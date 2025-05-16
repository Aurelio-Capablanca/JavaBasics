/*

Cree una clase con dos variables tipo int y dos métodos, 
el primer método debe tener dos parámetros que le permitan
recibir como argumentos los valores digitados desde teclado, 
pero en el método main, el método solo debe mostrar el mensaje 
con los valores que hayan recibido los parámetros. El segundo método,
mostrará la suma de esos valores.

Crear un constructor personalizado que acepte los parámetros correspondientes a
la variable de la clase y sobrecargarlo.

Implemente la clase e invoque los métodos.

 */
package overriders;

/**
 *
 * @author Lab2
 */
public class testerClass {

    public int a, b;

    public testerClass() {
        
    }

    public testerClass(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    public void operacion(int num1, int num2){
        System.out.println("VAL 1: "+num1+" VAL 2: "+num2);
    }
    
     public int operacion(){
         return (a+b);
    }
    
     
    
    
}
