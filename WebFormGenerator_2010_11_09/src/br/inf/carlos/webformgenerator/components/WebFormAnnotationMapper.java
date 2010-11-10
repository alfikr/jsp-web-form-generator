package br.inf.carlos.webformgenerator.components;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import br.inf.carlos.webformgenerator.util.ExtensionFileFilter;
import br.inf.carlos.webformgenerator.util.WebFormUtil;


public class WebFormAnnotationMapper
{
	/**
	 * Este método carrega todas as classes mapeadas de um determinado pacote.
	 * 
	 * @param String pkg caminho do pacote. <br/>Exemplo: <code>br.inf.carlos.beans</code>
	 * 
	 * @return List<Class> objects
	 */
	@SuppressWarnings("unchecked")
	public List<Class> getMappedBeans (String pkg)
	{
		String pacoteName = pkg;
		pkg = "src/" + pkg.replace('.', File.separatorChar);
		
		File pacote = new File(pkg);
		
		if(!pacote.exists() || !pacote.isDirectory())
		{
			return null;
		}
		
		File[] files = pacote.listFiles(new ExtensionFileFilter(".java"));
		
		List<Class> objects = new ArrayList<Class>();
		for (File file : files)
		{
			try {
				Class o = this.getClassReferenceByClassName(file.getName(), pacoteName);
				
				if(o != null)
				{
					objects.add(o);
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		return objects;
	}
	
	/**
	 * Retorna uma referencia para a classe mapeada.
	 * 
	 * @param String className
	 * 
	 * @param String pacoteName
	 * 
	 * @return Class cl
	 * 
	 * @throws ClassNotFoundException
	 */
	@SuppressWarnings("unchecked")
	private Class getClassReferenceByClassName (String className, String pacoteName) throws ClassNotFoundException
	{
		className = className.replaceAll(".java", "");
		
		Class cl = Class.forName(pacoteName + "." + className);
		
		if(cl != null)
		{
			if(WebFormUtil.hasWebFormBeanAnnotation(cl))
			{
				return cl;
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
}
