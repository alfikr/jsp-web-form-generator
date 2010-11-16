package br.inf.carlos.webformgenerator.components;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;



public class WebFormFile
{
	private String webContentDirectory;
	
	private String prefix;
	
	public WebFormFile(String webContentDirectory, String prefix)
	{
		super();
		this.webContentDirectory 	= webContentDirectory;
		this.prefix					= prefix;
	}
	
	public boolean hasWebContentDirectory ()
	{
		File file = new File(this.webContentDirectory);
		
		return file.exists();
	}
	
	public boolean createControllersJSPFiles (List<WebFormControllerComponent> controllers) throws IOException
	{
		for (WebFormControllerComponent controller : controllers)
		{
			List<WebFormComponent> components  = controller.getComponents();
			
			WebFormLayout layout = new WebFormLayout();
			
			WebFormComponent component = components.get(0);
			
			String fileName = component.getObject().getBean().controllerFolderName();
			
			File file = new File(
				this.getWebContentDirectory() + File.separator + fileName + File.separator + fileName + "." + this.getPrefix()
			);
			
			if(!file.exists())
			{
				file.createNewFile();
			}
			
			FileOutputStream out = new FileOutputStream(file);
			
			out.write(layout.renderWebFormLayout(components).getBytes());
			out.flush();
			out.close();
		}
		return false;
	}
	
	@SuppressWarnings("unchecked")
	public boolean createControllerFolders (List<Class> classes) throws IOException
	{
		if(this.hasWebContentDirectory())
		{
			boolean sucesso = false;
			for (Class clazz : classes)
			{
				File file = new File(this.getWebContentDirectory() + File.separator + clazz.getSimpleName().toLowerCase());
				
				sucesso = !file.exists() ? file.mkdir() : true;
			}
			
			return sucesso;
		}
		else
		{
			throw new IOException("O diretório WEB [" + this.webContentDirectory + "] não existe para a geração dos controladores.");
		}
	}

	public String getWebContentDirectory() {
		return webContentDirectory;
	}

	public String getPrefix() {
		return prefix;
	}
}