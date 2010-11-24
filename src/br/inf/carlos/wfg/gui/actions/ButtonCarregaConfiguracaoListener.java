package br.inf.carlos.wfg.gui.actions;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import br.inf.carlos.wfg.gui.object.ClassObject;
import br.inf.carlos.wfg.gui.panels.PanelClassFieldConfigurator;
import br.inf.carlos.wfg.gui.panels.PanelClassSelector;

/**
 * Gerencia o evento do botão do painel de seleção de classes para a JPanel
 * de configuração dos campos.
 * 
 * @author Carlos A. Junior
 */
public class ButtonCarregaConfiguracaoListener implements ActionListener
{
	private PanelClassSelector panelClassSelector;
	
	public ButtonCarregaConfiguracaoListener (PanelClassSelector panelClassSelector)
	{
		this.panelClassSelector = panelClassSelector;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		ClassObject cl = (ClassObject) this.getPanelClassSelector().getComboClasses().getSelectedItem();
		
		JFrame frame = new JFrame();

		JPanel abas = new PanelClassFieldConfigurator(
			this.getPanelClassSelector().getObjectProperties(), 
			this.getPanelClassSelector(), 
			cl.getClazz()
		);
		
		frame.add(abas);
		frame.setVisible	(true);
		frame.pack			();
		//frame.setResizable	(false);
		frame.setLocation	(200, 200);
		frame.setPreferredSize(new Dimension(800,600));
		frame.setTitle		("Configuração dos Componentes HTML");
	}

	private PanelClassSelector getPanelClassSelector() {
		return panelClassSelector;
	}
}
