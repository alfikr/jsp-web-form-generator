package br.inf.carlos.wfg.gui.actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;

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
		
		
	}

}
