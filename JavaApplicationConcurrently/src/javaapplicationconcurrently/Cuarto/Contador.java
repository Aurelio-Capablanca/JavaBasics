/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplicationconcurrently.Cuarto;

/**
 *
 * @author LAB
 */
public class Contador {

    public static void contadorHilos() {
        for (int i = 0; i < 10; i++) {
            ContadorIterativo contador = new ContadorIterativo("Hilo-" + (i + 1), (i + 1));
            contador.start();
            try {
                contador.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Error: " + ex);
            }
        }
    }

}
