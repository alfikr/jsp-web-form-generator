package br.inf.carlos.wfg.gui.object;

/**
 * Encapsular a regra de negócio para elementos
 * que contenham um objeto Class.
 * 
 * @author Carlos A. Junior
 */
@SuppressWarnings("unchecked")
public class ClassObject 
{
	private Class clazz;

	public ClassObject(Class clazz) {
		super();
		this.clazz = clazz;
	}

	public Class getClazz() {
		return clazz;
	}

	public void setClazz(Class clazz) {
		this.clazz = clazz;
	}

	@Override
	public String toString() {
		return this.getClazz().getSimpleName();
	}
}
