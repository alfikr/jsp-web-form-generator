package br.inf.carlos.webformgenerator.layout;

import java.util.List;

import br.inf.carlos.webformgenerator.components.WebFormComponent;


public class WebFormLayout implements IWebFormLayout
{
	public WebFormLayout()
	{
		super();
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
		
		return html;
	}
}