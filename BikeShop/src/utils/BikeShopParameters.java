/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Dialvec
 */
public interface BikeShopParameters {
    //Database Connection
    public final String DB_CRED_PATH = "/src/utils/db_credentials.json";
    public final String PW_PATH = "/src/utils/pswrd.json";
    public final String SCHEMA = "datos";
    
    //Cliente
    public final String ALIAS_CLIENTE = "alias cliente";
    public final String NOMBRE_CLIENTE = "nombre cliente";
    public final String APELLIDO_CLIENTE = "apellido cliente";
    public final String MAIL = "e-mail";
    public final String CELULAR = "celular";
    public final String DOB = "fecha nacimiento";
    
    //Ventana Buscar Cliente
    public final String BUSCAR_CLIENTE = "Buscar Cliente";
    public final String BUSCAR_CLIENTE_INSTR = "Indique información del cliente que busca.";
    public final String BOTON_BUSCAR = "Buscar";
    
    //Vehículo
    public final String FABRICANTE = "fabricante vehículo";
    public final String PRECIO = "precio";
    public final String ANIO_FABRICACION = "año fabricación";
    public final String PROVEEDOR_MOTOR = "proveedor del motor";
    public final String AUTONOMIA = "horas autonomía";
    
    //Ventana Buscar Vehículo
    public final String BUSCAR_VEHICULO = "Buscar Vehículo";
    public final String BUSCAR_VEHICULO_INSTR = "Indique información del vehículo que busca.";
    //Bicicletas
    public final String BICICLETAS = "Bicicletas";
    public final String MOTOS = "Motos Eléctricas";
    public final String BUSCAR_BICICLETA = "Buscar Bicicleta";
    //Motos
    public final String BUSCAR_MOTO = "Buscar Moto";
    
    //Ventana Buscar Intención Compra
}
