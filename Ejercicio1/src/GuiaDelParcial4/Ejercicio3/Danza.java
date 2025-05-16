package GuiaDelParcial4.Ejercicio3;

/*
En una clase Danza se tienen dos métodos:

a. El primer método se llamará bailar, la función de este será mostrar en
pantalla el mensaje “Yo bailo bonito ja ja ja…”. El método será
privado.

b. El segundo método debe ser público y su función será invocar el
método privado.

La clase también tiene un constructor por omisión, el cual mostrará el
mensaje “Soy el mejor bailarin”

Debe crear la clase que contendrá el método main desde donde usted
creará un objeto e invocará al método.
*/

public class Danza {

  public Danza() {
    System.out.println("Soy el mejor bailarin");
  }

  private String bailar(){
    return "Yo bailo bonito ja ja ja…";
  }

  public void llamarMetodos(){
    System.out.println(bailar());
  }

}
