package br.inf.carlos.wfg.gui.forms;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

import br.inf.carlos.wfg.gui.object.ObjectProperties;

public class PanelObjectDefinition extends JPanel
{
	private static final long serialVersionUID = 1L;

	private ObjectProperties objectProperties;
	
	private javax.swing.JButton jbSalvar;
    private javax.swing.JTabbedPane jtpBase;
	
	public PanelObjectDefinition (ObjectProperties objectProperties)
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
        	JTabbedPane aba 	= new JTabbedPane();
        	JComponent panel 	= new JPanel();
        	
        	panel.setLayout	(new AbsoluteLayout());
        	
        	panel.add(new JButton("Meu Button para a classe: " + c.getSimpleName()), new AbsoluteConstraints(20, 20, -1, -1));
        	
        	aba.add			(panel);
			jtpBase.addTab	(c.getSimpleName(), aba);
		}
        
        jbSalvar.setText("Salvar Configurações");

        GroupLayout layout = new GroupLayout(this);
        
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