/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calificacionesalumnos.controlador;

/**
 *
 * @author Lab2
 */
public class ControladorMenu {

    public void menu() {       
        boolean bandera = true;
        int seleccionar;
        while (bandera) {
            System.out.println("Seleccione una de las siguientes: "
                    + "\n 1. Crear un Alumno"
                    + "\n 2. Ver todos los Alumnos"
                    + "\n 3. Procesar Notas"
                    + "\n 4. Mostrar Notas Finales"
                    + "\n 5. Salir");
            seleccionar = Inyector.INYECCION.validarNumeros();
            switch (seleccionar) {
                case 1:
                    Inyector.INYECCION.crearAlumno();
                    bandera = true;
                    break;
                case 2:
                    Inyector.INYECCION.mostrarAlumnos();
                    bandera = true;
                    break;
                case 3:
                    Inyector.INYECCION.procesarNotas();
                    bandera = true;
                    break;
                case 4:
                    Inyector.INYECCION.mostrarNotas();
                    bandera = true;
                    break;
                case 5:
                    bandera = false;
                    break;
                default:
                    System.out.println("¡No existe la opcion!");
                    bandera = true;
                    break;
            }
        }

    }

}
