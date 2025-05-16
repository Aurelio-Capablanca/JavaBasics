/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calificacionesalumnos.helper;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lab2
 */
public class helper {

    protected final Scanner scan = new Scanner(System.in);
    protected final DecimalFormat format = new DecimalFormat("####.##");

    public int validarNumeros() {
        int value;
        while (!scan.hasNextInt()) {
            System.out.println("No puede ingresar valores no numericos");
            scan.next();
        }
        value = scan.nextInt();
        return value;
    }

    public double validarDecimales() {
        double value;
        while (!scan.hasNextDouble()) {
            System.out.println("No puede ingresar valores no numericos");
            scan.next();
        }
        value = scan.nextDouble();
        return value;
    }

    public boolean validarMenu(String value) {
        boolean validator;
        while (!value.equals("s") && !value.equals("n")) {
            System.out.println("No se puede elegir un valor distinto de s/n");
            value = scan.next();
        }
        validator = value.equals("s");
        return validator;
    }

    public boolean validarListas(ArrayList<?> arr) {
        if (arr.isEmpty()) {
            System.out.println("No hay Alumnos para mostrar");
            return false;
        }
        return true;
    }
}
