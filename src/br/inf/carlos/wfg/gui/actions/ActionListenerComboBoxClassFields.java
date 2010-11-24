package br.inf.carlos.wfg.gui.actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JComboBox;

import org.netbeans.lib.awtextra.AbsoluteConstraints;

import br.inf.carlos.wfg.gui.object.FieldObject;
import br.inf.carlos.wfg.gui.panels.PanelClassFieldConfigurator;
import br.inf.carlos.wfg.gui.panels.impl.PanelWebFormComponentText;
import br.inf.carlos.wfg.util.WebFormUtil;

/**
 * Esta classe implementa o controle das ações de troca de item da caixa
 * de Fields de uma classe mapeada.
 * 
 * @author Carlos A. Junior
 * 
 * @see ActionListener
 */
public class ActionListenerComboBoxClassFields implements ActionListener
{
	private PanelClassFieldConfigurator classFieldConfigurator;
	
	public ActionListenerComboBoxClassFields(PanelClassFieldConfigurator classFieldConfigurator)
	{
		super();
		this.classFieldConfigurator = classFieldConfigurator;
	}

	/**
	 * Este método processa uma ação a cada troca de item do combobox de 
	 * Fields da classe.
	 * 
	 * @return void
	 */
	@Override
	public void actionPerformed(ActionEvent action)
	{
		JComboBox combo = (JComboBox) action.getSource();
		FieldObject field = (FieldObject) combo.getSelectedItem();
		
		if(field.getField() != null)
		{
			PanelWebFormComponentText p = new PanelWebFormComponentText(
				field, 
				this.getClassFieldConfigurator().getObjectProperties(),
				this.classFieldConfigurator.getClazz()
			);
			
			List<FieldObject> fields = WebFormUtil.getClassFields(this.classFieldConfigurator.getClazz());
			
			int i = 1;
			int y = 165;
			for (FieldObject f : fields)
			{
				PanelWebFormComponentText pp = new PanelWebFormComponentText(
					f, 
					this.getClassFieldConfigurator().getObjectProperties(),
					this.classFieldConfigurator.getClazz()
				);
				this.getClassFieldConfigurator().add(pp, new AbsoluteConstraints(1, y, 640, 250), i);
				i++;
				y = (y + y) + 100;
			}
			
			//(int x, int y, int width, int height)
			//this.getClassFieldConfigurator().add(p, new AbsoluteConstraints(1, 165, 640, 250), 1);
			//this.getClassFieldConfigurator().add(p, new AbsoluteConstraints(1, 180, 640, 250), 2);
			
			this.getClassFieldConfigurator().getButtonSalvarConfiguracao().setEnabled(true);
		}
		else
		{
			this.getClassFieldConfigurator().remove(1);
			this.getClassFieldConfigurator().getButtonSalvarConfiguracao().setEnabled(false);
		}
		// Atualiza o JPanel.
		this.getClassFieldConfigurator().updateUI();
	}

	public PanelClassFieldConfigurator getClassFieldConfigurator() {
		return classFieldConfigurator;
	}
}
