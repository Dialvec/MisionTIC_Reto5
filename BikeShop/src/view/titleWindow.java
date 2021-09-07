/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Font;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

import controller.ClickEvent;
/**
 *
 * @author Dialvec
 */
public class TitleWindow extends JFrame {

    public TitleWindow() {
        initComponents();
    }
    
    private void initComponents() {
        
        jLabelMainTitle = new JLabel();
        jButtonIngresoVentas = new JButton();
        jButtonIngresoAdmin = new JButton();
        clickEvent = new ClickEvent(this);

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(235, 235, 235));
        setLocation(new java.awt.Point(250, 250));
        setResizable(false);

        jLabelMainTitle.setFont(new Font("Tahoma", 3, 24)); // NOI18N
        jLabelMainTitle.setHorizontalAlignment(SwingConstants.CENTER);
        jLabelMainTitle.setText("Excite Bike Shop");

        jButtonIngresoVentas.setBackground(UIManager.getDefaults().getColor("InternalFrame.activeTitleGradient"));
        jButtonIngresoVentas.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        jButtonIngresoVentas.setText("Ingreso Ventas");
        jButtonIngresoVentas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonIngresoVentas.setBorderPainted(false);
        jButtonIngresoVentas.setMaximumSize(new Dimension(100, 25));
        jButtonIngresoVentas.setMinimumSize(new Dimension(100, 25));
        jButtonIngresoVentas.setPreferredSize(new Dimension(100, 25));
        jButtonIngresoVentas.addActionListener(clickEvent);

        jButtonIngresoAdmin.setBackground(UIManager.getDefaults().getColor("InternalFrame.activeTitleGradient"));
        jButtonIngresoAdmin.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        jButtonIngresoAdmin.setText("Ingreso Administrador");
        jButtonIngresoAdmin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonIngresoAdmin.setBorderPainted(false);
        jButtonIngresoAdmin.addActionListener(clickEvent);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelMainTitle, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonIngresoVentas, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(jButtonIngresoAdmin, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelMainTitle)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonIngresoVentas, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jButtonIngresoAdmin, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
        setVisible(true);
    }

    private JButton jButtonIngresoAdmin;
    private JButton jButtonIngresoVentas;
    private JLabel jLabelMainTitle;
    private ClickEvent clickEvent;

    /**
     * @return the JButtonIngresoAdmin
     */
    public JButton getJButtonIngresoAdmin() {
        return jButtonIngresoAdmin;
    }

    /**
     * @return the JButtonIngresoVentas
     */
    public JButton getJButtonIngresoVentas() {
        return jButtonIngresoVentas;
    }
}