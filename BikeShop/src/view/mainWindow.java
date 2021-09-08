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

import utils.BikeShopParameters;

import controller.ClickEvent;
import controller.MainListelectionEvent;

/**
 *
 * @author Dialvec
 */
public final class MainWindow extends JFrame {

    /**
     * Creates new form operations
     * @param adminsession
     */
    public MainWindow(boolean adminsession) {
        initComponents();
        setIdVehiculo(0);
        setIdIntencion(0);
        this.adminSession = adminsession;
        setCurrentJTableModel(BikeShopParameters.MODEL_CLIENTE);
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
        jTableData = new JTable();
        jLabelTableTitle = new JLabel();
        
        clickEvent = new ClickEvent(this);
        mainListelectionEvent = new MainListelectionEvent(this);
        
        setCurrentJTableModel(BikeShopParameters.MODEL_CLIENTE);

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setVisible(true);

        jButtonEliminar.setBackground(UIManager.getDefaults().getColor("nb.errorForeground"));
        jButtonEliminar.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        jButtonEliminar.setText(BikeShopParameters.BOTON_BORRAR);
        jButtonEliminar.setToolTipText("Use con Extremo cuidado");
        jButtonEliminar.setBorderPainted(false);
        jButtonEliminar.addActionListener(clickEvent);
        jButtonEliminar.setEnabled(false);

        jButtonModificar.setBackground(UIManager.getDefaults().getColor("InternalFrame.inactiveTitleGradient"));
        jButtonModificar.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        jButtonModificar.setText(BikeShopParameters.BOTON_MODIFICAR);
        jButtonModificar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonModificar.setBorderPainted(false);
        jButtonModificar.setSize(new Dimension(75, 25));
        jButtonModificar.addActionListener(clickEvent);
        jButtonModificar.setEnabled(false);

        jButtonCrear.setBackground(UIManager.getDefaults().getColor("InternalFrame.inactiveTitleGradient"));
        jButtonCrear.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        jButtonCrear.setText(BikeShopParameters.BOTON_CREAR);
        jButtonCrear.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonCrear.setBorderPainted(false);
        jButtonCrear.setSize(new Dimension(75, 25));
        jButtonCrear.addActionListener(clickEvent);
        
        jButtonBuscar.setBackground(UIManager.getDefaults().getColor("InternalFrame.inactiveTitleGradient"));
        jButtonBuscar.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        jButtonBuscar.setText(BikeShopParameters.BOTON_BUSCAR);
        jButtonBuscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonBuscar.setBorderPainted(false);
        jButtonBuscar.setSize(new Dimension(75, 25));
        jButtonBuscar.addActionListener(clickEvent);

        buttonGroupSelection.add(jRadioButtonCliente);
        jRadioButtonCliente.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        jRadioButtonCliente.setText(BikeShopParameters.RBUTTON_CLIENTE);
        jRadioButtonCliente.setActionCommand(BikeShopParameters.RBUTTON_CLIENTE);
        jRadioButtonCliente.setSelected(true);

        buttonGroupSelection.add(jRadioButtonVehiculo);
        jRadioButtonVehiculo.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        jRadioButtonVehiculo.setText(BikeShopParameters.RBUTTON_VEHICULO);
        jRadioButtonVehiculo.setActionCommand(BikeShopParameters.RBUTTON_VEHICULO);

        buttonGroupSelection.add(jRadioButtonIntencion);
        jRadioButtonIntencion.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        jRadioButtonIntencion.setText(BikeShopParameters.RBUTTON_INTENCION);
        jRadioButtonIntencion.setActionCommand(BikeShopParameters.RBUTTON_INTENCION);

        jLabelTextoTipoConsulta.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        jLabelTextoTipoConsulta.setHorizontalAlignment(SwingConstants.CENTER);
        jLabelTextoTipoConsulta.setText(BikeShopParameters.MAIN_INSTR);

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
                        .addComponent(jButtonCrear, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonEliminar))
                    .addGroup(PanelControlesLayout.createSequentialGroup()
                        .addComponent(jButtonBuscar, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonModificar, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        PanelControlesLayout.setVerticalGroup(PanelControlesLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, PanelControlesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelControlesLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonModificar, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelControlesLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEliminar)
                    .addComponent(jButtonCrear, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
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

        jTableData.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableData.getSelectionModel().addListSelectionListener(mainListelectionEvent);
        jScrollPaneTable.setViewportView(jTableData);
        jLabelTableTitle.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        jLabelTableTitle.setHorizontalAlignment(SwingConstants.CENTER);
        jLabelTableTitle.setText(BikeShopParameters.RESULT_QUERY);

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
    
    private ClickEvent clickEvent;
    private MainListelectionEvent mainListelectionEvent;
    
    private String currentJTableModel;
    private int idVehiculo;
    private int idIntencion;
    private final boolean adminSession;
    

    public void EnableAdminButtons(boolean newStatus){
        if(isAdminSession() == true){
            this.jButtonModificar.setEnabled(newStatus);
            this.jButtonEliminar.setEnabled(newStatus);
        } else{
            this.jButtonModificar.setEnabled(false);
            this.jButtonEliminar.setEnabled(false);
        }
    }
    
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

    /**
     * @return the currentJTableModel
     */
    public String getCurrentJTableModel() {
        return currentJTableModel;
    }

    /**
     * @param currentJTableModel the currentJTableModel to set
     */
    public void setCurrentJTableModel(String currentJTableModel) {
        this.currentJTableModel = currentJTableModel;
    }

    /**
     * @return the idVehiculo
     */
    public int getIdVehiculo() {
        return idVehiculo;
    }

    /**
     * @param idVehiculo the idVehiculo to set
     */
    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    /**
     * @return the idIntencion
     */
    public int getIdIntencion() {
        return idIntencion;
    }

    /**
     * @param idIntencion the idIntencion to set
     */
    public void setIdIntencion(int idIntencion) {
        this.idIntencion = idIntencion;
    }

    /**
     * @return the adminSession
     */
    public boolean isAdminSession() {
        return adminSession;
    }
                 
}
