package br.inf.carlos.wfg.gui.actions;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import br.inf.carlos.wfg.gui.forms.FrameMenuInicial;
import br.inf.carlos.wfg.gui.object.ObjectProperties;

public class DefinicaoListSelectListener implements ListSelectionListener
{
	/**
	 * Referencia para o objeto global.
	 */
	private ObjectProperties objectProperties;
	
	private FrameMenuInicial frameMenuInicial;
	
	public DefinicaoListSelectListener (ObjectProperties objectProperties, FrameMenuInicial frameMenuInicial)
	{
		this.objectProperties = objectProperties;
		this.frameMenuInicial = frameMenuInicial;
	}
	@Override
	public void valueChanged(ListSelectionEvent e)
	{
		// TODO Auto-generated method stub
		System.out.println("aqui");
		System.out.println(e.toString());
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
