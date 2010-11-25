package br.inf.carlos.wfg2.gui.panels;

import java.lang.reflect.Field;
import java.util.List;

import javax.swing.JPanel;

import br.inf.carlos.wfg2.gui.FrameBase;
import br.inf.carlos.wfg2.gui.interfaces.IPainelComponente;

/**
 * Superclasse abstrata para definir e padronizar todos os formulários
 * JPanel em que o usuário irá preencher informações sobre os componentes
 * mapeados de uma classe.
 * 
 * Após o carregamento de uma JFrame, dentro de um componente JPanel serão carregados
 * N componentes PainelComponente, um para cada atributo da classe.
 * 
 * @author Carlos A. Junior
 */
public abstract class PainelComponente extends JPanel implements IPainelComponente
{
	private static final long serialVersionUID = 1L;
	
	private Class clazz;
	
	private Field field;
	
	private FrameBase frameBase;
	
	public PainelComponente(Class clazz, Field field, FrameBase frameBase)
	{
		super();
		this.clazz 		= clazz;
		this.field 		= field;
		this.frameBase 	= frameBase;
		
		this.initComponents();
		this.carregaCamposPainel();
	}
	
	protected abstract void initComponents();

	public static PainelComponente createPainelComponenteInstance (Field field, Class clazz, FrameBase frameBase)
	{
		PainelComponente componente = null;
		
		if(!field.getType().equals(List.class))
		{
			componente = new PainelComponenteText(clazz, field, frameBase);
		}
		else
		{
			componente = new PainelComponenteSelect(clazz, field, frameBase);
		}
		
		return componente;
	}

	public Class getClazz() {
		return clazz;
	}

	public void setClazz(Class clazz) {
		this.clazz = clazz;
	}

	public Field getField() {
		return field;
	}

	public void setField(Field field) {
		this.field = field;
	}

	public FrameBase getFrameBase() {
		return frameBase;
	}
}
