/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Lab2
 */
public class diaBruja {
  
    private String tipoDulce, tipoDisfraz, tipoDecoracion, tipoFiesta;
    private int cantInvitados;

    public diaBruja() {
    }

    public diaBruja(String tipoDulce, String tipoDisfraz, String tipoDecoracion, String tipoFiesta, int cantInvitados) {
        this.tipoDulce = tipoDulce;
        this.tipoDisfraz = tipoDisfraz;
        this.tipoDecoracion = tipoDecoracion;
        this.tipoFiesta = tipoFiesta;
        this.cantInvitados = cantInvitados;
    }

    public String getTipoDulce() {
        return tipoDulce;
    }

    public void setTipoDulce(String tipoDulce) {
        this.tipoDulce = tipoDulce;
    }

    public String getTipoDisfraz() {
        return tipoDisfraz;
    }

    public void setTipoDisfraz(String tipoDisfraz) {
        this.tipoDisfraz = tipoDisfraz;
    }

    public String getTipoDecoracion() {
        return tipoDecoracion;
    }

    public void setTipoDecoracion(String tipoDecoracion) {
        this.tipoDecoracion = tipoDecoracion;
    }

    public String getTipoFiesta() {
        return tipoFiesta;
    }

    public void setTipoFiesta(String tipoFiesta) {
        this.tipoFiesta = tipoFiesta;
    }

    public int getCantInvitados() {
        return cantInvitados;
    }

    public void setCantInvitados(int cantInvitados) {
        this.cantInvitados = cantInvitados;
    }
    
    
    
}
