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
public class mainWindowDesign extends javax.swing.JFrame {

    /**
     * Creates new form operations
     */
    public mainWindowDesign() {
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

        buttonGroupSelection = new javax.swing.ButtonGroup();
        PanelControles = new javax.swing.JPanel();
        jButtonCrearModificar1 = new javax.swing.JButton();
        jButtonCrearModificar = new javax.swing.JButton();
        jButtonCrear = new javax.swing.JButton();
        jRadioButtonCliente = new javax.swing.JRadioButton();
        jRadioButtonProducto = new javax.swing.JRadioButton();
        jRadioButtonIntencion = new javax.swing.JRadioButton();
        jLabelTextoTipoConsulta = new javax.swing.JLabel();
        jButtonBuscar = new javax.swing.JButton();
        jScrollPaneTable = new javax.swing.JScrollPane();
        jTableData = new javax.swing.JTable();
        jLabelTableTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonCrearModificar1.setBackground(javax.swing.UIManager.getDefaults().getColor("nb.errorForeground"));
        jButtonCrearModificar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCrearModificar1.setText("Borrar Selección");
        jButtonCrearModificar1.setToolTipText("");
        jButtonCrearModificar1.setBorderPainted(false);

        jButtonCrearModificar.setBackground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.inactiveTitleGradient"));
        jButtonCrearModificar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCrearModificar.setText("Modificar");
        jButtonCrearModificar.setToolTipText("");
        jButtonCrearModificar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonCrearModificar.setBorderPainted(false);
        jButtonCrearModificar.setMaximumSize(new java.awt.Dimension(75, 25));
        jButtonCrearModificar.setMinimumSize(new java.awt.Dimension(75, 25));
        jButtonCrearModificar.setPreferredSize(new java.awt.Dimension(75, 25));

        jButtonCrear.setBackground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.inactiveTitleGradient"));
        jButtonCrear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCrear.setText("Crear");
        jButtonCrear.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonCrear.setBorderPainted(false);
        jButtonCrear.setMaximumSize(new java.awt.Dimension(75, 25));
        jButtonCrear.setMinimumSize(new java.awt.Dimension(75, 25));
        jButtonCrear.setPreferredSize(new java.awt.Dimension(75, 25));

        buttonGroupSelection.add(jRadioButtonCliente);
        jRadioButtonCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButtonCliente.setText("Cliente");
        jRadioButtonCliente.setToolTipText("");

        buttonGroupSelection.add(jRadioButtonProducto);
        jRadioButtonProducto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButtonProducto.setText("Producto");
        jRadioButtonProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonProductoActionPerformed(evt);
            }
        });

        buttonGroupSelection.add(jRadioButtonIntencion);
        jRadioButtonIntencion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButtonIntencion.setText("Intención de Compra");

        jLabelTextoTipoConsulta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelTextoTipoConsulta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTextoTipoConsulta.setText("Seleccione consulta");

        jButtonBuscar.setBackground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.inactiveTitleGradient"));
        jButtonBuscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonBuscar.setBorderPainted(false);
        jButtonBuscar.setMaximumSize(new java.awt.Dimension(75, 25));
        jButtonBuscar.setMinimumSize(new java.awt.Dimension(75, 25));
        jButtonBuscar.setPreferredSize(new java.awt.Dimension(75, 25));

        javax.swing.GroupLayout PanelControlesLayout = new javax.swing.GroupLayout(PanelControles);
        PanelControles.setLayout(PanelControlesLayout);
        PanelControlesLayout.setHorizontalGroup(
            PanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelControlesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTextoTipoConsulta)
                .addGap(8, 8, 8)
                .addGroup(PanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButtonIntencion)
                    .addComponent(jRadioButtonProducto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButtonCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelControlesLayout.createSequentialGroup()
                        .addComponent(jButtonCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCrearModificar1))
                    .addGroup(PanelControlesLayout.createSequentialGroup()
                        .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCrearModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        PanelControlesLayout.setVerticalGroup(
            PanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelControlesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCrearModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCrearModificar1)
                    .addComponent(jButtonCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelControlesLayout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addGroup(PanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelControlesLayout.createSequentialGroup()
                        .addComponent(jRadioButtonCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonProducto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIntencion))
                    .addComponent(jLabelTextoTipoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabelTextoTipoConsulta.getAccessibleContext().setAccessibleName("");
        jLabelTextoTipoConsulta.getAccessibleContext().setAccessibleDescription("");

        jTableData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPaneTable.setViewportView(jTableData);

        jLabelTableTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTableTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTableTitle.setText("Resultado consulta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelTableTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PanelControles, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPaneTable, javax.swing.GroupLayout.DEFAULT_SIZE, 637, Short.MAX_VALUE))
                        .addGap(6, 6, 6))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelTableTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneTable, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelControles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonProductoActionPerformed

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
            java.util.logging.Logger.getLogger(mainWindowDesign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainWindowDesign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainWindowDesign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainWindowDesign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainWindowDesign().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelControles;
    private javax.swing.ButtonGroup buttonGroupSelection;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCrear;
    private javax.swing.JButton jButtonCrearModificar;
    private javax.swing.JButton jButtonCrearModificar1;
    private javax.swing.JLabel jLabelTableTitle;
    private javax.swing.JLabel jLabelTextoTipoConsulta;
    private javax.swing.JRadioButton jRadioButtonCliente;
    private javax.swing.JRadioButton jRadioButtonIntencion;
    private javax.swing.JRadioButton jRadioButtonProducto;
    private javax.swing.JScrollPane jScrollPaneTable;
    private javax.swing.JTable jTableData;
    // End of variables declaration//GEN-END:variables
}