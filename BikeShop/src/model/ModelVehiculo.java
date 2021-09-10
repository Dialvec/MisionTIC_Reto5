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

    public ModelVehiculo(String fabricante) {
        this.fabricante = fabricante;
    }

    /**
     * @return the fabricante
     */
    public String getFabricante() {
        return fabricante;
    }
    
    // Retorma arreglo con campos de la clase
    public Object[] toArray(){
        Object[] data = {fabricante};
        return data;
    }
}