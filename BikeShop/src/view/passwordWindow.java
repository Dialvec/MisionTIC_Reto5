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
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

import controller.ClickEvent;

/**
 *
 * @author Dialvec
 */
public class PasswordWindow extends JFrame {

    
    public PasswordWindow() {
        initComponents();
    }
                        
    private void initComponents() {
        jLabelMainTitleAdmin = new JLabel();
        jButtonPasswordOk = new JButton();
        jPasswordFieldAdmin = new JPasswordField();
        jLabelWelcomeAdmin = new JLabel();
        clickEvent = new ClickEvent(this);

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(235, 235, 235));
        setLocation(new java.awt.Point(275, 275));
        setResizable(false);

        jLabelMainTitleAdmin.setFont(new Font("Tahoma", 3, 24)); // NOI18N
        jLabelMainTitleAdmin.setHorizontalAlignment(SwingConstants.CENTER);
        jLabelMainTitleAdmin.setText("Excite Bike Shop (Admin)");

        jButtonPasswordOk.setBackground(UIManager.getDefaults().getColor("InternalFrame.activeTitleGradient"));
        jButtonPasswordOk.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        jButtonPasswordOk.setText("Ok");
        jButtonPasswordOk.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonPasswordOk.setBorderPainted(false);
        jButtonPasswordOk.addActionListener(clickEvent);

        getjPasswordFieldAdmin().setFont(new Font("Tahoma", 0, 14)); // NOI18N
        getjPasswordFieldAdmin().setHorizontalAlignment(JTextField.CENTER);

        jLabelWelcomeAdmin.setFont(new Font("Tahoma", 0, 12)); // NOI18N
        jLabelWelcomeAdmin.setText("Bienvenido al modo Administrador. Ingrese su contraseña:");

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelMainTitleAdmin, GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                            .addComponent(getjPasswordFieldAdmin())
                            .addComponent(jLabelWelcomeAdmin, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(getjButtonPasswordOk(), GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelMainTitleAdmin)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelWelcomeAdmin)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(getjButtonPasswordOk(), GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                    .addComponent(getjPasswordFieldAdmin(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setVisible(true);
    }              
                    
    private javax.swing.JButton jButtonPasswordOk;
    private javax.swing.JLabel jLabelMainTitleAdmin;
    private javax.swing.JLabel jLabelWelcomeAdmin;
    private javax.swing.JPasswordField jPasswordFieldAdmin;
    private ClickEvent clickEvent;

    /**
     * @return the jButtonPasswordOk
     */
    public javax.swing.JButton getjButtonPasswordOk() {
        return jButtonPasswordOk;
    }

    /**
     * @return the jPasswordFieldAdmin
     */
    public javax.swing.JPasswordField getjPasswordFieldAdmin() {
        return jPasswordFieldAdmin;
    }

    
}
