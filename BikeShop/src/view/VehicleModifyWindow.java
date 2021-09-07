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
import javax.swing.WindowConstants;

import utils.BikeShopParameters;

import controller.ClickEvent;

/**
 *
 * @author Dialvec
 */
public class VehicleModifyWindow extends JFrame {

    private final String tipoVehiculo;
    private final int idVehiculo;

    /**
     * Creates new form clientSearch
     * @param tipoVehiculo
     * @param idVehiculo
     */
    public VehicleModifyWindow(String tipoVehiculo, int idVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
        this.idVehiculo = idVehiculo;
        initComponents();
        
    }
                         
    private void initComponents() {

        jLabelTituloBuscarCliente = new JLabel();
        jLabelInstrBuscarCliente = new JLabel();
        jTextFieldBVPrecio = new JTextField();
        jTextFieldBVFabricante = new JTextField();
        jTextFieldBVBanio = new JTextField();
        jTextFieldBVMProveedor = new JTextField();
        jButtonModifyVehicle = new JButton();
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

        jLabelTituloBuscarCliente.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        jLabelTituloBuscarCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTituloBuscarCliente.setText(BikeShopParameters.EDITAR_VEHICULO);

        jLabelInstrBuscarCliente.setFont(new Font("Tahoma", 0, 12)); // NOI18N
        jLabelInstrBuscarCliente.setText(BikeShopParameters.EDITAR_VEHICULO_INSTR);

        jTextFieldBVPrecio.setFont(new Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldBVFabricante.setEditable(false);
        jTextFieldBVFabricante.setFont(new Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldBVBanio.setFont(new Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldBVMProveedor.setEditable(false);
        jTextFieldBVMProveedor.setFont(new Font("Tahoma", 0, 12)); // NOI18N

        jButtonModifyVehicle.setBackground(UIManager.getDefaults().getColor("InternalFrame.activeTitleGradient"));
        jButtonModifyVehicle.setFont(new Font("Tahoma", 0, 12)); // NOI18N
        jButtonModifyVehicle.setText(BikeShopParameters.GUARDAR_CAMBIOS);
        jButtonModifyVehicle.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonModifyVehicle.setBorderPainted(false);
        jButtonModifyVehicle.addActionListener(clickEvent);

        jLabelBicicletas.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        jLabelBicicletas.setText(BikeShopParameters.BICICLETAS);

        jTextFieldBVMAutonomia.setFont(new Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldBVMAutonomia.setText(BikeShopParameters.AUTONOMIA);

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

        javax.swing.GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabelBicicletas)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTituloBuscarCliente, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelInstrBuscarCliente)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelProveedor)
                                            .addComponent(jLabelAutonomia)
                                            .addComponent(jLabelFabricante)
                                            .addComponent(jLabelAnioFabrica)
                                            .addComponent(jLabelPrecio))
                                        .addGap(33, 33, 33)
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                            .addComponent(getjTextFieldBVBanio(), GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(getjTextFieldBVPrecio(), GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(getjTextFieldBVFabricante(), GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(getjTextFieldBVMAutonomia(), GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(getjTextFieldBVMProveedor(), GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabelMotos))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(getjButtonModifyVehicle(), GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTituloBuscarCliente)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelInstrBuscarCliente)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(getjTextFieldBVFabricante(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFabricante))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(getjTextFieldBVPrecio(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPrecio))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelBicicletas)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(getjTextFieldBVBanio(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAnioFabrica))
                .addGap(22, 22, 22)
                .addComponent(jLabelMotos)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(getjTextFieldBVMProveedor(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelProveedor))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(getjTextFieldBVMAutonomia(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAutonomia))
                .addGap(18, 18, 18)
                .addComponent(getjButtonModifyVehicle())
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        
        if(getTipoVehiculo().equals(BikeShopParameters.BICICLETAS)){
            getjTextFieldBVMProveedor().setVisible(false);
            getjTextFieldBVMAutonomia().setVisible(false);
            getjTextFieldBVBanio().setVisible(true);
        }
        else if(getTipoVehiculo().equals(BikeShopParameters.MOTOS)){
            getjTextFieldBVMProveedor().setVisible(true);
            getjTextFieldBVMAutonomia().setVisible(true);
            getjTextFieldBVBanio().setVisible(false);
        }
        
        setVisible(true);
        pack();
    }                       

    private JButton jButtonModifyVehicle;
    private JLabel jLabelAnioFabrica;
    private JLabel jLabelAutonomia;
    private JLabel jLabelBicicletas;
    private JLabel jLabelFabricante;
    private JLabel jLabelInstrBuscarCliente;
    private JLabel jLabelMotos;
    private JLabel jLabelPrecio;
    private JLabel jLabelProveedor;
    private JLabel jLabelTituloBuscarCliente;
    private JTextField jTextFieldBVBanio;
    private JTextField jTextFieldBVFabricante;
    private JTextField jTextFieldBVMAutonomia;
    private JTextField jTextFieldBVMProveedor;
    private JTextField jTextFieldBVPrecio;
    private ClickEvent clickEvent;

    /**
     * @return the tipoVehiculo
     */
    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    /**
     * @return the idVehiculo
     */
    public int getIdVehiculo() {
        return idVehiculo;
    }

    /**
     * @return the jButtonModifyVehicle
     */
    public JButton getjButtonModifyVehicle() {
        return jButtonModifyVehicle;
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
    
    
}
