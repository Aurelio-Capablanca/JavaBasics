/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regpersonas;

import constructor.personaConstructor;

/**
 *
 * @author Lab2
 */
public class RegPersonas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        personaConstructor persona = new personaConstructor();
        persona.CalculateIMC();
    }
    
}
