package br.inf.carlos.wfg2.file;

import br.inf.carlos.wfg2.component.WebClass;
import br.inf.carlos.wfg2.exceptions.WebComponentEmptyException;

public class RenderHTMLApplication
{
	private WebClass webClass;

	public RenderHTMLApplication(WebClass webClass) throws WebComponentEmptyException
	{
		super();
		this.webClass = webClass;
		
		if(this.getWebClass().getComponents().isEmpty())
		{
			throw new WebComponentEmptyException("Nenhum componente HTML mapeado");
		}
	}

	public WebClass getWebClass() {
		return webClass;
	}

	public void setWebClass(WebClass webClass) {
		this.webClass = webClass;
	}
}
