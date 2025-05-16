/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package threads;

/**
 *
 * @author LAB
 */
public class Threads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ProcessInSecond thread = new ProcessInSecond();
        UseARunnable runnables = new UseARunnable();
        Thread threadStart = new Thread(runnables);
        
        runnables.run();
        threadStart.start();
        thread.start();
    }
    
}
