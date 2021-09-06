package view;

import java.awt.Font;
import javax.swing.JTable;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.LayoutStyle;
import javax.swing.JScrollPane;
import javax.swing.GroupLayout;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

/**
 *
 * @author Dialvec
 */
public class MainWindow extends JFrame {

    /**
     * Creates new form operations
     * @param adminsession
     */
    public MainWindow(boolean adminsession) {
        initComponents();
        setjButtonModificarEnabled(adminsession);
        setjButtonEliminarEnabled(adminsession);
    }

    private void initComponents() {

        buttonGroupSelection = new ButtonGroup();
        PanelControles = new JPanel();
        jButtonEliminar = new JButton();
        jButtonModificar = new JButton();
        jButtonCrear = new JButton();
        jRadioButtonCliente = new JRadioButton();
        jRadioButtonVehiculo = new JRadioButton();
        jRadioButtonIntencion = new JRadioButton();
        jLabelTextoTipoConsulta = new JLabel();
        jButtonBuscar = new JButton();
        jScrollPaneTable = new JScrollPane();
        setjTableData(new JTable());
        jLabelTableTitle = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);

        getjButtonEliminar().setBackground(UIManager.getDefaults().getColor("nb.errorForeground"));
        getjButtonEliminar().setFont(new Font("Tahoma", 1, 14)); // NOI18N
        getjButtonEliminar().setText("Borrar Selección");
        getjButtonEliminar().setToolTipText("");
        getjButtonEliminar().setBorderPainted(false);

        getjButtonModificar().setBackground(UIManager.getDefaults().getColor("InternalFrame.inactiveTitleGradient"));
        getjButtonModificar().setFont(new Font("Tahoma", 1, 14)); // NOI18N
        getjButtonModificar().setText("Modificar");
        getjButtonModificar().setToolTipText("");
        getjButtonModificar().setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getjButtonModificar().setBorderPainted(false);
        getjButtonModificar().setSize(new Dimension(75, 25));

        getjButtonCrear().setBackground(UIManager.getDefaults().getColor("InternalFrame.inactiveTitleGradient"));
        getjButtonCrear().setFont(new Font("Tahoma", 1, 14)); // NOI18N
        getjButtonCrear().setText("Crear");
        getjButtonCrear().setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getjButtonCrear().setBorderPainted(false);
        getjButtonCrear().setSize(new Dimension(75, 25));

        getButtonGroupSelection().add(getjRadioButtonCliente());
        getjRadioButtonCliente().setFont(new Font("Tahoma", 1, 14)); // NOI18N
        getjRadioButtonCliente().setText("Cliente");

        getButtonGroupSelection().add(getjRadioButtonVehiculo());
        getjRadioButtonVehiculo().setFont(new Font("Tahoma", 1, 14)); // NOI18N
        getjRadioButtonVehiculo().setText("Vehículo");

        getButtonGroupSelection().add(getjRadioButtonIntencion());
        getjRadioButtonIntencion().setFont(new Font("Tahoma", 1, 14)); // NOI18N
        getjRadioButtonIntencion().setText("Intención de Compra");

        jLabelTextoTipoConsulta.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        jLabelTextoTipoConsulta.setHorizontalAlignment(SwingConstants.CENTER);
        jLabelTextoTipoConsulta.setText("Seleccione consulta");

        getjButtonBuscar().setBackground(UIManager.getDefaults().getColor("InternalFrame.inactiveTitleGradient"));
        getjButtonBuscar().setFont(new Font("Tahoma", 1, 14)); // NOI18N
        getjButtonBuscar().setText("Buscar");
        getjButtonBuscar().setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getjButtonBuscar().setBorderPainted(false);
        getjButtonBuscar().setSize(new Dimension(75, 25));

