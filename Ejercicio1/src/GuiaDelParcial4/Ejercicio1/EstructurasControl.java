package GuiaDelParcial4.Ejercicio1;

/*
La primera clase se llama Estructuras de control: tendrá cinco métodos:
• El primer método utilizara la estructura selectiva simple
• El segundo método selectiva doble
• El tercer método múltiple
• La cuarta do White
• La quinta For
 */

import java.util.Scanner;

public class EstructurasControl {

  private String TodosLosStrings = "";

  public void primero(String datos) {
    if (datos != null && !datos.equals(" ")) {
      TodosLosStrings += datos;
    }
  }

  public void segundo(String[] datos, Scanner scan) {
    System.out.println("Seleccione una de las anteriores: ");
    int seleccion;
    seleccion = scan.nextInt();
    Scanner evaluacion = new Scanner(String.valueOf(seleccion));
    if (evaluacion.hasNextInt()) {
      System.out.println(datos[(seleccion-1)]);
    } else {
      System.out.println("Solo puede ingresar valores numericos, favor vuelva a ingresar los valores: ");
      scan.next();
      segundo(datos,scan);
    }
  }

  public void tecero() {//doesn't do nothing
    int casos = 6;
    switch (casos){
      case 1 -> {
        System.out.println(3);
      }
      case 6 -> {
        System.out.println(8);
      }
      default -> {
        System.out.println(4);
      }
    }
  }

  public String[] cuarto(String datos) {
    String[] arr = datos.split(",");
    int longitudes = 0;
    do {
      System.out.println((longitudes+1)+arr[longitudes]);
      longitudes++;
    } while (longitudes < arr.length);
    return arr;
  }

  public void quinto(String datos) {//doesn't do anything

  }

}
