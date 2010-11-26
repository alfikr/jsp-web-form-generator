package br.inf.carlos.wfg2.file.layout;

import java.util.List;

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
	
	private Class clazz;
	
	public WebLayout (Class clazz, List<WebComponent> components) throws WebComponentEmptyException
	{
		this.components = components;
		this.clazz		= clazz;
		
		if(this.components == null || this.components.size() == 0)
		{
			throw new WebComponentEmptyException("Nenhum componente foi encontrado para a geração do formulário.");
		}
	}

	public List<WebComponent> getComponents() {
		return components;
	}

	public void setComponents(List<WebComponent> components) {
		this.components = components;
	}

	public Class getClazz() {
		return clazz;
	}

	public void setClazz(Class clazz) {
		this.clazz = clazz;
	}
}
