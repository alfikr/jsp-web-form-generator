package br.inf.carlos.wfg2.gui.panels;

import java.lang.reflect.Field;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;

import br.inf.carlos.wfg2.component.WebComponent;
import br.inf.carlos.wfg2.gui.FrameBase;

/**
 *
 * @author carlos
 */
@SuppressWarnings("unchecked")
public class PainelComponenteSelect1 extends PainelComponente
{
	private static final long serialVersionUID = 1L;
	
	public PainelComponenteSelect1(Class clazz, Field field, FrameBase frameBase)
    {
		super(clazz, field, frameBase);
	}
	
    protected void initComponents()
    {
        jLabel1 = new JLabel();
        componentID = new JTextField();
        jLabel2 = new JLabel();
        componentName = new JTextField();
        jLabel3 = new JLabel();
        componentCSSClassName = new JTextField();
        disabledCheckbox = new JCheckBox();
        jLabel7 = new JLabel();
        componentDataList = new JTextField();
        jLabel4 = new JLabel();
        componentValue = new JTextField();
        jLabel5 = new JLabel();
        componentDataListValue = new JTextField();
        jLabel6 = new JLabel();
        componentDataListDisplayValue = new JTextField();

        setBorder(BorderFactory.createTitledBorder(
        	"Propriedades do atributo: " + this.getField().getName() + " - " + this.getField().getType().getSimpleName())
        );

        jLabel1.setText("ID");
        jLabel2.setText("Name:");
        jLabel3.setText("CSS");
        
        jLabel7.setText("Data List:");
        jLabel4.setText("Value:");
        jLabel5.setText("Value attr.:");
        
        jLabel6.setText("Display attr.:");
        
        disabledCheckbox.setText("Disabled");


        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(componentID, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(componentName, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(componentCSSClassName, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(componentDataList, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(componentDataListValue, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(componentDataListDisplayValue, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(componentValue, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(disabledCheckbox))
                    .addComponent(jLabel4))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(componentValue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(disabledCheckbox)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(componentName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(componentCSSClassName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(componentDataList, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(componentDataListValue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(componentDataListDisplayValue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(componentID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JTextField componentCSSClassName;
    private JTextField componentDataList;
    private JTextField componentDataListDisplayValue;
    private JTextField componentDataListValue;
    private JTextField componentID;
    private JTextField componentName;
    private JTextField componentValue;
    private JCheckBox disabledCheckbox;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
	
	@Override
	public void carregaCamposPainel()
	{
		Class cl = WebComponent.getGenericListType(this.getField());
		
		String el = WebComponent.createELVarName(this.getClazz());
		
		this.componentID.setText			(this.getField().getName().toLowerCase());
		this.componentName.setText			(el + "." + this.getField().getName().toLowerCase());
		this.componentCSSClassName.setText	("inputbox");
		this.componentDataList.setText		(this.getField().getName().toLowerCase());
		this.componentDataListValue.setText	(WebComponent.getDataListAttributeValue(this.getClazz()));
		this.componentDataListDisplayValue.setText	(WebComponent.getDataListAttributeDisplayValue(this.getClazz()));
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
		return true;
	}

}