        GroupLayout PanelControlesLayout = new GroupLayout(getPanelControles());
        getPanelControles().setLayout(PanelControlesLayout);
        PanelControlesLayout.setHorizontalGroup(PanelControlesLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, PanelControlesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTextoTipoConsulta)
                .addGap(8, 8, 8)
                .addGroup(PanelControlesLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(getjRadioButtonIntencion())
                    .addComponent(getjRadioButtonVehiculo(), GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
                    .addComponent(getjRadioButtonCliente(),  GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelControlesLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelControlesLayout.createSequentialGroup()
                        .addComponent(getjButtonCrear(), GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(getjButtonEliminar()))
                    .addGroup(PanelControlesLayout.createSequentialGroup()
                        .addComponent(getjButtonBuscar(), GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(getjButtonModificar(), GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        PanelControlesLayout.setVerticalGroup(PanelControlesLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, PanelControlesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelControlesLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(getjButtonModificar(), GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                    .addComponent(getjButtonBuscar(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelControlesLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(getjButtonEliminar())
                    .addComponent(getjButtonCrear(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(GroupLayout.Alignment.TRAILING, PanelControlesLayout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addGroup(PanelControlesLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(PanelControlesLayout.createSequentialGroup()
                        .addComponent(getjRadioButtonCliente())
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(getjRadioButtonVehiculo())
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(getjRadioButtonIntencion()))
                    .addComponent(jLabelTextoTipoConsulta, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabelTextoTipoConsulta.getAccessibleContext().setAccessibleName("");
        jLabelTextoTipoConsulta.getAccessibleContext().setAccessibleDescription("");

        getjTableData().setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Columna 1", "Columna 2", "Columna 3", "Columna 4"
            }
        ));
        jScrollPaneTable.setViewportView(getjTableData());

        jLabelTableTitle.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        jLabelTableTitle.setHorizontalAlignment(SwingConstants.CENTER);
        jLabelTableTitle.setText("Resultado consulta");

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelTableTitle, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPaneTable)
                        .addGap(6, 6, 6))
                    .addComponent(getPanelControles(), GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelTableTitle)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneTable, GroupLayout.PREFERRED_SIZE, 338, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(getPanelControles(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        pack();
    }
             
    private JPanel PanelControles;
    private ButtonGroup buttonGroupSelection;
    private JButton jButtonBuscar;
    private JButton jButtonCrear;
    private JButton jButtonModificar;
    private JButton jButtonEliminar;
    private JLabel jLabelTableTitle;
    private JLabel jLabelTextoTipoConsulta;
    private JRadioButton jRadioButtonCliente;
    private JRadioButton jRadioButtonIntencion;
    private JRadioButton jRadioButtonVehiculo;
    private JScrollPane jScrollPaneTable;
    private JTable jTableData;

    /**
     * @return the PanelControles
     */
    public JPanel getPanelControles() {
        return PanelControles;
    }

    /**
     * @return the buttonGroupSelection
     */
    public ButtonGroup getButtonGroupSelection() {
        return buttonGroupSelection;
    }

    /**
     * @return the jButtonBuscar
     */
    public JButton getjButtonBuscar() {
        return jButtonBuscar;
    }

    /**
     * @return the jButtonCrear
     */
    public JButton getjButtonCrear() {
        return jButtonCrear;
    }

    /**
     * @return the jButtonModificar
     */
    public JButton getjButtonModificar() {
        return jButtonModificar;
    }

    /**
     * @return the jButtonEliminar
     */
    public JButton getjButtonEliminar() {
        return jButtonEliminar;
    }

    /**
     * @return the jRadioButtonCliente
     */
    public JRadioButton getjRadioButtonCliente() {
        return jRadioButtonCliente;
    }

    /**
     * @return the jRadioButtonIntencion
     */
    public JRadioButton getjRadioButtonIntencion() {
        return jRadioButtonIntencion;
    }

    /**
     * @return the jRadioButtonVehiculo
     */
    public JRadioButton getjRadioButtonVehiculo() {
        return jRadioButtonVehiculo;
    }

    /**
     * @return the jTableData
     */
    public JTable getjTableData() {
        return jTableData;
    }

    /**
     * @param jTableData the jTableData to set
     */
    public void setjTableData(JTable jTableData) {
        this.jTableData = jTableData;
    }
    
    private void setjButtonEliminarEnabled(boolean enabled){
        jButtonEliminar.setEnabled(enabled);
    }
    
    private void setjButtonModificarEnabled(boolean enabled){
        jButtonModificar.setEnabled(enabled);
    }
                 
}
