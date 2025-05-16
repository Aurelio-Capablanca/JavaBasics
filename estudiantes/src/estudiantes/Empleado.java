/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiantes;

import java.util.Scanner;

/**
 *
 * @author Lab-11
 */
class Helper {

    public Scanner scan = new Scanner(System.in);
}

class Empleados extends Helper {

    private int idEmpleados;
    private String nombre, apellido, departamento, email, extensiontel;

    public Empleados(int id, String nombre, String apellido, String departamento, String email, String extension) {
        this.idEmpleados = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.departamento = departamento;
        this.extensiontel = extension;
    }
    
    public Empleados() {
        
    }
         

    public void Ingresar(Empleados[] arr) {
        for (int i = 0; i < arr.length; i++) {
            this.idEmpleados = i;
            System.out.println("Ingrese el nombre del empleado: ");
            this.nombre = this.scan.next();
            System.out.println("Ingrese el apellido del empleado: ");
            this.apellido = this.scan.next();
            System.out.println("Ingrese el departamento del empleado: ");
            this.departamento = this.scan.next();
            System.out.println("Ingrese el email del empleado: ");
            this.email = this.scan.next();
            System.out.println("Ingrese la extension telefonica del empleado: ");
            this.extensiontel = this.scan.next();
            arr[i] = new Empleados(this.idEmpleados, this.nombre, this.apellido, this.departamento, this.email, this.extensiontel);
        }
    }

    public void Automatico(Empleados[] arr) {

    }

    public String Mostrar() {
        return "" ;
    }

    public int getIdEmpleados() {
        return idEmpleados;
    }

    public void setIdEmpleados(int idEmpleados) {
        this.idEmpleados = idEmpleados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getExtensiontel() {
        return extensiontel;
    }

    public void setExtensiontel(String extensiontel) {
        this.extensiontel = extensiontel;
    }

}

public class Empleado {

    Empleados[] empleados = new Empleados[5];
    Empleados el = new Empleados(0,null,null,null,null,null);    
    //el.Ingresar(empleados);

}
