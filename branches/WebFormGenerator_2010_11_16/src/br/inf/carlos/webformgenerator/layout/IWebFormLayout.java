package br.inf.carlos.webformgenerator.layout;

import java.util.List;

import br.inf.carlos.webformgenerator.components.WebFormComponent;

public interface IWebFormLayout
{
	public String renderWebFormLayout (List<WebFormComponent> components);
}
