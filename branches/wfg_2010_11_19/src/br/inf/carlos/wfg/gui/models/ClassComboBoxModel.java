package br.inf.carlos.wfg.gui.models;

import java.util.List;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;

import br.inf.carlos.wfg.components.WebFormControllerComponent;
import br.inf.carlos.wfg.gui.object.ClassObject;

public class ClassComboBoxModel extends DefaultComboBoxModel
{
	private static final long serialVersionUID = 1L;

	public ClassComboBoxModel(List<WebFormControllerComponent> controllers)
	{
		super();
		for (WebFormControllerComponent controller : controllers)
		{
			this.addElement(new ClassObject(controller.getClazz()));
		}
	}

	public ClassComboBoxModel(Object[] items) {
		super(items);
	}

	public ClassComboBoxModel(Vector<?> v) {
		super(v);
	}
}
