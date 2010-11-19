package br.inf.carlos.wfg.components.impl;

import br.inf.carlos.wfg.components.WebFormComponent;
import br.inf.carlos.wfg.object.WebFormObject;

/**
 * Esta classe concretiza a geração do componente INPUT Checkbox.
 * 
 * @author Carlos A. Junior
 */
public class WebFormComponentCheckBox  extends WebFormComponent
{
	public WebFormComponentCheckBox(WebFormObject object)
	{
		super(object);
	}

	@Override
	public String renderComponent()
	{
		String html = "";
		String component = "";
		
		component += "							<input type='checkbox' class='" + this.getObject().getComponentCssClass() + "' ";
		component += " value='" + this.getObject().getComponentValue() + "' ";
		component += " id='" + this.getObject().getComponentId() + "' name='" + this.getObject().getComponentName() + "' />";
		
		html += "				 <label>\n";
		html += component;
		html += "&nbsp;" + this.getComponentLabel() + ". \n";
		html += "							<br/>\n";
		html += "						</label>\n";
		
		return html;
	}
}
