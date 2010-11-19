package br.inf.carlos.wfg;

import java.io.IOException;
import java.util.List;

import br.inf.carlos.wfg.components.WebFormAnnotationMapper;
import br.inf.carlos.wfg.components.WebFormComponentFactory;
import br.inf.carlos.wfg.components.WebFormControllerComponent;
import br.inf.carlos.wfg.components.WebFormFile;
import br.inf.carlos.wfg.util.WebFormUtil;

public class WebFormApplication
{
	private String pacote;
	
	private String webContentDirectory;
	
	private String prefix;

	public WebFormApplication(String pacote, String webContentDirectory, String prefix)
	{
		super();
		this.pacote = pacote;
		this.webContentDirectory = webContentDirectory;
		this.prefix = prefix;
	}
	
	@SuppressWarnings("unchecked")
	public void buildWebForms () throws IOException, Exception
	{
		if(!WebFormUtil.packageExists(this.pacote))
		{
			throw new IOException("O pacote [" + this.pacote + "] não existe.");
		}
		else
		{
			WebFormAnnotationMapper mapper = new WebFormAnnotationMapper();
			List<Class> classes = mapper.getMappedBeans(this.pacote);
			
			if(classes != null && classes.size() > 0)
			{
				List<WebFormControllerComponent> controllers = WebFormComponentFactory.createWebFormComponentInstances(classes);
				
				WebFormFile file = new WebFormFile(this.webContentDirectory, this.prefix);
				
				if(!file.hasWebContentDirectory())
				{
					throw new IOException("O diretório WEB [" + this.webContentDirectory + "] não existe.");
				}
				else
				{
					if(file.createControllerFolders(classes))
					{
						file.createControllersJSPFiles(controllers);
					}
					else
					{
						throw new IOException("Não foi possível gerar as pastas dos controladores.");
					}
				}
			}
			else
			{
				throw new Exception("Nenhuma classe carregada.");
			}
		}
	}
}