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

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import utils.utils;

import view.MainWindow;
import view.TitleWindow;
import view.PasswordWindow;
import view.ClientModifyWindow;
import view.ClientSearchWindow;
import view.VehicleSearchWindow;
import view.IntentionSearchWindow;

import model.ModelCliente;
import model.ModelVehiculo;
import model.ModelIntencion;
import model.ModelBicicleta;
import model.ModelMotoElectrica;
import model.ModelProveedorMotor;
import utils.BikeShopParameters;


/**
 *
 * @author Dialvec
 */
public class ClickEvent implements ActionListener{
    
    private final int mode; //Helps dealing with NullPointerException due to constructor
    private MainWindow mainWindow; //mode 1
    private TitleWindow titleWindow; //mode 2
    private PasswordWindow passwordWindow; //mode 3
    private ClientSearchWindow clientSearchWindow; //mode 4
    private VehicleSearchWindow vehicleSearchWindow; //mode 5
    private IntentionSearchWindow intentionSearchWindow; //mode 6
    private ClientModifyWindow clientModifyWindow; //mode 7
    
    
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

    public ClickEvent(ClientSearchWindow clientSearchWindow) {
        this.clientSearchWindow = clientSearchWindow;
        this.mode = 4;
    }

    public ClickEvent(VehicleSearchWindow vehicleSearchWindow) {
        this.vehicleSearchWindow = vehicleSearchWindow;
        this.mode = 5;
    }

    public ClickEvent(IntentionSearchWindow intentionSearchWindow) {
        this.intentionSearchWindow = intentionSearchWindow;
        this.mode = 6;
    }
    
