package br.inf.carlos.wfg.util;

import java.io.File;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import br.inf.carlos.wfg.annotations.WebFormBean;
import br.inf.carlos.wfg.annotations.WebFormBeanColumn;
import br.inf.carlos.wfg.components.WebFormComponent;
import br.inf.carlos.wfg.components.WebFormControllerComponent;
import br.inf.carlos.wfg.components.impl.WebFormComponentText;
import br.inf.carlos.wfg.object.WebFormObject;

/**
 * Esta classe contém métodos utilitários para a aplicação.
 * 
 * @author Carlos A. Junior
 */
public class WebFormUtil
{
	/**
	 * Retorna um ArrayList com todos os componentes Text que contenham uma mascara Javascript.
	 * 
	 * @param List<WebFormControllerComponent> controllers
	 * 
	 * @return
	 */
	public static List<WebFormComponent> getComponentsWithJavascriptMask (List<WebFormControllerComponent> controllers)
	{
		List<WebFormComponent> components = new ArrayList<WebFormComponent>();
		
		for (WebFormControllerComponent controller : controllers)
		{
			for (WebFormComponent component : controller.getComponents())
			{
				if(component instanceof WebFormComponentText)
				{
					if(component.getObject().getMascaraJavascript() != null && !component.getObject().getMascaraJavascript().equals(""))
					{
						components.add(component);
					}
				}
			}
		}
		
		return components;
	}
	
	public static boolean hasFieldWithJavascriptMask (List<WebFormControllerComponent> controllers)
	{
		boolean has = false;
		for (WebFormControllerComponent controller : controllers)
		{
			for (WebFormComponent component : controller.getComponents())
			{
				if(component.getObject().getMascaraJavascript() != null && !component.getObject().getMascaraJavascript().equals(""))
				{
					has = true;
					break;
				}
			}
		}
		
		return has;
	}
	
	/**
	 * Deixa a primeira letra de uma string em maiusculo.
	 * 
	 * @param s
	 * @return
	 */
	public static String capitalize (String s)
	{
		s = s.toLowerCase();
		
		return s.replaceFirst(s.substring(0, 1), s.substring(0, 1).toUpperCase());
	}
	
	/**
	 * Verifica se um determinado pacote informado existe. Faz a verificação
	 * baseado no contexto do projeto.
	 * Exemplo: br.inf.carlos será src/br/inf/carlos
	 * 
	 * @param String pacote
	 * 
	 * @return boolean
	 */
	public static boolean packageExists (String pacote)
	{
		pacote = "src/" + pacote.replace('.', File.separatorChar);
		File file = new File(pacote);
		
		return file.exists();
	}
	
	/**
	 * Verifica se uma class possui a annotation da interface WebFormBean.
	 * 
	 * @see WebFormBean
	 */
	@SuppressWarnings("unchecked")
	public static boolean hasWebFormBeanAnnotation (Class clazz)
	{
		return clazz.isAnnotationPresent(WebFormBean.class);
	}
	
	/**
	 * Retorna a configuração da annotation da classe mapeada.
	 * 
	 * @param Class clazz
	 * 
	 * @return WebFormBean
	 */
	@SuppressWarnings("unchecked")
	public static WebFormBean getWebFormBeanAnnotation (Class clazz)
	{
		if(clazz.isAnnotationPresent(WebFormBean.class))
		{
			return (WebFormBean) clazz.getAnnotation(WebFormBean.class);
		}
		else
		{
			return null;
		}
	}
	
	/**
	 * Retorna a configuração da annotation dos atributos da classe mapeada.
	 * 
	 * @param Class clazz
	 * 
	 * @return WebFormBeanColumn
	 */
	public static WebFormBeanColumn getWebFormBeanColumnAnnotation (Field field)
	{
		if(field != null)
		{
			if(field.isAnnotationPresent(WebFormBeanColumn.class))
			{
				Annotation[] annotations = field.getAnnotations();
				
				for (Annotation annotation : annotations)
				{
					if(annotation instanceof WebFormBeanColumn)
					{
						return (WebFormBeanColumn) annotation;
					}
				}
				return null;
			}
			else
			{
				return null;
			}
		}
		else
		{
			return null;
		}
	}
	
	/**
	 * Este método retorna um objeto WebFormObject populado com base numa referência de
	 * um objeto da annotation WebFormBeanColumn de um Bean mapeado.
	 * 
	 * @param WebFormBeanColumn column
	 * 
	 * @return WebFormObject object
	 */
	public static WebFormObject createWebFormObjectInstance (WebFormBeanColumn column, WebFormBean bean, Field field)
	{
		WebFormObject object = new WebFormObject();
		
		object.setComponentId		(column.id());
		object.setComponentName		(column.name());
		object.setComponentSize		(column.size());
		
		object.setComponentMaxLength(column.maxLength());
		object.setComponentCssClass	(column.cssClass());
		object.setComponentType		(column.type());
		
		object.setComponentLabel	(column.label());
		object.setBeanColumn		(column);
		object.setBean				(bean);
		
		object.setField				(field);
		object.setComponentValue	(column.value());
		object.setComponentCols		(column.cols());
		
		object.setComponentRows		(column.rows());
		object.setMascaraJavascript	(column.mascara());
		
		object.setComponentElementsData				(column.elements());
		object.setComponentElementsDisplayAttribute	(column.elementsDisplayAttribute());
		object.setComponentElementsValueAttribute	(column.elementsValueAttribute());
		
		if(object.getComponentLabel() == null || object.getComponentLabel().equals(""))
		{
			object.setComponentLabel(object.getField().getName());
		}
		
		// Caso esteja em branco.
		if(object.getComponentId() != null || object.getComponentId().equals(""))
		{
			object.setComponentId(object.getField().getName());
		}
		
		// Caso esteja em branco. ${cliente.nome}
		if(object.getComponentName() != null || object.getComponentName().equals(""))
		{
			object.setComponentName(object.getBean().elVarName() + "." + object.getField().getName());
		}
		
		return object;
	}
}
