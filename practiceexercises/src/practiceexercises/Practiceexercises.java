/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceexercises;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author SomeoneSomewhere
 */
public class Practiceexercises {

    /**
     * @param args the command line arguments
     */
    // 2.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int totalMatutino, totalDiurno;
        double totalSueldosMatutinos = 0, totalSueldosDiurnos = 0;
        DecimalFormat format = new DecimalFormat("####.##");
        boolean automaticInterference;
        String response;

        System.out.println("Manual or Automatic ? y/n");
        response = scan.next().toLowerCase();
        while (!response.equals("y") && !response.equals("n")) {
            System.out.println("Initial Wrong Response: "+response);
            System.out.println("Manual or Automatic ? y/n");
            response = scan.next().toLowerCase();
            System.out.println("Later Response: "+response);
        }
        automaticInterference = response.equals("y");

        // Mañana
        System.out.println("\n");
        System.out.println("Ingrese el numero de profesores del turno matutino");
        while (!scan.hasNextInt()) {
            System.out.println("Solo puede ingresar valores numericos !");
            scan.next();
        }
        totalMatutino = scan.nextInt();
        double[] sueldosMatutinos = new double[totalMatutino];
        for (int i = 0; i < totalMatutino; i++) {
            if (automaticInterference) {
                sueldosMatutinos[i] = Math.random() * (480 - 300) + 300;
                System.out.println("Profesor #"+(i+1)+": $"+format.format(sueldosMatutinos[i]));
            } else {
                System.out.println("Ingrese el sueldo del profesor # " + i + " del turno matutino: ");
                while (!scan.hasNextDouble()) {
                    System.out.println("Solo puede ingresar valores numericos !");
                    scan.next();
                }
                sueldosMatutinos[i] = scan.nextDouble();
            }
            totalSueldosMatutinos += sueldosMatutinos[i];

        }

        // Tarde
        System.out.println("\n");
        System.out.println("Ingrese el numero de profesores del turno diurno");
        while (!scan.hasNextInt()) {
            System.out.println("Solo puede ingresar valores numericos !");
            scan.next();
        }
        totalDiurno = scan.nextInt();
        double[] sueldosDiurnos = new double[totalDiurno];
        for (int i = 0; i < totalDiurno; i++) {
            if (automaticInterference) {
                sueldosDiurnos[i] = Math.random() * (480 - 300 + 1) + 300; 
                System.out.println("Profesor #"+(i+1)+": $"+format.format(sueldosDiurnos[i]));
            } else {
                System.out.println("Ingrese el sueldo del profesor # " + i + " del turno diurno: ");
                while (!scan.hasNextDouble()) {
                    System.out.println("Solo puede ingresar valores numericos !");
                    scan.next();
                }
                sueldosDiurnos[i] = scan.nextDouble();
            }
            totalSueldosDiurnos += sueldosDiurnos[i];
        }
        
        System.out.println("\n");
        System.out.println("El total de sueldos en el turno matutino es de: $"+format.format(totalSueldosMatutinos));
        System.out.println("El total de sueldos en el turno diurno es de: $"+format.format(totalSueldosDiurnos));
    }

}
