package br.inf.carlos.wfg2.file.layout;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
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
			
			String html = "<%@ taglib prefix=\"fmt\" uri=\"http://java.sun.com/jsp/jstl/fmt\" %>\n" +
						  "<%@ taglib prefix=\"c\" uri=\"http://java.sun.com/jsp/jstl/core\" %>\n\n";
			
			html += this.createHTML();
			
			try
			{
				// Cria o arquivo JSP e o seu conteúdo com o charset ISO.
		        Writer out = new BufferedWriter(new OutputStreamWriter(
		            new FileOutputStream(jspFile), "ISO-8859-1"));
		        out.write(html);
		        out.close();
		    } catch (UnsupportedEncodingException eu){
		    	eu.printStackTrace();
		    }
			
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
