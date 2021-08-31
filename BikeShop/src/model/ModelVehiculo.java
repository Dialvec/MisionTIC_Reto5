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
public class ModelVehiculo {
    private final String fabricante;
    private int precio;

    public ModelVehiculo(String fabricante, int precio) {
        this.fabricante = fabricante;
        this.precio = precio;
    }

    /**
     * @return the fabricante
     */
    public String getFabricante() {
        return fabricante;
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
    
    // Retorma arreglo con campos de la clase
    public Object[] toArray(){
        Object[] data = {fabricante, precio};
        return data;
    }
}