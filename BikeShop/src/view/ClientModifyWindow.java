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
        jLabelTituloBuscarCliente.setText("Modificar Cliente");

        jTextFieldBCNombre.setFont(new Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldBCAlias.setEditable(false);
        jTextFieldBCAlias.setFont(new Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldBCApellido.setFont(new Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldBCEmail.setFont(new Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldBCCelular.setFont(new Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldBCDob.setFont(new Font("Tahoma", 0, 12)); // NOI18N

        jButtonModify.setBackground(UIManager.getDefaults().getColor("InternalFrame.activeTitleGradient"));
        jButtonModify.setFont(new Font("Tahoma", 0, 12)); // NOI18N
        jButtonModify.setText("Guardar Cambios");
        jButtonModify.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonModify.setBorderPainted(false);
        jButtonModify.addActionListener(clickEvent);

        jLabelAlias.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        jLabelAlias.setText("Alias");

        jLabelNombre.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        jLabelNombre.setText("Nombre");

        jLabelApellido.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        jLabelApellido.setText("Apellido");

        jLabelemail.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        jLabelemail.setText("e-mail");

        jLabelCelular.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        jLabelCelular.setText("Celular");

        jLabelDob.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        jLabelDob.setText("Fecha nacimiento");

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jButtonModify, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(jTextFieldBCDob, GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldBCCelular)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldBCAlias, GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                    .addComponent(jTextFieldBCApellido)
                                    .addComponent(jTextFieldBCEmail)
                                    .addComponent(jTextFieldBCNombre))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
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
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBCCelular, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCelular))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBCDob, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDob))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jButtonModify)
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
    
}
