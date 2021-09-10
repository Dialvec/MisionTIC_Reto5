/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.FileReader;
import javax.swing.JFrame;
import javax.swing.JTable;
import java.io.IOException;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.sql.SQLException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import utils.utils;
import utils.BikeShopParameters;

import view.MainWindow;     // mode 1
import view.TitleWindow;    // mode 2
import view.PasswordWindow; // mode 3
import view.ClientWindow;   // mode 4
import view.VehicleWindow;  // mode 5
import view.IntentionWindow;// mode 6

import access.*;
import model.ModelBicicleta;
import model.ModelCliente;
import model.ModelIntencion;
import model.ModelMotoElectrica;

/**
 *
 * @author Dialvec
 */
public class ClickEvent implements ActionListener{
    
    private final int mode; //Helps dealing with NullPointerException due to constructor
    
    private MainWindow mainWindow;          // mode 1
    private TitleWindow titleWindow;        // mode 2
    private PasswordWindow passwordWindow;  // mode 3
    private ClientWindow clientWindow;      // mode 4
    private VehicleWindow vehicleWindow;    // mode 5
    private IntentionWindow intentionWindow;// mode 6
    
    
    //Constructors
    public ClickEvent(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
        this.mode = 1;
    }

    public ClickEvent(TitleWindow titlewindow) {
        this.titleWindow = titlewindow;
        this.mode = 2;
    }

    public ClickEvent(PasswordWindow passwordwindow) {
        this.passwordWindow = passwordwindow;
        this.mode = 3;
    }
    
    
    public ClickEvent(ClientWindow clientWindow) {
        this.clientWindow = clientWindow;
        this.mode = 4;
    }
    
    public ClickEvent(VehicleWindow vehicleWindow) {
        this.vehicleWindow = vehicleWindow;
        this.mode = 5;
    }

    public ClickEvent(IntentionWindow intentionWindow) {
        this.intentionWindow = intentionWindow;
        this.mode = 6;
    }
     

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        
        switch(getMode()){
            
            case 1:
                try {
                    processMainWindowActionEvents(actionEvent);
                } catch (SQLException ex) {
                    ex.printStackTrace();
                } 
            break;


            case 2: 
                try {
                    processTitleWindowActionEvents(actionEvent);
                } catch (SQLException ex) {
                    ex.printStackTrace();
                } 
            break;

            case 3: 
                try {
                    processPasswordWindowActionEvents(actionEvent);
                } catch (SQLException ex) {
                    ex.printStackTrace();
                } 
            break;

            
            case 4: 
                try {
                    processClientWindowActionEvents(actionEvent);
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            break;

            
            case 5: 
                try {
                    processVehicleWindowActionEvents(actionEvent);
                } catch (SQLException ex) {
                    ex.printStackTrace();
                } 
            break;

            case 6:
            {
                processIntentionWindowActionEvents(actionEvent);
            }
            break;

        }
    }
    
