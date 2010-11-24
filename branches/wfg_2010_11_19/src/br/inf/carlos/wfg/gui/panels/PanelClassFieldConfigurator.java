package br.inf.carlos.wfg.gui.panels;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

import br.inf.carlos.wfg.components.WebFormComponent;
import br.inf.carlos.wfg.components.WebFormControllerComponent;
import br.inf.carlos.wfg.gui.actions.ActionListenerComboBoxClassFields;
import br.inf.carlos.wfg.gui.models.FieldComboBoxModel;
import br.inf.carlos.wfg.gui.object.ObjectProperties;
import br.inf.carlos.wfg.util.WebFormUtil;

/**
 *
 * @author carlos
 */
public class PanelClassFieldConfigurator extends JPanel
{
	private static final long serialVersionUID = 1L;
	
	private JTextField actionURL;
    private JButton buttonSalvarConfiguracao;
    private JComboBox comboClassFields;
    private JTextField controllerClassName;
    private JTextField elVarName;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JPanel panelContainerPanelComponents;
    private JPanel painelClassFields;
    private JPanel panelClassProperties;
    private JComboBox submitType;
    
    private ObjectProperties objectProperties;
    
    private PanelClassSelector panelClassSelector;
    
    private Class clazz;
    
    public PanelClassFieldConfigurator(ObjectProperties objectProperties, PanelClassSelector panelClassSelector, Class clazz)
    {
    	this.objectProperties 	= objectProperties;
    	this.panelClassSelector = panelClassSelector;
    	this.clazz				= clazz;
        initComponents();
    }
    
    //TODO public AbsoluteConstraints(int x, int y, int width, int height)
    private void initComponents()
    {
        panelContainerPanelComponents = new JPanel();
        painelClassFields = new JPanel();
        jLabel1 = new JLabel();
        comboClassFields = new JComboBox();
        panelClassProperties = new JPanel();
        controllerClassName = new JTextField();
        jLabel2 = new JLabel();
        elVarName = new JTextField();
        jLabel3 = new JLabel();
        actionURL = new JTextField();
        jLabel4 = new JLabel();
        submitType = new JComboBox();
        jLabel5 = new JLabel();
        buttonSalvarConfiguracao = new JButton();

        this.setLayout					(new AbsoluteLayout());

        panelContainerPanelComponents.setBorder				(BorderFactory.createEtchedBorder());
        panelContainerPanelComponents.setLayout				(new AbsoluteLayout());
        //this.add						(panelContainerPanelComponents, new AbsoluteConstraints(10, 180, 640, 180));

        painelClassFields.setBorder		(BorderFactory.createTitledBorder("Classe: "));
        painelClassFields.setLayout		(new AbsoluteLayout());

        jLabel1.setText					("Atributos da Classe:");
        painelClassFields.add			(jLabel1, new AbsoluteConstraints(10, 20, -1, -1));

        FieldComboBoxModel fieldModel = new FieldComboBoxModel(WebFormUtil.getClassFields(this.getClazz()));
        
        comboClassFields.setModel		(fieldModel);
        painelClassFields.add			(comboClassFields, new AbsoluteConstraints(10, 40, 250, -1));

        this.add						(painelClassFields, new AbsoluteConstraints(10, 90, 640, 80));

        panelClassProperties.setBorder	(BorderFactory.createTitledBorder("Propriedades da Classe"));
        panelClassProperties.setLayout	(new AbsoluteLayout());
        panelClassProperties.add		(controllerClassName, new AbsoluteConstraints(10, 40, 180, -1));

        jLabel2.setText					("Classe Controladora:");
        panelClassProperties.add		(jLabel2, new AbsoluteConstraints(10, 20, -1, -1));
        panelClassProperties.add		(elVarName, new AbsoluteConstraints(200, 40, 90, -1));

        jLabel3.setText					("Variável EL:");
        panelClassProperties.add		(jLabel3, new AbsoluteConstraints(200, 20, -1, -1));
        panelClassProperties.add		(actionURL, new AbsoluteConstraints(300, 40, 210, -1));

        jLabel4.setText					("Action URL:");
        panelClassProperties.add		(jLabel4, new AbsoluteConstraints(300, 20, -1, -1));

        submitType.setModel				(new DefaultComboBoxModel(new String[] { "Post", "Get" }));
        panelClassProperties.add		(submitType, new AbsoluteConstraints(520, 40, -1, -1));

        jLabel5.setText					("Submit:");
        panelClassProperties.add		(jLabel5, new AbsoluteConstraints(520, 20, -1, -1));

        this.add						(panelClassProperties, new AbsoluteConstraints(10, 10, 640, 80));

        buttonSalvarConfiguracao.setText("Salvar Configurações");
        buttonSalvarConfiguracao.setEnabled(false);
        this.add						(buttonSalvarConfiguracao, new AbsoluteConstraints(450, 390, -1, -1));
        
        this.getComboClassFields().addActionListener(new ActionListenerComboBoxClassFields(this));
        this.getButtonSalvarConfiguracao().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent event)
			{
				Component[] components = getComponents();
				
				for (Component component : components)
				{
					if(component instanceof PanelFieldsConfigurator)
					{
						buttonSalvarConfiguracaoActionPerformed(event, (PanelFieldsConfigurator) component);
					}
				}
			}
		});
    }
    
    private void buttonSalvarConfiguracaoActionPerformed (ActionEvent event, PanelFieldsConfigurator panel)
    {
    	if(!this.getObjectProperties().hasClassInWebFormControllerComponents(this.getClazz()))
    	{
    		WebFormControllerComponent controller = new WebFormControllerComponent(this.getClazz());
    		
    		WebFormComponent component = panel.saveSettings();
    		
    		if(component instanceof WebFormComponent)
    		{
    			controller.getComponents().remove(component);
    			controller.getComponents().add(component);
    		}
    		
    		this.getObjectProperties().getControllers().add(controller);
    	}
    	
    	WebFormComponent component = this.getObjectProperties().findWebFormComponentByClassName(this.getClazz());
    	
    	if(component instanceof WebFormComponent)
    	{
    		JOptionPane.showMessageDialog(this, "Informações salvas...");
    	}
    	else
    	{
    		JOptionPane.showMessageDialog(this, "Nenhum componente econtrado para esta classe");
    	}
    }

	public ObjectProperties getObjectProperties() {
		return objectProperties;
	}

	public void setObjectProperties(ObjectProperties objectProperties) {
		this.objectProperties = objectProperties;
	}

	public JTextField getActionURL() {
		return actionURL;
	}

	public JButton getButtonSalvarConfiguracao() {
		return buttonSalvarConfiguracao;
	}

	public JComboBox getComboClassFields() {
		return comboClassFields;
	}

	public JTextField getControllerClassName() {
		return controllerClassName;
	}

	public JTextField getElVarName() {
		return elVarName;
	}

	public JPanel getPainelClassFields() {
		return painelClassFields;
	}

	public JPanel getPanelClassProperties() {
		return panelClassProperties;
	}

	public JComboBox getSubmitType() {
		return submitType;
	}

	public PanelClassSelector getPanelClassSelector() {
		return panelClassSelector;
	}

	@SuppressWarnings("unchecked")
	public Class getClazz() {
		return clazz;
	}
}
