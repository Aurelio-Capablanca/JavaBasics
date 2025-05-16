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
public class Productos {
    
    private String nombre, descripcion;
    private double precios;

    public Productos() {
    }

    public Productos(String nombre, String descripcion, double precios) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precios = precios;
    }
        

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecios() {
        return precios;
    }

    public void setPrecios(double precios) {
        this.precios = precios;
    }
    
    
}