package br.inf.carlos.wfg2.component.impl;

import java.lang.reflect.Field;

import br.inf.carlos.wfg2.component.WebComponent;

public class WebComponentTextArea extends WebComponent
{
	private int cols;
	
	private int rows;
	
	public WebComponentTextArea(Class clazz, Field field)
	{
		super(clazz, field);
	}

	@Override
	public String renderComponent()
	{
		return null;
	}

	public int getCols() {
		return cols;
	}

	public void setCols(int cols) {
		this.cols = cols;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}
}
