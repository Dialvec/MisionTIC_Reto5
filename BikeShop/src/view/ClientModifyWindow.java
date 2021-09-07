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
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

import utils.BikeShopParameters;

import controller.ClickEvent;

/**
 *
 * @author Dialvec
 */
public class ClientModifyWindow extends JFrame{
    
    public ClientModifyWindow(){
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
        jButtonModify = new JButton();
        jLabelAlias = new JLabel();
        jLabelNombre = new JLabel();
        jLabelApellido = new JLabel();
        jLabelemail = new JLabel();
        jLabelCelular = new JLabel();
        jLabelDob = new JLabel();
        clickEvent = new ClickEvent(this);

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        jLabelTituloBuscarCliente.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        jLabelTituloBuscarCliente.setHorizontalAlignment(SwingConstants.CENTER);
        jLabelTituloBuscarCliente.setText(BikeShopParameters.MODIF_CLIENTE);

        jTextFieldBCNombre.setFont(new Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldBCAlias.setEditable(false);
        jTextFieldBCAlias.setFont(new Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldBCApellido.setFont(new Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldBCEmail.setFont(new Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldBCCelular.setFont(new Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldBCDob.setFont(new Font("Tahoma", 0, 12)); // NOI18N

        jButtonModify.setBackground(UIManager.getDefaults().getColor("InternalFrame.activeTitleGradient"));
        jButtonModify.setFont(new Font("Tahoma", 0, 12)); // NOI18N
        jButtonModify.setText(BikeShopParameters.GUARDAR_CAMBIOS);
        jButtonModify.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonModify.setBorderPainted(false);
        jButtonModify.addActionListener(clickEvent);

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

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(getjButtonModify(), GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                            .addComponent(getjTextFieldBCDob(), GroupLayout.Alignment.TRAILING)
                            .addComponent(getjTextFieldBCCelular())
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(getjTextFieldBCAlias(), GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                    .addComponent(getjTextFieldBCApellido())
                                    .addComponent(getjTextFieldBCEmail())
                                    .addComponent(getjTextFieldBCNombre()))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTituloBuscarCliente)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(getjTextFieldBCAlias(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAlias))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(getjTextFieldBCNombre(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNombre))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(getjTextFieldBCApellido(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelApellido))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(getjTextFieldBCEmail(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelemail))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(getjTextFieldBCCelular(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCelular))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(getjTextFieldBCDob(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDob))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(getjButtonModify())
                .addContainerGap())
        );
        setVisible(true);
        pack();
    }
    
    
    
    private JLabel jLabelTituloBuscarCliente;
    private JTextField jTextFieldBCNombre;
    private JTextField jTextFieldBCAlias;
    private JTextField jTextFieldBCApellido;
    private JTextField jTextFieldBCEmail;
    private JTextField jTextFieldBCCelular;
    private JTextField jTextFieldBCDob;
    private JButton jButtonModify;
    private JLabel jLabelAlias;
    private JLabel jLabelNombre;
    private JLabel jLabelApellido;
    private JLabel jLabelemail;
    private JLabel jLabelCelular;
    private JLabel jLabelDob;
    private ClickEvent clickEvent;

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
     * @return the jButtonModify
     */
    public JButton getjButtonModify() {
        return jButtonModify;
    }
    
}
