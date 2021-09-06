/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
/**
 *
 * @author Dialvec
 */
public class TitleWindow extends JFrame {

    public TitleWindow() {
        initComponents();
    }
    
    private void initComponents() {
        
        setSize(new Dimension(400, 100));
        setResizable(false);
        setBackground(new Color(235, 235, 235));
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        jLabelMainTitle = new JLabel();
        JButtonIngresoVentas = new JButton();
        JButtonIngresoAdmin = new JButton();

        jLabelMainTitle.setFont(new Font("Tahoma", 3, 24));
        jLabelMainTitle.setHorizontalAlignment(SwingConstants.CENTER);
        jLabelMainTitle.setText("Excite Bike Shop");
        jLabelMainTitle.setSize(new Dimension(100, 20));
        add(jLabelMainTitle, new AbsoluteConstraints(85, 12, 216, -1));

        getJButtonIngresoVentas().setBackground(new Color(153, 204, 255));
        getJButtonIngresoVentas().setFont(new Font("Tahoma", 0, 14));
        getJButtonIngresoVentas().setText("Ingreso Ventas");
        getJButtonIngresoVentas().setBorderPainted(false);
        getJButtonIngresoVentas().setSize(new Dimension(75, 25));
        add(getJButtonIngresoVentas(), new AbsoluteConstraints(15, 59, 173, -1));

        getJButtonIngresoAdmin().setBackground(new Color(153, 204, 255));
        getJButtonIngresoAdmin().setFont(new Font("Tahoma", 0, 14));
        getJButtonIngresoAdmin().setText("Ingreso Administrador");
        getJButtonIngresoAdmin().setBorderPainted(false);
        getJButtonIngresoAdmin().setSize(new Dimension(75, 25));
        add(getJButtonIngresoAdmin(), new AbsoluteConstraints(206, 59, -1, -1));
    }

    private javax.swing.JButton JButtonIngresoAdmin;
    private javax.swing.JButton JButtonIngresoVentas;
    private javax.swing.JLabel jLabelMainTitle;

    /**
     * @return the JButtonIngresoAdmin
     */
    public javax.swing.JButton getJButtonIngresoAdmin() {
        return JButtonIngresoAdmin;
    }

    /**
     * @return the JButtonIngresoVentas
     */
    public javax.swing.JButton getJButtonIngresoVentas() {
        return JButtonIngresoVentas;
    }
}