/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.concurrentproject;

/**
 *
 * @author LAB
 */
public class ConcurrentProject {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        ThreadManager manage = new ThreadManager();
        manage.acceptMessage("Acccept Message").join();
                
    }
}
