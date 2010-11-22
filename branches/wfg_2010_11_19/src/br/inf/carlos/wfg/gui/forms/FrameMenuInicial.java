package br.inf.carlos.wfg.gui.forms;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import br.inf.carlos.wfg.gui.object.ObjectProperties;

/**
 * 
 * @author carlos
 */
public class FrameMenuInicial extends JFrame
{
	private static final long serialVersionUID = 1L;

	private ObjectProperties objectProperties;

	public FrameMenuInicial()
	{
		this.objectProperties = new ObjectProperties();
		initComponents();
	}

	private void initComponents() {

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		jMenuBar1 = new javax.swing.JMenuBar();
		jMenu1 = new javax.swing.JMenu();
		jmiDiretorioPacotes = new javax.swing.JMenuItem();
		jMenuItem2 = new javax.swing.JMenuItem();
		jMenu2 = new javax.swing.JMenu();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("WFG - GUI");
		setResizable(false);

		jMenu1.setText("Configurações Necessárias");

		jmiDiretorioPacotes.setText("Diretório dos pacotes");
		jmiDiretorioPacotes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jmiDiretorioPacotesActionPerformed(evt);
			}
		});
		
		jMenuItem2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jmiDefinicaoComponentesAction(evt);
			}
		});
		
		jMenu1.add(jmiDiretorioPacotes);

		jMenuItem2.setText("Definição dos componentes");
		jMenu1.add(jMenuItem2);

		jMenuBar1.add(jMenu1);

		jMenu2.setText("Edit");
		jMenuBar1.add(jMenu2);

		setJMenuBar(jMenuBar1);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 522,
				Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 172,
				Short.MAX_VALUE));

		pack();
	}
	
	private void jmiDefinicaoComponentesAction(ActionEvent evt)
	{
		if(this.objectProperties.getClassesSelecionadas().size() > 0)
		{
			JFrame frame = new JFrame();
			JPanel panelPackage = new PanelDefinicaoComponente(this.objectProperties, this);
			
			frame.add(panelPackage);
			frame.setVisible(true);
			frame.pack();
			frame.setResizable(false);
			frame.setTitle("Configuração dos Componentes HTML");
		}
		else
		{
			JOptionPane.showMessageDialog(this, "Primeiro selecione as classes a serem mapeadas!");
		}
	}


	private void jmiDiretorioPacotesActionPerformed(ActionEvent evt)
	{
		JFrame frame = new JFrame();
		JPanel panelPackage = new PanelPackageSelector(this.objectProperties, this);
		
		frame.add(panelPackage);
		frame.setVisible(true);
		frame.pack();
		frame.setResizable(false);
		frame.setTitle("Seletor de Pacotes");
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new FrameMenuInicial().setVisible(true);
			}
		});
	}

	public ObjectProperties getObjectProperties() {
		return objectProperties;
	}

	public void setObjectProperties(ObjectProperties objectProperties) {
		this.objectProperties = objectProperties;
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JMenu jMenu1;
	private javax.swing.JMenu jMenu2;
	private javax.swing.JMenuBar jMenuBar1;
	private javax.swing.JMenuItem jMenuItem2;
	private javax.swing.JMenuItem jmiDiretorioPacotes;
	// End of variables declaration//GEN-END:variables

}
