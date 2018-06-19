/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodosGerente;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import USUARIOS.colaborador;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Jasson
 */
public class operacionesGerente implements operaciones {

    @Override
    public void eliminarEmpleado(String nombreABorrar) {
        String ruta = "colaborador.txt";
        try {
            File inFile = new File(ruta);

            //Comprueba que exista un archivo con ese nombre en la dirección ingresada.
            if (!inFile.isFile()) {
                JOptionPane.showMessageDialog(null, "No hay un archivo en la ruta", "Ubicación incorrecta", JOptionPane.ERROR_MESSAGE);
                return;
            }

            //Crea el nuevo archivo que luego será renombrado como el nombre del archivo original.
            File tempFile = new File(inFile.getAbsolutePath() + ".tmp");//
            BufferedReader br = new BufferedReader(new FileReader(ruta));
            PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
            String line = null;

            //Lee del archivo original y escribe en el nuevo
            //excepto la línea que se quiere borrar.
            while ((line = br.readLine()) != null) {
                /*
            * El método trim() devuelve una copia de una cadena 
            * con espacios en blanco iniciales y finales eliminados, 
            * o la misma cadena si no tiene espacios en blanco iniciales
            * o finales.
                 */

                if (!line.trim().equals(nombreABorrar)) {
                    pw.println(line);
                    pw.flush();
                }

            }
            pw.close();
            br.close();
//            inFile.delete();
//
//            if (!inFile.delete()) {
//                JOptionPane.showMessageDialog(null, "No se puedo borrar el archivo", "Error de archivos", JOptionPane.ERROR_MESSAGE);
//                return;
//            }
//          

//            Le asigna al nuevo archivo el nombre que tenía el anterior
//            if (!tempFile.renameTo(inFile)) {
//                JOptionPane.showMessageDialog(null, "No fue posible cambiarle el nombre al nuevo archivo", "Error de archivos", JOptionPane.ERROR_MESSAGE);
//            }
            /*Obtengo el nombre del fichero inicial*/
            String SnomAntiguo = inFile.getName();
            System.out.println("nombre del fichero inicial" + SnomAntiguo);
            /*Borro el fichero inicial*/
            BorrarFichero(inFile);
            /*renombro el nuevo fichero con el nombre del fichero inicial*/
            tempFile.renameTo(inFile);

            /*Cierro el flujo de lectura*/
            br.close();

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void BorrarFichero(File Ffichero) {
        try {
            /*Si existe el fichero*/
            if (Ffichero.exists()) {
                /*Borra el fichero*/
                Ffichero.delete();
                System.out.println("Fichero Borrado con Exito");
            } else {
                System.out.println("Fichero no pudo ser borrado");
            }
        } catch (Exception ex) {
            /*Captura un posible error y le imprime en pantalla*/
            System.out.println(ex.getMessage());
        }
    }
}
