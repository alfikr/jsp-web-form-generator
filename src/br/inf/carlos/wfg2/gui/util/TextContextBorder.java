package br.inf.carlos.wfg2.gui.util;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.border.Border;
import javax.swing.text.JTextComponent;

public class TextContextBorder implements Border
{
	Border defaultBorder, mandatoryBorder;

	
	public TextContextBorder(Border defaultBorder, Border mandatoryBorder)
	{
		this.defaultBorder = defaultBorder;
		this.mandatoryBorder = mandatoryBorder;
	}
	
	@Override
	public Insets getBorderInsets(Component c)
	{
		return defaultBorder.getBorderInsets(c);
	}

	@Override
	public boolean isBorderOpaque()
	{
		return defaultBorder.isBorderOpaque();
	}

	@Override
	public void paintBorder(Component c, Graphics g, int x, int y, int width, int height)
	{
		JTextComponent t = (JTextComponent) c;
	    
		if (t.getText().isEmpty())
		{
	      mandatoryBorder.paintBorder(c, g, x, y, width, height);
	    }
		else
		{
	      defaultBorder.paintBorder(c, g, x, y, width, height);
	    }
	}

}
