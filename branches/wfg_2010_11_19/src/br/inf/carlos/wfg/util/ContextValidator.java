package br.inf.carlos.wfg.util;

import java.io.File;
import java.io.IOException;

public class ContextValidator
{
	public static boolean isValidWebProjectContext () throws IOException
	{
		boolean valid = false;
		File current = new File("WebContent/");
		System.out.println(current.getCanonicalPath());
		
		valid = current.exists();
		
		if(valid)
		{
			File libDir = new File("WebContent" + File.separator + "WEB-INF" + File.separator + "lib/");
			
			valid = libDir.exists();
		}
		
		return valid;
	}
}
