/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Lab2
 */
public class Clientes {
    
    private String nombreCompleto;

    public Clientes() {
    }

    public Clientes(String nombre, String apellido) {
        this.nombreCompleto = nombre;       
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }    
    
    
}
