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
import java.io.FileReader;

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
    public void reportesDeVentas(int tipoReporte, rutasTxt rutaArchivo) {

    }

    @Override
    public int agregarEmpleado(colaborador nuevoColaborador, rutasTxt rutaArchivo) {
        String ruta = String.valueOf(rutaArchivo);
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

            if (!buscarEmpleado(nuevoColaborador.getNombre(), rutaArchivo)) {
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

    @Override
    public void eliminarEmpleado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean buscarEmpleado(String nombre, rutasTxt rutaArchivo) {
        String ruta = String.valueOf(rutaArchivo);
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
}
