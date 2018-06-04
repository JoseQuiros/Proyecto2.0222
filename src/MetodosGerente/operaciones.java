/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodosGerente;

import java.rmi.server.ObjID;
import USUARIOS.colaborador;

/**
 *
 * @author Jasson
 */
public interface operaciones {
    public void listadoEmpleados(rutasTxt rutaArchivo);
    public void reportesDeVentas(int tipoReporte, rutasTxt rutaArchivo);
    public int agregarEmpleado(colaborador nuevoColaborador, rutasTxt rutaArchivo);
    public void eliminarEmpleado();
    public boolean buscarEmpleado(String nombre, rutasTxt rutaArchivo);
}
