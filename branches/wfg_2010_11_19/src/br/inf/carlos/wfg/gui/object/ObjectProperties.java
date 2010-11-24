package br.inf.carlos.wfg.gui.object;

import java.util.ArrayList;
import java.util.List;

import br.inf.carlos.wfg.components.WebFormComponent;
import br.inf.carlos.wfg.components.WebFormControllerComponent;

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
	
	/**
	 * List com todos os controladores dos componentes HTML.
	 */
	private List<WebFormControllerComponent> controllers;
	
	public ObjectProperties()
	{
		this.controllers			= new ArrayList<WebFormControllerComponent>();
	}
	
	public boolean setWebFormComponentByClassName (Class c, WebFormComponent newComponentSettings)
	{
		for (WebFormControllerComponent controller : this.controllers)
		{
			for (WebFormComponent component : controller.getComponents())
			{
				if(component.getClazz().equals(c))
				{
					component = newComponentSettings;
					return true;
				}
			}
		}
		
		return false;
	}
	
	/**
	 * Retorna os dados de um WebFormComponent baseado no nome da classe mapeada, 
	 * por exemplo: Cliente.class.
	 * 
	 * @param Class c - nome da classe mapeada, exemplo: Cliente, Aluno, etc.
	 * 
	 * @return WebFormComponent component - uma instância do objeto.
	 */
	public WebFormComponent findWebFormComponentByClassName (Class c)
	{
		for (WebFormControllerComponent controller : this.controllers)
		{
			for (WebFormComponent component : controller.getComponents())
			{
				if(component.getClazz().equals(c))
				{
					return component;
				}
			}
		}
		
		return null;
	}
	
	/**
	 * Verifica se a classe já foi adicionada nos elementos WebFormComponent.
	 * 
	 * @param Class c
	 * 
	 * @return
	 */
	public boolean hasClassInWebFormControllerComponents (Class c)
	{
		for (WebFormControllerComponent controller : this.controllers)
		{
			for (WebFormComponent component : controller.getComponents())
			{
				if(component.getClazz().equals(c))
				{
					return true;
				}
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

	public List<WebFormControllerComponent> getControllers() {
		return controllers;
	}
}
