package br.inf.carlos.webformgenerator.components.impl;

import br.inf.carlos.webformgenerator.components.WebFormComponent;
import br.inf.carlos.webformgenerator.object.WebFormObject;

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
		
		switch (this.getObject().getComponentType())
		{
			default:
			case TEXT:
				component += "						<input type='text' class='" + this.getObject().getComponentCssClass() + "' ";
				component += " size='" + this.getObject().getComponentSize() + "' ";
				component += " id='" + this.getObject().getComponentId() + "' name='" + this.getObject().getComponentName() + "' ";
				component += " maxlength='" + this.getObject().getComponentMaxLength() + "' />\n";
			break;
		}
		
		html += "				<label>\n";
		html += "						" + this.getComponentLabel() + ": \n";
		html += "						<br/>\n";
		html += component;
		html += "					</label>\n";
		
		return html;
	}
}
