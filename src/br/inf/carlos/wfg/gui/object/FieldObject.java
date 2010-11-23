package br.inf.carlos.wfg.gui.object;

import java.lang.reflect.Field;

public class FieldObject
{
	private Field field;
	private String displayName;
	
	public FieldObject(Field field, String displayName) {
		super();
		this.field = field;
		this.displayName = displayName;
	}
	public Field getField() {
		return field;
	}
	public void setField(Field field) {
		this.field = field;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	@Override
	public String toString()
	{
		if(this.field != null)
		{
			return this.displayName + " - " + this.field.getType().getSimpleName();
		}
		else
		{
			return this.displayName;
		}
	}
}
