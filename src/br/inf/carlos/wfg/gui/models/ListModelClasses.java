package br.inf.carlos.wfg.gui.models;

import java.util.ArrayList;
import java.util.List;

import javax.swing.AbstractListModel;

/**
 * Implementa uma AbstractListModel para colocar todas as classes 
 * carregadas do pacote informado pelo usuário.
 * 
 * @author Carlos A. Junior
 * 
 * @see AbstractListModel
 */
public class ListModelClasses extends AbstractListModel
{
	private static final long serialVersionUID = 1L;
	
	private List<String> elementos;
	
	@SuppressWarnings("unchecked")
	public ListModelClasses(List<Class> classes)
	{
		this.elementos = new ArrayList<String>();
		
		for (Class c : classes)
		{
			this.elementos.add(c.getName());
		}
	}
	
	@Override
	public Object getElementAt(int index)
	{
		return this.elementos.get(index);
	}

	@Override
	public int getSize()
	{
		return this.elementos.size();
	}
	
}
