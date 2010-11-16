package br.inf.carlos.webformgenerator.components;

import java.util.List;


public class WebFormLayout
{
	public WebFormLayout()
	{
		super();
	}
	
	public String renderWebFormLayout(List<WebFormComponent> components)
	{
		String html = "";
		html += "<div>\n";
		html += "	<form action='' method='post'>\n";
		html += "		<table width='100%' border='0'>\n";

		
		for (WebFormComponent co : components)
		{
			html += "			<tr>\n";
			html += "				<td>\n";
			html += "\t" + co.renderComponent();
			html += "				</td>\n";
			html += "			</tr>\n";
		}
		
		html += "		</table>\n";
		html += "	</form>\n";
		html += "</div>";
		
		return html;
	}
}