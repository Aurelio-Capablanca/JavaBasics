/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package threads;

/**
 *
 * @author LAB
 */
public class ProcessInSecond extends Thread {
    
    @Override
    public void run(){
        System.out.println("This Thread is: "+Thread.currentThread().getName());
        for (int i = 0; i < 5; i++) {
            System.out.println("Proceso #"+(i+1));
        }
    }
    
}
