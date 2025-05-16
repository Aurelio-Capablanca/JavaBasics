/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scheduler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Lab-11
 */
public class ContactController extends Helpers {
    
    private final ArrayList<Contact> contactGroup = new ArrayList<Contact>();
    private final Contact contact = new Contact();
    public Scanner scan = new Scanner(System.in);
    
    public void create(){
        contact.setId(this.autoIncrements(contactGroup));
        System.out.println("Ingrese el nombre del contacto: ");
        contact.setNombre(scan.next());
        System.out.println("Ingrese el apellido del contacto: ");
        contact.setApellido(scan.next());
        System.out.println("Ingrese el telefono del contacto: ");
        contact.setTelefono(scan.next());
        contactGroup.add(contact);
    }
    
    public void update(){
        System.out.println("Seleccione el Contacto a Actualizar");
        this.listAll(contactGroup);
    }        
    
    public void sortLists(int order){
      ArrayList<String> arr = new ArrayList<String>();
      for(int t = 0; t < contactGroup.size(); t++){
          arr.add(contactGroup.get(t).getNombre()+" "+contactGroup.get(t).getApellido());
      }
      if(order == 1){
        arr.sort((a,b) -> a.compareTo(b));
        this.showArray(arr);
      }
      if(order == 0){
         Collections.reverseOrder();
         this.showArray(arr);
      }
    }       
    
    public void delete(){
        System.out.println("Desea eliminar solo un contacto o desea vaciar la lista ?");
        
    }
    
}
