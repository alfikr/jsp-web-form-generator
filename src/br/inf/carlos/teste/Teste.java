package br.inf.carlos.teste;

import java.io.IOException;

import javax.swing.JFrame;

import br.inf.carlos.teste.beans.Cliente;
import br.inf.carlos.wfg2.gui.FrameBase;

public class Teste {
	public static void main(String[] args) {
		JFrame frame;
		try {
			frame = new FrameBase	(Cliente.class, ".");
			
			frame.setLocation				(50, 0);
			frame.setVisible				(true);
			frame.setSize					(850, 400);
			frame.setTitle					("WFG - Gerador de Formulários e Controladores");
			
			frame.setDefaultCloseOperation	(JFrame.EXIT_ON_CLOSE);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
