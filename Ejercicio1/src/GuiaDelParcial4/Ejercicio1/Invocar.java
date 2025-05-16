package GuiaDelParcial4.Ejercicio1;

/*
La cuarta clase se llamará Invocar: en esta creara
un objeto por clase e invocara
a los miembros de cada una de las clases estos los
creará dentro de un método
antes de crear los objetos debe agregar un mensaje que
diga “INVOCANDO TODAS LAS CLASES ANTERIORES “.
Puede aplicar creatividad utilizando las
estructuras de control usted decide.
*/

import java.util.Scanner;

public class Invocar {

  public void Invocaciones() {
    System.out.println("INVOCANDO TODAS LAS CLASES ANTERIORES");
    Scanner scans = new Scanner(System.in);

    System.out.print("ingrese su nombre completo: ");
    String nombreCompleto = scans.nextLine();
    System.out.print("ingrese su carnet: ");
    String carnet = scans.nextLine();
    System.out.print("ingrese su numero de grupo: ");
    String grupo = scans.nextLine();
    Alumnos.DatosAlumnos(nombreCompleto, carnet, grupo);

    System.out.print("Ingrese su carrera: ");
    String carrera = scans.nextLine();
    System.out.print("Ingrese la escuela a la que pertenece: ");
    String escuela = scans.nextLine();
    System.out.print("Ingrese el codigo de la carrera: ");
    String codigo = scans.nextLine();
    Alumnos.CarreraAlumno(carrera, escuela, codigo);

    Alumnos.MateriasACursar();
    Evaluaciones evals = new Evaluaciones();
    evals.acceso();
    evals.recursivo();
  }

}