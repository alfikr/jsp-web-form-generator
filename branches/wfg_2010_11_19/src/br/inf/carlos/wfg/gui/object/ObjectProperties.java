package br.inf.carlos.wfg.gui.object;

import java.util.List;

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
}
