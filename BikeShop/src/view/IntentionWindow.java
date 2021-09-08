package view;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.GroupLayout;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

import utils.BikeShopParameters;

import controller.ClickEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Dialvec
 */
public class IntentionWindow extends JFrame {

    /**
     * Creates new form clientSearch
     * @param mode
     * @param idIntention
     */
    public IntentionWindow(String mode, int idIntention) {
        this.mode = mode;
        this.idIntention = idIntention;
        initComponents();
    }
                         
    private void initComponents() {

        jLabelTitulo = new JLabel();
        jLabelInstr = new JLabel();
        jTextFieldNombre = new JTextField();
        jTextFieldAlias = new JTextField();
        jTextFieldApellido = new JTextField();
        jTextFieldFabricante = new JTextField();
        jTextFieldFechahora = new JTextField();
        jButtonAction = new JButton();
        jLabelAlias = new JLabel();
        jLabelNombre = new JLabel();
        jLabelApellido = new JLabel();
        jLabelFabricante = new JLabel();
        jLabelFechahora = new JLabel();
        
        clickEvent = new ClickEvent(this);

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabelTitulo.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        jLabelTitulo.setText(BikeShopParameters.BUSCAR_INTENCION);

        jLabelInstr.setFont(new Font("Tahoma", 0, 12)); // NOI18N
        jLabelInstr.setText(BikeShopParameters.BUSCAR_INTENCION_INSTR);

        jTextFieldNombre.setFont(new Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldAlias.setFont(new Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldApellido.setFont(new Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldFabricante.setFont(new Font("Tahoma", 0, 12)); // NOI18N
        
        jLabelFechahora.setFont(new Font("Tahoma", 0, 12)); // NOI18N
        jLabelFechahora.setText(BikeShopParameters.FECHA);
        
        jTextFieldFechahora.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jButtonAction.setBackground(UIManager.getDefaults().getColor("InternalFrame.activeTitleGradient"));
        jButtonAction.setFont(new Font("Tahoma", 0, 12)); // NOI18N
        jButtonAction.setText(BikeShopParameters.BOTON_GUARDAR_CAMBIOS);
        jButtonAction.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonAction.setBorderPainted(false);
        jButtonAction.addActionListener(clickEvent);

        jLabelAlias.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        jLabelAlias.setText(BikeShopParameters.ALIAS_CLIENTE);

        jLabelNombre.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        jLabelNombre.setText(BikeShopParameters.NOMBRE_CLIENTE);

        jLabelApellido.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        jLabelApellido.setText(BikeShopParameters.APELLIDO_CLIENTE);

        jLabelFabricante.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        jLabelFabricante.setText(BikeShopParameters.FABRICANTE);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTitulo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelInstr, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelNombre)
                                    .addComponent(jLabelApellido)
                                    .addComponent(jLabelFabricante)
                                    .addComponent(jLabelFechahora))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldAlias)
                                    .addComponent(jTextFieldNombre)
                                    .addComponent(jTextFieldApellido)
                                    .addComponent(jTextFieldFabricante, GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                    .addComponent(getjTextFieldFechahora())))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabelAlias)
                                .addGap(3, 3, 3)
                                .addComponent(jButtonAction, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelInstr)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelAlias)
                    .addComponent(jTextFieldAlias, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre)
                    .addComponent(jTextFieldNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelApellido)
                    .addComponent(jTextFieldApellido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFabricante)
                    .addComponent(jTextFieldFabricante, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFechahora)
                    .addComponent(getjTextFieldFechahora(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonAction)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        
        setWindowMode(getMode());
        pack();
        setVisible(true);
    }
    
    private javax.swing.JButton jButtonAction;
    private javax.swing.JLabel jLabelAlias;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelFabricante;
    private javax.swing.JLabel jLabelFechahora;
    private javax.swing.JLabel jLabelInstr;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JTextField jTextFieldAlias;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldFabricante;
    private javax.swing.JTextField jTextFieldFechahora;
    private javax.swing.JTextField jTextFieldNombre;
    
    private ClickEvent clickEvent;
    
    private final String mode;
    private int idIntention;
    
    private void setWindowMode(String mode){
        switch (mode) {
            case BikeShopParameters.CREATE_MODE:
                jLabelTitulo.setText(BikeShopParameters.CREAR_INTENCION);
                jButtonAction.setText(BikeShopParameters.BOTON_CREAR);
                jTextFieldAlias.setEditable(true);
                jTextFieldFabricante.setEditable(true);
                break;
                
            case BikeShopParameters.EDIT_MODE:
                jLabelTitulo.setText(BikeShopParameters.MODIF_INTENCION);
                jButtonAction.setText(BikeShopParameters.BOTON_GUARDAR_CAMBIOS);
                jTextFieldAlias.setEditable(false);
                jTextFieldFabricante.setEditable(false);
                break;
                
            case BikeShopParameters.SEARCH_MODE:
                jLabelTitulo.setText(BikeShopParameters.BUSCAR_INTENCION);
                jButtonAction.setText(BikeShopParameters.BOTON_BUSCAR);
                jTextFieldAlias.setEditable(true);
                jTextFieldFabricante.setEditable(true);
                break;
                
            default:
                JOptionPane.showMessageDialog(null, 
                        "No se encuentra modo de trabajo en VehicleWindow", 
                        "Debug", 
                        JOptionPane.INFORMATION_MESSAGE);
                break;
        }
    }

    /**
     * @return the jButtonAction
     */
    public JButton getjButtonAction() {
        return jButtonAction;
    }

    /**
     * @return the jTextFieldAlias
     */
    public JTextField getjTextFieldAlias() {
        return jTextFieldAlias;
    }

    /**
     * @return the jTextFieldApellido
     */
    public JTextField getjTextFieldApellido() {
        return jTextFieldApellido;
    }

    /**
     * @return the jTextFieldFabricante
     */
    public JTextField getjTextFieldFabricante() {
        return jTextFieldFabricante;
    }

    /**
     * @return the jTextFieldNombre
     */
    public JTextField getjTextFieldNombre() {
        return jTextFieldNombre;
    }

    /**
     * @return the clickEvent
     */
    public ClickEvent getClickEvent() {
        return clickEvent;
    }

    /**
     * @return the mode
     */
    public String getMode() {
        return mode;
    }

    /**
     * @return the idIntention
     */
    public int getIdIntention() {
        return idIntention;
    }

    /**
     * @param idIntention the idIntention to set
     */
    public void setIdIntention(int idIntention) {
        this.idIntention = idIntention;
    }

    /**
     * @return the jTextFieldFechahora
     */
    public javax.swing.JTextField getjTextFieldFechahora() {
        return jTextFieldFechahora;
    }
                  
}