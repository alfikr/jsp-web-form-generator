package br.inf.carlos.teste;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

import br.inf.carlos.wfg2.gui.panels.PainelClassSelector;

public class CarregaAplicacao {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		JPanel panel = new PainelClassSelector();
		
		frame.getContentPane().add(panel);
		frame.setLocation				(50, 0);
		frame.setVisible				(true);
		frame.setSize					(850, 400);
		frame.setTitle					("WFG - Gerador de Formulários e Controladores");
		
		frame.setDefaultCloseOperation	(JFrame.EXIT_ON_CLOSE);
		
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
