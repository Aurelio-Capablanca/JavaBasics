/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplicationconcurrently.Quinto;

import java.util.ArrayList;

/**
 *
 * @author LAB
 */
public class GatosHelper {

    public ArrayList<String> nombresGatos = new ArrayList<>();

    public void agregarNombres() {
        nombresGatos.add("Manchas");
        nombresGatos.add("Bigotes");
        nombresGatos.add("Luna");
        nombresGatos.add("Marco");
        nombresGatos.add("Polo");
        nombresGatos.add("Chepe");
        nombresGatos.add("Riko");
        nombresGatos.add("Cabo");
        nombresGatos.add("Skipper");
        nombresGatos.add("Kowalski");
    }

    public String getGato(int indice){
        return nombresGatos.get(indice);
    }
    
    public void inicio(String nombre, int numeroPan) {
        System.out.println(nombre+" Comienza a comer pan numero #"+numeroPan);
    }

    public void fin(String nombre, int numeroPan) {
        System.out.println(nombre+" Termina de comer pan numero #"+numeroPan);
    }

}
