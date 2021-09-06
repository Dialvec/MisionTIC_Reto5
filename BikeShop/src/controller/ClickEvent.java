/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
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


/**
 *
 * @author Dialvec
 */
public class ClickEvent implements ActionListener{
    
    private MainWindow mainWindow;
    private TitleWindow titlewindow;
    private PasswordWindow passwordwindow;
    private ClientSearchWindow clientSearchWindow;
    private VehicleSearchWindow vehicleSearchWindow;
    private IntentionSearchWindow intentionSearchWindow;
    
    //Constructors
    public ClickEvent(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
    }

    public ClickEvent(TitleWindow titlewindow) {
        this.titlewindow = titlewindow;
    }

    public ClickEvent(PasswordWindow passwordwindow) {
        this.passwordwindow = passwordwindow;
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
        
        //Boton Buscar
        if(actionEvent.getSource() == this.mainWindow.getjButtonBuscar()){
        
        }
        
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
