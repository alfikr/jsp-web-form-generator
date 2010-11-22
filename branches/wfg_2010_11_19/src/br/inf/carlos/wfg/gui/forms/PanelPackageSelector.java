package br.inf.carlos.wfg.gui.forms;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.inf.carlos.wfg.components.WebFormAnnotationMapper;
import br.inf.carlos.wfg.gui.models.ListModelClasses;
import br.inf.carlos.wfg.gui.object.ObjectProperties;
import br.inf.carlos.wfg.util.WebFormUtil;

/**
 *
 * @author carlos
 */

public class PanelPackageSelector extends javax.swing.JPanel
{
	private static final long serialVersionUID = 1L;
	
	/**
	 * Referencia para o objeto global.
	 */
	private ObjectProperties objectProperties;
	
	private FrameMenuInicial frame;
	
	public PanelPackageSelector(ObjectProperties objectProperties, FrameMenuInicial frame)
	{
		this.objectProperties 	= objectProperties;
		this.frame				= frame;
		
        initComponents();
    }

    private void initComponents()
    {

        jLabel1 = new javax.swing.JLabel();
        packageDirectory = new javax.swing.JTextField();
        jbCarregarClasses = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlClasses = new javax.swing.JList();
        jbSalvar = new javax.swing.JButton();
        
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Pacote das classes \"beans\" do projeto:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        packageDirectory.setText("br.inf.carlos.wfg.teste.beans");
        add(packageDirectory, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 450, -1));

        jbCarregarClasses.setText("Carregar Classes");
        jbCarregarClasses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jbCarregarClassesActionPerformed(evt);
            }
        });
        add(jbCarregarClasses, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 140, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 440, 10));

        jLabel2.setText("Classes encontradas:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jScrollPane1.setViewportView(jlClasses);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 450, 140));

        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });
        add(jbSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

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
    		List<Class> classes = new ArrayList<Class>();
    		
    		Object[] objects = jlClasses.getSelectedValues();
    		
    		for (Object object : objects)
    		{
    			System.out.println(object);
				try {
					Class c = Class.forName(this.packageDirectory.getText() + "." + (String) object);
					classes.add(c);
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
			}
    		
    		this.getObjectProperties().setClassesSelecionadas(classes);
    		this.getFrameMenuInicial().setObjectProperties(this.getObjectProperties());
    		JOptionPane.showMessageDialog(this, "Classes registradas com sucesso!");
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

	// Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbCarregarClasses;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JList jlClasses;
    private javax.swing.JTextField packageDirectory;
    // End of variables declaration//GEN-END:variables

}
