package br.inf.carlos.wfg.components.impl;

import br.inf.carlos.wfg.components.WebFormComponent;
import br.inf.carlos.wfg.enums.WebFormComponentType;
import br.inf.carlos.wfg.object.WebFormObject;

/**
 * Esta classe concretiza a geração do componente INPUT SELECT.
 * 
 * @author Carlos A. Junior
 */
public class WebFormComponentSelect  extends WebFormComponent
{
	public WebFormComponentSelect(WebFormObject object)
	{
		super(object);
	}

	@Override
	public String renderComponent()
	{
		String html = "";
		String component = "";
		
		if(this.getObject().getComponentType() == WebFormComponentType.SELECT)
		{
			component += "						<select class='" + this.getObject().getComponentCssClass() + "' ";
			component += " id='" + this.getObject().getComponentId() + "' name='" + this.getObject().getComponentName() + ".id'>\n ";
			
			String options = "							<option value='S' selected='selected'>-Selecione um " + this.getComponentLabel() + "</option>\n";
			
			if(this.getObject().getComponentElementsData() != null && !this.getObject().getComponentElementsData().equals(""))
			{
				options += "\n";
				options += "							<c:forEach items='${" + this.getObject().getComponentElementsData() + "}' var='p'>\n";
				options += "								<option value='${p." + this.getObject().getComponentElementsValueAttribute() + "}'>${p." + this.getObject().getComponentElementsDisplayAttribute() + "}</option>\n";
				options += "							</c:forEach>\n";
			}
			component += options + "						</select>\n";
			
			html += "				<label>\n";
			html += "						" + this.getComponentLabel() + ": \n";
			html += "						<br/>\n";
			html += component;
			html += "					</label>\n";
		}
		return html;
	}
}
