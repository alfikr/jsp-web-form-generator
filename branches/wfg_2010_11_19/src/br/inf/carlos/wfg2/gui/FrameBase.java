package br.inf.carlos.wfg2.gui;

import java.awt.GridLayout;
import java.lang.reflect.Field;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

import br.inf.carlos.wfg2.component.WebComponent;
import br.inf.carlos.wfg2.gui.panels.PainelComponente;

@SuppressWarnings("unchecked")
public class FrameBase extends JFrame
{
	private static final long serialVersionUID = 1L;
	
	private Class clazz;
	
	private JPanel painelBase;
	
	private GridLayout layout;

	public FrameBase(Class clazz)
	{
		super();
		
		this.clazz 		= clazz;
		this.painelBase = new JPanel();
		this.layout 	= new GridLayout();
		
		this.getPainelBase().setLayout	(this.getLayout());
		this.getContentPane().add		(this.getPainelBase());
		
		try {
			// Tema do próprio Ubuntu
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
			System.out.println(field.getName());
			this.addComponent(PainelComponente.createPainelComponenteInstance(field, this.getClazz()));
			this.getLayout().setRows( (this.getLayout().getRows() + 1) );
		}
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
}
