package br.inf.carlos.wfg.teste.run;

import javax.swing.JFrame;
import javax.swing.JPanel;

import br.inf.carlos.wfg.gui.forms.PanelPackageSelector;

public class TestePanelPacote {
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		
		JPanel panel = new PanelPackageSelector(null);
		
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();
	}
}
