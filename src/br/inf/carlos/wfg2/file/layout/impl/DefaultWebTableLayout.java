package br.inf.carlos.wfg2.file.layout.impl;

import java.util.List;

import br.inf.carlos.wfg2.component.WebClass;
import br.inf.carlos.wfg2.component.WebComponent;
import br.inf.carlos.wfg2.component.impl.WebComponentText;
import br.inf.carlos.wfg2.exceptions.WebComponentEmptyException;
import br.inf.carlos.wfg2.file.layout.WebLayout;

public class DefaultWebTableLayout extends WebLayout
{

	public DefaultWebTableLayout(WebClass webClass, List<WebComponent> components) throws WebComponentEmptyException
	{
		super(webClass, components);
	}

	@Override
	public String createHTML()
	{
		String html = "";
		String javascriptMasks = "";
		
		html += "<div>\n";
		html += "\t<fieldset>\n";
		html += "\t\t<legend>Formulário:</legend>\n";
		html += "\t\t<form>\n";
		html += "\t\t\t<table width='100%' border='1'>\n";
		
		for (WebComponent component : this.getComponents())
		{
			System.out.println("Renderizando componente...." + component);
			if(component != null)
			{
				html += "\t\t\t\t<tr>\n";
				html += "\t\t\t\t\t<td>\n";
				html += component.renderComponent();
				html += "\t\t\t\t\t</td>\n";
				html += "\t\t\t\t</tr>\n";
				
				if(component instanceof WebComponentText)
				{
					if(!((WebComponentText) component).getComponentJavascriptMask().equals(""))
					{
						javascriptMasks += "jQuery('#" + component.getComponentID() + "').mask('" 
									+ ((WebComponentText) component).getComponentJavascriptMask() + "');\n";
					}
				}
			}
		}
		
		html += "\t\t\t</table>\n";
		html += "\t\t</form>\n";
		html += "\t</fieldset>\n";
		html += "</div>\n";
		
		html += "<script type='text/javascript' src='http://code.jquery.com/jquery-1.4.4.min.js'></script>\n";
		html += "<script type='text/javascript' src='http://jquery-joshbush.googlecode.com/files/jquery.maskedinput-1.2.2.min.js'></script>\n\n";
		
		html += "<script type='text/javascript'>\n";
		html += "\t" + javascriptMasks;
		html += "</script>";
		
		return html;
	}
}
