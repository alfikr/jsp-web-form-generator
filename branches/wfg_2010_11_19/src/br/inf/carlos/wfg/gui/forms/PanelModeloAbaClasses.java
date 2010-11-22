package br.inf.carlos.wfg.gui.forms;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import br.inf.carlos.wfg.gui.object.ObjectProperties;

public class PanelModeloAbaClasses extends JPanel
{
	private static final long serialVersionUID = 1L;

	private ObjectProperties objectProperties;
	
	private javax.swing.JButton jbSalvar;
    private javax.swing.JTabbedPane jtpBase;
	
	public PanelModeloAbaClasses (ObjectProperties objectProperties)
	{
		this.objectProperties = objectProperties;
		
		this.initComponents();
	}
	
	@SuppressWarnings("unchecked")
	private void initComponents()
	{
        jtpBase 		= new JTabbedPane();
        jbSalvar 		= new JButton();

        for (Class c : this.getObjectProperties().getClassesSelecionadas()) 
        {
			jtpBase.addTab(c.getSimpleName(), new JTabbedPane());
		}
        
        jbSalvar.setText("Salvar Configurações");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtpBase, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(408, Short.MAX_VALUE)
                .addComponent(jbSalvar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jtpBase, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbSalvar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }
	


    public ObjectProperties getObjectProperties() {
		return objectProperties;
	}

	public void setObjectProperties(ObjectProperties objectProperties) {
		this.objectProperties = objectProperties;
	}

	public javax.swing.JTabbedPane getJtpBase() {
		return jtpBase;
	}

}