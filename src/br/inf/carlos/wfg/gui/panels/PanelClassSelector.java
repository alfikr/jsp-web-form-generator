package br.inf.carlos.wfg.gui.panels;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

import br.inf.carlos.wfg.gui.actions.ButtonCarregaConfiguracaoListener;
import br.inf.carlos.wfg.gui.models.ClassComboBoxModel;
import br.inf.carlos.wfg.gui.object.ObjectProperties;

/**
 * Painel JPanel para fazer a seleção das classes para o JPanel
 * de configurações.
 * 
 * @author Carlos A. Junior
 */
public class PanelClassSelector extends JPanel
{
	private static final long serialVersionUID = 1L;
	
	private JButton buttonCarregaConfiguracoes;
    private JComboBox comboClasses;
    private JLabel jLabel1;
    
    private ObjectProperties objectProperties;
    
    public PanelClassSelector (ObjectProperties objectProperties)
    {
    	this.objectProperties = objectProperties;
        initComponents();
    }

    private void initComponents() 
    {
        jLabel1 					= new JLabel();
        comboClasses 				= new JComboBox();
        buttonCarregaConfiguracoes 	= new JButton();

        this.setBorder			(BorderFactory.createEtchedBorder());
        this.setLayout			(new AbsoluteLayout());

        jLabel1.setText			("Selecione uma Classe: ");
        this.add				(jLabel1, new AbsoluteConstraints(20, 10, -1, -1));

        comboClasses.setModel	(new ClassComboBoxModel(this.getObjectProperties().getClassesSelecionadas()));
        
        this.add				(comboClasses, new AbsoluteConstraints(20, 30, 280, -1));

        this.buttonCarregaConfiguracoes.setText("Carregar Configurações");
        this.add(buttonCarregaConfiguracoes, new AbsoluteConstraints(310, 30, -1, -1));
        
        this.getButtonCarregaConfiguracoes().addActionListener(new ButtonCarregaConfiguracaoListener(this));
    }

	public JButton getButtonCarregaConfiguracoes() {
		return buttonCarregaConfiguracoes;
	}

	public JComboBox getComboClasses() {
		return comboClasses;
	}

	public ObjectProperties getObjectProperties() {
		return objectProperties;
	}
}
