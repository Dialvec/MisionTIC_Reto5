/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Dialvec
 */
public class ModelMotoElectrica {
    private final int id_moto;
    private final String fabricante_fk;
    private int precio;
    private final String proveedor_motor_fk;
    private int autonomia;

    public ModelMotoElectrica(int id_moto, String fabaricante_fk, String proveedor_motor_fk, int autonomia) {
        this.id_moto = id_moto;
        this.fabricante_fk = fabaricante_fk;
        this.proveedor_motor_fk = proveedor_motor_fk;
        this.autonomia = autonomia;
    }
    
    public ModelMotoElectrica(int id_moto, String fabaricante_fk, int precio, String proveedor_motor_fk, int autonomia) {
        this.id_moto = id_moto;
        this.fabricante_fk = fabaricante_fk;
        this.precio = precio;
        this.proveedor_motor_fk = proveedor_motor_fk;
        this.autonomia = autonomia;
    }

    /**
     * @return the id_moto
     */
    public int getId_moto() {
        return id_moto;
    }

    /**
     * @return the fabaricante_fk
     */
    public String getFabricante_fk() {
        return fabricante_fk;
    }
    
    /**
     * @return the precio
     */
    public int getPrecio() {
        return precio;
    }
    
    /**
     * @param precio the precio to set
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * @return the proveedor_motor_fk
     */
    public String getProveedor_motor_fk() {
        return proveedor_motor_fk;
    }

    /**
     * @return the autonomia
     */
    public int getAutonomia() {
        return autonomia;
    }

    /**
     * @param autonomia the autonomia to set
     */
    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }
    
    // Retorma arreglo con campos de la clase
    public Object[] toArray(){
        Object[] data = {id_moto, fabricante_fk, precio, proveedor_motor_fk, autonomia};
        return data;
    }
}
