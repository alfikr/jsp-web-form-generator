package br.inf.carlos.wfg.components;

import br.inf.carlos.wfg.object.WebFormObject;
import br.inf.carlos.wfg.util.WebFormUtil;


/**
 * Classe abstrata para padronizar todos os componentes HTML da aplicação.
 * 
 * @author Carlos A. Junior
 */
public abstract class WebFormComponent implements IWebFormComponent
{
	private WebFormObject object;
	
	private Class clazz;
	
	public WebFormComponent (WebFormObject object, Class clazz)
	{
		this.object = object;
		this.clazz  = clazz;
	}
	
	public void setWebFormObject(WebFormObject o)
	{
		this.object = o;
	}
	
	public WebFormObject getObject() {
		return object;
	}
	
	public Class getClazz() {
		return clazz;
	}

	public void setClazz(Class clazz) {
		this.clazz = clazz;
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
