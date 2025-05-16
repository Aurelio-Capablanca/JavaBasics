/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplicationconcurrently.Quinto;

/**
 *
 * @author LAB
 */
public class Gatos extends Thread {

    private int gato = 0;
    private int pan = 0;
    private int aleatorio = 0;
    private GatosHelper help = new GatosHelper();

    public Gatos(String name, int PanActual, int Gato, int aleatorio) {
        super(name);
        this.gato = Gato;
        this.pan = PanActual;
        this.aleatorio = aleatorio;
        help.agregarNombres();
    }

    @Override
    public void run() {
        System.out.println("Nombre del Hilo: " + Thread.currentThread().getName());        
        help.inicio(help.getGato(gato),pan);
        try {
            Thread.sleep(aleatorio);
        } catch (InterruptedException ex) {
            System.out.println("ERROR: " + ex);
        }
        help.fin(help.getGato(gato),pan);
    }

}
