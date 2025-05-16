/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notasalumnos.controlador;

import notasalumnos.model.Usuarios;

/**
 *
 * @author adalb
 */
public class LoginControlador extends NotasControlador {

    Usuarios usuario = new Usuarios();

    public void ingresarDatos() {
        System.out.println("Ingrese su Usuario: ");
        usuario.setUsuario(this.scan.next());
        System.out.println("Ingrese su Contraseña: ");
        usuario.setClave(this.scan.next());
    }

    public void login() {
        ingresarDatos();
        while (!usuario.getUsuario().equals("POO") || !usuario.getClave().equals("02")) {
            System.out.println("Re ingrese sus datos, estos no son validos !");
            ingresarDatos();
        }
    }

}
