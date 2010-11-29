package br.inf.carlos.wfg2.gui.panels;

import java.lang.reflect.Field;

import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.inf.carlos.wfg2.component.WebComponent;
import br.inf.carlos.wfg2.component.impl.WebComponentSelect;
import br.inf.carlos.wfg2.gui.FrameBase;
import br.inf.carlos.wfg2.gui.models.FieldModelComboBoxPadrao;

/**
 *
 * @author carlos
 */
public class PainelComponenteSelect extends PainelComponente
{
	private static final long serialVersionUID = 1L;


	public PainelComponenteSelect(Class clazz, Field field, FrameBase frameBase) {
		super(clazz, field, frameBase);
	}

    @Override
    protected void initComponents()
    {
    	jLabel1 = new javax.swing.JLabel();
        componentID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        componentName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        componentCSSClassName = new javax.swing.JTextField();
        disabledCheckbox = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        componentDataList = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        componentValue = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        componentDataListValue = new javax.swing.JComboBox();
        componentDataListDisplayValue = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        componentLabel = new javax.swing.JTextField();

        setBorder(BorderFactory.createTitledBorder(
        	"Propriedades do atributo: " + this.getField().getName() + " - " + this.getField().getType().getSimpleName())
        );

        jLabel1.setText("ID");

        componentID.setText(" ");

        jLabel2.setText("Name:");

        jLabel3.setText("CSS");

        disabledCheckbox.setText("Disabled");

        jLabel7.setText("Data List:");

        jLabel4.setText("Value:");

        jLabel5.setText("Value attr.:");

        jLabel6.setText("Display attr.:");

        componentDataListValue.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        componentDataListDisplayValue.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel8.setText("Label:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(componentID, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(componentName, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(componentCSSClassName, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(componentDataList)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(componentDataListValue, 0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(componentDataListDisplayValue, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(componentValue, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(componentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(disabledCheckbox))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel8)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(componentCSSClassName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(componentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(componentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(componentDataListValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(componentDataListDisplayValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(componentValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(componentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(disabledCheckbox)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(componentDataList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JTextField componentCSSClassName;
    private JTextField componentDataList;
    private JComboBox componentDataListDisplayValue;
    private JComboBox componentDataListValue;
    private JTextField componentID;
    private JTextField componentName;
    private JTextField componentValue;
    private JCheckBox disabledCheckbox;
    private JTextField componentLabel;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    

	@Override
	public void carregaCamposPainel() {
		Class cl = WebComponent.getGenericListType(this.getField());
		
		String el = WebComponent.createELVarName(this.getClazz());
		
		this.componentID.setText			(this.getField().getName().toLowerCase());
		this.componentName.setText			(el + "." + this.getField().getName().toLowerCase());
		this.componentCSSClassName.setText	("inputbox");
		this.componentDataList.setText		(this.getField().getName().toLowerCase());
		
		
		
		this.componentDataListValue.setModel(new FieldModelComboBoxPadrao(WebComponent.getFields(this.getClazz())));
		this.componentDataListDisplayValue.setModel(new FieldModelComboBoxPadrao(WebComponent.getFields(this.getClazz())));
		this.componentLabel.setText			(this.getField().getName().toLowerCase());
	}

	@Override
	public WebComponent getWebComponent()
	{
		WebComponent component = new WebComponentSelect(this.getClazz(), this.getField());
		
		component.setComponentID			(this.componentID.getText());
		component.setComponentName			(this.componentName.getText());
		component.setComponentCSSClassName	(this.componentCSSClassName.getText());
		component.setComponentDisabled		(this.disabledCheckbox.isSelected());
		component.setComponentValue			(this.componentValue.getText());
		component.setComponentLabel			(this.componentLabel.getText());
		
		((WebComponentSelect) component).setDataList			(this.componentDataList.getText());
		((WebComponentSelect) component).setDataListValue		(this.componentDataListValue.getSelectedItem().toString());
		((WebComponentSelect) component).setDataListDisplayValue(this.componentDataListDisplayValue.getSelectedItem().toString());
		
		return component;
	}

	@Override
	public void setWebComponent(WebComponent component) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean validatePainelFields()
	{
		boolean valid = true;
		
		if(this.componentID.getText().isEmpty())
		{
			valid = false;
		}
		if(this.componentName.getText().isEmpty())
		{
			valid = false;
		}
		
		if(this.componentCSSClassName.getText().isEmpty())
		{
			valid = false;
		}
		if(this.componentDataList.getText().isEmpty())
		{
			valid = false;
		}
		
		return valid;
	}

}
