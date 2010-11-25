package br.inf.carlos.wfg2.component.impl;

import java.lang.reflect.Field;

import br.inf.carlos.wfg2.component.WebComponent;

public class WebComponentText extends WebComponent
{

	public WebComponentText(Class clazz, Field field)
	{
		super(clazz, field);
	}

	@Override
	public String renderComponent()
	{
		return null;
	}

}
