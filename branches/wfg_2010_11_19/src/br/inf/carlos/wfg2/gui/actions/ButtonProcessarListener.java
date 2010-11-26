package br.inf.carlos.wfg2.gui.actions;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import br.inf.carlos.wfg2.gui.FrameBase;
import br.inf.carlos.wfg2.gui.interfaces.IPainelComponente;
import br.inf.carlos.wfg2.gui.panels.PainelComponente;

public class ButtonProcessarListener implements ActionListener
{
	private FrameBase frameBase;
	
	public ButtonProcessarListener (FrameBase frameBase)
	{
		this.frameBase = frameBase;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		Component[] components = this.getFrameBase().getPainelBase().getComponents();
		boolean valid = true;
		for (Component component : components)
		{
			if(component instanceof PainelComponente)
			{
				valid = ((IPainelComponente) component).validatePainelFields();
				
				if(valid)
				{
					this.getFrameBase().getWebClass().getComponents().add(((IPainelComponente) component).getWebComponent());
				}
			}
		}
		
		if(!valid)
		{
			JOptionPane.showMessageDialog(this.getFrameBase(), "Existem campos que precisam ser preenchidos");
		}
		else
		{
			
		}
	}

	public FrameBase getFrameBase() {
		return frameBase;
	}
}
