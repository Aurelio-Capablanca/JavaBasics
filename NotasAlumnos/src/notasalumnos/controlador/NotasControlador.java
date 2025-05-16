/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notasalumnos.controlador;

import Operador.NotasOperacionesBase;

/**
 *
 * @author adalb
 */
public class NotasControlador extends NotasOperacionesBase {

    private int numeroNotas;
    private double notaEstudiante;
    protected String opcion = "";

    public NotasControlador() {
        System.out.println("Acciones para Notas");
        System.out.println();
    }

    private void ingresarNotas() {
        System.out.println();        
        System.out.println("Ingrese el numero de notas a ingresar: ");
        numeroNotas = this.validarNumeros();
        for (int i = 0; i < numeroNotas; i++) {
            System.out.println("Ingrese las notas del estudiante #" + (i + 1) + " :");
            notaEstudiante = this.validarRango(this.validarDecimales());
            this.DeterminarMensaje(notaEstudiante);
            notas.setNotasfinales(notaEstudiante);
        }        
        this.calcularPromediosAprobadosReprobados();
        this.calcularMayorMenor();
        this.calcularPromediosTotales();
    }

    public void validarListasDeNotas(){
        if (this.validarListas(notas.getNotasfinales())) {
            System.out.println("Ya hay datos Ingresados, ¿desea reiniciar el proceso? s/n");
            opcion = scan.next();
            if (this.validarMenu(opcion)) {
                notas.getMensajeFinal().clear();
                notas.getNotasfinales().clear();
                ingresarNotas();                
            }
        } else {
            ingresarNotas();
        } 
    }
    
    public void validarNotasMensajeFinal() {
        System.out.println();
        this.validarListas(notas.getNotasfinales());
        for (Double nota : notas.getNotasfinales()) {
            DeterminarMensaje(nota);
        }
    }

    public void cantidadAprobadosReprobados() {
        System.out.println();
        if (this.validarListas(notas.getNotasfinales())) {
            System.out.println("Cantidad de Aprobados: " + notas.getCantidadAprobados());
            System.out.println("Cantidad de Reprobados: " + notas.getCantidadReprobados());
            System.out.println("Promedio de Aprobados: " + notas.getPromedioAprobados());
            System.out.println("Promedio de Reprobados: " + notas.getPromedioReprobados());
        }
    }

    public void MayorMenorNota() {
        System.out.println();
        if (this.validarListas(notas.getNotasfinales())) {
            System.out.println("Mayor: " + notas.getNotaMayor());
            System.out.println("Menor: " + notas.getNotaMenor());
        }
        //-- Casted out lines
        //String sayMoreOrLess = mayor > menor ? "Mayor" : "Menor";
        //String sayLessOrMore = menor < mayor ? "Menor" : "Mayor";
        //System.out.println(sayMoreOrLess + ": " + mayor);
        //System.out.println(sayLessOrMore + ": " + menor);
        //System.out.println("Experiment");
        //System.out.println(sayMoreOrLess + ": " + QuienEsMayor);
        //System.out.println(sayLessOrMore + ": " + QuienEsMenor);
        //System.out.println("NON Aproved Solution: ");
        //System.out.println("MAX: " + Collections.max(notas.getNotasfinales()));
        //System.out.println("MIN: " + Collections.min(notas.getNotasfinales()));
    }

    public void promedioTotal() {
        System.out.println();
        if (this.validarListas(notas.getNotasfinales())) {
            System.out.println("El Promedio de todas las notas es de: " + notas.getPromedioTotal());
        }
    }

    public void MostrarResultadoDeConteo() {
        System.out.println();
        if (this.validarListas(notas.getNotasfinales())) {
            System.out.println("Total Aprobados: " + notas.getCantidadAprobados());
            System.out.println("Total Reprobados: " + notas.getCantidadReprobados());

            System.out.println("Cantidad de Excelentes: " + notas.getExcelentes());
            System.out.println("Cantidad de Bueno: " + notas.getBueno());
            System.out.println("Cantidad de Regular: " + notas.getRegular());
            System.out.println("Cantidad de Necesita Mejorar: " + notas.getNecesitaMejorar());
            System.out.println("Cantidad de Necesita un Milagro: " + notas.getNecesitaUnMilagro());

            System.out.println("Promedio de Estudiantes Aprobados: " + formateador.format(notas.getPromedioAprobados()));
            System.out.println("Promedio de Estudiantes Reprobados: " + formateador.format(notas.getPromedioReprobados()));

            System.out.println("Promedio Total de Notas: " + formateador.format(notas.getPromedioTotal()));

            System.out.println("Mayor Nota: " + notas.getNotaMayor());
            System.out.println("Menor Nota: " + notas.getNotaMenor());
        }
    }

    public void todasLasNotas() {
        System.out.println();
        this.validarListas(notas.getNotasfinales());
        for (Double nota : notas.getNotasfinales()) {
            System.out.println("" + nota);
        }
    }
}
