/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplicationconcurrently;

/**
 *
 * @author LAB
 */
public class Hilo1 extends Thread{
    
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println((i+1)+":"+" H ");
            try {
                Hilo1.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("ERROR: "+ex);
            }
        }
    }
    
}
