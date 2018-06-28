/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodosGerente;

import java.rmi.server.ObjID;
import USUARIOS.colaborador;
import java.io.File;

/**
 *
 * @author Jasson
 */
public interface operaciones {

    public void BorrarFichero(File Ffichero);

    public void eliminarEmpleado(String nombreABorrar);
    
}
