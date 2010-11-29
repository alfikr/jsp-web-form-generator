package br.inf.carlos.wfg2.gui.panels;

import java.lang.reflect.Field;

import br.inf.carlos.wfg2.component.WebComponent;
import br.inf.carlos.wfg2.gui.FrameBase;
import br.inf.carlos.wfg2.gui.models.FieldModelComboBoxPadrao;

/**
 *
 * @author carlos
 */
public class PainelComponenteSelect extends PainelComponente
{

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

        setBorder(javax.swing.BorderFactory.createTitledBorder("Propriedades do atributo:"));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(componentID, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(componentName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(componentCSSClassName, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(componentDataList, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addComponent(componentDataListValue, 0, 82, Short.MAX_VALUE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(componentDataListDisplayValue, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(componentValue, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(disabledCheckbox))
                    .addComponent(jLabel4))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(disabledCheckbox)
                        .addComponent(componentValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(componentDataListDisplayValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(componentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(componentCSSClassName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(componentDataList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(componentDataListValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(componentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField componentCSSClassName;
    private javax.swing.JTextField componentDataList;
    private javax.swing.JComboBox componentDataListDisplayValue;
    private javax.swing.JComboBox componentDataListValue;
    private javax.swing.JTextField componentID;
    private javax.swing.JTextField componentName;
    private javax.swing.JTextField componentValue;
    private javax.swing.JCheckBox disabledCheckbox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    

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
	}

	@Override
	public WebComponent getWebComponent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setWebComponent(WebComponent component) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean validatePainelFields() {
		// TODO Auto-generated method stub
		return false;
	}

}
