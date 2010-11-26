package br.inf.carlos.wfg2.component.impl;

import java.lang.reflect.Field;

import br.inf.carlos.wfg2.component.WebComponent;

public class WebComponentSelect extends WebComponent
{
	private String dataList;
	
	private String dataListValue;
	
	private String dataListDisplayValue;
	
	public WebComponentSelect(Class clazz, Field field)
	{
		super(clazz, field);
	}

	@Override
	public String renderComponent()
	{
		return "";
	}

	public String getDataList() {
		return dataList;
	}

	public void setDataList(String dataList) {
		this.dataList = dataList;
	}

	public String getDataListValue() {
		return dataListValue;
	}

	public void setDataListValue(String dataListValue) {
		this.dataListValue = dataListValue;
	}

	public String getDataListDisplayValue() {
		return dataListDisplayValue;
	}

	public void setDataListDisplayValue(String dataListDisplayValue) {
		this.dataListDisplayValue = dataListDisplayValue;
	}
}
