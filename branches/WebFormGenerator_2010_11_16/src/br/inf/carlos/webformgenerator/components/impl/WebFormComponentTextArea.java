package br.inf.carlos.webformgenerator.components.impl;

import br.inf.carlos.webformgenerator.components.WebFormComponent;
import br.inf.carlos.webformgenerator.object.WebFormObject;

/**
 * Esta classe concretiza a geração do componente INPUT TEXT.
 * 
 * @author Carlos A. Junior
 */
public class WebFormComponentTextArea  extends WebFormComponent
{
	public WebFormComponentTextArea(WebFormObject object)
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
				component += "							<textarea class='" + this.getObject().getComponentCssClass() + "' ";
				component += " id='" + this.getObject().getComponentId() + "' name='" + this.getObject().getComponentName() + "' ";
				component += " rows='" + this.getObject().getComponentRows() + "' cols='" + this.getObject().getComponentCols() + "' ";
				component += " ></textarea>\n";
			break;
		}
		
		html += "					<label>\n";
		html += "							" + this.getComponentLabel() + ": \n";
		html += "							<br/>\n";
		html += component;
		html += "						</label>\n";
		
		return html;
	}
}
