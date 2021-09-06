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
public class intentionSearchWindow extends JFrame {

    /**
     * Creates new form clientSearch
     */
    public intentionSearchWindow() {
        initComponents();
    }
                        
    private void initComponents() {

        jLabelTituloBuscarCliente = new JLabel();
        jLabelInstrBuscarCliente = new JLabel();
        jTextFieldBINombre = new JTextField();
        jTextFieldBIAlias = new JTextField();
        jTextFieldBIApellido = new JTextField();
        jTextFieldBIFabricante = new JTextField();
        jButtonSearchClient = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabelTituloBuscarCliente.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        jLabelTituloBuscarCliente.setHorizontalAlignment(SwingConstants.CENTER);
        jLabelTituloBuscarCliente.setText("Buscar Intención de Compra");

        jLabelInstrBuscarCliente.setFont(new Font("Tahoma", 0, 12)); // NOI18N
        jLabelInstrBuscarCliente.setText("Indique información de la búsqueda.");

        getjTextFieldBINombre().setFont(new Font("Tahoma", 0, 12)); // NOI18N
        getjTextFieldBINombre().setText("nombre cliente");

        getjTextFieldBIAlias().setFont(new Font("Tahoma", 0, 12)); // NOI18N
        getjTextFieldBIAlias().setText("alias cliente");

        getjTextFieldBIApellido().setFont(new Font("Tahoma", 0, 12)); // NOI18N
        getjTextFieldBIApellido().setText("apellido cliente");

        getjTextFieldBIFabricante().setFont(new Font("Tahoma", 0, 12)); // NOI18N
        getjTextFieldBIFabricante().setText("fabricante vehículo");

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
                    .addComponent(getjTextFieldBIAlias(), GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
                    .addComponent(getjTextFieldBIFabricante(), GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTituloBuscarCliente, GroupLayout.PREFERRED_SIZE, 239, GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(getjTextFieldBINombre(), GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
                            .addComponent(getjTextFieldBIApellido(), GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(getjButtonSearchClient(), GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTituloBuscarCliente)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelInstrBuscarCliente)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(getjTextFieldBIAlias(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(getjTextFieldBINombre(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(getjTextFieldBIApellido(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(getjButtonSearchClient())))
                .addGap(9, 9, 9)
                .addComponent(getjTextFieldBIFabricante(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }
    
    /**
     * @return the jButtonSearchClient
     */
    public JButton getjButtonSearchClient() {
        return jButtonSearchClient;
    }

    /**
     * @return the jTextFieldBIAlias
     */
    public JTextField getjTextFieldBIAlias() {
        return jTextFieldBIAlias;
    }

    /**
     * @return the jTextFieldBIApellido
     */
    public JTextField getjTextFieldBIApellido() {
        return jTextFieldBIApellido;
    }

    /**
     * @return the jTextFieldBIFabricante
     */
    public JTextField getjTextFieldBIFabricante() {
        return jTextFieldBIFabricante;
    }

    /**
     * @return the jTextFieldBINombre
     */
    public JTextField getjTextFieldBINombre() {
        return jTextFieldBINombre;
    }
                    
    private JButton jButtonSearchClient;
    private JLabel jLabelInstrBuscarCliente;
    private JLabel jLabelTituloBuscarCliente;
    private JTextField jTextFieldBIAlias;
    private JTextField jTextFieldBIApellido;
    private JTextField jTextFieldBIFabricante;
    private JTextField jTextFieldBINombre;                   
}
