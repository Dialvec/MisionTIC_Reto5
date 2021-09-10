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
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle;
import javax.swing.GroupLayout;
import javax.swing.WindowConstants;

import utils.BikeShopParameters;

import controller.ClickEvent;

/**
 *
 * @author Dialvec
 */
public class VehicleWindow extends JFrame {

    /**
     * Creates new form clientSearch
     * @param tipoVehiculo
     * @param mode
     * @param mainWindowParent
     */
    public VehicleWindow(String tipoVehiculo, String mode, MainWindow mainWindowParent) {
        this.mode = mode;
        this.tipoVehiculo = (mode.equals(BikeShopParameters.CREAR_VEHICULO))? mode:tipoVehiculo;
        this.mainWindowParent = mainWindowParent;
        initComponents();
    }
                         
    private void initComponents() {

        jLabelTitulo = new JLabel();
        jLabelInstruccion = new JLabel();
        jTextFieldBVPrecio = new JTextField();
        jTextFieldBVFabricante = new JTextField();
        jTextFieldBVBanio = new JTextField();
        jTextFieldBVMProveedor = new JTextField();
        jButtonActionBicycle = new JButton();
        jButtonActionMotorcycle = new JButton();
        jLabelBicicletas = new JLabel();
        jTextFieldBVMAutonomia = new JTextField();
        jLabelMotos = new JLabel();
        jLabelFabricante = new JLabel();
        jLabelPrecio = new JLabel();
        jLabelAnioFabrica = new JLabel();
        jLabelProveedor = new JLabel();
        jLabelAutonomia = new JLabel();
        clickEvent = new ClickEvent(this);

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabelTitulo.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabelInstruccion.setFont(new Font("Tahoma", 0, 12)); // NOI18N
        jLabelInstruccion.setText(BikeShopParameters.EDITAR_VEHICULO_INSTR);

        jTextFieldBVPrecio.setFont(new Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldBVFabricante.setEditable(false);
        jTextFieldBVFabricante.setFont(new Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldBVBanio.setFont(new Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldBVMProveedor.setEditable(false);
        jTextFieldBVMProveedor.setFont(new Font("Tahoma", 0, 12)); // NOI18N

        jButtonActionBicycle.setBackground(UIManager.getDefaults().getColor("InternalFrame.activeTitleGradient"));
        jButtonActionBicycle.setFont(new Font("Tahoma", 0, 12)); // NOI18N
        jButtonActionBicycle.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonActionBicycle.setBorderPainted(false);
        jButtonActionBicycle.addActionListener(clickEvent);
        
        jButtonActionMotorcycle.setBackground(UIManager.getDefaults().getColor("InternalFrame.activeTitleGradient"));
        jButtonActionMotorcycle.setFont(new Font("Tahoma", 0, 12)); // NOI18N
        jButtonActionMotorcycle.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonActionMotorcycle.setBorderPainted(false);
        jButtonActionMotorcycle.addActionListener(clickEvent);

        jLabelBicicletas.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        jLabelBicicletas.setText(BikeShopParameters.BICICLETAS);

        jTextFieldBVMAutonomia.setFont(new Font("Tahoma", 0, 12)); // NOI18N

        jLabelMotos.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        jLabelMotos.setText(BikeShopParameters.MOTOS);

        jLabelFabricante.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        jLabelFabricante.setText(BikeShopParameters.FABRICANTE);

        jLabelPrecio.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        jLabelPrecio.setText(BikeShopParameters.PRECIO);

        jLabelAnioFabrica.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        jLabelAnioFabrica.setText(BikeShopParameters.ANIO_FABRICACION);

        jLabelProveedor.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        jLabelProveedor.setText(BikeShopParameters.PROVEEDOR_MOTOR);

        jLabelAutonomia.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        jLabelAutonomia.setText(BikeShopParameters.AUTONOMIA);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabelBicicletas)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelInstruccion)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelProveedor)
                                            .addComponent(jLabelAutonomia)
                                            .addComponent(jLabelFabricante)
                                            .addComponent(jLabelAnioFabrica)
                                            .addComponent(jLabelPrecio))
                                        .addGap(33, 33, 33)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jTextFieldBVBanio, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldBVPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldBVFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldBVMAutonomia, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldBVMProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabelMotos)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonActionBicycle, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonActionMotorcycle, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelInstruccion)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBVFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFabricante))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBVPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPrecio))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelBicicletas)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBVBanio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAnioFabrica))
                .addGap(22, 22, 22)
                .addComponent(jLabelMotos)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBVMProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelProveedor))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBVMAutonomia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAutonomia))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonActionBicycle)
                    .addComponent(jButtonActionMotorcycle))
                .addContainerGap())
        );

        setWindowMode(getMode() , getTipoVehiculo());
        pack();
        setVisible(true);
    }                       

    private JButton jButtonActionBicycle;
    private JButton jButtonActionMotorcycle;
    private JLabel jLabelAnioFabrica;
    private JLabel jLabelAutonomia;
    private JLabel jLabelBicicletas;
    private JLabel jLabelFabricante;
    private JLabel jLabelInstruccion;
    private JLabel jLabelMotos;
    private JLabel jLabelPrecio;
    private JLabel jLabelProveedor;
    private JLabel jLabelTitulo;
    private JTextField jTextFieldBVBanio;
    private JTextField jTextFieldBVFabricante;
    private JTextField jTextFieldBVMAutonomia;
    private JTextField jTextFieldBVMProveedor;
    private JTextField jTextFieldBVPrecio;
    
    private ClickEvent clickEvent;
    
    private final String tipoVehiculo;
    private final String mode;
    
    private final MainWindow mainWindowParent;

    
    private void setWindowMode(String mode, String tipoVehiculo){
        
        switch (mode) {
            case BikeShopParameters.CREATE_MODE:
                jLabelTitulo.setText(BikeShopParameters.CREAR_VEHICULO);
                jButtonActionBicycle.setText(BikeShopParameters.BOTON_CREAR_BICI);
                jButtonActionMotorcycle.setText(BikeShopParameters.BOTON_CREAR_MOTO);
                jTextFieldBVFabricante.setEditable(true);
                jTextFieldBVMProveedor.setEditable(true);
                
                jTextFieldBVBanio.setVisible(true);
                jButtonActionBicycle.setEnabled(true);
                jTextFieldBVMAutonomia.setVisible(true);
                jTextFieldBVMProveedor.setVisible(true);
                jButtonActionMotorcycle.setEnabled(true);
                break;
                
            
            case BikeShopParameters.SEARCH_MODE:
                jLabelTitulo.setText(BikeShopParameters.BUSCAR_VEHICULO);
                jButtonActionBicycle.setText(BikeShopParameters.BOTON_BUSCAR_BICI);
                jButtonActionMotorcycle.setText(BikeShopParameters.BOTON_BUSCAR_MOTO);
                jTextFieldBVFabricante.setEditable(true);
                jTextFieldBVMProveedor.setEditable(true);
                
                jTextFieldBVBanio.setVisible(true);
                jButtonActionBicycle.setEnabled(true);
                jTextFieldBVMAutonomia.setVisible(true);
                jTextFieldBVMProveedor.setVisible(true);
                jButtonActionMotorcycle.setEnabled(true);
                break;
                
                
            case BikeShopParameters.EDIT_MODE:
                jLabelTitulo.setText(BikeShopParameters.MODIF_VEHICULO);
                jButtonActionBicycle.setText(BikeShopParameters.BOTON_MODIF_BICI);
                jButtonActionMotorcycle.setText(BikeShopParameters.BOTON_MODIF_MOTO);
                jTextFieldBVFabricante.setEditable(false);
                jTextFieldBVMProveedor.setEditable(false);
                
                switch(tipoVehiculo){
                    case BikeShopParameters.MODEL_BICICLETA:
                        jTextFieldBVBanio.setVisible(true);
                        jButtonActionBicycle.setEnabled(true);
                        jTextFieldBVMAutonomia.setVisible(false);
                        jTextFieldBVMProveedor.setVisible(false);
                        jButtonActionMotorcycle.setEnabled(false);
                        break;
                    
                    case BikeShopParameters.MODEL_MOTO:
                        jTextFieldBVBanio.setVisible(false);
                        jButtonActionBicycle.setEnabled(false);
                        jTextFieldBVMAutonomia.setVisible(true);
                        jTextFieldBVMProveedor.setVisible(true);
                        jButtonActionMotorcycle.setEnabled(true);
                        break;
                    
                    default:
                        JOptionPane.showMessageDialog(null, 
                        "No se encuentra tipo de Vehículo en VehicleWindow ", 
                        "Debug", 
                        JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
                break;
                
            default:
                JOptionPane.showMessageDialog(null, 
                        "No se encuentra modo de trabajo en VehicleWindow", 
                        "Debug", 
                        JOptionPane.INFORMATION_MESSAGE);
                break;
        }
    }
    
    public int getSelectedRowItemId(){
        int rowItemId;
        int selectedRowIndex;
        String selectedRow;
        
        selectedRowIndex = this.getMainWindowParent().getjTableData().getSelectedRow();
        selectedRow = this.getMainWindowParent().getjTableData().getValueAt(selectedRowIndex, 0).toString();
        rowItemId = Integer.parseInt(selectedRow) ;
        return rowItemId;
    }
    
    /**
     * @return the tipoVehiculo
     */
    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    /**
     * @return the jButtonActionBicycle
     */
    public JButton getjButtonActionBicycle() {
        return jButtonActionBicycle;
    }
    
    /**
     * @return the jButtonActionMotorcycle
     */
    public JButton getjButtonActionMotorycle() {
        return jButtonActionMotorcycle;
    }

    /**
     * @return the jTextFieldBVBanio
     */
    public JTextField getjTextFieldBVBanio() {
        return jTextFieldBVBanio;
    }

    /**
     * @return the jTextFieldBVFabricante
     */
    public JTextField getjTextFieldBVFabricante() {
        return jTextFieldBVFabricante;
    }

    /**
     * @return the jTextFieldBVMAutonomia
     */
    public JTextField getjTextFieldBVMAutonomia() {
        return jTextFieldBVMAutonomia;
    }

    /**
     * @return the jTextFieldBVMProveedor
     */
    public JTextField getjTextFieldBVMProveedor() {
        return jTextFieldBVMProveedor;
    }

    /**
     * @return the jTextFieldBVPrecio
     */
    public JTextField getjTextFieldBVPrecio() {
        return jTextFieldBVPrecio;
    }

    /**
     * @return the mode
     */
    public String getMode() {
        return mode;
    }

    /**
     * @return the mainWindowParent
     */
    public MainWindow getMainWindowParent() {
        return mainWindowParent;
    }
    
}
