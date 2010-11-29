package br.inf.carlos.wfg2.component.impl;

import java.lang.reflect.Field;

import br.inf.carlos.wfg2.component.WebComponent;

public class WebComponentText extends WebComponent
{
	private int componentSize;
	
	private int componentMaxLength;
	
	private String componentJavascriptMask;
	
	@Override
	public String renderComponent()
	{
		String html = "";
		String component = "";
		
		component += "							<input type='text' class='" + this.getComponentCSSClassName() + "' ";
		component += " size='" + this.getComponentSize() + "' ";
		component += " id='" + this.getComponentID() + "' name='" + this.getComponentName() + "' ";
		
		if(this.isComponentDisabled())
		{
			component += " disabled='disabled' ";
		}
		
		if(this.isComponentReadOnly())
		{
			component += " readOnly='readOnly' ";
		}
		
		component += " maxlength='" + this.getComponentMaxLength() + "' />\n";
		
		html += "				 <label>\n";
		html += "							" + this.getComponentLabel() + ": \n";
		html += "							<br/>\n";
		html += component;
		html += "						</label>\n";
		
		return html;
	}

	public int getComponentSize() {
		return componentSize;
	}

	public void setComponentSize(int componentSize) {
		this.componentSize = componentSize;
	}

	public int getComponentMaxLength() {
		return componentMaxLength;
	}

	public void setComponentMaxLength(int componentMaxLength) {
		this.componentMaxLength = componentMaxLength;
	}
	public String getComponentJavascriptMask() {
		return componentJavascriptMask;
	}

	public void setComponentJavascriptMask(String componentJavascriptMask) {
		this.componentJavascriptMask = componentJavascriptMask;
	}

	public WebComponentText(Class clazz, Field field)
	{
		super(clazz, field);
	}
}
