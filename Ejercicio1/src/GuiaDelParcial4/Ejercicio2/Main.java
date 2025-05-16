package GuiaDelParcial4.Ejercicio2;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Dinero dinero = new Dinero();
    Scanner scan = new Scanner(System.in);
    System.out.print("Ingrese el tipo de moneda: ");
    dinero.setMoneda(scan.nextLine());
    System.out.println("Tipo de moneda: "+dinero.getMoneda());
    System.out.println();
    System.out.print("Ingrese la moneda de curso legal: ");
    String moneda = scan.nextLine();
    dinero.monedaLegal(moneda);
  }
}
