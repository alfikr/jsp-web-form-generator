package br.inf.carlos.webformgenerator.util;

import java.io.File;
import java.io.FileFilter;

/**
 * Esta classe aplica um filtro para a listagem de somente arquivos .java
 * 
 * @author Carlos
 */
public class ExtensionFileFilter implements FileFilter
{
	private String extension;
	
	public ExtensionFileFilter (String extension)
	{
		this.extension = extension;
	}
	
	@Override
	public boolean accept(File file)
	{
		if(file.isDirectory())
		{
			return false;
		}
		
		if(file.getName().endsWith(this.extension))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
