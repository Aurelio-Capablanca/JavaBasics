/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notasalumnos.ayudante;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author adalb
 */
public class Ayudante {

    protected final Scanner scan = new Scanner(System.in);
    protected final DecimalFormat formateador = new DecimalFormat("####.##");

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

    public double validarRango(double valor) {
        while (valor <= -1 || valor > 10) {
            System.out.println("No puede asignar notas mayores a 10 o menores a 0, favor re ingrese el valor");
            valor = validarDecimales();
        }
        return valor;
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
            System.out.println("No hay Notas para mostrar o procesar");
            return false;
        }
        return true;
    }

}
