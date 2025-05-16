/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplicationconcurrently.Primero;

/**
 *
 * @author LAB
 */
public class Primero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ProcessONE one = new ProcessONE();
        one.start();
        try {
            one.sleep(10);
        } catch (InterruptedException ex) {
            System.out.println("ERROR");
        }
    }

}
