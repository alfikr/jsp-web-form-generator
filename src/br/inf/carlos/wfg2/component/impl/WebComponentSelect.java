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
		String html = "";
		String component = "";
		
		component += "							<select class='" + this.getComponentCSSClassName() + "' ";
		component += " id='" + this.getComponentID() + "' name='" + this.getComponentName() + "' ";
		
		if(this.isComponentDisabled())
		{
			component += " disabled='disabled' ";
		}
		
		component += ">\n";
		
		component += "								<c:forEach items='${" + this.getDataList() + "}' var='pp'>\n";
		component += "									<option value='S'>-Selecione uma Opção-</option>\n";
		component += "									<option value='${pp." + this.getDataListValue() + "}'>${pp." + this.getDataListDisplayValue() + "}</option>\n";
		component += "								</c:forEach>\n";
		
		html += "				 <label>\n";
		html += "							" + this.getComponentName()+ ": \n";
		html += "							<br/>\n";
		html += component;
		html += "						</select>\n";
		html += "						</label>\n";
		
		return html;
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
