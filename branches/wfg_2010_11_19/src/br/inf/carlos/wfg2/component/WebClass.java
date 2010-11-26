package br.inf.carlos.wfg2.component;

import java.util.ArrayList;
import java.util.List;

public class WebClass
{
	private Class clazz;
	
	private String controllerClassName;
	
	private String defaultViews;
	
	private String outputPackage;
	
	private List<WebComponent> components;

	public WebClass()
	{
		super();
		this.components = new ArrayList<WebComponent>();
	}
	
	
	public List<WebComponent> getComponents() {
		return components;
	}
	public void setComponents(List<WebComponent> components) {
		this.components = components;
	}
	public Class getClazz() {
		return clazz;
	}

	public void setClazz(Class clazz) {
		this.clazz = clazz;
	}

	public String getControllerClassName() {
		return controllerClassName;
	}

	public void setControllerClassName(String controllerClassName) {
		this.controllerClassName = controllerClassName;
	}

	public String getDefaultViews() {
		return defaultViews;
	}

	public void setDefaultViews(String defaultViews) {
		this.defaultViews = defaultViews;
	}


	public String getOutputPackage() {
		return outputPackage;
	}


	public void setOutputPackage(String outputPackage) {
		this.outputPackage = outputPackage;
	}
}
