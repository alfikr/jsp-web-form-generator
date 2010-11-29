package br.inf.carlos.wfg2.gui.interfaces;

import br.inf.carlos.wfg2.component.WebComponent;

/**
 * Interface padrão para todas as classes que estendem da
 * superclasse abstrata PainelComponente.
 * 
 * @author Carlos A. Junior
 */
public interface IPainelComponente
{
	/**
	 * Este método cria o preenchimento dos campos na inicialização dos paineis.
	 */
	public void carregaCamposPainel ();
	/**
	 * Retorna um objeto WebComponent a partir das informações
	 * que o usuário preencheu na tela.
	 * 
	 * @return WebComponent
	 */
	public WebComponent getWebComponent ();
	
	/**
	 * Este método seta nos campos do formulário um componente que
	 * estende a classe WebComponent.
	 * 
	 *  @param WebComponent component
	 */
	public void setWebComponent (WebComponent component);
	
	public boolean validatePainelFields ();
}
