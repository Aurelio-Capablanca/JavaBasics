/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.multidimensionalarrays.helpers;

import java.util.Scanner;

/**
 *
 * @author LAB
 */
public class helper {
    
    public final Scanner scan = new Scanner(System.in);
    
    public void printRows(int[] arr) {
        for (int a : arr) {
            System.out.print(a);
            System.out.print("\t");
        }
        System.out.println();
    }    
    
}
