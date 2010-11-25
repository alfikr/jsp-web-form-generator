package br.inf.carlos.wfg2.component;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Esta classe representa todo componente HTML. Esta superclasse abstrata
 * já possui as propriedades comuns dos componentes HTML. 
 * 
 * @author Carlos A. Junior
 */
@SuppressWarnings("unchecked")
public abstract class WebComponent implements IWebComponent
{
	private Class clazz;
	
	private Field field;
	
	private String componentID;
	
	private String componentName;
	
	private String componentCSSClassName;
	
	private boolean componentDisabled;
	
	private boolean componentReadOnly;
	
	private String componentValue;

	public WebComponent(Class clazz, Field field)
	{
		super();
		this.clazz = clazz;
		this.field = field;
	}
	
	/**
	 * Retorna o nome do atributo que será apresentado em cada option de um 
	 * combobox HTML. Procura pela primeira String.
	 * 
	 * @param Class c
	 * 
	 * @return String
	 */
	public static String getDataListAttributeDisplayValue (Class c)
	{
		List<Field> fields = WebComponent.getFields(c);
		
		for (Field field : fields)
		{
			if(field.getGenericType().equals(String.class))
			{
				return field.getName();
			}
		}
		
		return "nenhumaString";
	}
	
	/**
	 * Retorna o nome do atributo que será o value de cada option de um 
	 * combobox HTML. Procura naturalmente por 'id' ou 'idObjeto'.
	 * 
	 * @param Class c
	 * 
	 * @return String
	 */
	public static String getDataListAttributeValue (Class c)
	{
		List<Field> fields = WebComponent.getFields(c);
		
		// procurar por id ou idObjeto
		for (Field field : fields)
		{
			if(field.getName().equals("id") || field.getName().equals("id" + c.getSimpleName()))
			{
				return field.getName();
			}
		}
		
		return "idNaoAchado";
	}
	
	/**
	 * Retorna o objeto do tipo genérico do atributo do tipo List.
	 * 
	 * @param Field field
	 * 
	 * @return Class
	 */
	public static Class getGenericListType (Field field)
	{
		Class c = null;
		
		if(field != null)
		{
			Type type = field.getGenericType();
			
			if(type instanceof ParameterizedType)
			{
			    ParameterizedType parameterizedType = (ParameterizedType) type;
			    Type[] types = parameterizedType.getActualTypeArguments();
			    
			    for(Type arg : types)
			    {
			        c = (Class) arg;
			    }
			}
		}
		
		return c;
	}
	
	/**
	 * Cria uma variável EL identificadora para a classe para
	 * ser utilizada dentro do código JSP.
	 * 
	 * @param Class c
	 * 
	 * @return String
	 */
	public static String createELVarName (Class c)
	{
		return c.getSimpleName().toLowerCase();
	}
	
	/**
	 * Retorna todos os atributos de uma classe.
	 * 
	 * @param Class c
	 * 
	 * @return List
	 */
	public static List<Field> getFields (Class c)
	{
		List<Field> fields = new ArrayList<Field>();
		
		for (Field field : c.getDeclaredFields())
		{
			fields.add(field);
		}
		
		return fields;
	}
	
	/**
	 * Compara o nome de um Field com o Field interno do componente. Através
	 * deste método é possível fazer uma busca agil de todos os componentes
	 * mapeados de uma determinada classe. Assim também é possível encontrar e
	 * remover estes componentes com uma facilidade maior.
	 * 
	 * @param Field fieldName
	 * 
	 * @return boolean
	 */
	public boolean getWebComponentIdentificator (String fieldName)
	{
		return this.getField().getName().equals(fieldName);
	}

	public Class getClazz() {
		return clazz;
	}

	public void setClazz(Class clazz) {
		this.clazz = clazz;
	}

	public Field getField() {
		return field;
	}

	public void setField(Field field) {
		this.field = field;
	}

	public String getComponentID() {
		return componentID;
	}

	public void setComponentID(String componentID) {
		this.componentID = componentID;
	}

	public String getComponentName() {
		return componentName;
	}

	public void setComponentName(String componentName) {
		this.componentName = componentName;
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

	public String getComponentCSSClassName() {
		return componentCSSClassName;
	}

	public void setComponentCSSClassName(String componentCSSClassName) {
		this.componentCSSClassName = componentCSSClassName;
	}

	public String getComponentValue() {
		return componentValue;
	}

	public void setComponentValue(String componentValue) {
		this.componentValue = componentValue;
	}

	@Override
	public String toString() {
		return "WebComponent [clazz=" + clazz + ", componentCSSClassName="
				+ componentCSSClassName + ", componentDisabled="
				+ componentDisabled + ", componentID=" + componentID
				+ ", componentName=" + componentName + ", componentReadOnly="
				+ componentReadOnly + ", componentValue=" + componentValue
				+ ", field=" + field + "]";
	}
}
