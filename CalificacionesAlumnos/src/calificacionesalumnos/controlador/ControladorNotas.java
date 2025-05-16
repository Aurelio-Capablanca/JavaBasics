/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calificacionesalumnos.controlador;

import calificacionesalumnos.modelo.*;
import java.util.ArrayList;

/**
 *
 * @author Lab2
 */
public class ControladorNotas extends ContoladorAlumno {

    private int cantidadNotas;
    private int seleccion;
    private final ArrayList<AlumnosCalificaciones> union = new ArrayList<>();

    public void procesarNotas() {
        AlumnosCalificaciones alumnosAsignados = new AlumnosCalificaciones();
        Calificaciones notas = new Calificaciones();
        alumnosAsignados.setAlumno(asignarAlumno());
        System.out.println("¿ Cuantas notas se van a procesar ?");
        cantidadNotas = this.validarNumeros();
        for (int i = 0; i < cantidadNotas; i++) {
            System.out.println("Ingrese la nota de la evaluacion " + (i + 1) + " :");
            notas.setNotas(this.validarDecimales());
        }
        notas.setPromedio(notas.getNotas() / cantidadNotas);
        alumnosAsignados.setCalificaciones(notas);
        union.add(alumnosAsignados);
    }

    private Alumno asignarAlumno() {
        System.out.println("Seleccione uno de los siguientes: ");
        this.mostrarAlumnos();
        seleccion = this.validarNumeros();
        return this.alumnos.get(seleccion - 1);
    }

    public void mostrarNotas() {
        int contar = 0;
        if (!this.validarListas(alumnos)) {
            return;
        }
        if (!this.validarListas(union)) {
            return;
        }
        for (AlumnosCalificaciones uniones : union) {
            System.out.println("N-" + (contar + 1) + " Nombre: " + uniones.getAlumno().getNombre() + " Promedio: " + uniones.getCalificaciones().getPromedio());
            contar++;
        }
    }
}
