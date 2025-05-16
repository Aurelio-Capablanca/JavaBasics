/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package separarstrings;

import java.util.Scanner;

/**
 *
 * @author LAB
 */
public class SepararStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        funcionalidades func = new funcionalidades();
        boolean bandera = true;
        Scanner scan = new Scanner(System.in);
        int opcion;
        while (bandera) {
            System.out.println("Elija una de las siguientes opciones: ");
            System.out.println("""
                               1. Retornar la cantidad de palabras (se tomará como referencia el espacio) 
                               
                               2. Retornar la cantidad de espacios 
                               
                               3. Retornar la cantidad de palabras tildadas 
                               
                               4. Retornar las palabras que inicien con la letra “n” 
                               
                               5. Retornar las palabras que terminen con la letra “e” 
                               
                               6. Salir
                               """);
            opcion = scan.nextInt();
            switch (opcion) {
                case 1 -> {
                    func.cantidadPalabras();
                    System.out.println();
                }
                case 2 -> {
                    func.cantidadEspacios();                    
                    System.out.println();
                }
                case 3 -> {
                    func.palabrasTildadas();                    
                    System.out.println();
                }
                case 4 -> {
                    func.inicioN();
                    System.out.println();
                }
                case 5 -> {
                    func.finalE();
                    System.out.println();
                }
                case 6 -> {
                    bandera = false;
                    System.out.println("Saliendo ...");
                }
                default -> {
                    System.out.println("La opcion no existe !");
                    System.out.println();
                }
            }
        }

    }

}
