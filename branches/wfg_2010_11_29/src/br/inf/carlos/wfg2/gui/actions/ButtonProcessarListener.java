package br.inf.carlos.wfg2.gui.actions;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JOptionPane;

import br.inf.carlos.wfg2.exceptions.WebComponentEmptyException;
import br.inf.carlos.wfg2.file.RenderHTMLApplication;
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
			PainelComponenteSaveConfiguracao panel = (PainelComponenteSaveConfiguracao) this.getFrameBase().getPanelSaveConfiguracao();
			
			this.getFrameBase().getWebClass().setControllerClassName(panel.getControllerName().getText());
			this.getFrameBase().getWebClass().setDefaultViews		(panel.getDefaultView().getText());
			this.getFrameBase().getWebClass().setOutputPackage		(panel.getOutputPackage().getText());
			
			
			try {
				RenderHTMLApplication render = new RenderHTMLApplication(this.getFrameBase().getWebClass());
				
				render.createApplication();
			} catch (WebComponentEmptyException e1) {
				JOptionPane.showMessageDialog(this.getFrameBase(), e1.getMessage());
			} catch (IOException io) {
				JOptionPane.showMessageDialog(this.getFrameBase(), io.getMessage());
			}
		}
	}

	public FrameBase getFrameBase() {
		return frameBase;
	}
}
