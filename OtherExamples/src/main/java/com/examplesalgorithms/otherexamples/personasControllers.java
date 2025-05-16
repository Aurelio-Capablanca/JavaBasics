/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examplesalgorithms.otherexamples;

import java.util.ArrayList;

/**
 *
 * @author LAB
 */
public class personasControllers extends helpers {
    
    private ArrayList<personas> persona = new ArrayList<>();
    
    public void create(){
        for (int i = 0; i < 5; i++) {
            personas personas = new personas();
            System.out.println("Ingrese el nombre de la persona #"+(i+1)+" :");
            personas.setNombre(this.scan.next());
            System.out.println("Ingrese el apellido de la persona #"+(i+1)+" :");
            personas.setApellido(this.scan.next());
            System.out.println("Ingrese su genero la persona #"+(i+1)+" :");
            personas.setGenero(validarGenero(this.scan.next().toUpperCase()));
            System.out.println("Ingrese su edad: ");
            personas.setEdad(validarEdad());
            persona.add(personas);
        }
    }
    
    public void mostrar(){
        for (int i = 0; i < persona.size(); i++) {
            System.out.println("\nNombre: "+persona.get(i).getNombre()
                               +"\nApellido: "+persona.get(i).getApellido()
                               +"\nGenero: "+persona.get(i).getGenero()
                               +"\nEdad: "+persona.get(i).getEdad());
        }
    }
    
    
    public void promedios(){
        int prom = 0;
        for (int i = 0; i <persona.size(); i++) {
            prom += persona.get(i).getEdad();
        }
        prom = prom / persona.size();
        System.out.println("\nPromedio de edad es: "+prom);
    }
    
    
}
