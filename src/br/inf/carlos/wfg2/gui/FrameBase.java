package br.inf.carlos.wfg2.gui;

import java.awt.GridLayout;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.UIManager;

import br.inf.carlos.wfg2.component.WebComponent;
import br.inf.carlos.wfg2.gui.panels.PainelComponente;
import br.inf.carlos.wfg2.gui.panels.PainelComponenteSaveConfiguracao;

@SuppressWarnings("unchecked")
public class FrameBase extends JFrame
{
	private static final long serialVersionUID = 1L;
	
	private Class clazz;
	
	private JPanel painelBase;
	
	private GridLayout layout;
	
	private String projectDirectory;
	
	private File projeto;

	public FrameBase(Class clazz, String projectDirectory) throws IOException
	{
		super();
		
		this.clazz 				= clazz;
		this.painelBase 		= new JPanel();
		this.layout 			= new GridLayout();
		
		this.projectDirectory 	= projectDirectory;
		this.projeto 			= new File(this.getProjectDirectory());
		
		if(!this.getProjeto().exists())
		{
			throw new IOException("O diretório do projeto [" + this.getProjectDirectory() + "] não existe.");
		}
		
		this.getPainelBase().setLayout	(this.getLayout());
		
		JScrollPane scrollPane = new JScrollPane(
			this.painelBase,  
			JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
			JScrollPane.HORIZONTAL_SCROLLBAR_NEVER
		);
		
		scrollPane.setViewportView	(this.painelBase);  
		this.getContentPane().add	(scrollPane);
		
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		this.initPanels();
	}
	
	private void initPanels ()
	{
		List<Field> fields = WebComponent.getFields(this.getClazz());
		
		this.getLayout().setColumns(1);
		for (Field field : fields)
		{
			this.addComponent		( PainelComponente.createPainelComponenteInstance(field, this.getClazz(), this) );
			this.getLayout().setRows( (this.getLayout().getRows() + 1) );
		}
		
		JPanel panelSaveConfiguracao = new PainelComponenteSaveConfiguracao(this.getClazz(), this);
		
		this.getPainelBase().add(panelSaveConfiguracao);
		//this.getLayout().setRows( (this.getLayout().getRows() + 1) );
	}
	
	public GridLayout getLayout() {
		return layout;
	}

	public void setLayout(GridLayout layout) {
		this.layout = layout;
	}

	public void addComponent(PainelComponente component)
	{
		this.getPainelBase().add(component);
	}

	public Class getClazz() {
		return clazz;
	}

	public void setClazz(Class clazz) {
		this.clazz = clazz;
	}

	public JPanel getPainelBase() {
		return painelBase;
	}

	public void setPainelBase(JPanel painelBase) {
		this.painelBase = painelBase;
	}

	public String getProjectDirectory() {
		return projectDirectory;
	}

	public void setProjectDirectory(String projectDirectory) {
		this.projectDirectory = projectDirectory;
	}

	public File getProjeto() {
		return projeto;
	}
}
