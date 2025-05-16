/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operador;

import notasalumnos.ayudante.Ayudante;
import notasalumnos.model.Notas;
import java.util.Collections;
/**
 *
 * @author adalb
 */
public class NotasOperacionesBase extends Ayudante{
    
    protected final Notas notas = new Notas();
    
    protected void DeterminarMensaje(double nota) {
        String mensaje = "";
        if (nota >= 9.0) {
            mensaje = "Excelente";
            notas.setExcelentes(notas.getExcelentes() + 1);
        } else if (nota >= 7.0) {
            mensaje = "Bueno";
            notas.setBueno(notas.getBueno() + 1);
        } else if (nota >= 5.0) {
            mensaje = "Regular";
            notas.setRegular(notas.getRegular() + 1);
        } else if (nota >= 3.0) {
            mensaje = "Necesita Mejorar";
            notas.setNecesitaMejorar(notas.getNecesitaMejorar() + 1);
        } else if (nota >= 0.0) {
            mensaje = "Necesita un milagro";
            notas.setNecesitaUnMilagro(notas.getNecesitaUnMilagro() + 1);
        }
        System.out.println(mensaje);
        notas.setMensajeFinal(mensaje);
    }

    protected void calcularPromediosAprobadosReprobados(){
        int aprobados = 0, reprobados = 0;
        double promedioAprobados = 0, promedioReprobados = 0;
        for (Double nota : notas.getNotasfinales()) {
            if (nota >= 7.0) {
                aprobados++;
                promedioAprobados += nota;
            } else {
                reprobados++;
                promedioReprobados += nota;
            }
        }
        promedioAprobados = promedioAprobados / aprobados;
        promedioReprobados = promedioReprobados / reprobados;
        notas.setPromedioAprobados(promedioAprobados);
        notas.setPromedioReprobados(promedioReprobados);
        notas.setCantidadAprobados(aprobados);
        notas.setCantidadReprobados(reprobados);
    }
    
    protected void calcularMayorMenor(){
        double mayor = notas.getNotasfinales().get(0), menor = notas.getNotasfinales().get(0);
        for (int i = 0; i < notas.getNotasfinales().size(); i++) {
            //System.out.println("Iteración Mayor " + (i + 1) + " :" + mayor + " > " + notas.getNotasfinales().get(i) + " = " + (mayor > notas.getNotasfinales().get(i)));
            //System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
            //System.out.println("Iteración Menor " + (i + 1) + " : " + menor + " < " + notas.getNotasfinales().get(i) + " = " + (menor < notas.getNotasfinales().get(i)));
            if (mayor > notas.getNotasfinales().get(i)) {
                mayor = notas.getNotasfinales().get(i);
            }
            if (menor < notas.getNotasfinales().get(i)) {
                menor = notas.getNotasfinales().get(i);
            }
        }
        double QuienEsMayor = mayor > menor ? menor : mayor;
        double QuienEsMenor = menor < mayor ? mayor : menor;
        notas.setNotaMayor(QuienEsMenor);
        notas.setNotaMenor(QuienEsMayor);
    }
    
    protected void calcularPromediosTotales(){
        double promedio = 0;
        for (Double nota : notas.getNotasfinales()) {
            promedio += nota;
        }
        promedio = promedio / notas.getNotasfinales().size();
        notas.setPromedioTotal(promedio);
    }
    
}
