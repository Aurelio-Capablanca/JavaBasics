/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplicationconcurrently.Primero;

/**
 *
 * @author LAB
 */
public class ProcessONE extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("This the number #" + (i + 1) + " In the Thread named: " + Thread.currentThread().getName());
            try {
                ProcessONE.sleep(1500);
            } catch (InterruptedException ex) {
                System.out.println("ERROR: "+ex);
            }
        }
    }

}
