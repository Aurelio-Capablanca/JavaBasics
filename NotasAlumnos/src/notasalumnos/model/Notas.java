/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notasalumnos.model;

import java.util.ArrayList;

/**
 *
 * @author adalb
 */
public class Notas {

    private final ArrayList<Double> notasfinales = new ArrayList<>();
    private final ArrayList<String> mensajeFinal = new ArrayList<>();

    private int excelentes = 0;
    private int reprobados = 0;
    private int bueno = 0;
    private int regular = 0;
    private int necesitaMejorar = 0;
    private int necesitaUnMilagro = 0;

    private int cantidadReprobados;
    private int cantidadAprobados;

    private double NotaMayor;
    private double NotaMenor;
    
    private double promedioTotal;
    private double promedioAprobados;
    private double promedioReprobados;

    public double getPromedioTotal() {
        return promedioTotal;
    }

    public void setPromedioTotal(double promedioTotal) {
        this.promedioTotal = promedioTotal;
    }

    public double getPromedioAprobados() {
        return promedioAprobados;
    }

    public void setPromedioAprobados(double promedioAprobados) {
        this.promedioAprobados = promedioAprobados;
    }

    public double getPromedioReprobados() {
        return promedioReprobados;
    }

    public void setPromedioReprobados(double promedioReprobados) {
        this.promedioReprobados = promedioReprobados;
    }

    public ArrayList<String> getMensajeFinal() {
        return mensajeFinal;
    }

    public void setMensajeFinal(String mensajeFinal) {
        this.mensajeFinal.add(mensajeFinal);
    }

    public ArrayList<Double> getNotasfinales() {
        return notasfinales;
    }

    public void setNotasfinales(double nota) {
        this.notasfinales.add(nota);
    }

    public int getExcelentes() {
        return excelentes;
    }

    public void setExcelentes(int excelentes) {
        this.excelentes = excelentes;
    }

    public int getReprobados() {
        return reprobados;
    }

    public void setReprobados(int reprobados) {
        this.reprobados = reprobados;
    }

    public int getBueno() {
        return bueno;
    }

    public void setBueno(int bueno) {
        this.bueno = bueno;
    }

    public int getRegular() {
        return regular;
    }

    public void setRegular(int regular) {
        this.regular = regular;
    }

    public int getNecesitaMejorar() {
        return necesitaMejorar;
    }

    public void setNecesitaMejorar(int necesitaMejorar) {
        this.necesitaMejorar = necesitaMejorar;
    }

    public int getNecesitaUnMilagro() {
        return necesitaUnMilagro;
    }

    public void setNecesitaUnMilagro(int necesitaUnMilagro) {
        this.necesitaUnMilagro = necesitaUnMilagro;
    }

    public int getCantidadReprobados() {
        return cantidadReprobados;
    }

    public void setCantidadReprobados(int cantidadReprobados) {
        this.cantidadReprobados = cantidadReprobados;
    }

    public int getCantidadAprobados() {
        return cantidadAprobados;
    }

    public void setCantidadAprobados(int cantidadAprobados) {
        this.cantidadAprobados = cantidadAprobados;
    }

    public double getNotaMayor() {
        return NotaMayor;
    }

    public void setNotaMayor(double NotaMayor) {
        this.NotaMayor = NotaMayor;
    }

    public double getNotaMenor() {
        return NotaMenor;
    }

    public void setNotaMenor(double NotaMenor) {
        this.NotaMenor = NotaMenor;
    }

}
