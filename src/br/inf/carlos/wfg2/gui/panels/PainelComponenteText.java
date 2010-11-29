package br.inf.carlos.wfg2.gui.panels;

import java.lang.reflect.Field;

import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.inf.carlos.wfg2.component.WebComponent;
import br.inf.carlos.wfg2.component.impl.WebComponentText;
import br.inf.carlos.wfg2.gui.FrameBase;

/**
 *
 * @author carlos
 */
public class PainelComponenteText extends PainelComponente
{
	private static final long serialVersionUID = 1L;
	
	private JTextField componentCSSClassName;
    private JCheckBox componentDisabled;
    private JTextField componentID;
    private JTextField componentJavascriptMask;
    private JTextField componentMaxLength;
    private JTextField componentName;
    private JCheckBox componentReadOnly;
    private JTextField componentSize;
    private JTextField componentValue;
    private JTextField componentLabel;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;

	public PainelComponenteText(Class clazz, Field field, FrameBase frameBase)
    {
		super(clazz, field, frameBase);
	}
	
    protected void initComponents()
    {
        setBorder(BorderFactory.createTitledBorder(
        	"Propriedades do atributo: " + this.getField().getName() + " - " + this.getField().getType().getSimpleName())
        );
        
        jLabel1 = new javax.swing.JLabel();
        componentID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        componentName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        componentCSSClassName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        componentSize = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        componentMaxLength = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        componentJavascriptMask = new javax.swing.JTextField();
        componentReadOnly = new javax.swing.JCheckBox();
        componentDisabled = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        componentValue = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        componentLabel = new javax.swing.JTextField();


        jLabel1.setText("ID");

        componentID.setText(" ");

        jLabel2.setText("Name:");

        jLabel3.setText("CSS");

        jLabel4.setText("Size:");

        componentSize.setText("20");

        jLabel5.setText("Length:");

        componentMaxLength.setText("20");

        jLabel6.setText("JS Mask:");

        componentReadOnly.setText("ReadOnly");

        componentDisabled.setText("Disabled");

        jLabel7.setText("Value");

        jLabel8.setText("Label:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(componentID, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(componentName, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(componentCSSClassName, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(componentValue, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(componentSize)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(componentMaxLength, 0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(componentJavascriptMask, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(componentDisabled)
                    .addComponent(componentReadOnly, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(componentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(componentDisabled)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(componentJavascriptMask, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(componentReadOnly)
                            .addComponent(componentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(componentSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(componentMaxLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(componentValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(componentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

	@Override
	public WebComponent getWebComponent()
	{
		WebComponent component = new WebComponentText(this.getClazz(), this.getField());
		
		component.setComponentID			(this.componentID.getText());
		component.setComponentName			(this.componentName.getText());
		component.setComponentCSSClassName	(this.componentCSSClassName.getText());
		component.setComponentDisabled		(this.componentDisabled.isSelected());
		component.setComponentReadOnly		(this.componentReadOnly.isSelected());
		component.setComponentValue			(this.componentValue.getText());
		component.setComponentLabel			(this.componentLabel.getText());
		
		((WebComponentText) component).setComponentSize				(Integer.parseInt(this.componentSize.getText()));
		((WebComponentText) component).setComponentMaxLength		(Integer.parseInt(this.componentMaxLength.getText()));
		((WebComponentText) component).setComponentJavascriptMask	(this.componentJavascriptMask.getText());
		
		return component;
	}

	@Override
	public void setWebComponent(WebComponent component) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void carregaCamposPainel()
	{
		String el = WebComponent.createELVarName(this.getClazz());
		
		this.componentID.setText			(this.getField().getName().toLowerCase());
		this.componentName.setText			(el + "." + this.getField().getName().toLowerCase());
		this.componentCSSClassName.setText	("inputbox");
		this.componentValue.setText			("${" + el + "." + this.getField().getName().toLowerCase() + "}");
		this.componentLabel.setText			(this.getField().getName().toLowerCase());
		
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
		if(!this.componentSize.getText().isEmpty())
		{
			try {
				Integer.parseInt(this.componentSize.getText());
			} catch (NumberFormatException e) {
				valid = false;
			}
		}
		if(!this.componentMaxLength.getText().isEmpty())
		{
			try {
				Integer.parseInt(this.componentMaxLength.getText());
			} catch (NumberFormatException e) {
				valid = false;
			}
		}
		
		return valid;
	}

}
