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
public class VehicleSearchWindow extends JFrame {

    public VehicleSearchWindow() {
        initComponents();
    }
                    
    private void initComponents() {

        jLabelTituloBuscarCliente = new JLabel();
        jLabelInstrBuscarCliente = new JLabel();
        jTextFieldBVPrecio = new JTextField();
        jTextFieldBVFabricante = new JTextField();
        jTextFieldBVBanio = new JTextField();
        jTextFieldBVMProveedor = new JTextField();
        jButtonSearchBicycle = new JButton();
        jLabelBicicletas = new JLabel();
        jTextFieldBVMAutonomia = new JTextField();
        jLabelBicicletas1 = new JLabel();
        jButtonSearchMotorcycle = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);

        jLabelTituloBuscarCliente.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        jLabelTituloBuscarCliente.setHorizontalAlignment(SwingConstants.CENTER);
        jLabelTituloBuscarCliente.setText("Buscar Vehículo");

        jLabelInstrBuscarCliente.setFont(new Font("Tahoma", 0, 12)); // NOI18N
        jLabelInstrBuscarCliente.setText("Indique información de vehículo que busca");

        getjTextFieldBVPrecio().setFont(new Font("Tahoma", 0, 12)); // NOI18N
        getjTextFieldBVPrecio().setText("precio");

        getjTextFieldBVFabricante().setFont(new Font("Tahoma", 0, 12)); // NOI18N
        getjTextFieldBVFabricante().setText("fabricante");

        getjTextFieldBVBanio().setFont(new Font("Tahoma", 0, 12)); // NOI18N
        getjTextFieldBVBanio().setText("año de fabricación");

        getjTextFieldBVMProveedor().setFont(new Font("Tahoma", 0, 12)); // NOI18N
        getjTextFieldBVMProveedor().setText("proveedor del motor");

        getjButtonSearchBicycle().setBackground(UIManager.getDefaults().getColor("InternalFrame.activeTitleGradient"));
        getjButtonSearchBicycle().setFont(new Font("Tahoma", 0, 12)); // NOI18N
        getjButtonSearchBicycle().setText("Buscar Bicicleta");
        getjButtonSearchBicycle().setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getjButtonSearchBicycle().setBorderPainted(false);

        jLabelBicicletas.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        jLabelBicicletas.setText("Bicicletas");

        getjTextFieldBVMAutonomia().setFont(new Font("Tahoma", 0, 12)); // NOI18N
        getjTextFieldBVMAutonomia().setText("horas autonomía");

        jLabelBicicletas1.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        jLabelBicicletas1.setText("Motos Eléctricas");

        getjButtonSearchMotorcycle().setBackground(UIManager.getDefaults().getColor("InternalFrame.activeTitleGradient"));
        getjButtonSearchMotorcycle().setFont(new Font("Tahoma", 0, 12)); // NOI18N
        getjButtonSearchMotorcycle().setText("Buscar Moto");
        getjButtonSearchMotorcycle().setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getjButtonSearchMotorcycle().setBorderPainted(false);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTituloBuscarCliente, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelInstrBuscarCliente)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabelBicicletas)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelBicicletas1)
                        .addGap(27, 27, 27))
                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(getjButtonSearchBicycle(), GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addComponent(getjButtonSearchMotorcycle(), GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(getjTextFieldBVBanio(), GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(getjTextFieldBVMProveedor(), GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
                            .addComponent(getjTextFieldBVMAutonomia(), GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(getjTextFieldBVFabricante(), GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
                    .addComponent(getjTextFieldBVPrecio(), GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTituloBuscarCliente)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelInstrBuscarCliente)
                .addGap(18, 18, 18)
                .addComponent(getjTextFieldBVFabricante(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(getjTextFieldBVPrecio(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBicicletas)
                    .addComponent(jLabelBicicletas1))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(getjTextFieldBVBanio(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(getjTextFieldBVMProveedor(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(getjTextFieldBVMAutonomia(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(getjButtonSearchBicycle())
                    .addComponent(getjButtonSearchMotorcycle()))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }                                                     
                    
    private JButton jButtonSearchBicycle;
    private JButton jButtonSearchMotorcycle;
    private JLabel jLabelBicicletas;
    private JLabel jLabelBicicletas1;
    private JLabel jLabelInstrBuscarCliente;
    private JLabel jLabelTituloBuscarCliente;
    private JTextField jTextFieldBVBanio;
    private JTextField jTextFieldBVFabricante;
    private JTextField jTextFieldBVMAutonomia;
    private JTextField jTextFieldBVMProveedor;
    private JTextField jTextFieldBVPrecio;

    /**
     * @return the jButtonSearchBicycle
     */
    public JButton getjButtonSearchBicycle() {
        return jButtonSearchBicycle;
    }

    /**
     * @return the jButtonSearchBicycle1
     */
    public JButton getjButtonSearchMotorcycle() {
        return jButtonSearchMotorcycle;
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