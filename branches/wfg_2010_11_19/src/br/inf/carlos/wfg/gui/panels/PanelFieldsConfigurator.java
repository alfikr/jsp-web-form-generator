package br.inf.carlos.wfg.gui.panels;

import javax.swing.JPanel;

import br.inf.carlos.wfg.gui.interfaces.IPanelHTMLComponentConfigurator;
import br.inf.carlos.wfg.gui.object.FieldObject;
import br.inf.carlos.wfg.gui.object.ObjectProperties;

/**
 * Superclasse para todos os JPanel que irão conter os formulários de 
 * configuração dos componentes HTML.
 * 
 * @author Carlos A. Junior
 */
public abstract class PanelFieldsConfigurator extends JPanel implements IPanelHTMLComponentConfigurator
{
	private static final long serialVersionUID = 1L;
	
	private FieldObject fieldObject;
	
	/**
	 * Referência global para este objeto.
	 * 
	 * @see FrameMenuPrincipal
	 */
	private ObjectProperties objectProperties;
	
	private Class clazz;
	
	/**
	 * Construtor padrão para os JPanels dos componentes HTML.
	 * 
	 * @param field
	 * @param objectProperties
	 */
	public PanelFieldsConfigurator (FieldObject field, ObjectProperties objectProperties, Class clazz)
	{
		this.fieldObject 		= field;
		this.objectProperties 	= objectProperties;
		this.clazz				= clazz;
		
		this.initComponents();
	}
	
	public Class getClazz() {
		return clazz;
	}

	protected abstract void initComponents();

	public FieldObject getFieldObject() {
		return fieldObject;
	}

	public ObjectProperties getObjectProperties() {
		return objectProperties;
	}
}
