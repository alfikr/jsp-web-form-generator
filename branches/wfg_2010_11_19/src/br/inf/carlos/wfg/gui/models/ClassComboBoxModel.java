package br.inf.carlos.wfg.gui.models;

import java.util.List;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;

public class ClassComboBoxModel extends DefaultComboBoxModel
{
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unchecked")
	public ClassComboBoxModel(List<Class> classes)
	{
		super();
		
		for (Class c : classes) {
			this.addElement(c);
		}
		
	}

	public ClassComboBoxModel(Object[] items) {
		super(items);
	}

	public ClassComboBoxModel(Vector<?> v) {
		super(v);
	}
}
