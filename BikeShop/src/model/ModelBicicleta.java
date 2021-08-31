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
public class ModelBicicleta {
    private final int id_bicicleta;
    private final String fabricante_fk;
    private int anio_fabrica;

    public ModelBicicleta(int id_bicicleta, String fabricante_fk, int anio_fabrica) {
        this.id_bicicleta = id_bicicleta;
        this.fabricante_fk = fabricante_fk;
        this.anio_fabrica = anio_fabrica;
    }

    /**
     * @return the id_bicicleta
     */
    public int getId_bicicleta() {
        return id_bicicleta;
    }

    /**
     * @return the fabricante_fk
     */
    public String getFabricante_fk() {
        return fabricante_fk;
    }

    /**
     * @return the anio_fabrica
     */
    public int getAnio_fabrica() {
        return anio_fabrica;
    }

    /**
     * @param anio_fabrica the anio_fabrica to set
     */
    public void setAnio_fabrica(int anio_fabrica) {
        this.anio_fabrica = anio_fabrica;
    }
    
    // Retorma arreglo con campos de la clase
    public Object[] toArray(){
        Object[] data = {id_bicicleta, fabricante_fk, anio_fabrica};
        return data;
    }
    
}
