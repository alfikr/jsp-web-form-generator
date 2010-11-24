package br.inf.carlos.wfg.gui.panels.impl;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

import br.inf.carlos.wfg.components.WebFormComponent;
import br.inf.carlos.wfg.components.WebFormControllerComponent;
import br.inf.carlos.wfg.components.impl.WebFormComponentText;
import br.inf.carlos.wfg.enums.WebFormComponentType;
import br.inf.carlos.wfg.gui.object.FieldObject;
import br.inf.carlos.wfg.gui.object.ObjectProperties;
import br.inf.carlos.wfg.gui.panels.PanelFieldsConfigurator;
import br.inf.carlos.wfg.object.WebFormObject;

/**
 *
 * @author carlos
 */
public class PanelWebFormComponentText extends PanelFieldsConfigurator 
{
	private JTextField componentCssClassName;
    private JComboBox componentDisabled;
    private JTextField componentID;
    private JTextField componentMascaraJavascript;
    private JTextField componentMaxLength;
    private JTextField componentName;
    private JComboBox componentReadOnly;
    private JTextField componentSize;
    private JTextField componentValue;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JLabel labelNomeAtributo;
    private JPanel panelConfiguracoes;
    
	public PanelWebFormComponentText(FieldObject field, ObjectProperties objectProperties)
	{
		super(field, objectProperties);
	}


	private static final long serialVersionUID = 1L;

    protected void initComponents() 
    {
        jLabel1 = new JLabel();
        labelNomeAtributo = new JLabel();
        panelConfiguracoes = new JPanel();
        jLabel2 = new JLabel();
        componentID = new JTextField();
        componentName = new JTextField();
        jLabel3 = new JLabel();
        componentCssClassName = new JTextField();
        jLabel4 = new JLabel();
        componentSize = new JTextField();
        jLabel5 = new JLabel();
        componentMaxLength = new JTextField();
        jLabel6 = new JLabel();
        componentValue = new JTextField();
        jLabel7 = new JLabel();
        componentMascaraJavascript = new JTextField();
        jLabel8 = new JLabel();
        jLabel9 = new JLabel();
        componentDisabled = new JComboBox();
        jLabel10 = new JLabel();
        componentReadOnly = new JComboBox();

        setLayout(new AbsoluteLayout());

        jLabel1.setText("Atributo selecionado:");
        add(jLabel1, new AbsoluteConstraints(10, 10, -1, -1));

        labelNomeAtributo.setText(this.getFieldObject().getDisplayName());
        add(labelNomeAtributo, new AbsoluteConstraints(170, 10, -1, -1));

        panelConfiguracoes.setBorder(BorderFactory.createTitledBorder("Configurações do Componente HTML"));
        panelConfiguracoes.setLayout(new AbsoluteLayout());

        jLabel2.setText("ID:");
        panelConfiguracoes.add(jLabel2, new AbsoluteConstraints(10, 20, -1, -1));
        panelConfiguracoes.add(componentID, new AbsoluteConstraints(10, 40, 150, -1));
        panelConfiguracoes.add(componentName, new AbsoluteConstraints(180, 40, 180, -1));

        jLabel3.setText("Name:");
        panelConfiguracoes.add(jLabel3, new AbsoluteConstraints(180, 20, -1, -1));
        panelConfiguracoes.add(componentCssClassName, new AbsoluteConstraints(380, 40, 170, -1));

        jLabel4.setText("CSS Class:");
        panelConfiguracoes.add(jLabel4, new AbsoluteConstraints(380, 20, -1, -1));
        panelConfiguracoes.add(componentSize, new AbsoluteConstraints(10, 90, 60, -1));

        jLabel5.setText("Size:");
        panelConfiguracoes.add(jLabel5, new AbsoluteConstraints(10, 70, -1, -1));
        panelConfiguracoes.add(componentMaxLength, new AbsoluteConstraints(80, 90, 80, -1));

        jLabel6.setText("Max length:");
        panelConfiguracoes.add(jLabel6, new AbsoluteConstraints(80, 70, -1, -1));
        panelConfiguracoes.add(componentValue, new AbsoluteConstraints(180, 90, 180, -1));

        jLabel7.setText("Value:");
        panelConfiguracoes.add(jLabel7, new AbsoluteConstraints(180, 70, -1, -1));
        panelConfiguracoes.add(componentMascaraJavascript, new AbsoluteConstraints(380, 90, 170, -1));

        jLabel8.setText("Máscara Javascript:");
        panelConfiguracoes.add(jLabel8, new AbsoluteConstraints(380, 70, -1, -1));

        jLabel9.setText("Read Only:");
        panelConfiguracoes.add(jLabel9, new AbsoluteConstraints(10, 120, -1, -1));

        componentDisabled.setModel(new DefaultComboBoxModel(new String[] { "Sim", "Não" }));
        componentDisabled.setSelectedIndex(1);
        panelConfiguracoes.add(componentDisabled, new AbsoluteConstraints(100, 140, -1, -1));

        jLabel10.setText("Disabled:");
        panelConfiguracoes.add(jLabel10, new AbsoluteConstraints(100, 120, -1, -1));

        componentReadOnly.setModel(new DefaultComboBoxModel(new String[] { "Sim", "Não" }));
        componentReadOnly.setSelectedIndex(1);
        panelConfiguracoes.add(componentReadOnly, new AbsoluteConstraints(10, 140, -1, -1));

        add(panelConfiguracoes, new AbsoluteConstraints(10, 30, 630, 190));
        
    }
    
    @Override
    public boolean isValid ()
    {
    	
    	return true;
    }

	@Override
	public WebFormComponent getComponentProperties()
	{
		
		return null;
	}

	@Override
	public void setComponentProperties(WebFormControllerComponent component) {
		
	}

	@Override
	public WebFormComponent saveSettings()
	{
		if(this.isValid())
		{
			WebFormObject o = new WebFormObject();
			
			o.setComponentCssClass	(this.componentCssClassName.getText());
			o.setComponentDisabled	(this.componentDisabled.getSelectedItem().equals("Sim"));
			o.setComponentReadOnly	(this.componentReadOnly.getSelectedItem().equals("Sim"));
			
			o.setComponentId		(this.componentID.getText());
			o.setComponentName		(this.componentName.getText());
			o.setComponentSize		(Integer.parseInt(this.componentSize.getText()));
			
			o.setComponentMaxLength	(Integer.parseInt(this.componentMaxLength.getText()));
			o.setComponentType		(WebFormComponentType.TEXT);
			o.setMascaraJavascript	(this.componentMascaraJavascript.getText());
			
			WebFormComponent component = new WebFormComponentText(o);
			
			return component;
		}
		else
		{
			return null;
		}
	}

}
