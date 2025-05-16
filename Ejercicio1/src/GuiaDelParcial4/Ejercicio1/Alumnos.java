package GuiaDelParcial4.Ejercicio1;

/*

La segunda clase a crear se llamará Alumnos: esta tendrá tres métodos
estáticos:

Crear un constructor por omisión donde muestre un mensaje
referente al nombre de la clase .

El primer método se llama Datos Alumnos , esta tendrá 3 parámetros
estos tienen que tener relación al nombre del método ,además debe
ingresarlos los datos desde teclado y mostrarlos .(Ese método debe
de contener los datos de los integrantes del grupo.)

El segundo método se llama CarreraAlumno este tendrá tres
parámetros estos tienen que tener relación al nombre del método y
dentro de él creara tres variables locales en donde asignara los
parámetros y los mostrara.

El tercer método se llama MateriasAcursar este tendrá parámetros
relacionado al método, usted decidirá cuantos parámetros le
asignará los argumentos los ingresará desde teclado y los mostrará

*/

import java.util.Scanner;

public class Alumnos {

  private final Scanner scan = new Scanner(System.in);

  public Alumnos() {
    System.out.println("Funcionalidades de Alumnos");
  }

  public static void DatosAlumnos(String nombreCompleto, String carnet, String numeroGrupo) {
    EstructurasControl control = new EstructurasControl();
    String alumno = "Nombre:  " + nombreCompleto + " Carnet: " + carnet + " Grupo: " + numeroGrupo + " ,";
    System.out.println(alumno);
    control.primero(alumno);
  }

  public static void CarreraAlumno(String carrera, String escuela, String codigo) {
    String carreraIngre = carrera;
    String escuelaIngre = escuela;
    String codigoIngre = codigo;
    System.out.println("" + carreraIngre + "" + escuelaIngre + "" + codigoIngre + "");
  }

  public static void MateriasACursar() {
    String materias = " Calculo, Algoritmos I, Programación Orientada a Objetos, Seminario Taller de Competencias, Bases de Datos";
    EstructurasControl control = new EstructurasControl();
    Alumnos al = new Alumnos();
    System.out.println("Materias disponibles: ");
    control.segundo(control.cuarto(materias),al.scan);
  }

}
