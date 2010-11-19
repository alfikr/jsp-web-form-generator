package br.inf.carlos.wfg.components.impl;

import br.inf.carlos.wfg.components.WebFormComponent;
import br.inf.carlos.wfg.object.WebFormObject;

/**
 * Esta classe concretiza a geração do componente INPUT TEXT.
 * 
 * @author Carlos A. Junior
 */
public class WebFormComponentText  extends WebFormComponent
{
	public WebFormComponentText(WebFormObject object)
	{
		super(object);
	}

	@Override
	public String renderComponent()
	{
		String html = "";
		String component = "";
		
		component += "							<input type='text' class='" + this.getObject().getComponentCssClass() + "' ";
		component += " size='" + this.getObject().getComponentSize() + "' ";
		component += " id='" + this.getObject().getComponentId() + "' name='" + this.getObject().getComponentName() + "' ";
		
		if(this.getObject().isComponentDisabled())
		{
			component += " disabled='disabled' ";
		}
		
		if(this.getObject().isComponentReadOnly())
		{
			component += " readOnly='readOnly' ";
		}
		
		component += " maxlength='" + this.getObject().getComponentMaxLength() + "' />\n";
		
		html += "				 <label>\n";
		html += "							" + this.getComponentLabel() + ": \n";
		html += "							<br/>\n";
		html += component;
		html += "						</label>\n";
		
		return html;
	}
}
