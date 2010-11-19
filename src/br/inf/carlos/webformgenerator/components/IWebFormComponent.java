package br.inf.carlos.wfg.components;

/**
 * Interface padrão para todos os componentes HTML a serem renderizados
 * para os arquivos JSPs.
 * 
 * @author Carlos A. Junior
 */
public interface IWebFormComponent
{
	/**
	 * Método padrão para desenhar um componente HTML para o
	 * arquivo JSP final.
	 * 
	 * @return String html
	 */
	public String renderComponent ();
}
