package br.inf.carlos.wfg2.gui.actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import br.inf.carlos.wfg2.gui.FrameBase;
import br.inf.carlos.wfg2.gui.panels.PainelClassSelector;

public class ButtonCarregaFrameBase implements ActionListener
{
	private PainelClassSelector painelClassSelector;
	
	public ButtonCarregaFrameBase (PainelClassSelector painelClassSelector)
	{
		this.painelClassSelector = painelClassSelector;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(this.getPainelClassSelector().getClasses().isSelectionEmpty())
		{
			JOptionPane.showMessageDialog(this.getPainelClassSelector(), "Selecione uma classe para abrir o Gerador!");
		}
		else
		{
			Class clazz = (Class) this.getPainelClassSelector().getClasses().getSelectedValue();
			
			if(clazz != null)
			{
				JFrame frame;
				try {
					frame = new FrameBase	(clazz, ".");
					
					frame.setLocation				(50, 0);
					frame.setVisible				(true);
					frame.setSize					(850, 400);
					frame.setTitle					("WFG - Gerador de Formulários e Controladores [" + clazz.getSimpleName() + "]");
					
					//frame.setDefaultCloseOperation	(JFrame.EXIT_ON_CLOSE);
				} catch (IOException ee) {
					ee.printStackTrace();
				}
			}
		}
	}

	public PainelClassSelector getPainelClassSelector() {
		return painelClassSelector;
	}
}
