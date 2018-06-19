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
    public boolean validarUsuario(String nombreUsuario,String ruta){
    boolean existe = false;
        File file = new File(ruta);

        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            String cadena = "";
            FileReader fileR = new FileReader(file);
            BufferedReader buffReader = new BufferedReader(fileR);
            while ((cadena = buffReader.readLine()) != null) {
                if (cadena.indexOf(",") != -1) {
                    if (cadena.split(",")[0].equalsIgnoreCase(nombreUsuario)) {//search the user int the txt and compare
                        System.out.println("Exists");
                        existe= true;
                    }
                }
            }
        } catch (IOException e) {
        }
        return existe;
    }
    public boolean validarContraseña(String contraseña, String ruta){
        boolean existeContraseña=false;
        File file = new File(ruta);

        try {
            if (!file.exists()) {
                file.createNewFile();
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
        } catch (IOException e) {
        }
        return existeContraseña;
    }
}
