/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PanelWebFormComponentText.java
 *
 * Created on 23/11/2010, 11:13:56
 */

package br.inf.carlos.wfg.gui.panels.impl;

import br.inf.carlos.wfg.components.WebFormControllerComponent;
import br.inf.carlos.wfg.gui.object.FieldObject;
import br.inf.carlos.wfg.gui.object.ObjectProperties;
import br.inf.carlos.wfg.gui.panels.PanelFieldsConfigurator;

/**
 *
 * @author carlos
 */
public class PanelWebFormComponentText extends PanelFieldsConfigurator 
{
	public PanelWebFormComponentText(FieldObject field, ObjectProperties objectProperties)
	{
		super(field, objectProperties);
	}


	private static final long serialVersionUID = 1L;

    protected void initComponents() 
    {

        jLabel1 = new javax.swing.JLabel();
        labelNomeAtributo = new javax.swing.JLabel();
        panelConfiguracoes = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        componentID = new javax.swing.JTextField();
        componentName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        componentCssClassName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        componentSize = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        componentMaxLength = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        componentValue = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        componentMascaraJavascript = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        componentDisabled = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        componentReadOnly = new javax.swing.JComboBox();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Atributo selecionado:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        labelNomeAtributo.setText(this.getFieldObject().getDisplayName());
        add(labelNomeAtributo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        panelConfiguracoes.setBorder(javax.swing.BorderFactory.createTitledBorder("Configurações do Componente HTML"));
        panelConfiguracoes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("ID:");
        panelConfiguracoes.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));
        panelConfiguracoes.add(componentID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 150, -1));
        panelConfiguracoes.add(componentName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 180, -1));

        jLabel3.setText("Name:");
        panelConfiguracoes.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));
        panelConfiguracoes.add(componentCssClassName, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 170, -1));

        jLabel4.setText("CSS Class:");
        panelConfiguracoes.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));
        panelConfiguracoes.add(componentSize, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 60, -1));

        jLabel5.setText("Size:");
        panelConfiguracoes.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));
        panelConfiguracoes.add(componentMaxLength, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 80, -1));

        jLabel6.setText("Max length:");
        panelConfiguracoes.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));
        panelConfiguracoes.add(componentValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 180, -1));

        jLabel7.setText("Value:");
        panelConfiguracoes.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, -1, -1));
        panelConfiguracoes.add(componentMascaraJavascript, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 170, -1));

        jLabel8.setText("Máscara Javascript:");
        panelConfiguracoes.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, -1, -1));

        jLabel9.setText("Read Only:");
        panelConfiguracoes.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        componentDisabled.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sim", "Não" }));
        componentDisabled.setSelectedIndex(1);
        panelConfiguracoes.add(componentDisabled, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));

        jLabel10.setText("Disabled");
        panelConfiguracoes.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        componentReadOnly.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sim", "Não" }));
        componentReadOnly.setSelectedIndex(1);
        panelConfiguracoes.add(componentReadOnly, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        add(panelConfiguracoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 630, 190));
        
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField componentCssClassName;
    private javax.swing.JComboBox componentDisabled;
    private javax.swing.JTextField componentID;
    private javax.swing.JTextField componentMascaraJavascript;
    private javax.swing.JTextField componentMaxLength;
    private javax.swing.JTextField componentName;
    private javax.swing.JComboBox componentReadOnly;
    private javax.swing.JTextField componentSize;
    private javax.swing.JTextField componentValue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labelNomeAtributo;
    private javax.swing.JPanel panelConfiguracoes;
    // End of variables declaration//GEN-END:variables
	@Override
	public WebFormControllerComponent getComponentProperties() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setComponentProperties(WebFormControllerComponent component) {
		// TODO Auto-generated method stub
		
	}

}