package br.inf.carlos.wfg.object;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Arrays;

import br.inf.carlos.wfg.annotations.WebFormBean;
import br.inf.carlos.wfg.annotations.WebFormBeanColumn;
import br.inf.carlos.wfg.enums.WebFormComponentType;

/**
 * Classe para abstrair um componente HTML a ser gerado. Os atributos desta
 * classe são baseados nos campos da annotação WebFormBeanColumn.
 * 
 * @see WebFormBeanColumn
 * 
 * @author Carlos A. Junior
 */
public class WebFormObject implements Serializable
{
	private static final long serialVersionUID = 6808552980616794116L;

	private String componentCssClass;
	
	private String componentId;
	
	private String componentName;
	
	private String componentLabel;
	
	private String[] componentValue;
	
	private String componentElementsData;
	
	private String componentElementsDisplayAttribute;
	
	private String componentElementsValueAttribute;
	
	private int componentSize;
	
	private int componentMaxLength;
	
	private int componentCols;
	
	private int componentRows;
	
	private boolean componentDisabled;
	
	private boolean componentReadOnly;
	
	private WebFormComponentType componentType;
	
	private WebFormBean bean;
	
	private WebFormBeanColumn beanColumn;
	
	private Field field;
	
	private String mascaraJavascript;
	
	public WebFormObject ()
	{
		super();
	}

	public String getComponentCssClass() {
		return componentCssClass;
	}

	public void setComponentCssClass(String componentCssClass) {
		this.componentCssClass = componentCssClass;
	}

	public String getComponentId() {
		return componentId;
	}

	public void setComponentId(String componentId) {
		this.componentId = componentId;
	}

	public String getComponentName() {
		return componentName;
	}

	public void setComponentName(String componentName) {
		this.componentName = componentName;
	}

	public String getComponentLabel() {
		return componentLabel;
	}

	public void setComponentLabel(String componentLabel) {
		this.componentLabel = componentLabel;
	}

	public String[] getComponentValue() {
		return componentValue;
	}

	public void setComponentValue(String[] componentValue) {
		this.componentValue = componentValue;
	}

	public String getComponentElementsData() {
		return componentElementsData;
	}

	public void setComponentElementsData(String componentElementsData) {
		this.componentElementsData = componentElementsData;
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

	public int getComponentCols() {
		return componentCols;
	}

	public void setComponentCols(int componentCols) {
		this.componentCols = componentCols;
	}

	public int getComponentRows() {
		return componentRows;
	}

	public void setComponentRows(int componentRows) {
		this.componentRows = componentRows;
	}

	public WebFormComponentType getComponentType() {
		return componentType;
	}

	public void setComponentType(WebFormComponentType componentType) {
		this.componentType = componentType;
	}

	public WebFormBean getBean() {
		return bean;
	}

	public void setBean(WebFormBean bean) {
		this.bean = bean;
	}

	public WebFormBeanColumn getBeanColumn() {
		return beanColumn;
	}

	public void setBeanColumn(WebFormBeanColumn beanColumn) {
		this.beanColumn = beanColumn;
	}

	public Field getField() {
		return field;
	}

	public void setField(Field field) {
		this.field = field;
	}

	public String getMascaraJavascript() {
		return mascaraJavascript;
	}

	public void setMascaraJavascript(String mascaraJavascript) {
		this.mascaraJavascript = mascaraJavascript;
	}

	public String getComponentElementsDisplayAttribute() {
		return componentElementsDisplayAttribute;
	}

	public void setComponentElementsDisplayAttribute(
			String componentElementsDisplayAttribute) {
		this.componentElementsDisplayAttribute = componentElementsDisplayAttribute;
	}

	public String getComponentElementsValueAttribute() {
		return componentElementsValueAttribute;
	}

	public void setComponentElementsValueAttribute(
			String componentElementsValueAttribute) {
		this.componentElementsValueAttribute = componentElementsValueAttribute;
	}

	public boolean isComponentDisabled() {
		return componentDisabled;
	}

	public void setComponentDisabled(boolean componentDisabled) {
		this.componentDisabled = componentDisabled;
	}

	public boolean isComponentReadOnly() {
		return componentReadOnly;
	}

	public void setComponentReadOnly(boolean componentReadOnly) {
		this.componentReadOnly = componentReadOnly;
	}

	@Override
	public String toString() {
		return "WebFormObject [bean=" + bean + ", beanColumn=" + beanColumn
				+ ", componentCols=" + componentCols + ", componentCssClass="
				+ componentCssClass + ", componentDisabled="
				+ componentDisabled + ", componentElementsData="
				+ componentElementsData
				+ ", componentElementsDisplayAttribute="
				+ componentElementsDisplayAttribute
				+ ", componentElementsValueAttribute="
				+ componentElementsValueAttribute + ", componentId="
				+ componentId + ", componentLabel=" + componentLabel
				+ ", componentMaxLength=" + componentMaxLength
				+ ", componentName=" + componentName + ", componentReadOnly="
				+ componentReadOnly + ", componentRows=" + componentRows
				+ ", componentSize=" + componentSize + ", componentType="
				+ componentType + ", componentValue="
				+ Arrays.toString(componentValue) + ", field=" + field
				+ ", mascaraJavascript=" + mascaraJavascript + "]";
	}
}