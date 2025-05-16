/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overrides;

/**
 *
 * @author Lab2
 */
public class Heir extends Inheritor{
    
    @Override
    public void callOutMethod(){
        System.out.println("Replace Behavior");
    }
    
    public void owned(){
        System.out.println("This Class");
    }
}
