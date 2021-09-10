/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

//import javax.swing.JTable;
import javax.swing.JTable;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

import view.*;

import utils.BikeShopParameters;
import view.ClientWindow;


/**
 *
 * @author Dialvec
 */
public class MainListelectionEvent implements ListSelectionListener {
    
    public MainListelectionEvent(MainWindow mainWindow){
        this.mainWindow = mainWindow;
    }

    @Override
    public void valueChanged(ListSelectionEvent listSelectionEvent) {
        
        //ClienteModel
        String alias;
        String nombres;
        String apellidos;
        String email;
        String contrasena;
        String celular;
        String dob;
        
        //VehiculoModel
        String idVehiculo;
        String fabricante_fk;
        String precio;
        //Bicicleta
        String anio_fabrica;
        //Moto
        String proveedor_motor_fk;
        String autonomia;
        
        //IntencionModel
        String idIntencion;
        String alias_cliente_fk;
        // String fabricante_fk;
        String fechahora;
        
        //jTable row selection
        int selectedRowIndex = getMainWindow().getjTableData().getSelectedRow();
        String currentJTableModel = this.getMainWindow().getCurrentJTableModel();
        
        
        switch(currentJTableModel){
            case BikeShopParameters.MODEL_CLIENTE:
                
                if(getMainWindow().getClickEvent().getClientWindow() != null & selectedRowIndex >=0 ){
                    ClientWindow clientWindow = getMainWindow().getClickEvent().getClientWindow();
                    JTable jTableData = getMainWindow().getjTableData();
                    
                    alias = jTableData.getValueAt(selectedRowIndex, 0).toString();
                    nombres = jTableData.getValueAt(selectedRowIndex, 1).toString();
                    apellidos = jTableData.getValueAt(selectedRowIndex, 2).toString();
                    
                    try{
                        email = jTableData.getValueAt(selectedRowIndex, 3).toString();
                    } catch (NullPointerException ex){
                        email = null;
                    }
                    
                    try{
                        contrasena = jTableData.getValueAt(selectedRowIndex, 4).toString();
                    } catch (NullPointerException ex){
                        contrasena = null;
                    }
                    
                    try{
                        celular = jTableData.getValueAt(selectedRowIndex, 5).toString();
                    } catch (NullPointerException ex){
                        celular = null;
                    }
                    
                    try{
                        dob = jTableData.getValueAt(selectedRowIndex, 6).toString();
                    } catch (NullPointerException ex){
                        dob = null;
                    }
                    
                    clientWindow.getjTextFieldBCAlias().setText(alias);
                    clientWindow.getjTextFieldBCNombre().setText(nombres);
                    clientWindow.getjTextFieldBCApellido().setText(apellidos);
                    clientWindow.getjTextFieldBCEmail().setText(email);
                    clientWindow.getjPasswordFieldContrasena().setText(contrasena);
                    clientWindow.getjTextFieldBCCelular().setText(celular);
                    clientWindow.getjTextFieldBCDob().setText(dob);
                }
                break;
            
            case BikeShopParameters.MODEL_BICICLETA:
                
                if(getMainWindow().getClickEvent().getVehicleWindow() != null & selectedRowIndex >=0 ){
                    VehicleWindow vehicleWindow = getMainWindow().getClickEvent().getVehicleWindow();
                    JTable jTableData = getMainWindow().getjTableData();
                    
                    idVehiculo = jTableData.getValueAt(selectedRowIndex, 0).toString();
                    fabricante_fk = jTableData.getValueAt(selectedRowIndex, 1).toString();
                    
                    try{
                        precio = jTableData.getValueAt(selectedRowIndex, 2).toString();
                    } catch (NullPointerException ex){
                        precio = null;
                    }
                    
                    try{
                        anio_fabrica = jTableData.getValueAt(selectedRowIndex, 3).toString();
                    } catch (NullPointerException ex){
                        anio_fabrica = null;
                    }
                    
                    vehicleWindow.getjTextFieldBVFabricante().setText(fabricante_fk);
                    vehicleWindow.getjTextFieldBVPrecio().setText(precio);
                    vehicleWindow.getjTextFieldBVBanio().setText(anio_fabrica);

                }
                break;
            
            case BikeShopParameters.MODEL_MOTO:
                
                if(getMainWindow().getClickEvent().getVehicleWindow() != null & selectedRowIndex >=0 ){
                    VehicleWindow vehicleWindow = getMainWindow().getClickEvent().getVehicleWindow();
                    JTable jTableData = getMainWindow().getjTableData();
                    
                    idVehiculo = jTableData.getValueAt(selectedRowIndex, 0).toString();
                    fabricante_fk = jTableData.getValueAt(selectedRowIndex, 1).toString();
                    
                    try{
                        precio = jTableData.getValueAt(selectedRowIndex, 2).toString();
                    } catch (NullPointerException ex){
                        precio = null;
                    }
                    
                    try{
                        proveedor_motor_fk = jTableData.getValueAt(selectedRowIndex, 3).toString();
                    } catch (NullPointerException ex){
                        proveedor_motor_fk = null;
                    }
                    
                    try{
                        autonomia = jTableData.getValueAt(selectedRowIndex, 4).toString();
                    } catch (NullPointerException ex){
                        autonomia = null;
                    }
                    
                    vehicleWindow.getjTextFieldBVFabricante().setText(fabricante_fk);
                    vehicleWindow.getjTextFieldBVPrecio().setText(precio);
                    vehicleWindow.getjTextFieldBVMProveedor().setText(proveedor_motor_fk);
                    vehicleWindow.getjTextFieldBVMAutonomia().setText(autonomia);
                }
                break;
                
            case BikeShopParameters.MODEL_INTENCION:
                
                if(getMainWindow().getClickEvent().getIntentionWindow() != null & selectedRowIndex >=0 ){
                    
                    IntentionWindow intentionWindow = getMainWindow().getClickEvent().getIntentionWindow();
                    JTable jTableData = getMainWindow().getjTableData();
                    
                    idIntencion = jTableData.getValueAt(selectedRowIndex, 0).toString();
                    alias_cliente_fk = jTableData.getValueAt(selectedRowIndex, 1).toString();
                    fabricante_fk = jTableData.getValueAt(selectedRowIndex, 2).toString();
                    
                    try{
                        fechahora = jTableData.getValueAt(selectedRowIndex, 3).toString();
                    } catch (NullPointerException ex){
                        fechahora = null;
                    }
                    
                    intentionWindow.getjTextFieldAlias().setText(alias_cliente_fk);
                    intentionWindow.getjTextFieldFabricante().setText(fabricante_fk);
                    intentionWindow.getjTextFieldFechahora().setText(fechahora);
                }
                
                break;
        }
        
    }
    
    
    private final MainWindow mainWindow;

    /**
     * @return the mainWindow
     */
    public MainWindow getMainWindow() {
        return this.mainWindow;
    }
}
