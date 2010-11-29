package br.inf.carlos.wfg2.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import br.inf.carlos.wfg2.component.WebClass;
import br.inf.carlos.wfg2.exceptions.DefaultApplicationException;

public class ControllerHelper
{
	private WebClass webClass;

	public ControllerHelper(WebClass webClass)
	{
		super();
		this.webClass = webClass;
	}
	
	private String classContent ()
	{
		String content = "";
		
		content += "package " + this.getWebClass().getOutputPackage() + ";\n\n";
		
		content += "import br.com.caelum.vraptor.Path;\n";
		content += "import br.com.caelum.vraptor.Resource;\n";
		
		content += "\n";
		content += "@Resource";
		content += "\n";
		content += "public class " + this.getWebClass().getControllerClassName() + "\n";
		content += "{";
		content += "\n";
		
		content += "\tpublic " + this.getWebClass().getControllerClassName() + " ()";
		content += "\n";
		content += "\t{";
		content += "\n";
		content += "\n";
		content += "\t}";
		content += "\n\n";
		
		content += "\t@Path(" + this.getWebClass().getDefaultViews() + ")\n";
		content += "\tpublic void home ()";
		content += "\n";
		content += "\t{";
		content += "\n";
		content += "\n";
		content += "\t}";
		content += "\n";
		
		content += "}";
		
		return content;
	}
	
	public boolean createClassController () throws IOException, DefaultApplicationException
	{
		if(this.getWebClass().getControllerClassName().isEmpty())
		{
			throw new DefaultApplicationException(
				"O nome do controlador da classe [" + this.getWebClass().getClazz().getSimpleName() + "] não foi definido."
			);
		}
		
		if(this.getWebClass().getOutputPackage().isEmpty())
		{
			throw new DefaultApplicationException(
				"O pacote do controlador da classe [" + this.getWebClass().getClazz().getSimpleName() + "] não foi definido."
			);
		}
		
		
		String out = this.getWebClass().getOutputPackage().replace(".", File.separator);
		
		System.out.println("." + File.separator + "src" + File.separator + out);
		
		File pkg = new File("." + File.separator + "src" + File.separator + out);
		
		if(!pkg.exists())
		{
			pkg.mkdirs();
		}
		
		if(pkg.exists())
		{
			String classContent = this.classContent();
			
			File classe = new File(
				"." + File.separator + "src" + File.separator + out + File.separator + this.getWebClass().getControllerClassName() + ".java"
			);
			
			if(classe.exists())
			{
				classe.delete();
			}
			
			if(classe.createNewFile())
			{
				FileOutputStream output = new FileOutputStream(classe);
				
				output.write(classContent.getBytes());
				output.flush();
				output.close();
				
				return true;
			}
			else
			{
				throw new IOException("Erro ao criar a classe do controlador [" + this.getWebClass().getControllerClassName() + "].");
			}
		}
		else
		{
			throw new IOException("Erro ao criar a estrutura dos pacotes dos controladores.");
		}
	}
	
	public WebClass getWebClass() {
		return webClass;
	}

	public void setWebClass(WebClass webClass) {
		this.webClass = webClass;
	}
}
