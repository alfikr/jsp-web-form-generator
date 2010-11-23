package br.inf.carlos.wfg.gui.models;

import java.util.List;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;

public class CustomComboBoxModel extends DefaultComboBoxModel
{
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unchecked")
	public CustomComboBoxModel(List<Class> classes)
	{
		super();
		
		for (Class c : classes) {
			this.addElement(c);
		}
		
	}

	public CustomComboBoxModel(Object[] items) {
		super(items);
	}

	public CustomComboBoxModel(Vector<?> v) {
		super(v);
	}
}
