package br.inf.carlos.wfg.gui.actions;

import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import br.inf.carlos.wfg.gui.FrameMenuInicial;
import br.inf.carlos.wfg.gui.object.ObjectProperties;

public class DefinicaoListSelectListener implements ListSelectionListener
{
	/**
	 * Referencia para o objeto global.
	 */
	private ObjectProperties objectProperties;
	
	private FrameMenuInicial frameMenuInicial;
	
	private JList lista;
	
	public DefinicaoListSelectListener (ObjectProperties objectProperties, FrameMenuInicial frameMenuInicial, JList lista)
	{
		this.objectProperties = objectProperties;
		this.frameMenuInicial = frameMenuInicial;
		this.lista			  = lista;
	}
	@Override
	public void valueChanged(ListSelectionEvent e)
	{
		System.out.println(this.getLista().getSelectedValue());
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
	public JList getLista() {
		return lista;
	}
	public void setLista(JList lista) {
		this.lista = lista;
	}
}
