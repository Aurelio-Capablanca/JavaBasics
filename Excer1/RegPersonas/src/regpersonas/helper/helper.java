/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regpersonas.helper;

import java.util.Scanner;

/**
 *
 * @author Lab2
 */
public class helper {

    public final Scanner scan = new Scanner(System.in);

    public double ValidarDouble(){
        double value;
        while(!scan.hasNextInt()){
            System.out.println("No puede ingresar valores distintos de Decimales");
            scan.next();
        }
        value = scan.nextDouble();
        return value;
    }
    
    public int ValidarIntegers(){
        int value;
        while(!scan.hasNextInt()){
            System.out.println("No puede ingresar valores distintos de Enteros");
            scan.next();
        }
        value = scan.nextInt();
        return value;
    }
    
    
}
