/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notasalumnos.controlador;

/**
 *
 * @author adalb
 */
public class Menu extends LoginControlador {

    private boolean bandera = true;    
    private int seleccion;
    
    private void menuPrincipal() {
        login();
        while (bandera) {
            System.out.println();
            System.out.println("Seleccione una de las siguientes: "
                    + "\n1. Ingresar Notas"
                    + "\n2. Verificar Promedios de Aprobados/Reprobados"
                    + "\n3. Verificar Promedios Totales"
                    + "\n4. Verificar Nota Mayor y Menor"
                    + "\n5. Resumen de Datos"
                    + "\n6. Ver todas las notas"
                    + "\n7. Salir");
            seleccion = validarNumeros();            
            switch (seleccion) {
                case 1:
                    //ingresarNotas();
                    validarListasDeNotas();
                    break;
                case 2:
                    cantidadAprobadosReprobados();
                    break;
                case 3:
                    promedioTotal();
                    break;
                case 4:
                    MayorMenorNota();
                    break;
                case 5:
                    MostrarResultadoDeConteo();
                    break;
                case 6:
                    todasLasNotas();
                    break;
                case 7:
                    bandera = false;
                    break;
                default:
                    System.out.println("¡ La opción no existe !");
                    break;
            }
        }
    }    
    
    public static void menuAcceso(){
        Menu menu = new Menu();
        menu.menuPrincipal();
    }
}
