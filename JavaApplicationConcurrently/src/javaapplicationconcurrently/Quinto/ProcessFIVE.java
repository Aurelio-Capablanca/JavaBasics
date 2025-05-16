/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplicationconcurrently.Quinto;

/*
Cree un programa en java que elabore un hilo que con 10 nombres de gatos
comiendo pan con queso (3), quien termine los tres panes indique que termino
*/


/**
 *
 * @author LAB
 */
public class ProcessFIVE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int random = (int)(Math.random() * (2000 - 1000) + 1000);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 3; j++) {
                Gatos gatos = new Gatos("Pan Con Queso #"+(j+1)+" Gato Numero #"+(i+1),(j+1),(i+1),random);
                gatos.start();
            }
        }
    }
    
}
