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

import view.MainWindow;
import view.TitleWindow;
import view.PasswordWindow;
import view.ClientSearchWindow;
import view.VehicleSearchWindow;
import view.IntentionSearchWindow;

import model.ModelCliente;
import model.ModelVehiculo;
import model.ModelIntencion;
import model.ModelBicicleta;
import model.ModelMotoElectrica;
import model.ModelProveedorMotor;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import utils.BikeShopParameters;


/**
 *
 * @author Dialvec
 */
public class ClickEvent implements ActionListener{
    
    private MainWindow mainWindow;
    private TitleWindow titleWindow;
    private PasswordWindow passwordWindow;
    private ClientSearchWindow clientSearchWindow;
    private VehicleSearchWindow vehicleSearchWindow;
    private IntentionSearchWindow intentionSearchWindow;
    
    //Constructors
    public ClickEvent(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
    }

    public ClickEvent(TitleWindow titlewindow) {
        this.titleWindow = titlewindow;
    }

    public ClickEvent(PasswordWindow passwordwindow) {
        this.passwordWindow = passwordwindow;
    }

    public ClickEvent(ClientSearchWindow clientSearchWindow) {
        this.clientSearchWindow = clientSearchWindow;
    }

    public ClickEvent(VehicleSearchWindow vehicleSearchWindow) {
        this.vehicleSearchWindow = vehicleSearchWindow;
    }

    public ClickEvent(IntentionSearchWindow intentionSearchWindow) {
        this.intentionSearchWindow = intentionSearchWindow;
    }

        

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        
        // Solicitar sesion como ventas
        if(actionEvent.getSource() == this.titleWindow.getJButtonIngresoVentas()){
            mainWindow = new MainWindow(false);    
        }
        // Solicitar sesión como administrador
        else if(actionEvent.getSource() == this.titleWindow.getJButtonIngresoAdmin() ){
            passwordWindow = new PasswordWindow();
        }
        // Intentar ingreso de contraseña
        else if(actionEvent.getSource() == this.passwordWindow.getjButtonPassOk() ){
            String passwordInput = String.valueOf(this.passwordWindow.getjPasswordField().getPassword());
            String truePassword = getPassword();
            // Iniciar sesión como administrador
            if(passwordInput.equals(truePassword)){
                mainWindow = new MainWindow(true);
            }
            // Contraseña incorrecta
            else{
                String message = "La contrseña ingresada no es correcta";
                JOptionPane.showMessageDialog(new JFrame(), message, "Contraseña Incorrecta", JOptionPane.ERROR_MESSAGE);
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
            ex.printStackTrace();
        }
        
        return pswrd;
    }
    
}
