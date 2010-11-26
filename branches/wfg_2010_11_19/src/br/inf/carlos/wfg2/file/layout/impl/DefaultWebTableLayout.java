package br.inf.carlos.wfg2.file.layout.impl;

import java.util.List;

import br.inf.carlos.wfg2.component.WebComponent;
import br.inf.carlos.wfg2.exceptions.WebComponentEmptyException;
import br.inf.carlos.wfg2.file.layout.WebLayout;

public class DefaultWebTableLayout extends WebLayout
{
	public DefaultWebTableLayout(Class clazz, List<WebComponent> components) throws WebComponentEmptyException
	{
		super(clazz, components);
	}

	@Override
	public String createHTML()
	{
		String html = "";
		
		html += "<div>\n";
		html += "\t<fieldset>\n";
		html += "\t\t<legend>Formulário:</legend>\n";
		html += "\t\t<form>\n";
		html += "\t\t\t<table width='100%' border='1'>\n";
		
//		for (WebComponent component : this.getComponents())
//		{
//			html += "\t\t\t\t<tr>\n";
//			html += "\t\t\t\t\t<td>\n";
//			html += component.renderComponent();
//			html += "\t\t\t\t\t</td>\n";
//			html += "\t\t\t\t</tr>\n";
//		}
		
		html += "\t\t\t</table>\n";
		html += "\t\t</form>\n";
		html += "\t</fieldset>\n";
		html += "</div>\n";
		
		return html;
	}
}
