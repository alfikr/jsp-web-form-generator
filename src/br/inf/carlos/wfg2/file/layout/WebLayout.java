package br.inf.carlos.wfg2.file.layout;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import br.inf.carlos.wfg2.component.WebClass;
import br.inf.carlos.wfg2.component.WebComponent;
import br.inf.carlos.wfg2.exceptions.WebComponentEmptyException;

/**
 * Superclasse abstrata para padronizar todas as classes que irão prover
 * os layouts HTML para os formulários.
 * 
 * @author Carlos A. Junior
 */
public abstract class WebLayout implements IWebLayout
{
	private List<WebComponent> components;
	
	private WebClass webClass;
	
	public WebLayout (WebClass webClass, List<WebComponent> components) throws WebComponentEmptyException
	{
		this.components = components;
		this.webClass 	= webClass;
		
		if(this.components == null || this.components.size() == 0)
		{
			throw new WebComponentEmptyException("Nenhum componente foi encontrado para a geração do formulário.");
		}
	}
	
	public boolean createHTMLFiles () throws IOException
	{
		String fileName = this.getWebClass().getClazz().getSimpleName();
		
		String webDir = 
			"." + File.separator + "WebContent" + File.separator + "WEB-INF" + File.separator + "jsp" + File.separator + fileName.toLowerCase();
		
		File diretorio = new File(webDir);
		
		if(!diretorio.exists())
		{
			diretorio.mkdirs();
		}
		
		if(!diretorio.exists())
		{
			throw new IOException("Não foi possível criar a pasta JSP do controlador [" + fileName + "]");
		}
		else
		{
			String jspFile = 
				"." + File.separator + "WebContent" + File.separator + "WEB-INF" + File.separator + "jsp" + 
				File.separator + fileName.toLowerCase() + File.separator + "home.jsp";
			
			File jsp = new File(jspFile);
			
			if(jsp.exists())
			{
				jsp.delete();
			}
			
			jsp.createNewFile();
			
			FileOutputStream output = new FileOutputStream(jsp);
			
			output.write(this.createHTML().getBytes());
			output.flush();
			output.close();
			
			return true;
			
		}
	}

	public List<WebComponent> getComponents() {
		return components;
	}

	public void setComponents(List<WebComponent> components) {
		this.components = components;
	}

	public WebClass getWebClass() {
		return webClass;
	}

	public void setWebClass(WebClass webClass) {
		this.webClass = webClass;
	}
}
