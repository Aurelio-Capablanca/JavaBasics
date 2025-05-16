/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scheduler;

import java.util.ArrayList;

/**
 *
 * @author Lab-11
 */
public class Helpers {
    
    public int autoIncrements(ArrayList<Contact> arr){       
       return (arr.size() - 1) + 1;
    }
    
    public void listAll(ArrayList<Contact> arr){
        for (int i = 0; i < arr.size(); i++) {
            System.out.println("\nId: "+arr.get(i).getId()+
                               "\nNombre: "+arr.get(i).getNombre()+
                               "\nApellido: "+arr.get(i).getApellido()+
                               "\nTelefono: "+arr.get(i).getTelefono());
        }
    }
    
    public void showArray(ArrayList<?> arr){
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
    
}
