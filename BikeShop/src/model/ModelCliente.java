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
public class ModelCliente {
    private final String alias;
    private final String nombres;
    private final String apellidos;
    private String email;
    private int contrasena;
    private String contrasenaStr;
    private String celular;
    private String dob;

    
    public ModelCliente(String alias, String nombres, String apellidos) {
        this.alias = alias;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.contrasena = 0;
    }
    
    public ModelCliente(String alias, String nombres, String apellidos, String email, int contrasena, String celular, String dob) {
        this.alias = alias;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
        this.contrasena = contrasena;
        this.celular = celular;
        this.dob = dob;
    }
    
    public ModelCliente(String alias, String nombres, String apellidos, String email, String contrasenaStr, String celular, String dob) {
        this.alias = alias;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
        this.contrasenaStr = contrasenaStr;
        this.celular = celular;
        this.dob = dob;
    }
    
    /**
     * @return the alias
     */
    public String getAlias() {
        return alias;
    }

    /**
     * @return the nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the contrasena
     */
    public int getContrasena() {
        return contrasena;
    }

    /**
     * @param contrasena the contrasena to set
     */
    public void setContrasena(int contrasena) {
        this.contrasena = contrasena;
    }

    /**
     * @return the dob
     */
    public String getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(String dob) {
        this.dob = dob;
    }
    
    // Retorma arreglo con campos de la clase
    public Object[] toArray(){
        Object[] data = {alias, nombres, apellidos, email, contrasena, celular, dob};
        return data;
    }

    /**
     * @return the celular
     */
    public String getCelular() {
        return celular;
    }

    /**
     * @param celular the celular to set
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }

    /**
     * @return the contrasenaStr
     */
    public String getContrasenaStr() {
        return contrasenaStr;
    }
}
