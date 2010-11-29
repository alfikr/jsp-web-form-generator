package br.inf.carlos.wfg2.gui.panels;

import java.lang.reflect.Field;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;

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
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;

	public PainelComponenteText(Class clazz, Field field, FrameBase frameBase)
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
        jLabel4 = new JLabel();
        componentSize = new JTextField();
        jLabel5 = new JLabel();
        componentMaxLength = new JTextField();
        jLabel6 = new JLabel();
        componentJavascriptMask = new JTextField();
        componentReadOnly = new JCheckBox();
        componentDisabled = new JCheckBox();
        jLabel7 = new JLabel();
        componentValue = new JTextField();

        setBorder(BorderFactory.createTitledBorder(
        	"Propriedades do atributo: " + this.getField().getName() + " - " + this.getField().getType().getSimpleName())
        );

        jLabel1.setText("ID");

        jLabel2.setText("Name:");

        jLabel3.setText("CSS");

        jLabel4.setText("Size:");

        componentSize.setText("50");

        jLabel5.setText("Length:");

        componentMaxLength.setText("50");

        jLabel6.setText("JS Mask:");

        componentReadOnly.setText("ReadOnly");

        componentDisabled.setText("Disabled");

        jLabel7.setText("Value");

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
                    .addComponent(componentValue, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(componentSize)
                    .addComponent(jLabel4))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(componentMaxLength, 0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel5))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(componentJavascriptMask, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(componentReadOnly, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(componentDisabled))
                    .addComponent(jLabel6))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(componentJavascriptMask, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(componentReadOnly)
                            .addComponent(componentDisabled)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(componentSize, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(componentMaxLength, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(componentName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(componentCSSClassName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(componentValue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(componentID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
