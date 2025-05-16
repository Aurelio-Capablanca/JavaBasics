/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overrides;

import java.util.Scanner;

/**
 *
 * @author Lab2
 */
public class Overrides {

    /**
     *
     * @param args the command line arguments
     */
    double resdoble = 0;
    int resentero = 0;

    public void realizaSuma(int n1, int n2, int n3) {
        resentero = n1 + n2 + n3;
        System.out.println("La suma es: " + resentero);
    }

    public void realizaSuma(Double n1, Double n2) {
        resdoble = n1 + n2;
        System.out.println("La suma es: " + resdoble);

    }

    public static void main(String[] args) {
        Inheritor inh = new Inheritor();
        inh.callOutMethod();
        Heir hr = new Heir();
        hr.callOutMethod();
        hr.owned();

        String a = "Dato1.1";
        String b = "Dato2.0";

        double valA = 0;
        double valB = 0;
        for (int i = 0; i < a.length(); i++) {            
            Scanner scans = new Scanner(String.valueOf(a.charAt(i)));
            Scanner scaned = new Scanner(String.valueOf(b.charAt(i)));
            
            if(scans.hasNextDouble()){                
                valA = scans.nextDouble();//Double.valueOf(String.valueOf(a.charAt(i)));
                System.out.println(valA);
                System.out.println();
            }
            if(scaned.hasNextDouble()){
                valB += scaned.nextDouble();//Double.valueOf(String.valueOf(b.charAt(i)));
                System.out.println(valB);
                System.out.println();
            }            
        }        
        System.out.println(valA);
        System.out.println(valB);
        double total =  valA + valB;
        System.out.println("TOTAL: "+total);
    }

}
