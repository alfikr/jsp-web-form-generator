package br.inf.carlos.wfg.gui.object;

import java.util.ArrayList;
import java.util.List;

import br.inf.carlos.wfg.components.WebFormControllerComponent;

/**
 * Objeto padrão para armazenar todas as configurações feitas na aplicação
 * GUI para a modelagem dos formulários HTML.
 * 
 * @author Carlos A. Junior
 */
public class ObjectProperties
{
	private String diretorioClasses;
	@SuppressWarnings("unchecked")
	private List<Class> classesSelecionadas;
	
	private List<WebFormControllerComponent> controllers;
	
	public ObjectProperties()
	{
		this.classesSelecionadas = new ArrayList<Class>();
		this.controllers		 = new ArrayList<WebFormControllerComponent>();
	}

	public String getDiretorioClasses() {
		return this.diretorioClasses;
	}

	@SuppressWarnings("unchecked")
	public List<Class> getClassesSelecionadas() {
		return this.classesSelecionadas;
	}

	@SuppressWarnings("unchecked")
	public void setClassesSelecionadas(List<Class> classes) {
		this.classesSelecionadas = classes;
	}

	public void setDiretorioClasses(String dir) {
		this.diretorioClasses = dir;
	}

	public List<WebFormControllerComponent> getControllers() {
		return controllers;
	}

	public void setControllers(List<WebFormControllerComponent> controllers) {
		this.controllers = controllers;
	}
}
