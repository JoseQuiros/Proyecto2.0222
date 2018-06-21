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
    public void EcribirFichero(File Ffichero,String SCadena){
        try {
                //Si no Existe el fichero lo crea
                if(!Ffichero.exists()){
                     Ffichero.createNewFile();
                }
               //Abre un Flujo de escritura,sobre el fichero con codificacion utf-8. Ademas   en
               //el pedazo de sentencia "FileOutputStream(Ffichero,true)", true es por si existe el fichero
               //segir añadiendo texto y no borrar lo que tenia 
                BufferedWriter Fescribe=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(Ffichero,true), "utf-8"));
                //Escribe en el fichero la cardena que recibe la funcion. la cadena "\r\n" significa salto de linea
                Fescribe.write(SCadena + "\r\n");
                //Cierra el flujo de escritura
                Fescribe.close();
            } catch (Exception ex) {
               //Captura un posible error y le imprime en pantalla 
               System.out.println(ex.getMessage());
            }
        
    }
     public void ModificarFichero(String Satigualinea,String Snuevalinea){    
          String ruta = "Unidades.txt";
       
            File FficheroAntiguo = new File(ruta);

            //Comprueba que exista un archivo con ese nombre en la dirección ingresada.
            if (!FficheroAntiguo.isFile()) {
                JOptionPane.showMessageDialog(null, "No hay un archivo en la ruta", "Ubicación incorrecta", JOptionPane.ERROR_MESSAGE);
                return;
            }
        //+10
        /*Obtengo un numero aleatorio*/
        Random numaleatorio= new Random(3816L); 
        /*Creo un nombre para el nuevo fichero apartir del
         *numero aleatorio*/
           File FficheroNuevo = new File(FficheroAntiguo.getAbsolutePath() + ".tmp");//
     
        try {
            /*Si existe el fichero inical*/
            if(FficheroAntiguo.exists()){
                /*Abro un flujo de lectura*/
                BufferedReader Flee= new BufferedReader(new FileReader(FficheroAntiguo));
                String Slinea;
                /*Recorro el fichero de texto linea a linea*/
                while((Slinea=Flee.readLine())!=null) { 
                    /*Si la linea obtenida es igual al la bucada
                     *para modificar*/
                    if (Slinea.toUpperCase().trim().equals(Satigualinea.toUpperCase().trim())) {
                        /*Escribo la nueva linea en vez de la que tenia*/
                         EcribirFichero(FficheroNuevo,Snuevalinea);
                    }else{
                        /*Escribo la linea antigua*/
                         EcribirFichero(FficheroNuevo,Slinea);
                    }             
                }
                /*Obtengo el nombre del fichero inicial*/
                String SnomAntiguo=FficheroAntiguo.getName();
                /*Borro el fichero inicial*/
                
            System.out.println("nombre del fichero inicial" + SnomAntiguo);
            /*Borro el fichero inicial*/
            BorrarFichero(FficheroAntiguo);
            /*renombro el nuevo fichero con el nombre del fichero inicial*/
            FficheroNuevo.renameTo(FficheroAntiguo);
            }else{
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
      
     
}

