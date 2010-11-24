package br.inf.carlos.wfg.components.impl;

import br.inf.carlos.wfg.components.WebFormComponent;
import br.inf.carlos.wfg.object.WebFormObject;

/**
 * Esta classe concretiza a geração do componente INPUT TEXT.
 * 
 * @author Carlos A. Junior
 */
public class WebFormComponentTextArea  extends WebFormComponent
{
	public WebFormComponentTextArea(WebFormObject object, Class clazz) {
		super(object, clazz);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String renderComponent()
	{
		String html = "";
		String component = "";
		
		component += "							<textarea class='" + this.getObject().getComponentCssClass() + "' ";
		component += " id='" + this.getObject().getComponentId() + "' name='" + this.getObject().getComponentName() + "' ";
		
		if(this.getObject().isComponentDisabled())
		{
			component += " disabled='disabled' ";
		}
		
		component += " rows='" + this.getObject().getComponentRows() + "' cols='" + this.getObject().getComponentCols() + "' ";
		component += " ></textarea>\n";
		
		html += "					<label>\n";
		html += "							" + this.getComponentLabel() + ": \n";
		html += "							<br/>\n";
		html += component;
		html += "						</label>\n";
		
		return html;
	}
}
