/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodosColaborador;

import USUARIOS.cliente;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Jasson
 */
public class operacionesColaborador implements operacionColaborador {

    @Override
    public int agregarCliente(cliente nuevoCliente) {
        String ruta = "Clientes.txt";
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

            if (!buscarCliente(nuevoCliente.getUsuario())) {
                brWriter.write(nuevoCliente.getUsuario() + ","
                        + nuevoCliente.getContraseña()
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
    public void eliminarCliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean buscarCliente(String nombre) {
        String ruta = "Clientes.txt";
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
    public boolean buscarRuta(String rutaIngresada) {
        String ruta = "RutasBusTren.txt";
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
                if (cadena.equalsIgnoreCase(rutaIngresada)) {
                    encontrado = true;
                }
                System.out.println(cadena);
            }
            buffReader.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error");
        }

        return encontrado;
    }

    @Override
    public int agregarRuta(String nuevaRuta) {
        String ruta = "RutasBusTren.txt";
        int insertado = 0;
        File file = new File(ruta);

        System.out.println("Creamos un FIleWriter");
        FileWriter flWriter = null;
        try {
            //crear el archivo en disco duro, 
            if (!file.exists()) {
                file.createNewFile();
            }

            flWriter = new FileWriter(file.getAbsoluteFile(), true);

            BufferedWriter brWriter = new BufferedWriter(flWriter);

            if (!buscarRuta(nuevaRuta)) {
                brWriter.write(nuevaRuta);
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

}
