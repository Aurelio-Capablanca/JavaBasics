/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import helpers.helper;
import java.util.Scanner;
import model.diaBruja;

/**
 *
 * @author Lab2
 */
public class halloweenController extends helper {

    private final diaBruja dia = new diaBruja();

    public static String tiposDulces(String tipoDulce) {
        halloweenController controller = new halloweenController();
        Scanner scanning = new Scanner(tipoDulce);
        while (!scanning.hasNextInt()) {
            System.out.println("Reingrese el valor !");
            tipoDulce = controller.scan.next();
            tiposDulces(tipoDulce);
        }
        int tipoDulces = Integer.valueOf(tipoDulce);        
        switch (tipoDulces) {
            case 1:
                controller.dia.setTipoDulce("Chocolate");
                break;
            case 2:
                controller.dia.setTipoDulce("Dulce de Coco");
                break;
            case 3:
                controller.dia.setTipoDulce("Bombones");
                break;
            case 4:
                controller.dia.setTipoDulce("Quiebradientes");                
                break;
            default:
                System.out.println("No existe la opcion: ");
                tiposDulces(tipoDulce);
                break;
        }
        return controller.dia.getTipoDulce();
    }

    public void invitados(int cantidad) {
        int cantidadM = 0, cantidadF = 0;
        String genero;
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese su genero M/F");
            genero = this.scan.next().toUpperCase();
            validarGenero(genero);
            if (genero.equals("M")) {
                cantidadM++;
            }
            if (genero.equals("F")) {
                cantidadF++;
            }
        }
        System.out.println("La Cantidad de Invitados Masculinos es de: "+cantidadM);
        System.out.println("La Cantidad de Invitadas Femeninas es de: "+cantidadF);
        System.out.println("La Cantidad Total de invitados es de :"+cantidad);
    }
    
    public String tipoDisfraz(){
        dia.setTipoDisfraz(scan.next());
        return dia.getTipoDisfraz();
    }
    
    public String tipoDecoracion(){
        dia.setTipoDecoracion(scan.next());
        return dia.getTipoDecoracion();
    }
    
    

}
