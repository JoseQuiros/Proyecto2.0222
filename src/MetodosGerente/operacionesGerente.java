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
    public void listadoEmpleados(rutasTxt rutaArchivo) {

        String[] columnas = {
            "Numbre:",
            "Edad:",
            "Celular",
            "Usuario",
            "Contraseña"
        };

        try {
            String ruta = String.valueOf(rutaArchivo);

            File file = new File(ruta);

            int cantidad = 0;

            FileReader R = new FileReader(file);

            BufferedReader buff = new BufferedReader(R);

            while ((buff.readLine()) != null) {
                cantidad++;
            }

            Object[][] data = new Object[cantidad][5];
            if (!file.exists()) {
                file.createNewFile();
            }

            String cadena = "";
            FileReader fileR = new FileReader(file);
            BufferedReader buffReader = new BufferedReader(fileR);

            int cantidadFilas = 0;

            while ((cadena = buffReader.readLine()) != null) {

                if (cadena.indexOf(",") != -1) {
                    //Convierte la línea en un vector separado por comas
                    data[cantidadFilas][0] = cadena.split(",")[0];
                    data[cantidadFilas][1] = cadena.split(",")[1];
                    data[cantidadFilas][2] = cadena.split(",")[2];
                    data[cantidadFilas][3] = cadena.split(",")[3];
                    data[cantidadFilas][4] = cadena.split(",")[4];
                }
                cantidadFilas++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int agregarEmpleado(colaborador nuevoColaborador) {
        String ruta = "";
        File file = new File(ruta);
        int insertado = 0;

        System.out.println("Creamos un FIleWriter");
        FileWriter flWriter = null;
        try {
            //crear el archivo en disco duro, 
            if (!file.exists()) {
                file.createNewFile();
            }

            flWriter = new FileWriter(file.getAbsoluteFile(), true);

            BufferedWriter brWriter = new BufferedWriter(flWriter);

            if (!buscarEmpleado(nuevoColaborador.getNombre())) {
                brWriter.write(
                        nuevoColaborador.getNombre() + ","
                        + nuevoColaborador.getEdad() + ","
                        + nuevoColaborador.getNumeroCelular() + ","
                        + nuevoColaborador.getUsuario() + ","
                        + nuevoColaborador.getContraseña()
                );
                brWriter.newLine();
                insertado = 1;
            }

            brWriter.close();
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        } finally {
            if (flWriter != null) {
                try {
                    flWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return insertado;
    }

    public void eliminarEmpleado(String nombreABorrar) {
      String ruta="colaborador.txt";
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
                String SnomAntiguo=inFile.getName();
                System.out.println("nombre del fichero inicial"+ SnomAntiguo);
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

    public static void BorrarFichero(File Ffichero) {
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
 public void renameArchivo(){
 
 
 
 
 
 }
    @Override
    public boolean buscarEmpleado(String nombre) {
        String ruta = "Trabajadores.txt";
        File file = new File(ruta);
        boolean encontrado = false;

        try {
            if (!file.exists()) {
                file.createNewFile();
            }

            String cadena = "";
            FileReader fileR = new FileReader(file);
            BufferedReader buffReader = new BufferedReader(fileR);
            while ((cadena = buffReader.readLine()) != null) {
                if (cadena.indexOf(",") != -1) {
                    if (cadena.split(",")[0].equalsIgnoreCase(nombre)) {
                        encontrado = true;
                    }
                }
                //System.out.println(cadena);
            }
            buffReader.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error");
        }

        return encontrado;
    }

    @Override
    public void eliminarEmpleado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
