/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.FileReader;
import javax.swing.JFrame;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import utils.utils;

import view.MainWindow;     // mode 1
import view.TitleWindow;    // mode 2
import view.PasswordWindow; // mode 3
import view.ClientWindow;   // mode 4
import view.VehicleWindow;  // mode 5
import view.IntentionWindow;// mode 6

import utils.BikeShopParameters;

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
                processMainWindowActionEvents(actionEvent); 
            break;

            case 2: 
                try {
                    processTitleWindowActionEvents(actionEvent);
                } catch (SQLException ex) {
                    Logger.getLogger(ClickEvent.class.getName()).log(Level.SEVERE, null, ex);
                }
            break;

            case 3: 
                try {
                    processPasswordWindowActionEvents(actionEvent);
                } catch (SQLException ex) {
                    Logger.getLogger(ClickEvent.class.getName()).log(Level.SEVERE, null, ex);
                }
            break;

            case 4: 
                processClientWindowActionEvents(actionEvent); 
            break;
            
            case 5: 
                processVehicleWindowActionEvents(actionEvent); 
            break;
            case 6: 
                processIntentionWindowActionEvents(actionEvent); 
            break;
        }
        
    }
    
    // mode 1
    private void processMainWindowActionEvents(ActionEvent actionEvent){
        String mode = null;
        String rButtonSelection = null;
        System.out.println();
        //CREATE_MODE
        if(actionEvent.getSource() == getMainWindow().getjButtonCrear() ){
            mode = BikeShopParameters.CREATE_MODE;
            rButtonSelection = this.getMainWindow().getButtonGroupSelection().getSelection().getActionCommand();

            switch (rButtonSelection){
                case BikeShopParameters.RBUTTON_CLIENTE:
                    clientWindow = new ClientWindow(mode);
                    break;

                case BikeShopParameters.RBUTTON_VEHICULO:
                    vehicleWindow = new VehicleWindow( this.getMainWindow().getCurrentJTableModel() , this.getMainWindow().getIdVehiculo(), mode);
                    break;

                case BikeShopParameters.RBUTTON_INTENCION:
                    intentionWindow = new IntentionWindow(mode, this.getMainWindow().getIdIntencion());
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
            mode = BikeShopParameters.SEARCH_MODE;
            rButtonSelection =this.getMainWindow().getButtonGroupSelection().getSelection().getActionCommand();

            switch (rButtonSelection){
                case BikeShopParameters.RBUTTON_CLIENTE:
                    clientWindow = new ClientWindow(mode);
                    break;

                case BikeShopParameters.RBUTTON_VEHICULO:
                    vehicleWindow = new VehicleWindow( this.getMainWindow().getCurrentJTableModel() , this.getMainWindow().getIdVehiculo(), mode);
                    break;

                case BikeShopParameters.RBUTTON_INTENCION:
                    intentionWindow = new IntentionWindow(mode, this.getMainWindow().getIdIntencion());
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
            mode = BikeShopParameters.DELETE_MODE;

            //DAO Delete Mode

        }// DELETE_MODE
        // EDIT_MODE
        else if(actionEvent.getSource() == getMainWindow().getjButtonModificar() ){
            mode = BikeShopParameters.EDIT_MODE;
            String currentJTableModel = this.getMainWindow().getCurrentJTableModel();

            switch (currentJTableModel){
                case BikeShopParameters.MODEL_CLIENTE:
                    clientWindow = new ClientWindow(mode);
                    break;

                case BikeShopParameters.MODEL_BICICLETA:
                    vehicleWindow = new VehicleWindow( currentJTableModel , getMainWindow().getIdVehiculo(), mode);
                    break;

                case BikeShopParameters.MODEL_MOTO:
                    vehicleWindow = new VehicleWindow( currentJTableModel , getMainWindow().getIdVehiculo(), mode);
                    break;

                case BikeShopParameters.MODEL_INTENCION:
                    intentionWindow = new IntentionWindow(mode, getMainWindow().getIdIntencion());
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
    private void processClientWindowActionEvents(ActionEvent actionEvent){
        if(actionEvent.getSource() == getClientWindow().getjButtonAction() ){
            String alias = (String) getClientWindow().getjTextFieldBCAlias().getText();
            String nombre = (String) getClientWindow().getjTextFieldBCNombre().getText();
            String apellido = (String) getClientWindow().getjTextFieldBCApellido().getText();
            String email = (String) getClientWindow().getjTextFieldBCEmail().getText();
            String contrasena = (String) Arrays.toString(getClientWindow().getjPasswordFieldContrasena().getPassword());
            String celular = (String) getClientWindow().getjTextFieldBCCelular().getText();
            String dob = (String) getClientWindow().getjTextFieldBCDob().getText();
            
            //DAO Modificar Cliente
        }
    } // mode 4
    
    
    // mode 5
    private void processVehicleWindowActionEvents(ActionEvent actionEvent){
        int idVehiculo;
        int precio;
        int anio;
        int autonomia;
        String fabricante = null;
        String proveedor = null;
        String tipoVehiculo = null;
        
        if(actionEvent.getSource() == getVehicleWindow().getjButtonActionBicycle() ){
            idVehiculo = getVehicleWindow().getIdVehiculo();
            fabricante = (String) getVehicleWindow().getjTextFieldBVFabricante().getText();
            precio = Integer.parseInt(getVehicleWindow().getjTextFieldBVPrecio().getText());
            
            tipoVehiculo = getVehicleWindow().getTipoVehiculo();
            if(tipoVehiculo.equals(BikeShopParameters.BICICLETAS)){
                anio = Integer.parseInt(getVehicleWindow().getjTextFieldBVBanio().getText());
                
                //DAO Modificar Bicicleta
            }
            else if(tipoVehiculo.equals(BikeShopParameters.MOTOS)){
                proveedor = (String) getVehicleWindow().getjTextFieldBVMProveedor().getText();
                autonomia = Integer.parseInt(getVehicleWindow().getjTextFieldBVMAutonomia().getText());
                
                //DAO Modificar Moto
            }
        }
    } // mode 5
    
    
    // mode 6
    private void processIntentionWindowActionEvents(ActionEvent actionEvent){
        
        if(actionEvent.getSource() == getIntentionWindow().getjButtonAction() ){
            String alias = (String) getIntentionWindow().getjTextFieldAlias().getText();
            String nombre = (String) getIntentionWindow().getjTextFieldNombre().getText();
            String apellido = (String) getIntentionWindow().getjTextFieldApellido().getText();
            String fabricante = (String) getIntentionWindow().getjTextFieldFabricante().getText();
            
            alias = utils.filterJTextField(alias, BikeShopParameters.ALIAS_CLIENTE);
            nombre = utils.filterJTextField(nombre, BikeShopParameters.NOMBRE_CLIENTE);
            apellido = utils.filterJTextField(apellido, BikeShopParameters.APELLIDO_CLIENTE);
            fabricante = utils.filterJTextField(fabricante, BikeShopParameters.FABRICANTE);
        }
        
        //DAO Buscar Intención

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
            ex.printStackTrace();
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
