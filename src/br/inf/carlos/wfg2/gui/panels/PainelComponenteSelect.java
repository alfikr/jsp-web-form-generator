package br.inf.carlos.wfg2.gui.panels;

import java.lang.reflect.Field;

import br.inf.carlos.wfg2.component.WebComponent;
import br.inf.carlos.wfg2.gui.FrameBase;

/**
 *
 * @author carlos
 */
public class PainelComponenteSelect extends PainelComponente
{
    public PainelComponenteSelect(Class clazz, Field field, FrameBase frameBase)
    {
		super(clazz, field, frameBase);
		// TODO Auto-generated constructor stub
	}
	/** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    protected void initComponents() {

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
        componentDataListValue = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        componentDataListDisplayValue = new javax.swing.JTextField();

        setBorder(javax.swing.BorderFactory.createTitledBorder(
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
                    .addComponent(componentDataList, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(componentDataListValue, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(componentDataListDisplayValue, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(componentValue, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(disabledCheckbox))
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(componentValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(disabledCheckbox)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(componentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(componentCSSClassName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(componentDataList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(componentDataListValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(componentDataListDisplayValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
    private javax.swing.JTextField componentDataListDisplayValue;
    private javax.swing.JTextField componentDataListValue;
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
    // End of variables declaration//GEN-END:variables
	
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
