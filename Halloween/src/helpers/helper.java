/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lab2
 */
public class helper {
    
   public final Scanner scan = new Scanner(System.in);
    

  public int validarNumeros() {
    int value;
    while (!scan.hasNextInt()) {
      System.out.println("No puede ingresar valores no numericos");
      scan.next();
    }
    value = scan.nextInt();
    return value;
  }
  
  public String validarGenero(String genero) {
        while (!genero.equals("M") && !genero.equals("F")) {
            System.out.println("No puede ingresar un valor distinto de M o F");
            genero = scan.next();
        }
        return genero;
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
  
  public boolean validarListas(ArrayList<?> arr){
      if(arr.isEmpty()){
          System.out.println("No hay Contactos para mostrar");
          return false;          
      }
      return true;
  }
    
}
