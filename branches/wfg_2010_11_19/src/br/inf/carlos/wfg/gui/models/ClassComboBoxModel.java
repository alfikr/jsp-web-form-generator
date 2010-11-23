package br.inf.carlos.wfg.gui.models;

import java.util.List;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;

import br.inf.carlos.wfg.components.WebComponent;
import br.inf.carlos.wfg.gui.object.ClassObject;

public class ClassComboBoxModel extends DefaultComboBoxModel
{
	private static final long serialVersionUID = 1L;

	public ClassComboBoxModel(List<WebComponent> components)
	{
		super();
		for (WebComponent component : components)
		{
			this.addElement(new ClassObject(component.getClazz()));
		}
	}

	public ClassComboBoxModel(Object[] items) {
		super(items);
	}

	public ClassComboBoxModel(Vector<?> v) {
		super(v);
	}
}
