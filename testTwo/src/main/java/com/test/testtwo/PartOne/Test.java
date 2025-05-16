/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.testtwo.PartOne;

import java.util.Scanner;

/**
 *
 * @author 1708222023
 */
public class Test {

    /*
        1.	Crear un programa que contenga un menú con 2 opciones . 20%
Opción 1: Programa que permita calcular en base a una serie de números ingresados por teclado lo siguiente:
        El Número mayor, 
        el menor y 
        el promedio
    
Opción 2: Programa que pida los datos de conversión de longitudes
	Convertir Millas a Km’s y viceversa
	Convertir Millas a metros y viceversa

     */
    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Selecccione una opcion: "
                + "\n 1. Ingresar una serie de numeros para calcular,"
                + "\n 2. Conversion de longitudes"
        );
        final int option = scan.nextInt();
        boolean flag = true;
        while (flag) {
            switch (option) {
                case 1:
                    determineMaxMin();
                    break;
                case 2:
                    conversionTypes();
                    break;
                default:
                    break;
            }
            System.out.println("Continue ?");
            String optionContinue = scan.next();
            flag = optionContinue.toLowerCase().equals("y");
        }

    }

    public static void determineMaxMin() {
        System.out.println("Insert the total of elements : ");
        final int totalEl = scan.nextInt();
        double prom = 0;
        int[] arrNums = new int[totalEl];
        for (int i = 0; i < totalEl; i++) {
            arrNums[i] = scan.nextInt();
            prom += arrNums[i];
        }
        int max = arrNums[0];
        int min = arrNums[0];
        for (int i = 1; i < arrNums.length; i++) {
            if (max < arrNums[i]) {
                max = arrNums[i];
            }
            if (min > arrNums[i]) {
                min = arrNums[i];
            }
        }
        prom = prom / totalEl;
        System.out.println("Max is : " + max + " Min is: " + min + " Prom is : " + prom);
    }

    public static void conversionTypes() {

        System.out.println("Selecccione una opcion: "
                + "\n 1. Millas a Kilómetros"
                + "\n 2. Kilómetros a Millas"
                + "\n 3. Millas a Metros"
                + "\n 4. Metros a Millas"
        );        
        boolean flag = true;
        while (flag) {
            int option = scan.nextInt();
            double finalResult = 0;
            switch (option) {
                case 1:
                    double millas = scan.nextInt();
                    finalResult = millas * 1.60934;
                    System.out.println("Millas : " + finalResult);
                    break;
                case 2:
                    double kilometros = scan.nextInt();
                    finalResult = kilometros / 1.60934;
                    System.out.println("Kilometros : " + finalResult);
                    break;
                case 3:
                    double millasToMetros = scan.nextInt();
                    finalResult = millasToMetros * 1609.34;
                    System.out.println("Millas : " + finalResult);
                    break;
                case 4:
                    double metros = scan.nextInt();
                    finalResult = metros / 1609.34;
                    System.out.println("Metros : " + finalResult);
                    break;
                default:
                    break;
            }
            System.out.println("Continue ?");
            String optionContinue = scan.next();
            flag = optionContinue.toLowerCase().equals("y");            
        }

    }

}
