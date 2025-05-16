package GuiaDelParcial4.Ejercicio1;

/*
La tercera clase se llamará Evaluaciones: crear cinco atributos privados que
tengan relación al nombre de la clase y cinco métodos privados:

• El primer método retornara el promedio de los cinco atributos
privados

• El segundo método retornara al primer método.

• El tercer un método público que invoque a los miembros privados
(atributos y métodos y que los muestre) puede usar las instrucciones
del set y get para acceder a los miembros privados o pueden hacerlo
como desean aplique su creatividad.
*/

import java.util.Scanner;

public class Evaluaciones {

  private double eval1, eval2, eval3, eval4, prom;
  private final Scanner scan = new Scanner(System.in);

  public double getEval1() {
    return eval1;
  }

  public void setEval1(double eval1) {
    this.eval1 = eval1;
  }

  public double getEval2() {
    return eval2;
  }

  public void setEval2(double eval2) {
    this.eval2 = eval2;
  }

  public double getEval3() {
    return eval3;
  }

  public void setEval3(double eval3) {
    this.eval3 = eval3;
  }

  public double getEval4() {
    return eval4;
  }

  public void setEval4(double eval4) {
    this.eval4 = eval4;
  }

  public double getProm() {
    return prom;
  }

  public void setProm(double prom) {
    this.prom = prom;
  }

  private double promedios(){
    this.prom = (this.eval1 + this.eval2 + this.eval3 + this.eval4) / 4;
    return this.prom;
  }

  public void recursivo(){
    System.out.println(promedios());
  }

  public void acceso(){
    System.out.println("Ingrese la nota de la evaluación 1: ");
    setEval1(scan.nextDouble());
    System.out.println("Ingrese la nota de la evaluación 2: ");
    setEval2(scan.nextDouble());
    System.out.println("Ingrese la nota de la evaluación 3: ");
    setEval3(scan.nextDouble());
    System.out.println("Ingrese la nota de la evaluación 4: ");
    this.eval4 = scan.nextDouble();
  }

}
