/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodosColaborador;

import USUARIOS.cliente;
import USUARIOS.colaborador;

/**
 *
 * @author Jasson
 */
public interface operacionColaborador {

    public int agregarCliente(cliente nuevoCliente);

    public void eliminarCliente();

    public boolean buscarCliente(String nombre);

    public int agregarRuta(String nuevaRuta);

    public boolean buscarRuta(String nombre);

    public int agregarUnidad(Object object, String tipo);

    public boolean buscarUnidad(String id);

}
