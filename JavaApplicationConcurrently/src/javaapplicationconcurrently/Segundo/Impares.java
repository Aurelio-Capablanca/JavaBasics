/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplicationconcurrently.Segundo;

/**
 *
 * @author LAB
 */
public class Impares extends Thread{
    
    @Override
    public void run(){
        int sumatoria = 0;
        for (int i = 1; i <= 10; i++) {
            if(i % 2 != 0){
                System.out.println("Numero Impar: "+i);
                sumatoria += i;
            }
        }
        System.out.println("El total de los impares es: "+sumatoria);
    }
    
}