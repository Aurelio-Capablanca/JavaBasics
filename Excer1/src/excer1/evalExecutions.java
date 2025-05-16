/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excer1;

/**
 *
 * @author Lab2
 */
public class evalExecutions {
    
    private boolean automatic;
    private String val;
    private final sample ss = new sample();
    
    private void intros(){}
    
    private void self(int limit){
      for(int i = 0; i < limit; i++){
          ss.setNumbers((int)(Math.random() * (100 - 1 + 1) + 1));          
      }
    } 
    
    
    public void evaluator(){
        
        System.out.println("Will be automatic ? y/n: ");
        val = ss.scan.next().toLowerCase();
        while (!val.equals("s") && !val.equals("n")){
            System.out.println("No valid enter! s/n: ");
            val = ss.scan.next().toLowerCase();
        }
        automatic = val.equals("s");
        if(automatic){
            
        } else {
        
        }
    }  
    
}
