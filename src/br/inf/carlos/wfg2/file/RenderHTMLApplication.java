package br.inf.carlos.wfg2.file;

import java.io.File;
import java.io.IOException;

import javax.swing.JOptionPane;

import br.inf.carlos.wfg2.component.WebClass;
import br.inf.carlos.wfg2.exceptions.DefaultApplicationException;
import br.inf.carlos.wfg2.exceptions.WebComponentEmptyException;
import br.inf.carlos.wfg2.file.layout.WebLayout;
import br.inf.carlos.wfg2.file.layout.impl.DefaultWebTableLayout;

public class RenderHTMLApplication
{
	private WebClass webClass;

	public RenderHTMLApplication(WebClass webClass) throws WebComponentEmptyException, IOException
	{
		super();
		this.webClass = webClass;
		
		if(this.getWebClass().getComponents().isEmpty())
		{
			throw new WebComponentEmptyException("Nenhum componente HTML mapeado");
		}
	}
	
	public void createApplication () throws IOException
	{
		if(!this.validateProjectStructure())
		{
			File root = new File("." + File.separator + "WebContent" + File.separator + "WEB-INF" + File.separator + "jsp");
			root.mkdirs();
		}
		
		
		if(this.validateProjectStructure())
		{
			try {
				WebLayout layout = new DefaultWebTableLayout(this.getWebClass().getClazz(), this.getWebClass().getComponents());
				
				String html = layout.createHTML();
				
				System.out.println("CRIANDO HTML...");
				
				ControllerHelper helper = new ControllerHelper(this.getWebClass());
				
				try {
					if(helper.createClassController())
					{
						JOptionPane.showMessageDialog(null, "Controlador criado com sucesso");
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Erro ao criar o Controlador");
					}
				} catch (DefaultApplicationException ee) {
					ee.printStackTrace();
				}
				
			} catch (WebComponentEmptyException e) {
				e.printStackTrace();
			}
		}
		else
		{
			throw new IOException("Não foi possível criar a estrutura dos arquivos.");
		}
	}
	
	/**
	 * Verifica se existe o diretório WEB padrão do VRaptor 3.
	 * 
	 * @return boolean
	 */
	public boolean validateProjectStructure ()
	{
		File root = new File("." + File.separator + "WebContent" + File.separator + "WEB-INF" + File.separator + "jsp");
		
		return (root.exists() && root.isDirectory());
	}

	public WebClass getWebClass() {
		return webClass;
	}

	public void setWebClass(WebClass webClass) {
		this.webClass = webClass;
	}
}
