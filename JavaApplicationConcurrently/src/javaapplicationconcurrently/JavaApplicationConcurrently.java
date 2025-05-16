/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplicationconcurrently;
/**
 *
 * @author LAB
 */
public class JavaApplicationConcurrently {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Hilo1 uno = new Hilo1();
        Hilo2 dos = new Hilo2();
        Hilo3 tres = new Hilo3();
        Hilo4 cuatro = new Hilo4();
        
        uno.start();
        try {
            uno.sleep(10);
        } catch (InterruptedException ex) {
            System.out.println("ERROR");           
        }
        dos.start();
        try {
            dos.sleep(10);
        } catch (InterruptedException ex) {
            System.out.println("ERROR");           
        }
        tres.start();
        try {
            tres.sleep(10);
        } catch (InterruptedException ex) {
            System.out.println("ERROR");           
        }
        cuatro.start();
        try {
            cuatro.sleep(10);
        } catch (InterruptedException ex) {
            System.out.println("ERROR");           
        }
        
    }
    
}
