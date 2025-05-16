/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;

import model.Persona;
import regpersonas.helper.helper;

/**
 *
 * @author Lab2
 */
public class personaConstructor extends helper {

    private Persona persona = new Persona();

    private void AddPersons() {
        persona.setNombre(scan.next());
        persona.setApellido(scan.next());
        persona.setCarnet(scan.next());
        // KG
        persona.setAltura(this.ValidarDouble());
        // Mtr
        persona.setPeso(this.ValidarDouble());
        persona.setEdad(this.ValidarIntegers());
    }

    private double IMC() {
        return (persona.getPeso() / Math.pow(persona.getAltura(), 2));
    }

    private void calculateWeight(double origin) {
        System.out.println(origin);
        double imc = (Double) origin;
        if (imc < 20) {
            System.out.println("Menor");
        }
        if (imc >= 20 && imc <= 25) {
            System.out.println("Aceptable");
        }
        if (imc > 24) {
            System.out.println("Mayor");
        }
    }

    public void CalculateIMC() {
        AddPersons();
        calculateWeight(IMC());
    }

}
