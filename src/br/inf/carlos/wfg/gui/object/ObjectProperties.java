package br.inf.carlos.wfg.gui.object;

import java.util.ArrayList;
import java.util.List;

import br.inf.carlos.wfg.components.WebComponent;

/**
 * Objeto padrão para armazenar todas as configurações feitas na aplicação
 * GUI para a modelagem dos formulários HTML.
 * 
 * @author Carlos A. Junior
 */
@SuppressWarnings("unchecked")
public class ObjectProperties
{
	private String diretorioClasses;
	
	private List<WebComponent> components;
	
	public ObjectProperties()
	{
		this.components				= new ArrayList<WebComponent>();
	}
	
	/**
	 * Verifica se a classe já foi adicionada nos elementos WebFormComponent.
	 * 
	 * @param Class c
	 * 
	 * @return
	 */
	public boolean hasClassInWebComponents (Class c)
	{
		for (WebComponent component : this.components)
		{
			if(component.getClazz().equals(c))
			{
				return true;
			}
		}
		return false;
	}

	public String getDiretorioClasses() {
		return diretorioClasses;
	}

	public void setDiretorioClasses(String diretorioClasses) {
		this.diretorioClasses = diretorioClasses;
	}

	public List<WebComponent> getComponents() {
		return components;
	}

	public void setComponents(List<WebComponent> components) {
		this.components = components;
	}

	@Override
	public String toString() {
		return "ObjectProperties [components=" + components
				+ ", diretorioClasses=" + diretorioClasses + "]";
	}
}
