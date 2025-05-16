/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplicationconcurrently.Segundo;

/**
 *
 * @author LAB
 */
public class ParesImpares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here                
        Principal principal = new Principal();
        principal.par.start();        
        principal.impar.start();
    }
    
}
