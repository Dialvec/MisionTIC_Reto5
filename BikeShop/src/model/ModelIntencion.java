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
public class ModelIntencion {
    private final int id_intencion;
    private final String alias_cliente_fk;
    private final String fabricante_fk;
    private String fechahora;

    public ModelIntencion(int id_intencion, String alias_cliente_fk, String fabricante_fk, String fechahora) {
        this.id_intencion = id_intencion;
        this.alias_cliente_fk = alias_cliente_fk;
        this.fabricante_fk = fabricante_fk;
        this.fechahora = fechahora;
    }

    /**
     * @return the id_intencion
     */
    public int getId_intencion() {
        return id_intencion;
    }

    /**
     * @return the alias_cliente_fk
     */
    public String getAlias_cliente_fk() {
        return alias_cliente_fk;
    }

    /**
     * @return the fabricante_fk
     */
    public String getFabricante_fk() {
        return fabricante_fk;
    }

    /**
     * @return the fechahora
     */
    public String getFechahora() {
        return fechahora;
    }

    /**
     * @param fechahora the fechahora to set
     */
    public void setFechahora(String fechahora) {
        this.fechahora = fechahora;
    }
    
    // Retorma arreglo con campos de la clase
    public Object[] toArray(){
        Object[] data = {id_intencion, alias_cliente_fk, fabricante_fk, fechahora};
        return data;
    }
}