package br.inf.carlos.wfg.gui.interfaces;

import br.inf.carlos.wfg.components.WebFormControllerComponent;

/**
 * Interface padrão para todos os JPanels que irão ser utilizados
 * para definir os campos HTML.
 * 
 * @author Carlos A. Junior
 */
public interface IPanelHTMLComponentConfigurator 
{
	public boolean isValid ();
	
	public void setComponentProperties (WebFormControllerComponent component);
	
	public WebFormControllerComponent getComponentProperties ();
	
}
