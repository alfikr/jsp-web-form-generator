package br.inf.carlos.wfg.gui.panels;

import javax.swing.JPanel;

import br.inf.carlos.wfg.gui.interfaces.IPanelHTMLComponentConfigurator;
import br.inf.carlos.wfg.gui.object.FieldObject;
import br.inf.carlos.wfg.gui.object.ObjectProperties;

public abstract class PanelFieldsConfigurator extends JPanel implements IPanelHTMLComponentConfigurator
{
	private static final long serialVersionUID = 1L;
	
	private FieldObject fieldObject;
	private ObjectProperties objectProperties;
	
	/**
	 * Construtor padrão para os JPanels dos componentes HTML.
	 * 
	 * @param field
	 * @param objectProperties
	 */
	public PanelFieldsConfigurator (FieldObject field, ObjectProperties objectProperties)
	{
		this.fieldObject = field;
		this.objectProperties = objectProperties;
		
		this.initComponents();
	}
	
	protected abstract void initComponents();

	public FieldObject getFieldObject() {
		return fieldObject;
	}

	public ObjectProperties getObjectProperties() {
		return objectProperties;
	}
}
