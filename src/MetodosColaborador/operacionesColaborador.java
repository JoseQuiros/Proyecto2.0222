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
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.io.PrintWriter;
import javax.swing.JOptionPane;

import vehiculo.bus;
import vehiculo.tren;

/**
 *
 * @author Jasson
 */
public class operacionesColaborador implements operacionColaborador {

    @Override
    public int agregarCliente(cliente nuevoCliente) {
        String ruta = "Clientes.txt";// se guarda la ruta de cliente en una variable
        File file = new File(ruta);// se crea un archivo con la ruta del string
        int insertado = 0;

        System.out.println("Creamos un FIleWriter");
        FileWriter flWriter = null;
        try {
            //crear el archivo en disco duro, 
            if (!file.exists()) {
                file.createNewFile();// si el archivo no existe se crea 
            }

            flWriter = new FileWriter(file.getAbsoluteFile(), true);// para escribir en el archivo 

            BufferedWriter brWriter = new BufferedWriter(flWriter);// lectura del archivo

            if (!buscarCliente(nuevoCliente.getUsuario())) {// si el cliente no existe se crea un nuevo cliente con su respectivo usuario y contraseña
                brWriter.write(nuevoCliente.getUsuario() + ","
                        + nuevoCliente.getContraseña()
                );
                brWriter.newLine();
                insertado = 1;// contador de clientes
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

    public void eliminarCliente(String lineaBorrar) {// metodo para eliminar cliente, se le pasa por parametro la linea respectiva con cliente,contraseña en la cadena
        String ruta = "Clientes.txt";//inicializa la ruta
        try {
            File inFile = new File(ruta);

            //Comprueba que exista un archivo con ese nombre en la dirección ingresada.
            if (!inFile.isFile()) {
                JOptionPane.showMessageDialog(null, "No hay un archivo en la ruta", "Ubicación incorrecta", JOptionPane.ERROR_MESSAGE);
                return;
            }

            //Crea el nuevo archivo que luego será renombrado como el nombre del archivo original.
            System.out.println("se crea un arhivo cliente");
            File tempFile = new File(inFile.getAbsolutePath() + ".tmp");//se crea un archivo temporal 
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

                if (!line.trim().equals(lineaBorrar)) {
                    pw.println(line);
                    pw.flush();
                }

            }
            pw.close();
            br.close();
//          
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

    public void eliminarBus(String lineaBorrar) {
        String ruta = "Unidades.txt";//se inicializa la ruta respectiva
        try {
            File inFile = new File(ruta);

            //Comprueba que exista un archivo con ese nombre en la dirección ingresada.
            if (!inFile.isFile()) {
                JOptionPane.showMessageDialog(null, "No hay un archivo en la ruta", "Ubicación incorrecta", JOptionPane.ERROR_MESSAGE);
                return;
            }

            //Crea el nuevo archivo que luego será renombrado como el nombre del archivo original.
            System.out.println("se crea un arhivo cliente");
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

                if (!line.trim().equals(lineaBorrar)) {
                    pw.println(line);
                    pw.flush();
                }

            }
            pw.close();
            br.close();
//          
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

    @Override
    public boolean buscarCliente(String nombre) {
        String ruta = "Clientes.txt";//se inicializa la ruta
        File file = new File(ruta);
        boolean encontrado = false;

        try {
            if (!file.exists()) {
                file.createNewFile();
            }

            String cadena = "";
            FileReader fileR = new FileReader(file);
            BufferedReader buffReader = new BufferedReader(fileR);
            while ((cadena = buffReader.readLine()) != null) {//busca linea por linea
                if (cadena.indexOf(",") != -1) {
                    if (cadena.split(",")[0].equalsIgnoreCase(nombre)) {// si la linea es igual a la cadena(nombre);
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

        return encontrado;// se retorna true or false 
    }

    @Override
    public boolean buscarRuta(String rutaIngresada) {
        String ruta = "RutasBusTren.txt";// se inicializa la ruta 
        File file = new File(ruta);
        boolean encontrado = false;

        try {
            if (!file.exists()) {// si el archivo no existe se crea
                file.createNewFile();
            }

            String cadena = "";
            FileReader fileR = new FileReader(file);
            BufferedReader buffReader = new BufferedReader(fileR);
            while ((cadena = buffReader.readLine()) != null) {
                if (cadena.equalsIgnoreCase(rutaIngresada)) {//se busca la ruta
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

    //se pasa por parametro una nueva ruta la cual se va agregar en el archivo RutasBusTren
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

    @Override

    public void eliminarCliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //metodo no utilizado, ignore XXX
    public int agregarUnidad(Object object, String tipo) {
        int opcion = 0;
        int insertado = 0;
        if (tipo == "Tren") {
            opcion = 1;
        }
        if (tipo == "Bus") {
            opcion = 2;
        }

        String ruta = "Unidades.txt";
        File file = new File(ruta);
        System.out.println("Creamos un FIleWriter");
        FileWriter flWriter = null;

        switch (opcion) {
            case 1:
                tren nuevoTren = (tren) object;
                try {
                    //crear el archivo en disco duro, 
                    if (!file.exists()) {
                        file.createNewFile();
                    }

                    flWriter = new FileWriter(file.getAbsoluteFile(), true);

                    BufferedWriter brWriter = new BufferedWriter(flWriter);

                    if (!buscarUnidad(nuevoTren.getId())) {
                        brWriter.write(tipo + ","
                                + nuevoTren.getId() + ","
                                + nuevoTren.getRutaAsignada() + ","
                                + nuevoTren.getHora() + ","
                                + nuevoTren.getAsientosOcupados());
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

                break;
            case 2:
                bus nuevoBus = (bus) object;
                try {
                    //crear el archivo en disco duro, 
                    if (!file.exists()) {
                        file.createNewFile();
                    }

                    flWriter = new FileWriter(file.getAbsoluteFile(), true);

                    BufferedWriter brWriter = new BufferedWriter(flWriter);

                    if (!buscarUnidad(nuevoBus.getId())) {
                        brWriter.write(tipo + ","
                                + nuevoBus.getId() + ","
                                + nuevoBus.getRutaAsignada() + ","
                                + nuevoBus.getHora() + ","
                                + nuevoBus.getAsientosOcupados());

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

                break;
            default:
                break;
        }
        return insertado;
    }
//metodo no utilizado

    @Override
    public boolean buscarUnidad(String id) {
        String ruta = "Unidades.txt";
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
                    if (cadena.split(",")[1].equalsIgnoreCase(id)) {
                        encontrado = true;
                    }
                }
            }
            buffReader.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error");
        }

        return encontrado;

    }

}
