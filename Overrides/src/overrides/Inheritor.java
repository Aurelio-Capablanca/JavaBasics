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
public class Inheritor implements Contracts{
    
    public void callOutMethod(){
        System.out.println("Show a behaviour");
    }

    @Override
    public String forceReurn() {
        return "Random TEXT";
    }
    
}
