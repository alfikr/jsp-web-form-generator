package br.inf.carlos.wfg.gui.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;

import br.inf.carlos.wfg.gui.object.ClassObject;

public class ClassComboBoxModel extends DefaultComboBoxModel
{
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unchecked")
	public ClassComboBoxModel(List<Class> classes)
	{
		super();
		List<ClassObject> objects = new ArrayList<ClassObject>();
		for (Class c : classes) {
			ClassObject o = new ClassObject(c);
			objects.add(o);
		}
		
		for (ClassObject co : objects) {
			this.addElement(co);
		}
	}

	public ClassComboBoxModel(Object[] items) {
		super(items);
	}

	public ClassComboBoxModel(Vector<?> v) {
		super(v);
	}
}
