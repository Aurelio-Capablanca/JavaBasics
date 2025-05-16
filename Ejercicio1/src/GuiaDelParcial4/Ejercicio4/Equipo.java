package GuiaDelParcial4.Ejercicio4;

/*
Se tiene una clase llamada Equipo de la cual se creará un objeto televisor.
La clase tendrá los siguientes métodos:

a. Método privado Encender, este método retornará la cadena “Televisor
encendido”.

b. Método público Volumen, este método tendrá dos parámetros, un
parámetro entero y uno tipo cadena, el parámetro entero recibirá un
número entero, el parámetro tipo cadena recibirá como argumento el
mensaje: “El volumen establecido es: ”.
Este método se encargará de:
- Invocar el método privado.
- Mostrar en pantalla la concatenación de sus parámetros (el tipo entero y
el tipo cadena). Por ejemplo, se podría tener como resultado de la
concatenación: “El volumen establecido es: 30”.

Implemente la clase y cree un objeto. Analice si serán los dos métodos que
invocará desde este lugar o será solo uno, si es uno reflexione cuál de ellos
será
*/

public class Equipo {

  private String encender(){
    return "Televisor encendido";
  }

  public void volumen(int voulumenTel, String mensaje){
    System.out.println(encender());
    System.out.println(mensaje+""+voulumenTel);
  }

}
