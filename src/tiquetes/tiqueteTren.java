/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiquetes;

/**
 *
 * @author Jasson
 */
public class tiqueteTren {

    String ruta;
    String fecha;
    String hora;

    public tiqueteTren() {
    }

    public tiqueteTren(String ruta, String fecha, String hora) {
        this.ruta = ruta;
        this.fecha = fecha;
        this.hora = hora;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

}
