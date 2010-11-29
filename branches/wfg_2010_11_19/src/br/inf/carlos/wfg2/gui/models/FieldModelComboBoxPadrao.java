package br.inf.carlos.wfg2.gui.models;

import java.lang.reflect.Field;
import java.util.List;

import javax.swing.DefaultComboBoxModel;

public class FieldModelComboBoxPadrao extends DefaultComboBoxModel
{
	private static final long serialVersionUID = 1L;
	
	public FieldModelComboBoxPadrao (List<Field> fields)
	{
		for (Field field : fields)
		{
			this.addElement(field.getName());
		}
	}
}
