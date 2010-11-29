package br.inf.carlos.wfg2.gui.panels;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;

import br.inf.carlos.wfg2.component.WebComponent;
import br.inf.carlos.wfg2.gui.actions.ButtonCarregaFrameBase;
import br.inf.carlos.wfg2.gui.models.DefaultClassListModel;

/**
 *
 * @author carlos
 */
public class PainelClassSelector extends JPanel
{
	private static final long serialVersionUID = -3546515021446073436L;
	
	private JList classes;
    private JButton button;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JScrollPane jScrollPane1;
    private JTextField pacoteBeans;

    public PainelClassSelector()
    {
        initComponents();
    }

    private void initComponents()
    {
        jLabel1 	= new JLabel();
        pacoteBeans = new JTextField();
        jScrollPane1= new JScrollPane();
        classes 	= new JList();
        button 		= new JButton();
        jLabel2 	= new JLabel();

        jLabel1.setText		("Pacote das Classes:");
        pacoteBeans.setText	("br.inf.carlos.teste.beans");

        jScrollPane1.setViewportView(classes);

        button.setText		("Abrir Gerador");
        button.setEnabled	(false);
        jLabel2.setText("Classes do Pacote:");

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(button, GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                        .addComponent(pacoteBeans, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
                        .addComponent(jLabel1, GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pacoteBeans, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        
        this.button.addActionListener(new ButtonCarregaFrameBase(this));
        
        this.pacoteBeans.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent arg0) {
				
			}
			
			@Override
			public void keyReleased(KeyEvent arg0) {
				
			}
			
			@Override
			public void keyPressed(KeyEvent e)
			{
				if(e.getKeyCode() == KeyEvent.VK_ENTER)
				{
					try {
						classes.setModel(new DefaultClassListModel(WebComponent.getPackageClasses(pacoteBeans.getText())));
						button.setEnabled(true);
					} catch (IOException ee) {
						JOptionPane.showMessageDialog(null, ee.getMessage());
						button.setEnabled(false);
					}
				}
			}
		});
    }

	public JList getClasses() {
		return classes;
	}

	public void setClasses(JList classes) {
		this.classes = classes;
	}

	public JTextField getPacoteBeans() {
		return pacoteBeans;
	}

	public void setPacoteBeans(JTextField pacoteBeans) {
		this.pacoteBeans = pacoteBeans;
	}
}
