/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Dialvec
 */
public class clientModify extends javax.swing.JFrame {

    /**
     * Creates new form clientSearch
     */
    public clientModify() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTituloBuscarCliente = new javax.swing.JLabel();
        jTextFieldBCNombre = new javax.swing.JTextField();
        jTextFieldBCAlias = new javax.swing.JTextField();
        jTextFieldBCApellido = new javax.swing.JTextField();
        jTextFieldBCEmail = new javax.swing.JTextField();
        jTextFieldBCCelular = new javax.swing.JTextField();
        jTextFieldBCDob = new javax.swing.JTextField();
        jButtonModify = new javax.swing.JButton();
        jLabelAlias = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelApellido = new javax.swing.JLabel();
        jLabelemail = new javax.swing.JLabel();
        jLabelCelular = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelTituloBuscarCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelTituloBuscarCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTituloBuscarCliente.setText("Modificar Cliente");

        jTextFieldBCNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldBCAlias.setEditable(false);
        jTextFieldBCAlias.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldBCApellido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldBCApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBCApellidoActionPerformed(evt);
            }
        });

        jTextFieldBCEmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldBCEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBCEmailActionPerformed(evt);
            }
        });

        jTextFieldBCCelular.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldBCCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBCCelularActionPerformed(evt);
            }
        });

        jTextFieldBCDob.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldBCDob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBCDobActionPerformed(evt);
            }
        });

        jButtonModify.setBackground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.activeTitleGradient"));
        jButtonModify.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonModify.setText("Guardar Cambios");
        jButtonModify.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonModify.setBorderPainted(false);

        jLabelAlias.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelAlias.setText("Alias");

        jLabelNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNombre.setText("Nombre");

        jLabelApellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelApellido.setText("Apellido");

        jLabelemail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelemail.setText("e-mail");

        jLabelCelular.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelCelular.setText("Celular");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Fecha nacimiento");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jButtonModify, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTituloBuscarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelAlias)
                            .addComponent(jLabelNombre)
                            .addComponent(jLabelApellido)
                            .addComponent(jLabelemail)
                            .addComponent(jLabelCelular)
                            .addComponent(jLabel1))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldBCDob, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldBCCelular)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldBCAlias, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                    .addComponent(jTextFieldBCApellido)
                                    .addComponent(jTextFieldBCEmail)
                                    .addComponent(jTextFieldBCNombre))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTituloBuscarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBCAlias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAlias))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBCNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNombre))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBCApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelApellido))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBCEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelemail))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBCCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCelular))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBCDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jButtonModify)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldBCApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBCApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBCApellidoActionPerformed

    private void jTextFieldBCEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBCEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBCEmailActionPerformed

    private void jTextFieldBCCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBCCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBCCelularActionPerformed

    private void jTextFieldBCDobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBCDobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBCDobActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(clientModify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(clientModify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(clientModify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(clientModify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new clientModify().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonModify;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAlias;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelCelular;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelTituloBuscarCliente;
    private javax.swing.JLabel jLabelemail;
    private javax.swing.JTextField jTextFieldBCAlias;
    private javax.swing.JTextField jTextFieldBCApellido;
    private javax.swing.JTextField jTextFieldBCCelular;
    private javax.swing.JTextField jTextFieldBCDob;
    private javax.swing.JTextField jTextFieldBCEmail;
    private javax.swing.JTextField jTextFieldBCNombre;
    // End of variables declaration//GEN-END:variables
}