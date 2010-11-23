package br.inf.carlos.wfg.gui.models;

import java.util.List;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;

import br.inf.carlos.wfg.gui.object.FieldObject;

public class FieldComboBoxModel extends DefaultComboBoxModel
{
	private static final long serialVersionUID = 1L;

	public FieldComboBoxModel(List<FieldObject> fields)
	{
		super();
		
		for (FieldObject field : fields) {
			this.addElement(field);
		}
		
	}

	public FieldComboBoxModel(Object[] items) {
		super(items);
	}

	public FieldComboBoxModel(Vector<?> v) {
		super(v);
	}
}
