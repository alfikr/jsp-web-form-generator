package br.inf.carlos.wfg.gui.forms;

import javax.swing.JFrame;
import javax.swing.JPanel;

import br.inf.carlos.wfg.gui.FrameMenuInicial;
import br.inf.carlos.wfg.gui.actions.DefinicaoListSelectListener;
import br.inf.carlos.wfg.gui.models.ListModelClasses;
import br.inf.carlos.wfg.gui.object.ObjectProperties;

/**
 *
 * @author carlos
 */
public class PanelDefinicaoComponente extends JPanel
{
	private static final long serialVersionUID = 1L;
	
	/**
	 * Referencia para o objeto global.
	 */
	private ObjectProperties objectProperties;
	
	private FrameMenuInicial frameMenuInicial;
	
	private JFrame parent;
	
	private javax.swing.JButton jButton1;
    private javax.swing.JList jlClasses;
    private javax.swing.JPanel jpPainelComponentes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;

	public PanelDefinicaoComponente(ObjectProperties objectProperties, FrameMenuInicial frameMenuInicial, JFrame parent)
	{
		this.objectProperties = objectProperties;
		this.frameMenuInicial = frameMenuInicial;
		this.parent			  = parent;
		
        initComponents();
    }

    private void initComponents()
    {

        jScrollPane1 = new javax.swing.JScrollPane();
        jlClasses = new javax.swing.JList();
        jSeparator1 = new javax.swing.JSeparator();
        jpPainelComponentes = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        
		ListModelClasses padrao = new ListModelClasses(this.getObjectProperties().getClassesSelecionadas());
		
        jlClasses.setModel(padrao);
        jScrollPane1.setViewportView(jlClasses);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 310));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 10, 310));

        jpPainelComponentes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpPainelComponentes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        
        add(jpPainelComponentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 420, 310));

        jButton1.setText("Salvar");
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, 70, -1));
        
        DefinicaoListSelectListener listener = new DefinicaoListSelectListener(
        	this.getObjectProperties(), 
        	this.getFrameMenuInicial(), 
        	this.jlClasses
        );
        
        jlClasses.addListSelectionListener(listener);
    }

	public ObjectProperties getObjectProperties() {
		return objectProperties;
	}

	public void setObjectProperties(ObjectProperties objectProperties) {
		this.objectProperties = objectProperties;
	}

	public FrameMenuInicial getFrameMenuInicial() {
		return frameMenuInicial;
	}

	public void setFrameMenuInicial(FrameMenuInicial frameMenuInicial) {
		this.frameMenuInicial = frameMenuInicial;
	}
}
