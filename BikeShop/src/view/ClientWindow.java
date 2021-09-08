/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.GroupLayout;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

import utils.BikeShopParameters;

import controller.ClickEvent;

/**
 *
 * @author Dialvec
 */
public class ClientWindow extends JFrame{
    
    public ClientWindow(String mode){
        this.mode = mode;
        initComponents();   
    }
    
    private void initComponents(){
        jLabelTituloBuscarCliente = new JLabel();
        jTextFieldBCNombre = new JTextField();
        jTextFieldBCAlias = new JTextField();
        jTextFieldBCApellido = new JTextField();
        jTextFieldBCEmail = new JTextField();
        jTextFieldBCCelular = new JTextField();
        jTextFieldBCDob = new JTextField();
        jButtonAction = new JButton();
        jLabelAlias = new JLabel();
        jLabelNombre = new JLabel();
        jLabelApellido = new JLabel();
        jLabelemail = new JLabel();
        jLabelCelular = new JLabel();
        jLabelDob = new JLabel();
        jLabelContrasena = new JLabel();
        jPasswordFieldContrasena = new JPasswordField();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        jLabelTituloBuscarCliente.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        jLabelTituloBuscarCliente.setHorizontalAlignment(SwingConstants.CENTER);

        jTextFieldBCNombre.setFont(new Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldBCAlias.setFont(new Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldBCApellido.setFont(new Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldBCEmail.setFont(new Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldBCCelular.setFont(new Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldBCDob.setFont(new Font("Tahoma", 0, 12)); // NOI18N

        jButtonAction.setBackground(UIManager.getDefaults().getColor("InternalFrame.activeTitleGradient"));
        jButtonAction.setFont(new Font("Tahoma", 0, 12)); // NOI18N
        jButtonAction.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonAction.setBorderPainted(false);
        jButtonAction.addActionListener(clickEvent);

        jLabelAlias.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        jLabelAlias.setText(BikeShopParameters.ALIAS_CLIENTE);

        jLabelNombre.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        jLabelNombre.setText(BikeShopParameters.NOMBRE_CLIENTE);

        jLabelApellido.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        jLabelApellido.setText(BikeShopParameters.APELLIDO_CLIENTE);

        jLabelemail.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        jLabelemail.setText(BikeShopParameters.MAIL);

        jLabelCelular.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        jLabelCelular.setText(BikeShopParameters.CELULAR);

        jLabelDob.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        jLabelDob.setText(BikeShopParameters.DOB);

        jLabelContrasena.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        jLabelContrasena.setText(BikeShopParameters.CONTRASENA);

        getjPasswordFieldContrasena().setFont(new Font("Tahoma", 0, 12)); // NOI18N

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTituloBuscarCliente, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelAlias)
                                    .addComponent(jLabelNombre)
                                    .addComponent(jLabelApellido)
                                    .addComponent(jLabelemail)
                                    .addComponent(jLabelCelular)
                                    .addComponent(jLabelDob))
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldBCDob, GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldBCCelular)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextFieldBCAlias, GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                            .addComponent(jTextFieldBCApellido)
                                            .addComponent(jTextFieldBCEmail)
                                            .addComponent(jTextFieldBCNombre)
                                            .addComponent(getjPasswordFieldContrasena()))
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jButtonAction, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelContrasena)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTituloBuscarCliente)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBCAlias, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAlias))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBCNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNombre))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBCApellido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelApellido))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBCEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelemail))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelContrasena)
                    .addComponent(getjPasswordFieldContrasena(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBCCelular, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCelular))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBCDob, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDob))
                .addGap(18, 18, 18)
                .addComponent(jButtonAction)
                .addContainerGap())
        );
        setWindowMode( this.getMode() );
        setVisible(true);
        pack();
    }
    
    private JButton jButtonAction;
    private JLabel jLabelAlias;
    private JLabel jLabelApellido;
    private JLabel jLabelCelular;
    private JLabel jLabelContrasena;
    private JLabel jLabelDob;
    private JLabel jLabelNombre;
    private JLabel jLabelTituloBuscarCliente;
    private JLabel jLabelemail;
    private JTextField jTextFieldBCAlias;
    private JTextField jTextFieldBCApellido;
    private JTextField jTextFieldBCCelular;
    private JTextField jTextFieldBCDob;
    private JTextField jTextFieldBCEmail;
    private JTextField jTextFieldBCNombre;
    private JPasswordField jPasswordFieldContrasena;
    private ClickEvent clickEvent;
    private final String mode;
    
    private void setWindowMode(String mode){
        switch (mode) {
            case BikeShopParameters.CREATE_MODE:
                jLabelTituloBuscarCliente.setText(BikeShopParameters.CREAR_CLIENTE);
                jTextFieldBCAlias.setEditable(true);
                jButtonAction.setText(BikeShopParameters.BOTON_CREAR);
                break;
                
            case BikeShopParameters.EDIT_MODE:
                jLabelTituloBuscarCliente.setText(BikeShopParameters.MODIF_CLIENTE);
                jTextFieldBCAlias.setEditable(false);
                jButtonAction.setText(BikeShopParameters.BOTON_GUARDAR_CAMBIOS);
                break;
                
            case BikeShopParameters.SEARCH_MODE:
                jLabelTituloBuscarCliente.setText(BikeShopParameters.BUSCAR_CLIENTE);
                jTextFieldBCAlias.setEditable(true);
                jButtonAction.setText(BikeShopParameters.BOTON_BUSCAR);
                break;
                
            default:
                JOptionPane.showMessageDialog(null, 
                        "No se encuentra modo de trabajo en ClientWindow", 
                        "Debug", 
                        JOptionPane.INFORMATION_MESSAGE);
                break;
        }
    }

    /**
     * @return the jTextFieldBCNombre
     */
    public JTextField getjTextFieldBCNombre() {
        return jTextFieldBCNombre;
    }

    /**
     * @param jTextFieldBCNombre the jTextFieldBCNombre to set
     */
    public void setjTextFieldBCNombre(JTextField jTextFieldBCNombre) {
        this.jTextFieldBCNombre = jTextFieldBCNombre;
    }

    /**
     * @return the jTextFieldBCAlias
     */
    public JTextField getjTextFieldBCAlias() {
        return jTextFieldBCAlias;
    }

    /**
     * @param jTextFieldBCAlias the jTextFieldBCAlias to set
     */
    public void setjTextFieldBCAlias(JTextField jTextFieldBCAlias) {
        this.jTextFieldBCAlias = jTextFieldBCAlias;
    }

    /**
     * @return the jTextFieldBCApellido
     */
    public JTextField getjTextFieldBCApellido() {
        return jTextFieldBCApellido;
    }

    /**
     * @param jTextFieldBCApellido the jTextFieldBCApellido to set
     */
    public void setjTextFieldBCApellido(JTextField jTextFieldBCApellido) {
        this.jTextFieldBCApellido = jTextFieldBCApellido;
    }

    /**
     * @return the jTextFieldBCEmail
     */
    public JTextField getjTextFieldBCEmail() {
        return jTextFieldBCEmail;
    }

    /**
     * @param jTextFieldBCEmail the jTextFieldBCEmail to set
     */
    public void setjTextFieldBCEmail(JTextField jTextFieldBCEmail) {
        this.jTextFieldBCEmail = jTextFieldBCEmail;
    }

    /**
     * @return the jTextFieldBCCelular
     */
    public JTextField getjTextFieldBCCelular() {
        return jTextFieldBCCelular;
    }

    /**
     * @param jTextFieldBCCelular the jTextFieldBCCelular to set
     */
    public void setjTextFieldBCCelular(JTextField jTextFieldBCCelular) {
        this.jTextFieldBCCelular = jTextFieldBCCelular;
    }

    /**
     * @return the jTextFieldBCDob
     */
    public JTextField getjTextFieldBCDob() {
        return jTextFieldBCDob;
    }

    /**
     * @param jTextFieldBCDob the jTextFieldBCDob to set
     */
    public void setjTextFieldBCDob(JTextField jTextFieldBCDob) {
        this.jTextFieldBCDob = jTextFieldBCDob;
    }

    /**
     * @return the jButtonAction
     */
    public JButton getjButtonAction() {
        return jButtonAction;
    }

    /**
     * @return the jPasswordFieldContrasena
     */
    public JPasswordField getjPasswordFieldContrasena() {
        return jPasswordFieldContrasena;
    }

    /**
     * @param jPasswordFieldContrasena the jPasswordFieldContrasena to set
     */
    public void setjPasswordFieldContrasena(JPasswordField jPasswordFieldContrasena) {
        this.jPasswordFieldContrasena = jPasswordFieldContrasena;
    }
    
    /**
     * @return the mode
     */
    public String getMode(){
        return this.mode;
    }
    
}
