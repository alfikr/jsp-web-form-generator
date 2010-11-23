package br.inf.carlos.wfg.components;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import br.inf.carlos.wfg.gui.object.FieldObject;

@SuppressWarnings("unchecked")
public class WebComponent implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private Class clazz;
	
	private List<FieldObject> fields;
	
	public WebComponent ()
	{
		this.fields = new ArrayList<FieldObject>();
	}

	public Class getClazz() {
		return clazz;
	}

	public void setClazz(Class clazz) {
		this.clazz = clazz;
	}

	public List<FieldObject> getFields() {
		return fields;
	}

	public void setFields(List<FieldObject> fields) {
		this.fields = fields;
	}
}
