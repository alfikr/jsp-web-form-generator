package br.inf.carlos.wfg.components;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import br.inf.carlos.wfg.annotations.WebFormBeanColumn;
import br.inf.carlos.wfg.components.impl.WebFormComponentCheckBox;
import br.inf.carlos.wfg.components.impl.WebFormComponentRadioBox;
import br.inf.carlos.wfg.components.impl.WebFormComponentSelect;
import br.inf.carlos.wfg.components.impl.WebFormComponentText;
import br.inf.carlos.wfg.components.impl.WebFormComponentTextArea;
import br.inf.carlos.wfg.object.WebFormObject;
import br.inf.carlos.wfg.util.WebFormUtil;


public class WebFormComponentFactory
{
	/**
	 * Este método estático cria uma instancia de todos os atributos mapeados das classes mapeadas.
	 * 
	 * @param List<Class> classes
	 * 
	 * @return List<WebFormComponent>
	 */
	@SuppressWarnings("unchecked")
	public static List<WebFormControllerComponent> createWebFormComponentInstances (List<Class> classes)
	{
		List<WebFormControllerComponent> controllers = new ArrayList<WebFormControllerComponent>();
		
		for (Class clazz : classes)
		{
			Field[] fields = WebFormComponentFactory.getFields(clazz);
			
			List<WebFormComponent> components = new ArrayList<WebFormComponent>();
			
			for (Field field : fields)
			{
				if(field.isAnnotationPresent(WebFormBeanColumn.class))
				{
					WebFormObject object = WebFormUtil.createWebFormObjectInstance(
						WebFormUtil.getWebFormBeanColumnAnnotation(field),
						WebFormUtil.getWebFormBeanAnnotation(clazz),
						field
					);
	
					WebFormComponent component = WebFormComponentFactory.createInstance(object);
					components.add(component);
				}
			}
			
			WebFormControllerComponent controller = new WebFormControllerComponent(components, clazz);
			controllers.add(controller);
		}
		
		return controllers;
	}
	
	/**
	 * Retorna todos os atributos a classe informada.
	 * 
	 * @param Class clazz
	 * @return Field[]
	 */
	@SuppressWarnings("unchecked")
	private static Field[] getFields (Class clazz)
	{
		return clazz.getDeclaredFields();
	}
	
	/**
	 * Cria uma instancia dinamica do WebFormComponent baseado no tipo do campo mapeado do
	 * atributo da classe.
	 * 
	 * @param WebFormObject object
	 * 
	 * @return WebFormComponent
	 */
	public static WebFormComponent createInstance (WebFormObject object)
	{
		WebFormComponent component = null;
		
		switch (object.getComponentType())
		{
			case TEXT:
				component = new WebFormComponentText(object);
			break;
			case SELECT:
				component = new WebFormComponentSelect(object);
			break;
			case TEXTAREA:
				component = new WebFormComponentTextArea(object);
			break;
			case CHECKBOX:
				component = new WebFormComponentCheckBox(object);
			break;
			case RADIOBOX:
				component = new WebFormComponentRadioBox(object);
			break;
		}
		
		return component;
	}
}
