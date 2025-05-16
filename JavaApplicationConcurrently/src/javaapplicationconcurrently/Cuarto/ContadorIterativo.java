/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplicationconcurrently.Cuarto;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LAB
 */
public class ContadorIterativo extends Thread {

    private int valor = 0;
    
    public ContadorIterativo(String name, int valor) {
        super(name);
        this.valor = valor;
    }
    
    @Override
    public void run(){
        System.out.println("Nombre del Hilo: "+Thread.currentThread().getName());
        System.out.println("Numero: "+valor);       
    }
    
}
