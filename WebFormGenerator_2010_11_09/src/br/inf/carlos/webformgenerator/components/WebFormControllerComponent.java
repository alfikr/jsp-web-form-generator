package br.inf.carlos.webformgenerator.components;

import java.util.List;



public class WebFormControllerComponent
{
	private List<WebFormComponent> components;
	@SuppressWarnings("unchecked")
	private Class clazz;
	
	@SuppressWarnings("unchecked")
	public WebFormControllerComponent(List<WebFormComponent> components, Class clazz)
	{
		super();
		this.components = components;
		this.clazz 		= clazz;
	}

	public List<WebFormComponent> getComponents() {
		return components;
	}

	public void setComponents(List<WebFormComponent> components) {
		this.components = components;
	}

	@SuppressWarnings("unchecked")
	public Class getClazz() {
		return clazz;
	}

	@SuppressWarnings("unchecked")
	public void setClazz(Class clazz) {
		this.clazz = clazz;
	}
}
