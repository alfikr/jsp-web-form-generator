package br.inf.carlos.wfg.gui.forms;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;

import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

import br.inf.carlos.wfg.components.WebFormAnnotationMapper;
import br.inf.carlos.wfg.components.WebFormControllerComponent;
import br.inf.carlos.wfg.gui.FrameMenuInicial;
import br.inf.carlos.wfg.gui.models.ListModelClasses;
import br.inf.carlos.wfg.gui.object.ObjectProperties;
import br.inf.carlos.wfg.util.WebFormUtil;

/**
 * Contém a definição do formulário para a seleção do pacote
 * e das classes.
 * 
 * @author Carlos A. Junior
 */
public class PanelPackageSelector extends JPanel
{
	private static final long serialVersionUID = 1L;
	
	private JLabel jLabel1;
    private JLabel jLabel2;
    private JScrollPane jScrollPane1;
    private JSeparator jSeparator1;
    private JButton jbCarregarClasses;
    private JButton jbSalvar;
    private JList jlClasses;
    private JTextField packageDirectory;
	
	/**
	 * Referencia para o objeto global.
	 */
	private ObjectProperties objectProperties;
	
	private FrameMenuInicial frame;
	
	private JFrame			parent;
	
	public PanelPackageSelector(ObjectProperties objectProperties, FrameMenuInicial frame, JFrame parent)
	{
		this.objectProperties 	= objectProperties;
		this.frame				= frame;
		this.parent				= parent;
        initComponents();
    }

    private void initComponents()
    {

        jLabel1 = new JLabel();
        packageDirectory = new JTextField();
        jbCarregarClasses = new JButton();
        jSeparator1 = new JSeparator();
        jLabel2 = new JLabel();
        jScrollPane1 = new JScrollPane();
        jlClasses = new JList();
        jbSalvar = new JButton();
        
        setLayout(new AbsoluteLayout());

        jLabel1.setText("Pacote das classes \"beans\" do projeto:");
        add(jLabel1, new AbsoluteConstraints(20, 20, -1, -1));

        packageDirectory.setText("br.inf.carlos.wfg.teste.beans");
        add(packageDirectory, new AbsoluteConstraints(20, 50, 450, -1));

        jbCarregarClasses.setText("Carregar Classes");
        jbCarregarClasses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jbCarregarClassesActionPerformed(evt);
            }
        });
        
        add(jbCarregarClasses, new AbsoluteConstraints(300, 90, 180, -1));
        add(jSeparator1, new AbsoluteConstraints(20, 140, 440, 10));

        jLabel2.setText("Classes encontradas:");
        add(jLabel2, new AbsoluteConstraints(20, 160, -1, -1));

        jScrollPane1.setViewportView(jlClasses);

        add(jScrollPane1, new AbsoluteConstraints(20, 180, 450, 140));

        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });
        
        add(jbSalvar, new AbsoluteConstraints(420, 330, -1, -1));
        
        jlClasses.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				jlClassesKeyPressed(e);
			}
		});
        
        packageDirectory.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent evt) {
				// TODO Auto-generated method stub
			}
			
			@Override
			public void keyReleased(KeyEvent evt) {
				// TODO Auto-generated method stub
			}
			
			@Override
			public void keyPressed(KeyEvent evt) {
				// TODO Auto-generated method stub
				componentMascaraJavascriptKeyPressed(evt);
			}
		});
    }
    
    private void jlClassesKeyPressed(KeyEvent evt)
    {
    	if(evt.getKeyCode() == KeyEvent.VK_ENTER)
    	{
    		this.jbSalvarActionPerformed(null);
    	}
    }
    
    private void componentMascaraJavascriptKeyPressed(KeyEvent evt)
    {
    	if(evt.getKeyCode() == KeyEvent.VK_ENTER)
    	{
    		this.jbCarregarClassesActionPerformed(null);
    	}
    }
    
    @SuppressWarnings("unchecked")
	private void jbCarregarClassesActionPerformed(ActionEvent evt)
    {
    	if(packageDirectory.getText() != null && !packageDirectory.getText().equals(""))
    	{
    		String pacote = packageDirectory.getText();
    		
    		if(WebFormUtil.packageExists(pacote))
    		{
    			WebFormAnnotationMapper mapper = new WebFormAnnotationMapper();
    			List<Class> classes = mapper.getMappedBeans(pacote);
    			
    			ListModelClasses padrao = new ListModelClasses(classes);
    			
    			jlClasses.setModel(padrao);
    			jlClasses.setFocusable(true);
    			jlClasses.setSelectionInterval(0, jlClasses.getModel().getSize() -1);
    			jlClasses.requestFocus();
    		}
    		else
    		{
    			JOptionPane.showMessageDialog(this, "O Pacote informado não existe!");
    		}
    	}
    	else
    	{
    		JOptionPane.showMessageDialog(this, "Informe o Pacote das classes!");
    	}
    }

    @SuppressWarnings("unchecked")
	private void jbSalvarActionPerformed(ActionEvent evt) 
    {
    	if(this.getObjectProperties().equals(null))
    	{
    		this.setObjectProperties(new ObjectProperties());
    	}
    	
    	if(jlClasses.getSelectedIndices().length > 0)
    	{
    		Object[] objects = jlClasses.getSelectedValues();
    		
    		for (Object object : objects)
    		{
				try {
					Class c = Class.forName(this.packageDirectory.getText() + "." + (String) object);
					
					if(!this.getObjectProperties().hasClassInWebFormControllerComponents(c))
					{
						WebFormControllerComponent controller = new WebFormControllerComponent(c);
						//WebFormUtil.getClassFields(c)
						this.getObjectProperties().getControllers().add(controller);
					}
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
			}
    		
    		this.getFrameMenuInicial().setObjectProperties(this.getObjectProperties());
    		JOptionPane.showMessageDialog(this, "Classes registradas com sucesso!");
    		
    		this.getParentFrame().getContentPane().removeAll();
    		this.getParentFrame().removeAll();
    		this.getParentFrame().setVisible(false);
    	}
    	else
    	{
    		JOptionPane.showMessageDialog(this, "Você deve Selecionar pelo menos uma Classe!");
    	}
    }

    public ObjectProperties getObjectProperties() {
		return objectProperties;
	}

	public void setObjectProperties(ObjectProperties objectProperties) {
		this.objectProperties = objectProperties;
	}

	public FrameMenuInicial getFrameMenuInicial() {
		return frame;
	}

	public void setFrameMenuInicial(FrameMenuInicial frame) {
		this.frame = frame;
	}

	public JFrame getParentFrame() {
		return parent;
	}

	public void setParentFrame(JFrame parent) {
		this.parent = parent;
	}
}
