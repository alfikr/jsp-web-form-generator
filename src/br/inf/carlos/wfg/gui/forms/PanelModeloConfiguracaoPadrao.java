package br.inf.carlos.wfg.gui.forms;

import javax.swing.JPanel;

import br.inf.carlos.wfg.gui.FrameMenuInicial;
import br.inf.carlos.wfg.gui.object.ObjectProperties;

/**
 * Modelo padrão para o JPanel que irá apresentar os atributos da classe que será passada
 * por parâmetro.
 * 
 * @author Carlos A. Junior
 * 
 * @see JPanel
 */
public class PanelModeloConfiguracaoPadrao extends JPanel
{
	private static final long serialVersionUID = 1L;
	
	private ObjectProperties objectProperties;
	
	private FrameMenuInicial frameMenuInicial;

	public PanelModeloConfiguracaoPadrao(ObjectProperties objectProperties, FrameMenuInicial frameMenuInicial)
	{
		this.objectProperties = objectProperties;
		this.frameMenuInicial = frameMenuInicial;
	}

	public ObjectProperties getObjectProperties() {
		return objectProperties;
	}

	public void setObjectProperties(ObjectProperties objectProperties) {
		this.objectProperties = objectProperties;
	}

	public FrameMenuInicial getFrameMenuInicial() {
		return frameMenuInicial;
	}

	public void setFrameMenuInicial(FrameMenuInicial frameMenuInicial) {
		this.frameMenuInicial = frameMenuInicial;
	}
}
