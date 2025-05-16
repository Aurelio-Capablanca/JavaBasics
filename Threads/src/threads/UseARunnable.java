/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package threads;

/**
 *
 * @author LAB
 */
public class UseARunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("Sub Thread");
        System.out.println("This Thread is: "+Thread.currentThread().getName());
        for (int i = 0; i < 10; i++) {
            System.out.println("Table 5 * "+(i)+" = "+(5*i));
        }
    }
    
}
