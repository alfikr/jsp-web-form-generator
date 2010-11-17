package br.inf.carlos.webformgenerator.components;

import br.inf.carlos.webformgenerator.object.WebFormObject;
import br.inf.carlos.webformgenerator.util.WebFormUtil;


/**
 * Classe abstrata para padronizar todos os componentes HTML da aplicação.
 * 
 * @author Carlos A. Junior
 */
public abstract class WebFormComponent implements IWebFormComponent
{
	private WebFormObject object;
	
	public WebFormComponent (WebFormObject object)
	{
		this.object = object;
	}
	
	public WebFormObject getObject() {
		return object;
	}

	@Override
	public String renderComponent()
	{
		return "";
	}
	
	/**
	 * Retorna o nome do componente no formato da capitalize.
	 * 
	 * @see WebFormUtil.capitalize
	 * 
	 * @return String
	 */
	protected String getComponentLabel()
	{
		return WebFormUtil.capitalize(this.getObject().getComponentLabel().toLowerCase());
	}
}
