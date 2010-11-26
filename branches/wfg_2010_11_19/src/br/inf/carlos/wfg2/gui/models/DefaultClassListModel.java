package br.inf.carlos.wfg2.gui.models;

import java.util.List;

import javax.swing.DefaultListModel;

public class DefaultClassListModel extends DefaultListModel
{
	private List<Class> classes;
	
	public DefaultClassListModel(List<Class> classes) {
		super();
		this.classes = classes;
		
		for (Class c : classes)
		{
			this.addElement(c);
		}
	}

	@Override
	public Object getElementAt(int arg0)
	{
		return this.elementAt(arg0);
	}

	@Override
	public int getSize() {
		return this.classes.size();
	}
}
