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
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.BorderFactory;
import javax.swing.WindowConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.UIManager;
/**
 *
 * @author Dialvec
 */
public class passwordWindow extends JFrame {

    public passwordWindow() {
        initComponents();
    }
                        
    private void initComponents() {
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabelPasswordTitle = new JLabel();
        jButtonPassOk = new JButton();
        jPasswordField = new JPasswordField();

        jLabelPasswordTitle.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        jLabelPasswordTitle.setHorizontalAlignment(SwingConstants.CENTER);
        jLabelPasswordTitle.setText("Ingrese contraseña");

        getjButtonPassOk().setBackground(UIManager.getDefaults().getColor("InternalFrame.activeTitleGradient"));
        getjButtonPassOk().setFont(new Font("Tahoma", 0, 14)); // NOI18N
        getjButtonPassOk().setText("OK");
        getjButtonPassOk().setBorder(BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getjButtonPassOk().setHorizontalTextPosition(SwingConstants.CENTER);

        getjPasswordField().setFont(new Font("Tahoma", 0, 14)); // NOI18N
        getjPasswordField().setHorizontalAlignment(JTextField.CENTER);

        javax.swing.GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(getjPasswordField(), GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(getjButtonPassOk(), GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabelPasswordTitle)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPasswordTitle)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                    .addComponent(getjButtonPassOk(), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(getjPasswordField()))
                .addContainerGap())
        );
    }                      
                    
    private javax.swing.JButton jButtonPassOk;
    private javax.swing.JLabel jLabelPasswordTitle;
    private javax.swing.JPasswordField jPasswordField;                  

    /**
     * @return the jButtonPassOk
     */
    public javax.swing.JButton getjButtonPassOk() {
        return jButtonPassOk;
    }

    /**
     * @return the jPasswordField
     */
    public javax.swing.JPasswordField getjPasswordField() {
        return jPasswordField;
    }
}