    public ClickEvent(ClientModifyWindow clientModifyWindow) {
        this.clientModifyWindow = clientModifyWindow;
        this.mode = 7;
    }

        

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        
        switch(getMode()){
            
            case 1: processMainWindowActionEvents(actionEvent); break;
            case 2: processTitleWindowActionEvents(actionEvent); break;
            case 3: processPasswordWindowActionEvents(actionEvent); break;
            case 4: processClientSearchWindowActionEvents(actionEvent); break;
            case 5: processVehicleSearchWindowActionEvents(actionEvent); break;
            case 6: processIntentionSearchWindowActionEvents(actionEvent); break;
            case 7: processClientModifyWindowActionEvents(actionEvent); break;
        }
        
    }
    
    
    private void processMainWindowActionEvents(ActionEvent actionEvent){
        
    }
    
    
    private void processTitleWindowActionEvents(ActionEvent actionEvent){
        // Solicitar sesion como ventas
        if(actionEvent.getSource() == getTitleWindow().getJButtonIngresoVentas()){
            mainWindow = new MainWindow(false);    
        } // Solicitar sesion como ventas
        
        // Solicitar sesión como administrador
        else if(actionEvent.getSource() == getTitleWindow().getJButtonIngresoAdmin() ){
            passwordWindow = new PasswordWindow();
        } // Solicitar sesión como administrador
    }
    
    
    private void processPasswordWindowActionEvents(ActionEvent actionEvent){
        if(actionEvent.getSource() == getPasswordWindow().getjButtonPasswordOk() ){
            String passwordInput = String.valueOf(getPasswordWindow().getjPasswordFieldAdmin().getPassword());
            String truePassword = getPassword();
            
            // Contraseña correcta. Iniciar sesión como administrador
            if(passwordInput.equals(truePassword)){
                mainWindow = new MainWindow(true);
            } // Contraseña correcta. Iniciar sesión como administrador
            
            else{ // Contraseña incorrecta
                String message = "La contrseña ingresada no es correcta";
                JOptionPane.showMessageDialog(new JFrame(), message, "Contraseña Incorrecta", JOptionPane.INFORMATION_MESSAGE);
            }// Contraseña incorrecta
            
        }// Intentar ingreso de contraseña
    }
    
    
    private void processClientSearchWindowActionEvents(ActionEvent actionEvent){
        if(actionEvent.getSource() == getClientSearchWindow().getjButtonSearchClient() ){
            String alias = (String) getClientSearchWindow().getjTextFieldBCAlias().getText();
            String nombre = (String) getClientSearchWindow().getjTextFieldBCNombre().getText();
            String apellido = (String) getClientSearchWindow().getjTextFieldBCApellido().getText();
            String email = (String) getClientSearchWindow().getjTextFieldBCEmail().getText();
            String celular = (String) getClientSearchWindow().getjTextFieldBCCelular().getText();
            String dob = (String) getClientSearchWindow().getjTextFieldBCDob().getText();
            
            alias = utils.filterJTextField(alias, "alias");
            nombre = utils.filterJTextField(nombre, "nombre");
            apellido = utils.filterJTextField(apellido, "apellido");
            email = utils.filterJTextField(email, "e-mail");
            celular = utils.filterJTextField(celular, "celular");
            dob = utils.filterJTextField(dob, "fecha de nacimiento");
            
            //DAO de Cliente
        }
    }
    
    
    private void processVehicleSearchWindowActionEvents(ActionEvent actionEvent){
        
        String fabricante = null;
        String precio = null;
        
        if(actionEvent.getSource() == getVehicleSearchWindow().getjButtonSearchBicycle()){
            fabricante = (String) getVehicleSearchWindow().getjTextFieldBVFabricante().getText();
            precio = (String) getVehicleSearchWindow().getjTextFieldBVPrecio().getText();
            String anio_fab = (String) getVehicleSearchWindow().getjTextFieldBVBanio().getText();
            
            fabricante = utils.filterJTextField(fabricante, "fabricante");
            precio = utils.filterJTextField(precio, "precio");
            anio_fab = utils.filterJTextField(anio_fab, "año de fabricación");
            
            //DAO Bicicletas
        }
        else if(actionEvent.getSource() == getVehicleSearchWindow().getjButtonSearchMotorcycle() ){
            fabricante = (String) getVehicleSearchWindow().getjTextFieldBVFabricante().getText();
            precio = (String) getVehicleSearchWindow().getjTextFieldBVPrecio().getText();
            String prov_mot = (String) getVehicleSearchWindow().getjTextFieldBVMProveedor().getText();
            String autonomia = (String) getVehicleSearchWindow().getjTextFieldBVMAutonomia().getText();
            
            fabricante = utils.filterJTextField(fabricante, "fabricante");
            precio = utils.filterJTextField(precio, "precio");
            prov_mot = utils.filterJTextField(prov_mot, "proveedor del motor");
            autonomia = utils.filterJTextField(autonomia, "horas autonomía");
            
            //DAO Motos Eléctricas
        }
    }
    
    
    private void processIntentionSearchWindowActionEvents(ActionEvent actionEvent){
        
        if(actionEvent.getSource() == getIntentionSearchWindow().getjButtonSearchClient() ){
            String alias = (String) getIntentionSearchWindow().getjTextFieldBIAlias().getText();
            String nombre = (String) getIntentionSearchWindow().getjTextFieldBINombre().getText();
            String apellido = (String) getIntentionSearchWindow().getjTextFieldBIApellido().getText();
            String fabricante = (String) getIntentionSearchWindow().getjTextFieldBIFabricante().getText();
            
            alias = utils.filterJTextField(alias, "alias cliente");
            nombre = utils.filterJTextField(nombre, "nombre cliente");
            apellido = utils.filterJTextField(apellido, "apellido cliente");
            fabricante = utils.filterJTextField(fabricante, "fabricante vehículo");
        }

    }
    
    
    private void processClientModifyWindowActionEvents(ActionEvent actionEvent){
    
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
     * @return the clientSearchWindow
     */
    public ClientSearchWindow getClientSearchWindow() {
        return this.clientSearchWindow;
    }

    /**
     * @return the vehicleSearchWindow
     */
    public VehicleSearchWindow getVehicleSearchWindow() {
        return vehicleSearchWindow;
    }

    /**
     * @return the intentionSearchWindow
     */
    public IntentionSearchWindow getIntentionSearchWindow() {
        return intentionSearchWindow;
    }

    /**
     * @return the clientModifyWindow
     */
    public ClientModifyWindow getClientModifyWindow() {
        return clientModifyWindow;
    }
    
    
    
}
