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
        jTextFieldBINombre = new JTextField();
        jTextFieldBIAlias = new JTextField();
        jTextFieldBIApellido = new JTextField();
        jTextFieldBIFabricante = new JTextField();
        jButtonAction = new javax.swing.JButton();
        jLabelAlias = new JLabel();
        jLabelNombre = new JLabel();
        jLabelApellido = new JLabel();
        jLabelFabricante = new JLabel();
        
        clickEvent = new ClickEvent(this);

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabelTitulo.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        jLabelTitulo.setText(BikeShopParameters.BUSCAR_INTENCION);

        jLabelInstr.setFont(new Font("Tahoma", 0, 12)); // NOI18N
        jLabelInstr.setText(BikeShopParameters.BUSCAR_INTENCION_INSTR);

        getjTextFieldBINombre().setFont(new Font("Tahoma", 0, 12)); // NOI18N

        getjTextFieldBIAlias().setFont(new Font("Tahoma", 0, 12)); // NOI18N

        getjTextFieldBIApellido().setFont(new Font("Tahoma", 0, 12)); // NOI18N

        getjTextFieldBIFabricante().setFont(new Font("Tahoma", 0, 12)); // NOI18N

        getjButtonAction().setBackground(UIManager.getDefaults().getColor("InternalFrame.activeTitleGradient"));
        getjButtonAction().setFont(new Font("Tahoma", 0, 12)); // NOI18N
        getjButtonAction().setText(BikeShopParameters.BOTON_GUARDAR_CAMBIOS);
        getjButtonAction().setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getjButtonAction().setBorderPainted(false);
        getjButtonAction().addActionListener(clickEvent);

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
                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNombre)
                            .addComponent(jLabelApellido)
                            .addComponent(jLabelFabricante))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(getjTextFieldBIAlias(), GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
                            .addComponent(getjTextFieldBINombre(), GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
                            .addComponent(getjTextFieldBIApellido(), GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
                            .addComponent(getjTextFieldBIFabricante(), GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelInstr)
                            .addComponent(jLabelTitulo, GroupLayout.PREFERRED_SIZE, 239, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelAlias))
                        .addGap(0, 3, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(getjButtonAction(), GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelInstr)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(getjTextFieldBIAlias(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAlias))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(getjTextFieldBINombre(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNombre))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(getjTextFieldBIApellido(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelApellido))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(getjTextFieldBIFabricante(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFabricante))
                .addGap(18, 18, 18)
                .addComponent(getjButtonAction())
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        
        setWindowMode(getMode());
        pack();
        setVisible(true);
    }
    
    private JButton jButtonAction;
    private JLabel jLabelAlias;
    private JLabel jLabelApellido;
    private JLabel jLabelFabricante;
    private JLabel jLabelInstr;
    private JLabel jLabelNombre;
    private JLabel jLabelTitulo;
    private JTextField jTextFieldBIAlias;
    private JTextField jTextFieldBIApellido;
    private JTextField jTextFieldBIFabricante;
    private JTextField jTextFieldBINombre;
    
    private ClickEvent clickEvent;
    
    private final String mode;
    private final int idIntention;
    
    private void setWindowMode(String mode){
        switch (mode) {
            case BikeShopParameters.CREATE_MODE:
                jLabelTitulo.setText(BikeShopParameters.CREAR_INTENCION);
                jButtonAction.setText(BikeShopParameters.BOTON_CREAR);
                jTextFieldBIAlias.setEditable(true);
                jTextFieldBIFabricante.setEditable(true);
                break;
                
            case BikeShopParameters.EDIT_MODE:
                jLabelTitulo.setText(BikeShopParameters.MODIF_INTENCION);
                jButtonAction.setText(BikeShopParameters.BOTON_GUARDAR_CAMBIOS);
                jTextFieldBIAlias.setEditable(false);
                jTextFieldBIFabricante.setEditable(false);
                break;
                
            case BikeShopParameters.SEARCH_MODE:
                jLabelTitulo.setText(BikeShopParameters.BUSCAR_INTENCION);
                jButtonAction.setText(BikeShopParameters.BOTON_BUSCAR);
                jTextFieldBIAlias.setEditable(true);
                jTextFieldBIFabricante.setEditable(true);
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
     * @return the jTextFieldBIAlias
     */
    public JTextField getjTextFieldBIAlias() {
        return jTextFieldBIAlias;
    }

    /**
     * @return the jTextFieldBIApellido
     */
    public JTextField getjTextFieldBIApellido() {
        return jTextFieldBIApellido;
    }

    /**
     * @return the jTextFieldBIFabricante
     */
    public JTextField getjTextFieldBIFabricante() {
        return jTextFieldBIFabricante;
    }

    /**
     * @return the jTextFieldBINombre
     */
    public JTextField getjTextFieldBINombre() {
        return jTextFieldBINombre;
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
                  
}