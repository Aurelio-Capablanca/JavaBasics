package GuiaDelParcial4.Ejercicio2;

/*
 En una clase llamada Dinero se tienen los siguientes miembros:

a. Una variable privada y tipo cadena llamada moneda, que almacenará
un tipo de moneda, el cual debe digitarlo desde el teclado. El código
para solicitar ese valor debe escribirlo en la clase del método main.

b. Un método público con un parámetro de tipo String que retornará el
mensaje “la moneda de curso legal es el ” a este mensaje le debe
concatenar la variable moneda que recibirá en el parámetro.

c. Un constructor por omisión, el cual mostrará el mensaje “Paises y
Monedas”

Cree la clase que tendrá el método main, desde ella cree un objeto, capture
las variables desde teclado e invoque al método con la instancia creada
*/

public class Dinero {

  private String moneda;// not able to access to this value from main due to the in-ability to pass a value to it by the fact of being private

  public String getMoneda() {
    return moneda;
  }

  public void setMoneda(String moneda) {
    this.moneda = moneda;
  }

  public Dinero() {
    System.out.println("Paises y Monedas");
  }

  public String monedaLegal(String parametroMoneda) {
    return "la moneda de curso legal es el " + parametroMoneda;
  }

}