    // mode 1
    private void processMainWindowActionEvents(ActionEvent actionEvent) throws SQLException{
        String mainWindowMode;
        String rButtonSelection;
        String currentJTableModel;
        String alias;
        String idVehiculo;
        String idIntencion;
        JTable jTableData;
        int selectedRowIndex;
        
        ClienteDAO clienteDAO = new ClienteDAO();
        VehiculoDAO vehiculoDAO = new VehiculoDAO();
        BicicletaDAO bicicletaDAO = new BicicletaDAO();
        MotoElectricaDAO motoElectricaDAO = new MotoElectricaDAO();
        IntencionDAO intencionDAO = new IntencionDAO();
        
        //When Radio Button click, show all items from category
        if( actionEvent.getSource() == this.getMainWindow().getjRadioButtonCliente() ){
            this.getMainWindow().setJtableClients(clienteDAO.getAllClientes());
        }
        else if( actionEvent.getSource() == this.getMainWindow().getjRadioButtonIntencion() ){
            this.getMainWindow().setJtableIntention(intencionDAO.getAllintencion());
        }
        
        //CREATE_MODE
        else if(actionEvent.getSource() == this.getMainWindow().getjButtonCrear() ){
            mainWindowMode = BikeShopParameters.CREATE_MODE;
            rButtonSelection = this.getMainWindow().getButtonGroupSelection().getSelection().getActionCommand();

            switch (rButtonSelection){
                case BikeShopParameters.RBUTTON_CLIENTE:
                    clientWindow = new ClientWindow(mainWindowMode, this.getMainWindow());
                    break;

                case BikeShopParameters.RBUTTON_VEHICULO:
                    vehicleWindow = new VehicleWindow( this.getMainWindow().getCurrentJTableModel(), mainWindowMode, this.getMainWindow());
                    break;

                case BikeShopParameters.RBUTTON_INTENCION:
                    intentionWindow = new IntentionWindow(mainWindowMode, this.getMainWindow());
                    break;

                default:
                    JOptionPane.showMessageDialog(null, 
                            "No se encuentra selección de ButtonGroup", 
                            "Debug", 
                            JOptionPane.INFORMATION_MESSAGE);
                    break;
            }
        } // CREATE_MODE
        //SEARCH_MODE
        else if(actionEvent.getSource() == getMainWindow().getjButtonBuscar() ){
            mainWindowMode = BikeShopParameters.SEARCH_MODE;
            rButtonSelection = this.getMainWindow().getButtonGroupSelection().getSelection().getActionCommand();

            switch (rButtonSelection){
                case BikeShopParameters.RBUTTON_CLIENTE:
                    clientWindow = new ClientWindow(mainWindowMode, this.getMainWindow());
                    break;

                case BikeShopParameters.RBUTTON_VEHICULO:
                    vehicleWindow = new VehicleWindow( this.getMainWindow().getCurrentJTableModel() , mainWindowMode, this.getMainWindow());
                    break;

                case BikeShopParameters.RBUTTON_INTENCION:
                    intentionWindow = new IntentionWindow(mainWindowMode, this.getMainWindow());
                    break;

                default:
                    JOptionPane.showMessageDialog(null, 
                            "No se encuentra selección de ButtonGroup", 
                            "Debug", 
                            JOptionPane.INFORMATION_MESSAGE);
                    break;
            }
        } // SEARCH_MODE
        // DELETE_MODE
        else if(actionEvent.getSource() == getMainWindow().getjButtonEliminar() ){
            mainWindowMode = BikeShopParameters.DELETE_MODE;
            
            currentJTableModel = this.getMainWindow().getCurrentJTableModel();
            selectedRowIndex = getMainWindow().getjTableData().getSelectedRow();
            
            switch (currentJTableModel){
                    
                case BikeShopParameters.MODEL_CLIENTE:
                    jTableData = getMainWindow().getjTableData();
                    
                    alias = jTableData.getValueAt(selectedRowIndex, 0).toString();
                    clienteDAO.deleteClienteByAlias(alias);
                    System.out.println("Ejecuta delete Cliente");
                    getMainWindow().setJtableClients(clienteDAO.getAllClientes());
                    
                    break;


                case BikeShopParameters.MODEL_BICICLETA:
                    jTableData = getMainWindow().getjTableData();
                    
                    idVehiculo = jTableData.getValueAt(selectedRowIndex, 0).toString();
                    bicicletaDAO.deleteBicicletaById( Integer.parseInt(idVehiculo) );
                    this.getMainWindow().setJtableBicycles(bicicletaDAO.getAllbicicletas());
                    break;

                case BikeShopParameters.MODEL_MOTO:
                    jTableData = getMainWindow().getjTableData();
                    
                    idVehiculo = jTableData.getValueAt(selectedRowIndex, 0).toString();
                    motoElectricaDAO.deleteMotoById( Integer.parseInt(idVehiculo) );
                    
                    this.getMainWindow().setJtableMotorcycles(motoElectricaDAO.getAllMotos());
                    break;

                case BikeShopParameters.MODEL_INTENCION:
                    jTableData = getMainWindow().getjTableData();
                    
                    idIntencion = jTableData.getValueAt(selectedRowIndex, 0).toString();
                    intencionDAO.deleteIntencionById( Integer.parseInt(idIntencion) );
                    
                    this.getMainWindow().setJtableIntention(intencionDAO.getAllintencion());
                    break;
                
                default:
                    JOptionPane.showMessageDialog(null, 
                            "Delete Mode No tiene Model Asignado", 
                            "Debug", 
                            JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }// DELETE_MODE
        
        // EDIT_MODE
        else if(actionEvent.getSource() == getMainWindow().getjButtonModificar() ){
            mainWindowMode = BikeShopParameters.EDIT_MODE;
            currentJTableModel = this.getMainWindow().getCurrentJTableModel();

            switch (currentJTableModel){
                case BikeShopParameters.MODEL_CLIENTE:
                    clientWindow = new ClientWindow(mainWindowMode, this.getMainWindow());
                    break;

                case BikeShopParameters.MODEL_BICICLETA:
                    vehicleWindow = new VehicleWindow( currentJTableModel , mainWindowMode, this.getMainWindow());
                    break;

                case BikeShopParameters.MODEL_MOTO:
                    vehicleWindow = new VehicleWindow( currentJTableModel, mainWindowMode, this.getMainWindow());
                    break;

                case BikeShopParameters.MODEL_INTENCION:
                    intentionWindow = new IntentionWindow(mainWindowMode, this.getMainWindow());
                    break;
                
                default:
                    JOptionPane.showMessageDialog(null, 
                            "MainWindow No tiene Model Asignado", 
                            "Debug", 
                            JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }// EDIT_MODE
        // NO MODE
        else {
        JOptionPane.showMessageDialog(null, 
                            "No existen datos Cargados para modificar", 
                            "Debug", 
                            JOptionPane.ERROR_MESSAGE);
        }// NO MODE
    } // mode 1
    
    
    // mode 2 
    private void processTitleWindowActionEvents(ActionEvent actionEvent) throws SQLException{
        // Solicitar sesion como ventas
        if(actionEvent.getSource() == getTitleWindow().getJButtonIngresoVentas()){
            mainWindow = new MainWindow(false);    
        } // Solicitar sesion como ventas
        
        // Solicitar sesión como administrador
        else if(actionEvent.getSource() == getTitleWindow().getJButtonIngresoAdmin() ){
            passwordWindow = new PasswordWindow();
        } // Solicitar sesión como administrador
    } // mode 2
    
    
    // mode 3
    private void processPasswordWindowActionEvents(ActionEvent actionEvent) throws SQLException{
        if(actionEvent.getSource() == getPasswordWindow().getjButtonPasswordOk() ){
            String passwordInput = String.valueOf(getPasswordWindow().getjPasswordFieldAdmin().getPassword());
            String truePassword = getPassword();
            
            // Contraseña correcta. Iniciar sesión como administrador
            if(passwordInput.equals(truePassword)){
                mainWindow = new MainWindow(true);
            } // Contraseña correcta. Iniciar sesión como administrador
            
            else{ // Contraseña incorrecta
                JOptionPane.showMessageDialog(new JFrame(), BikeShopParameters.WRONG_PASS_MSG, BikeShopParameters.WRONG_PASS_TITLE, JOptionPane.INFORMATION_MESSAGE);
            }// Contraseña incorrecta
            
        }// Intentar ingreso de contraseña
    } // mode 3
    
    
    // mode 4
    private void processClientWindowActionEvents(ActionEvent actionEvent) throws SQLException{

        String clientWindowMode;
        
        String alias;
        String nombre;
        String apellido;
        String email;
        int contrasena;
        String celular;
        String dob;
        
        ClienteDAO clienteDAO = new ClienteDAO();
        ModelCliente cliente;
        
        if(actionEvent.getSource() == this.getClientWindow().getjButtonAction() ){
            
            clientWindowMode = this.getClientWindow().getMode();
            
            
            try{
                alias = (String) getClientWindow().getjTextFieldBCAlias().getText();
            } catch (NullPointerException ex){
                alias = null;
            }
            
            try{
                nombre = (String) getClientWindow().getjTextFieldBCNombre().getText();
            } catch (NullPointerException ex){
                nombre = null;
            }
            
            try{
                apellido = (String) getClientWindow().getjTextFieldBCApellido().getText();
            } catch (NullPointerException ex){
                apellido = null;
            }
            
            try{
                email = (String) getClientWindow().getjTextFieldBCEmail().getText();
            } catch (NullPointerException ex){
                email = null;
            }
            
            try{
                String contrasenaStr = String.valueOf(getClientWindow().getjPasswordFieldContrasena().getPassword());
                
                contrasena =  (contrasenaStr.isBlank()) ? 0 : Integer.parseInt(contrasenaStr);
            } catch (NullPointerException ex){
                contrasena = 0;
            }
            
            try{
                celular = (String) getClientWindow().getjTextFieldBCCelular().getText();
            } catch (NullPointerException ex){
                celular = null;
            }
            
            try{
                dob = (String) getClientWindow().getjTextFieldBCDob().getText();
            } catch (NullPointerException ex){
                dob = null;
            }
            
            switch (clientWindowMode){
                case BikeShopParameters.CREATE_MODE:
                    
                    if ( alias.isBlank() ){
                        JOptionPane.showMessageDialog(new JFrame(), 
                                BikeShopParameters.ALIAS_VACIO, 
                                BikeShopParameters.TITULO_CAMPO_VACIO, 
                                JOptionPane.INFORMATION_MESSAGE
                        );
                    } else if ( nombre.isBlank() ){
                        JOptionPane.showMessageDialog(new JFrame(), 
                                BikeShopParameters.NOMBRE_VACIO, 
                                BikeShopParameters.TITULO_CAMPO_VACIO, 
                                JOptionPane.INFORMATION_MESSAGE
                        );
                    } else if ( apellido.isBlank() ){
                        JOptionPane.showMessageDialog(new JFrame(), 
                                BikeShopParameters.APELLIDO_VACIO, 
                                BikeShopParameters.TITULO_CAMPO_VACIO, 
                                JOptionPane.INFORMATION_MESSAGE
                        );
                    } else {
                        cliente = new ModelCliente(alias, nombre, apellido, email, contrasena, celular, dob);
                        
                        clienteDAO.createCliente( cliente );
                        
                        this.getClientWindow().getMainWindowParent().setJtableClients(clienteDAO.getAllClientes());
                    }
                    
                break;
                    
                case BikeShopParameters.EDIT_MODE:
                    
                    cliente = new ModelCliente(alias, nombre, apellido, email, contrasena, celular, dob);
                    
                    clienteDAO.updateCliente( cliente );
                        
                    this.getClientWindow().getMainWindowParent().setJtableClients(clienteDAO.getAllClientes());
                    
                break;
                    
                case BikeShopParameters.SEARCH_MODE:
                    alias = utils.JTextFieldToSearchQuery(alias);
                    nombre = utils.JTextFieldToSearchQuery(nombre);
                    apellido = utils.JTextFieldToSearchQuery(apellido);
                    email = utils.JTextFieldToSearchQuery(email);
                    celular = utils.JTextFieldToSearchQuery(celular);
                    dob = utils.JTextFieldToSearchQuery(dob);
                    
                    cliente = new ModelCliente(alias, nombre, apellido, email, contrasena, celular, dob);
                    if(clienteDAO.searchCliente(cliente).isEmpty())
                        this.getClientWindow().getMainWindowParent().setJtableClients(clienteDAO.getAllClientes());
                    else
                        this.getClientWindow().getMainWindowParent().setJtableClients(clienteDAO.searchCliente(cliente));
                break;
                    
                default:
                    JOptionPane.showMessageDialog(null, 
                            "ClientWindow no tiene modo asignado", 
                            "Debug", 
                            JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
    } // mode 4
    
    
    // mode 5
    private void processVehicleWindowActionEvents(ActionEvent actionEvent) throws SQLException{
        
        String vehicleWindowMode;
        
        int idVehiculo;
        int precio;
        int anio;
        int autonomia;
        String fabricante = null;
        String proveedor = null;
        
        BicicletaDAO bicicletaDAO = new BicicletaDAO();
        ModelBicicleta bicicleta;
        MotoElectricaDAO motoElectricaDAO = new MotoElectricaDAO();
        ModelMotoElectrica moto;
        
        
        if(actionEvent.getSource() == getVehicleWindow().getjButtonActionBicycle() ){
            
            idVehiculo = 0;
            
            try{
                fabricante = (String) getVehicleWindow().getjTextFieldBVFabricante().getText();
            } catch (NullPointerException ex){
                fabricante = null;
            }
            
            try{
                String precioStr = getVehicleWindow().getjTextFieldBVPrecio().getText();
                
                precio = (precioStr.trim().isBlank())?0:Integer.parseInt(precioStr);
                
            } catch (NullPointerException ex){
                precio = 0;
            }
            
            try{
                String anioStr = getVehicleWindow().getjTextFieldBVBanio().getText();
                
                anio = (anioStr.trim().isBlank())? 0:Integer.parseInt(anioStr);
               
            } catch (NullPointerException ex){
                anio = 0;
            }
            
            vehicleWindowMode = this.getVehicleWindow().getMode();
            
            switch(vehicleWindowMode){
                        
                case BikeShopParameters.CREATE_MODE:
                    if ( fabricante.isBlank() ){
                        JOptionPane.showMessageDialog(new JFrame(), 
                                BikeShopParameters.FABRICANTE_VACIO, 
                                BikeShopParameters.TITULO_CAMPO_VACIO, 
                                JOptionPane.INFORMATION_MESSAGE
                        );
                    } else{
                        bicicletaDAO.createBicicleta( new ModelBicicleta(idVehiculo, fabricante, precio, anio) );
                        this.getVehicleWindow().getMainWindowParent().setJtableBicycles(bicicletaDAO.getAllbicicletas());
                    }
                    
                break;

                case BikeShopParameters.SEARCH_MODE:
                    fabricante = utils.JTextFieldToSearchQuery(fabricante);

                    bicicleta = new ModelBicicleta(idVehiculo, fabricante, precio, anio);
                    
                    if (bicicletaDAO.searchBicicletas(bicicleta).isEmpty())
                        this.getVehicleWindow().getMainWindowParent().setJtableBicycles(bicicletaDAO.getAllbicicletas());
                    else
                        this.getVehicleWindow().getMainWindowParent().setJtableBicycles(bicicletaDAO.searchBicicletas(bicicleta));
                break;

                case BikeShopParameters.EDIT_MODE:
                    
                    idVehiculo = this.getVehicleWindow().getMainWindowParent().getIntSelectedRowItem(0);

                    bicicleta = new ModelBicicleta(idVehiculo, fabricante, precio, anio);

                    bicicletaDAO.updateBicicletas(bicicleta);

                    this.getVehicleWindow().getMainWindowParent().setJtableBicycles(bicicletaDAO.getAllbicicletas());
                break;

                default:
                    JOptionPane.showMessageDialog(null, 
                            "VehicleWindow de Bicicleta no tiene modo asignado", 
                            BikeShopParameters.DEBUG, 
                            JOptionPane.ERROR_MESSAGE);
                break;
            }  
        }
        else if(actionEvent.getSource() == getVehicleWindow().getjButtonActionMotorycle() ){
            
            idVehiculo = 0;
            
            try{
                fabricante = (String) getVehicleWindow().getjTextFieldBVFabricante().getText();
            } catch (NullPointerException ex){
                fabricante = null;
            }
            
            try{
                String precioStr = getVehicleWindow().getjTextFieldBVPrecio().getText().trim();
                
                precio = (precioStr.isBlank())? 0:Integer.parseInt(precioStr);
                
            } catch (NullPointerException ex){
                precio = 0;
            }
            
            try{
                String autonomiaStr = getVehicleWindow().getjTextFieldBVMAutonomia().getText().trim();
                        
                autonomia = (autonomiaStr.isBlank())? 0:Integer.parseInt(autonomiaStr);
            } catch (NullPointerException ex){
                autonomia = 0;
            }
            
            try{
                proveedor = (String) getVehicleWindow().getjTextFieldBVMProveedor().getText();
            } catch (NullPointerException ex){
                proveedor = null;
            }
            
            vehicleWindowMode = this.getVehicleWindow().getMode();
            
            
            switch(vehicleWindowMode){
                        
                case BikeShopParameters.CREATE_MODE:
                    
                    if ( fabricante.isBlank() ){
                        JOptionPane.showMessageDialog(new JFrame(), 
                                BikeShopParameters.FABRICANTE_VACIO, 
                                BikeShopParameters.TITULO_CAMPO_VACIO, 
                                JOptionPane.INFORMATION_MESSAGE
                        );
                    } else if ( proveedor.isBlank() ){
                        JOptionPane.showMessageDialog(new JFrame(), 
                                BikeShopParameters.PROVEEDOR_VACIO, 
                                BikeShopParameters.TITULO_CAMPO_VACIO, 
                                JOptionPane.INFORMATION_MESSAGE
                        );
                    } else{
                        moto = new ModelMotoElectrica(idVehiculo, fabricante, precio, proveedor, autonomia);
                    
                        motoElectricaDAO.createMoto( moto );
                    
                        this.getVehicleWindow().getMainWindowParent().setJtableMotorcycles(motoElectricaDAO.getAllMotos());
                    }
                    
                break;

                case BikeShopParameters.SEARCH_MODE:
                    fabricante = utils.JTextFieldToSearchQuery(fabricante);
                    proveedor = utils.JTextFieldToSearchQuery(proveedor);

                    moto = new ModelMotoElectrica(idVehiculo, fabricante, precio, proveedor, autonomia);
                    
                    if(motoElectricaDAO.searchMoto(moto).isEmpty()){
                        
                        this.getVehicleWindow().getMainWindowParent().setJtableMotorcycles(motoElectricaDAO.getAllMotos());
                    }else{
                        this.getVehicleWindow().getMainWindowParent().setJtableMotorcycles(motoElectricaDAO.searchMoto(moto));
                    }
                    
                    
                break;

                case BikeShopParameters.EDIT_MODE:
                    
                    idVehiculo = this.getMainWindow().getIntSelectedRowItem(0);
                    
                    moto = new ModelMotoElectrica(idVehiculo, fabricante, precio, proveedor, autonomia);
                        
                    motoElectricaDAO.updateMoto(moto);
                        
                    this.getVehicleWindow().getMainWindowParent().setJtableMotorcycles(motoElectricaDAO.getAllMotos());
                break;

                default:
                    JOptionPane.showMessageDialog(null, 
                            "VehicleWindow de Moto Elèctrica no tiene modo asignado", 
                            BikeShopParameters.DEBUG, 
                            JOptionPane.ERROR_MESSAGE);
                break;
            }
        }
    } // mode 5
    
    
    // mode 6
    private void processIntentionWindowActionEvents(ActionEvent actionEvent){
        
        String intentionWindowMode;
        ModelIntencion intencion;
        IntencionDAO intencionDAO = new IntencionDAO(); 
        
        int id_intencion;
        String alias_cliente_fk;
        String nombre;
        String apellido;
        String fabricante_fk;
        String fechahora;

        if(actionEvent.getSource() == getIntentionWindow().getjButtonAction() ){
            
            id_intencion = 0;
            
            try{
                alias_cliente_fk  = this.getIntentionWindow().getjTextFieldAlias().getText();
            }catch (NullPointerException ex){
                alias_cliente_fk = null;
            }
            
            try{
                nombre  = this.getIntentionWindow().getjTextFieldNombre().getText();
            }catch (NullPointerException ex){
                nombre = null;
            }
            
            try{
                apellido  = this.getIntentionWindow().getjTextFieldApellido().getText();
            }catch (NullPointerException ex){
                apellido = null;
            }
            
            try{
                fabricante_fk  = this.getIntentionWindow().getjTextFieldFabricante().getText();
            }catch (NullPointerException ex){
                fabricante_fk = null;
            }
            
            try{
                fechahora  = this.getIntentionWindow().getjTextFieldFechahora().getText();
            }catch (NullPointerException ex){
                fechahora = null;
            }
            
            intentionWindowMode = this.getIntentionWindow().getMode();
            
            switch (intentionWindowMode){
                case BikeShopParameters.CREATE_MODE:
                    
                    if(alias_cliente_fk.isBlank()){
                        JOptionPane.showMessageDialog(new JFrame(), 
                                BikeShopParameters.ALIAS_VACIO, 
                                BikeShopParameters.TITULO_CAMPO_VACIO, 
                                JOptionPane.INFORMATION_MESSAGE);
                    } else if(fabricante_fk.isBlank()){
                        JOptionPane.showMessageDialog(new JFrame(), 
                                BikeShopParameters.FABRICANTE_VACIO, 
                                BikeShopParameters.TITULO_CAMPO_VACIO, 
                                JOptionPane.INFORMATION_MESSAGE);
                    } else{
                        intencion = new ModelIntencion(id_intencion, alias_cliente_fk, fabricante_fk, fechahora);
                    
                        intencionDAO.createIntencion(intencion, nombre, apellido);

                        this.getIntentionWindow().getParentMainWindow().setJtableIntention(intencionDAO.getAllintencion());
                    }
                    
                    
                break;
                    
                case BikeShopParameters.SEARCH_MODE:
                    
                    alias_cliente_fk = utils.JTextFieldToSearchQuery(alias_cliente_fk);
                    fabricante_fk = utils.JTextFieldToSearchQuery(fabricante_fk);
                    fechahora = utils.JTextFieldToSearchQuery(fechahora);
                    
                    intencion = new ModelIntencion(id_intencion, alias_cliente_fk, fabricante_fk, fechahora);
                    
                    if(intencionDAO.searchIntencion(intencion).isEmpty()){
                        this.getIntentionWindow().getParentMainWindow().setJtableIntention(intencionDAO.getAllintencion());
                    } else{
                        this.getIntentionWindow().getParentMainWindow().setJtableIntention(intencionDAO.searchIntencion(intencion));
                    }
                                        
                    
                break;
                
                case BikeShopParameters.EDIT_MODE:
                    id_intencion = this.getIntentionWindow().getParentMainWindow().getIntSelectedRowItem(0);
                    
                    intencion = new ModelIntencion(id_intencion, alias_cliente_fk, fabricante_fk, fechahora);
                    
                    intencionDAO.updateIntenciones(intencion);
                    
                    this.getIntentionWindow().getParentMainWindow().setJtableIntention(intencionDAO.getAllintencion());
                break;
                    
                default:
                    JOptionPane.showMessageDialog(null, 
                            "IntentionWindow no tiene modo asignado", 
                            "Debug", 
                            JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
    }
    
    public static String getPassword() {
        JSONParser parser = new JSONParser();
        String pswrd = null;
        try {
            String credentials_path = System.getProperty("user.dir") + BikeShopParameters.PW_PATH;
            JSONObject jsonObject = (JSONObject)parser.parse(new FileReader(credentials_path));
            
            pswrd = (String)jsonObject.get("pswrd");
        } 
        catch (IOException | ParseException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), null, JOptionPane.INFORMATION_MESSAGE);
            
        }
        
        return pswrd;
    }
    
    /**
     * @return the mode
     */
    public int getMode() {
        return this.mode;
    }

    /**
     * @return the mainWindow
     */
    public MainWindow getMainWindow() {
        return this.mainWindow;
    }

    /**
     * @return the titleWindow
     */
    public TitleWindow getTitleWindow() {
        return this.titleWindow;
    }

    /**
     * @return the passwordWindow
     */
    public PasswordWindow getPasswordWindow() {
        return this.passwordWindow;
    }

    /**
     * @return the clientModifyWindow
     */
    public ClientWindow getClientWindow() {
        return this.clientWindow;
    }

    /**
     * @return the vehicleModifyWindow
     */
    public VehicleWindow getVehicleWindow() {
        return this.vehicleWindow;
    }
    
    /**
     * @return the intentionSearchWindow
     */
    public IntentionWindow getIntentionWindow() {
        return this.intentionWindow;
    }   
}