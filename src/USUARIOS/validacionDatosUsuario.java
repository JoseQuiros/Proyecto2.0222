/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package USUARIOS;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Andrew
 */
public class validacionDatosUsuario {
    //este metodo corresponde a validar datos de los clientes 
    public boolean validarUsuario(String nombreUsuario,String ruta){//el nombre de usuario y la ruta esta dada por parametros
    boolean existe = false;//boolean que va a indicar si los datos existes o no
        File file = new File(ruta);
        //se lee el archivo
        try {
            if (!file.exists()) {
                file.createNewFile();//si no existe el archivo lo crea
            }
            String cadena = "";
            FileReader fileR = new FileReader(file);
            BufferedReader buffReader = new BufferedReader(fileR);
            while ((cadena = buffReader.readLine()) != null) {
                if (cadena.indexOf(",") != -1) {
                    if (cadena.split(",")[0].equalsIgnoreCase(nombreUsuario)) {//lee en el campo 0 si el nombre que ingreso el usuario es igual al que esta contenido en el txt
                        System.out.println("Exists");
                        existe= true;//si entre en el if cambia el valor de existe a true
                    }
                }
            }
            fileR.close();
            buffReader.close();
        } catch (IOException e) {
        }
        return existe;
    }
    public boolean validarContraseña(String contraseña, String ruta){
        boolean existeContraseña=false;//boolen existeContraseña cambia si se encuentra la contraseña 
        File file = new File(ruta);

        try {
            if (!file.exists()) {
                file.createNewFile();//si no existe el archivo se crea
            }
            String cadena = "";
            FileReader fileR = new FileReader(file);
            BufferedReader buffReader = new BufferedReader(fileR);
            while ((cadena = buffReader.readLine()) != null) {
                if (cadena.indexOf(",") != -1) {
                    if (cadena.split(",")[1].equals(contraseña)) {//compares the password entered as a parameter with the ones already entered in the txt
                        System.out.println("Correct");
                        existeContraseña= true;
                    }
                }
            }
            buffReader.close();//se los buffeReader 
            fileR.close();
        } catch (IOException e) {
        }
        return existeContraseña;
    }
}
