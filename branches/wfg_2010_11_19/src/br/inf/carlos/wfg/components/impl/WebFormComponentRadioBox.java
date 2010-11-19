package br.inf.carlos.wfg.components.impl;

import br.inf.carlos.wfg.components.WebFormComponent;
import br.inf.carlos.wfg.object.WebFormObject;
import br.inf.carlos.wfg.util.WebFormUtil;

/**
 * Esta classe concretiza a geração do componente INPUT Checkbox.
 * 
 * @author Carlos A. Junior
 */
public class WebFormComponentRadioBox  extends WebFormComponent
{
	public WebFormComponentRadioBox(WebFormObject object)
	{
		super(object);
	}

	@Override
	public String renderComponent()
	{
		String htmlFinal = "";
		
		if(this.getObject().getComponentValue() != null)
		{
			for (String value : this.getObject().getComponentValue())
			{
				String html 		= "";
				String component 	= "";
				
				component += "								<input type='radio' class='" + this.getObject().getComponentCssClass() + "' ";
				component += " value='" + value + "' ";
				
				if(this.getObject().isComponentDisabled())
				{
					component += " disabled='disabled' ";
				}
				
				component += " id='" + this.getObject().getComponentId() + "' name='" + this.getObject().getComponentName() + "' />";
				
				html 		+= "				 		<label>\n";
				html 		+= component;
				html 		+= "&nbsp;" + WebFormUtil.capitalize(value) + ". \n";
				html 		+= "							<br/>\n";
				html 		+= "						</label>\n";
				
				html 		+= "						<br/>\n";
				
				htmlFinal 	+= html;
			}
			
			if(this.getObject().getComponentLabel() != null && !this.getObject().getComponentLabel().equals(""))
			{
				String label = "";
				
				label += "								<p>\n";
				label += "									<b>" + this.getObject().getComponentLabel() + "</b><br/>\n";
				label += "									<br/>\n";
				label += "									" + htmlFinal ;
				label += "								</p>\n";
				
				htmlFinal = label;
			}
			
		}
		
		return htmlFinal;
	}
}
