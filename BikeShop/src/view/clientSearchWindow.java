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

/**
 *
 * @author Dialvec
 */
public class ClientSearchWindow extends JFrame {

    /**
     * Creates new form clientSearch
     */
    public ClientSearchWindow() {
        initComponents();
    }
                       
    private void initComponents() {

        jLabelTituloBuscarCliente = new JLabel();
        jLabelInstrBuscarCliente = new JLabel();
        jTextFieldBCNombre = new JTextField();
        jTextFieldBCAlias = new JTextField();
        jTextFieldBCApellido = new JTextField();
        jTextFieldBCEmail = new JTextField();
        jTextFieldBCCelular = new JTextField();
        jTextFieldBCDob = new JTextField();
        jButtonSearchClient = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);

        jLabelTituloBuscarCliente.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        jLabelTituloBuscarCliente.setHorizontalAlignment(SwingConstants.CENTER);
        jLabelTituloBuscarCliente.setText("Buscar Cliente");

        jLabelInstrBuscarCliente.setFont(new Font("Tahoma", 0, 12)); // NOI18N
        jLabelInstrBuscarCliente.setText("Indique información del cliente que busca.");

        getjTextFieldBCNombre().setFont(new Font("Tahoma", 0, 12)); // NOI18N
        getjTextFieldBCNombre().setText("nombre");

        getjTextFieldBCAlias().setFont(new Font("Tahoma", 0, 12)); // NOI18N
        getjTextFieldBCAlias().setText("alias");

        getjTextFieldBCApellido().setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getjTextFieldBCApellido().setText("apellido");

        getjTextFieldBCEmail().setFont(new Font("Tahoma", 0, 12)); // NOI18N
        getjTextFieldBCEmail().setText("e-mail");

        getjTextFieldBCCelular().setFont(new Font("Tahoma", 0, 12)); // NOI18N
        getjTextFieldBCCelular().setText("celular");
        
        getjTextFieldBCDob().setFont(new Font("Tahoma", 0, 12)); // NOI18N
        getjTextFieldBCDob().setText("fecha de nacimiento");

        getjButtonSearchClient().setBackground(UIManager.getDefaults().getColor("InternalFrame.activeTitleGradient"));
        getjButtonSearchClient().setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getjButtonSearchClient().setText("Buscar");
        getjButtonSearchClient().setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getjButtonSearchClient().setBorderPainted(false);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelInstrBuscarCliente)
                    .addComponent(getjTextFieldBCNombre(), GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
                    .addComponent(getjTextFieldBCAlias(), GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(getjTextFieldBCApellido(), GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(getjButtonSearchClient(), GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE))
                    .addComponent(getjTextFieldBCEmail(), GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
                    .addComponent(getjTextFieldBCCelular(), GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
                    .addComponent(getjTextFieldBCDob(), GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTituloBuscarCliente, GroupLayout.PREFERRED_SIZE, 239, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTituloBuscarCliente)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelInstrBuscarCliente)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(getjTextFieldBCAlias(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(getjTextFieldBCNombre(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(getjTextFieldBCApellido(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(getjButtonSearchClient()))
                .addGap(9, 9, 9)
                .addComponent(getjTextFieldBCEmail(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(getjTextFieldBCCelular(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(getjTextFieldBCDob(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }                  

    // Variables declaration - do not modify                     
    private JButton jButtonSearchClient;
    private JLabel jLabelInstrBuscarCliente;
    private JLabel jLabelTituloBuscarCliente;
    private JTextField jTextFieldBCAlias;
    private JTextField jTextFieldBCApellido;
    private JTextField jTextFieldBCCelular;
    private JTextField jTextFieldBCDob;
    private JTextField jTextFieldBCEmail;
    private JTextField jTextFieldBCNombre;
    // End of variables declaration                   

    /**
     * @return the jButtonSearchClient
     */
    public JButton getjButtonSearchClient() {
        return jButtonSearchClient;
    }

    /**
     * @return the jTextFieldBCAlias
     */
    public JTextField getjTextFieldBCAlias() {
        return jTextFieldBCAlias;
    }

    /**
     * @return the jTextFieldBCApellido
     */
    public JTextField getjTextFieldBCApellido() {
        return jTextFieldBCApellido;
    }

    /**
     * @return the jTextFieldBCCelular
     */
    public JTextField getjTextFieldBCCelular() {
        return jTextFieldBCCelular;
    }

    /**
     * @return the jTextFieldBCDob
     */
    public JTextField getjTextFieldBCDob() {
        return jTextFieldBCDob;
    }

    /**
     * @return the jTextFieldBCEmail
     */
    public JTextField getjTextFieldBCEmail() {
        return jTextFieldBCEmail;
    }

    /**
     * @return the jTextFieldBCNombre
     */
    public JTextField getjTextFieldBCNombre() {
        return jTextFieldBCNombre;
    }
}
