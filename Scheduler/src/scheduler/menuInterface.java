/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scheduler;

/**
 *
 * @author Lab-11
 */
public class menuInterface extends ContactController{
    
    private boolean rev = true;
    private int menuSel;
    
    public void menu(){
        do {
          System.out.println("1. Crear"
                + "\n2. Modificar"
                + "\n3. Eliminar"
                + "\n4. Listar Ascendente (A - Z)"
                + "\n5. Listar Descendente (Z - A)"
                + "\n6. Salir");
          menuSel = this.scan.nextInt();
          switch(menuSel){
              case 1:
                 this.create();
              break;
              case 2:
                  
              break;
              case 3:
                  
              break;
              case 4:
                 this.sortLists(1);
              break;
              case 5:
                 this.sortLists(0);
              break;
              case 6:
                rev = false;
              break;
          }            
        } while (rev);
                    
    }
    
}
