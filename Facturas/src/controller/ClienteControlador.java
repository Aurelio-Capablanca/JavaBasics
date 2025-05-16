/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import helper.helper;
import java.util.ArrayList;
import model.Clientes;

/**
 *
 * @author Lab2
 */
public class ClienteControlador extends helper{
    
    private ArrayList<Clientes> clientes = new ArrayList<>();
    private Clientes cliente = new Clientes();
    
    public void solicitarDatos(){
        System.out.println("Ingrese su nombre: ");
        cliente.setNombreCompleto(this.scan.next());
        clientes.add(cliente);
    }
    
    
    
}
