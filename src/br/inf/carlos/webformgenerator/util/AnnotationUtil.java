package br.inf.carlos.wfg.util;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import br.inf.carlos.wfg.annotations.WebFormBean;
import br.inf.carlos.wfg.annotations.WebFormBeanColumn;

public class AnnotationUtil
{
	public static WebFormBean getWebFormBeanAnnotationFromClass (Class clazz)
	{
		if(AnnotationUtil.hasWebFormBeanAnnotation(clazz))
		{
			Annotation[] annotations = clazz.getAnnotations();
			
			for (Annotation annotation : annotations)
			{
				if(annotation instanceof WebFormBean)
				{
					return (WebFormBean) annotation;
				}
			}
			return null;
		}
		else
		{
			return null;
		}
	}
	
	@SuppressWarnings("unchecked")
	public static ArrayList<Field> getAnnotedFields(Class clazz)
	{
		List<Field> annotedFields = new ArrayList<Field>();
		
		Field[] fields = clazz.getDeclaredFields();
		
		for (Field field : fields)
		{
			if(field.isAnnotationPresent(WebFormBeanColumn.class))
			{
				annotedFields.add(field);
			}
		}
		
		return (ArrayList<Field>) annotedFields;
	}
	
	@SuppressWarnings("unchecked")
	public static boolean hasWebFormBeanAnnotation (Class clazz)
	{
		return clazz.isAnnotationPresent(WebFormBean.class);
	}
}
