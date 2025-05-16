/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examplesalgorithms.otherexamples;

import java.util.Scanner;

/**
 *
 * @author LAB
 */
public class helpers {

    final Scanner scan = new Scanner(System.in);

    public String validarGenero(String genero) {
        while (!genero.equals("M") && !genero.equals("F")) {
            System.out.println("No puede ingresar un valor distinto de M o F");
            genero = scan.next();
        }
        return genero;
    }

    public int validarEdad() {        
        int edad;        
        if (!scan.hasNextInt()) {
            System.out.println("No puede ingresar valores no numericos en el campo edad: ");
            scan.next();
        }
        edad = scan.nextInt();
        return edad;
    }
}
