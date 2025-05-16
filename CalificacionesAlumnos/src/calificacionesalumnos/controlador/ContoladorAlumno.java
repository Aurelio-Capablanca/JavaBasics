/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calificacionesalumnos.controlador;

import calificacionesalumnos.helper.helper;
import calificacionesalumnos.modelo.Alumno;
import java.util.ArrayList;

/**
 *
 * @author Lab2
 */
public class ContoladorAlumno extends helper {

    protected ArrayList<Alumno> alumnos = new ArrayList<>();
    private static int idAlumno;

    public void crearAlumno() {
        idAlumno++;
        Alumno alumno = new Alumno();
        alumno.setId(idAlumno);
        System.out.println("Ingrese el Nombre del Alumno: ");
        alumno.setNombre(scan.next());
        System.out.println("Ingrese el Carnet del Alumno: ");
        alumno.setCarnet(scan.next());
        System.out.println("Ingrese el Correo del Alumno: ");
        alumno.setCorreo(scan.next());
        alumnos.add(alumno);
        
    }
    
    public void mostrarAlumnos(){
        int contador = 0;
        if(!this.validarListas(alumnos)){
            return;
        }
        System.out.println("Lista de Alumnos: ");
        for(Alumno alumnoCreado : alumnos){
            System.out.println("N-"+(contador+1)+"  Nombre: "+alumnoCreado.getNombre()+" Correo: "+alumnoCreado.getCorreo()+" Carnet: "+alumnoCreado.getCarnet());
            contador++;
        }
    }

}
