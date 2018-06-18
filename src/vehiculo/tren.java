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
public class tren extends bus {

    public tren() {
    }

    public tren(String id, String rutaAsignada, int[] asientosOcupados) {
        super(id, rutaAsignada, asientosOcupados);
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

    public int[] getAsientosOcupados() {
        return asientosOcupados;
    }

    public void setAsientosOcupados(int[] asientosOcupados) {
        this.asientosOcupados = asientosOcupados;
    }



}
