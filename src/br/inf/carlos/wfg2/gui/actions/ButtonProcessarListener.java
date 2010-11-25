package br.inf.carlos.wfg2.gui.actions;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.inf.carlos.wfg2.gui.FrameBase;
import br.inf.carlos.wfg2.gui.interfaces.IPainelComponente;
import br.inf.carlos.wfg2.gui.panels.PainelComponente;
import br.inf.carlos.wfg2.gui.panels.PainelComponenteSaveConfiguracao;

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
		Component[] components = this.getFrameBase().getComponents();
		
		for (Component component : components)
		{
			if(component instanceof PainelComponente)
			{
				((IPainelComponente) component).validatePainelFields();
			}
		}
	}

	public FrameBase getFrameBase() {
		return frameBase;
	}
}
