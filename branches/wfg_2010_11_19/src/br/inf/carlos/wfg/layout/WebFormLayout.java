package br.inf.carlos.wfg.layout;

import java.util.List;

import br.inf.carlos.wfg.components.WebFormComponent;
import br.inf.carlos.wfg.components.WebFormControllerComponent;
import br.inf.carlos.wfg.util.WebFormUtil;


public class WebFormLayout implements IWebFormLayout
{
	private List<WebFormControllerComponent> controllers;
	
	public WebFormLayout(List<WebFormControllerComponent> controllers)
	{
		super();
		this.controllers = controllers;
	}
	
	public String renderWebFormLayout(List<WebFormComponent> components)
	{
		String html = "";
		html += "<div>\n";
		html += "	<fieldset>\n";
		html += "		<form action='' method='post'>\n";
		html += "			<table width='100%' border='0'>\n";

		
		for (WebFormComponent co : components)
		{
			html += "				<tr>\n";
			html += "					<td>\n";
			html += "\t\t" + co.renderComponent();
			html += "					</td>\n";
			html += "				</tr>\n";
		}
		
		html += "			</table>\n";
		html += "		</form>\n";
		html += "	</fieldset>\n";
		html += "</div>";
		
		if(WebFormUtil.hasFieldWithJavascriptMask(this.getControllers()))
		{
			// Carregando direto do site do desenvolvedor. 
			html += "\n";
			html += "<script type='text/javascript' src='https://ajax.googleapis.com/ajax/libs/jquery/1.4.2/jquery.min.js'>\n";
			html += "<script type='text/javascript' src='http://jquery-joshbush.googlecode.com/files/jquery.maskedinput-1.2.2.min.js'>\n";
			html += "</script>\n\n";
			
			html += "<script type='text/javascript'>\n";
			
			List<WebFormComponent> componentesComMascara = WebFormUtil.getComponentsWithJavascriptMask(this.getControllers());
			
			for (WebFormComponent comp : componentesComMascara)
			{
				html += "	jQuery('#" + comp.getObject().getComponentId() + "').mask('" + comp.getObject().getMascaraJavascript() + "');\n";
			}
			
			html += "</script>\n";
		}
		
		return html;
	}

	public List<WebFormControllerComponent> getControllers() {
		return controllers;
	}
}