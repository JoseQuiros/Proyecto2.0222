/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculo;

/**
 *
 * @author Andrew
 */
public class bus {

    String id;
    String rutaAsignada;
    

    public bus() {
    }

    public bus(String id, String rutaAsignada) {
        this.id = id;
        this.rutaAsignada = rutaAsignada;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRutaAsignada() {
        return rutaAsignada;
    }

    public void setRutaAsignada(String rutaAsignada) {
        this.rutaAsignada = rutaAsignada;
    }
    

}
