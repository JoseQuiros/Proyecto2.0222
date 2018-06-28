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
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Jasson
 */
public class operacionesGerente implements operaciones {

    int cantidad = 0;

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

    public void EcribirFichero(File Ffichero, String SCadena) {
        try {
            //Si no Existe el fichero lo crea
            if (!Ffichero.exists()) {
                Ffichero.createNewFile();
            }
            //Abre un Flujo de escritura,sobre el fichero con codificacion utf-8. Ademas   en
            //el pedazo de sentencia "FileOutputStream(Ffichero,true)", true es por si existe el fichero
            //segir añadiendo texto y no borrar lo que tenia 
            BufferedWriter Fescribe = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(Ffichero, true), "utf-8"));
            //Escribe en el fichero la cardena que recibe la funcion. la cadena "\r\n" significa salto de linea
            Fescribe.write(SCadena + "\r\n");
            //Cierra el flujo de escritura
            Fescribe.close();
        } catch (Exception ex) {
            //Captura un posible error y le imprime en pantalla 
            System.out.println(ex.getMessage());
        }

    }

    public void ModificarFichero(String Satigualinea, String Snuevalinea) {
        /**
         * este metodo fue llamado por venderGUI el cual este va a llamar a leerReporteDiario
         * */
        String ruta = "Unidades.txt";

        File FficheroAntiguo = new File(ruta);

        //Comprueba que exista un archivo con ese nombre en la dirección ingresada.
        if (!FficheroAntiguo.isFile()) {
            JOptionPane.showMessageDialog(null, "No hay un archivo en la ruta", "Ubicación incorrecta", JOptionPane.ERROR_MESSAGE);
            return;
        }
        //+10
        /*Creo un nombre para el nuevo fichero apartir del
         *numero aleatorio*/
        File FficheroNuevo = new File(FficheroAntiguo.getAbsolutePath() + ".tmp");//

        try {
            /*Si existe el fichero inical*/
            if (FficheroAntiguo.exists()) {
                /*Abro un flujo de lectura*/
                BufferedReader Flee = new BufferedReader(new FileReader(FficheroAntiguo));
                String Slinea;
                /*Recorro el fichero de texto linea a linea*/
                while ((Slinea = Flee.readLine()) != null) {

                    cantidad = cantidad + Integer.parseInt(Slinea.split(",")[4]);

                    /*Si la linea obtenida es igual al la bucada
                     *para modificar*/
                    if (Slinea.toUpperCase().trim().equals(Satigualinea.toUpperCase().trim())) {
                        /*Escribo la nueva linea en vez de la que tenia*/
                        EcribirFichero(FficheroNuevo, Snuevalinea);
                    } else {
                        /*Escribo la linea antigua*/
                        EcribirFichero(FficheroNuevo, Slinea);
                    }
                }
                Flee.close();
                cantidad++;
                agregarReportesDiarios(cantidad);

                /*Obtengo el nombre del fichero inicial*/
                String SnomAntiguo = FficheroAntiguo.getName();
                /*Borro el fichero inicial*/

                System.out.println("nombre del fichero inicial" + SnomAntiguo);
                /*Borro el fichero inicial*/
                BorrarFichero(FficheroAntiguo);
                /*renombro el nuevo fichero con el nombre del fichero inicial*/
                FficheroNuevo.renameTo(FficheroAntiguo);
                String nombreFicheroNuevo = FficheroNuevo.getName();
                System.out.println(nombreFicheroNuevo);
            } else {
                System.out.println("Fichero No Existe");
            }

        } catch (Exception ex) {
            /*Captura un posible error y le imprime en pantalla*/
            System.out.println(ex.getMessage());
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

    public void agregarReportesDiarios(int cantidadTiquetes) {
        /*
            este metodo agrega un txt diario que va a tener las compras de este dia 
        */
        Calendar c = new GregorianCalendar();//se utiliza la libreria calendar para tomar la fecha de la computadora
        int dia = c.get(Calendar.DATE);//obtengo el dia
        int mes = c.get(Calendar.MONTH);//obtengo mes
        mes++;//aumento el mes debido a que al obtner el mes se empiezan en 0 
        String fecha = "";
        String stringDiarios = String.valueOf(dia + "/" + mes);//crea un string diario
        String ruta = "diario.txt";
        File file = new File(ruta);

        System.out.println("Creamos un FIleWriter");
        FileWriter flWriter = null;
        try {
            //crear el archivo txt 
            if (!file.exists()) {
                file.createNewFile();
            }

            System.out.println("Inicializamos el flWriter");
            flWriter = new FileWriter(file);

            System.out.println("Creamos un BufferedWriter");
            BufferedWriter brWriter = new BufferedWriter(flWriter);
            fecha = stringDiarios + "," + cantidadTiquetes;//a fecha se le asigna el stringDiarios con la cantidad de tiquetes 
            System.out.println("dentro de for");

            brWriter.write(fecha);

            System.out.println("saliendo");

            brWriter.newLine();

            System.out.println("Cerramos conexion");
            leerReporteSemanal(fecha);
            brWriter.close();

        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }

    }

    public void leerReporteSemanal(String fecha) {
        /*
            este metodo lee el txt semanal para asi poder asignar dos cadenas,una cadena con los valores
            que tiene el txt y la otra cadena con los datos que se le van a asignar
        */
        String ruta = "semanal.txt";
        File file = new File(ruta);
        int totalTiquetesVendidos = sumaTiquetesSemanales();//se llama al metodo que retorna la cantidad de tiquetes que hay ene el txt semanal
        int contadorSemanal = 0;
        boolean band = false;
        try {
            if (!file.exists()) {
                file.createNewFile();
            }

            String cadena = "";
            String nuevaCadena = "";
            String cadenaBorrar = "";
            FileReader fileR = new FileReader(file);
            BufferedReader buffReader = new BufferedReader(fileR);

            //Aqui lo que se hace es obtener una cadena de la linea en la que el numero de asientos decrece
            // Se obtiene una cadena que es la  que se va a modificar en el archivo de texto
            while ((cadena = buffReader.readLine()) != null) {
                contadorSemanal++;//lleva las cuentas de las lineas,cada linea equivale a un dia diferente
                if (cadena.split(",")[0].equalsIgnoreCase(fecha.split(",")[0])) {
                    nuevaCadena = fecha;//nueva cadena va a tener lo de fecha 
                    cadenaBorrar = cadena;
                    System.out.println(nuevaCadena);
                    System.out.println(cadenaBorrar);
                    band = true;//esta bandera se vuele true si entra en el if

                }
            }
            System.out.println("el totoal de tiquetes antes de pasar a mensual " + totalTiquetesVendidos);
            if (band == false) {//si band es false, quiere decir que no encontro considencias dentro del txt
                                //por lo tanto se procede a escribir un txt semanal 
                escribirReporteSemanal(fecha);
            }
            fileR.close();
            generarReporteSemanal(cadenaBorrar, nuevaCadena);//despues de que se lee se genera el reporte con los nuevos datos
            buffReader.close();

            if (contadorSemanal >= 7) {//como una semana tiene 7 dias se asigna un contador que cuenta las lineas del txt
                System.out.println("se borrara el fichero semanal");
                leerReporteMensual(totalTiquetesVendidos);//cuando entra en este if se escribe en el txt mensual
                                                          
                BorrarFichero(file);//borra el archivo semanal.txt por que ya la semana termino
                escribirReporteSemanal(fecha);//se vuelve a crear para no perder el ultimo valor 
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error");
        }

    }

    public void escribirReporteSemanal(String datos) {
        //escribe en el txt semanal 
        String ruta = "semanal.txt";
        File file = new File(ruta);

        System.out.println("Creamos un FIleWriter semanal");
        FileWriter flWriter = null;
        try {
             
            if (!file.exists()) {
                file.createNewFile();
            }
            flWriter = new FileWriter(file, true);

            BufferedWriter brWriter = new BufferedWriter(flWriter);
            brWriter.write(datos);
            brWriter.newLine();
            System.out.println("Cerramos conexion semanal");

            brWriter.close();

        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }

    }

    public void generarReporteSemanal(String Satigualinea, String Snuevalinea) throws IOException {
        /*
        este metodo actualiza la informacion nueva al txt semanal , el cual recive dos String 
        uno con la infromacion nueva y otra con la informacion vieja
        */
        String ruta = "semanal.txt";

        File FficheroAntiguo = new File(ruta);

        //Comprueba que exista un archivo con ese nombre en la dirección ingresada.
        if (!FficheroAntiguo.isFile()) {
            JOptionPane.showMessageDialog(null, "No hay un archivo en la ruta", "Ubicación incorrecta", JOptionPane.ERROR_MESSAGE);
            return;
        }

        File FficheroNuevo = new File(FficheroAntiguo.getAbsolutePath() + ".tmp");//

        try {
            /*Si existe el fichero inical*/
            if (FficheroAntiguo.exists()) {
                /*Abro un flujo de lectura*/
                BufferedReader Flee = new BufferedReader(new FileReader(FficheroAntiguo));
                String Slinea;
                /*Recorro el fichero de texto linea a linea*/
                while ((Slinea = Flee.readLine()) != null) {

                    /*Si la linea obtenida es igual al la bucada
                     *para modificar*/
                    if (Slinea.toUpperCase().trim().equals(Satigualinea.toUpperCase().trim())) {
                        /*Escribo la nueva linea en vez de la que tenia*/
                        EcribirFichero(FficheroNuevo, Snuevalinea);
                    } else {
                        /*Escribo la linea antigua*/
                        EcribirFichero(FficheroNuevo, Slinea);
                    }
                }
                Flee.close();


                /*Obtengo el nombre del fichero inicial*/
                String SnomAntiguo = FficheroAntiguo.getName();
                /*Borro el fichero inicial*/

                System.out.println("nombre del fichero inicial" + SnomAntiguo);
                /*Borro el fichero inicial*/
                BorrarFichero(FficheroAntiguo);
                /*renombro el nuevo fichero con el nombre del fichero inicial*/
                FficheroNuevo.renameTo(FficheroAntiguo);
                String nombreFicheroNuevo = FficheroNuevo.getName();
                System.out.println(nombreFicheroNuevo);
            } else {
                System.out.println("Fichero No Existe");
            }
        } catch (Exception ex) {
            /*Captura un posible error y le imprime en pantalla*/
            System.out.println(ex.getMessage());
        }

    }

    public void leerReporteMensual(int totalTiquetes) {
        //aqui se lee el txt mensual
        String ruta = "mensual.txt";
        File file = new File(ruta);
        Calendar c = new GregorianCalendar();
        int mes = c.get(Calendar.MONTH);
        mes++;//se aumenta el mes ya que .MONTH retorna los numeros de meses empezando en cero
        int total = 0;
        boolean band = false;
        try {
            if (!file.exists()) {
                file.createNewFile();
            }

            String cadena = "";
            String nuevaCadena = "";
            String cadenaBorrar = "";
            FileReader fileR = new FileReader(file);
            BufferedReader buffReader = new BufferedReader(fileR);

            //Aqui lo que se hace es obtener una cadena de la linea en la que el numero de asientos decrece
            // Se obtiene una cadena que es la  que se va a modificar en el archivo de texto
            while ((cadena = buffReader.readLine()) != null) {

                if (cadena.split(",")[0].equalsIgnoreCase(String.valueOf(mes))) {//si lo que esta en la primer posicion del mes es igual al mes
                                                                                //significa que es la misma linea por tanto tiene que cambiar los datos
                    total = totalTiquetes + Integer.parseInt(cadena.split(",")[1]);
                    nuevaCadena = mes + "," + total;//se deja una cadena con los datos nuevos que va a tener actualizados el total de tiquetes
                    cadenaBorrar = cadena;//la cadena vieja va a tener lo que tenia el txt originalmente
                    band = true;
                }
            }
            if (band == false) {//si es false significa que no entro en el if
                escribirReporteMensual(mes, totalTiquetes);//se escribe el txt mensual
            }
            fileR.close();
            generarReporteMensual(cadenaBorrar, nuevaCadena);//genera un txt con la informacion nueva
            buffReader.close();

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error");
        }

    }

    public void escribirReporteMensual(int mes, int totaltiquetes) {
        //escribe y crea un txt mensual 
        String ruta = "mensual.txt";
        File file = new File(ruta);

        System.out.println("Creamos un FIleWriter semanal");
        FileWriter flWriter = null;
        try {
            //crear el archivo en disco duro, 
            if (!file.exists()) {
                file.createNewFile();
            }
            flWriter = new FileWriter(file, true);

            BufferedWriter brWriter = new BufferedWriter(flWriter);
            brWriter.write(mes + "," + totaltiquetes);
            brWriter.newLine();
            System.out.println("Cerramos conexion semanal");

            brWriter.close();

        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }

    }

    public void generarReporteMensual(String Satigualinea, String Snuevalinea) {
       /*
        este metodo actualiza la informacion nueva al txt mensual , el cual recive dos String 
        uno con la infromacion nueva y otra con la informacion vieja
        */
        String ruta = "mensual.txt";

        File FficheroAntiguo = new File(ruta);

        //Comprueba que exista un archivo con ese nombre en la dirección ingresada.
        if (!FficheroAntiguo.isFile()) {
            JOptionPane.showMessageDialog(null, "No hay un archivo en la ruta", "Ubicación incorrecta", JOptionPane.ERROR_MESSAGE);
            return;
        }

        File FficheroNuevo = new File(FficheroAntiguo.getAbsolutePath() + ".tmp");//se crea un temporal

        try {
            /*Si existe el fichero inical*/
            if (FficheroAntiguo.exists()) {
                /*Abro un flujo de lectura*/
                BufferedReader Flee = new BufferedReader(new FileReader(FficheroAntiguo));
                String Slinea;
                /*Recorro el fichero de texto linea a linea*/
                while ((Slinea = Flee.readLine()) != null) {

                    /*Si la linea obtenida es igual al la bucada
                     *para modificar*/
                    if (Slinea.toUpperCase().trim().equals(Satigualinea.toUpperCase().trim())) {
                        /*Escribo la nueva linea en vez de la que tenia*/
                        EcribirFichero(FficheroNuevo, Snuevalinea);
                    } else {
                        /*Escribo la linea antigua*/
                        EcribirFichero(FficheroNuevo, Slinea);
                    }
                }
                Flee.close();


                /*Obtengo el nombre del fichero inicial*/
                String SnomAntiguo = FficheroAntiguo.getName();
                /*Borro el fichero inicial*/

                System.out.println("nombre del fichero inicial" + SnomAntiguo);
                /*Borro el fichero inicial*/
                BorrarFichero(FficheroAntiguo);
                /*renombro el nuevo fichero con el nombre del fichero inicial*/
                FficheroNuevo.renameTo(FficheroAntiguo);
                String nombreFicheroNuevo = FficheroNuevo.getName();
                System.out.println(nombreFicheroNuevo);
            } else {
                System.out.println("Fichero No Existe");
            }
        } catch (Exception ex) {
            /*Captura un posible error y le imprime en pantalla*/
            System.out.println(ex.getMessage());
        }

    }

    public int sumaTiquetesSemanales() {
        /*
            este metodo va a retornar un entero con el numero total de tiquetes 
            el cual va a recorrer todo el txt semanal y va a concatenar lo que tiene la ultima posicion de cada
            linea en una variable el cual se a retornar
        */
        String ruta = "semanal.txt";
        File file = new File(ruta);
        int total = 0;

        try {
            if (!file.exists()) {
                file.createNewFile();
            }

            String cadena = "";
            FileReader fileR = new FileReader(file);
            BufferedReader buffReader = new BufferedReader(fileR);
            while ((cadena = buffReader.readLine()) != null) {
                total = total + Integer.parseInt(cadena.split(",")[1]);//total se le deja lo que tiene mas lo que esta en la ultima posicion de la linea
                //System.out.println(cadena);
            }
            buffReader.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error");
        }

        return total;
    }

}
