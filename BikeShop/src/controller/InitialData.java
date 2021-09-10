/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.*;
import access.*;
import java.sql.SQLException;
/**
 *
 * @author Dialvec
 */
public class InitialData {
    private ArrayList <ModelCliente> clientes = null;
    private ArrayList <ModelBicicleta> bicicletas = null;
    private ArrayList <ModelMotoElectrica> motos = null;
    private ArrayList <ModelIntencion> intenciones = null;

    public InitialData() throws SQLException {
        ClienteDAO clienteDAO = new ClienteDAO();
        this.clientes = clienteDAO.getAllClientes();
        
        BicicletaDAO bicicletaDAO = new BicicletaDAO();
        this.bicicletas = bicicletaDAO.getAllbicicletas();
        
        MotoElectricaDAO motoelEctricaDAO = new MotoElectricaDAO();
        this.motos = motoelEctricaDAO.getAllMotos();
        
        IntencionDAO intencionDAO = new IntencionDAO();
        this.intenciones = intencionDAO.getAllintencion();   
    }

    /**
     * @return the clientes
     */
    public ArrayList <ModelCliente> getClientes() {
        return clientes;
    }

    /**
     * @return the bicicletas
     */
    public ArrayList <ModelBicicleta> getBicicletas() {
        return bicicletas;
    }

    /**
     * @return the motos
     */
    public ArrayList <ModelMotoElectrica> getMotos() {
        return motos;
    }

    /**
     * @return the intenciones
     */
    public ArrayList <ModelIntencion> getIntenciones() {
        return intenciones;
    }
}
