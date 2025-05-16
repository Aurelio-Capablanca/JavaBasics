package GuiaDelParcial4.Ejercicio4;

public class Main {
  public static void main(String[] args){
    Equipo televisor = new Equipo();
    //solo se puede acceder al metodo publico, no se puede acceder en solitario al metodo encender
    //televisor.encender(); //-- Esta linea marca que el metodo no se ha encontrado por lo que encender() debe ser público
    televisor.volumen(20,"El volumen establecido es:");
  }
}
