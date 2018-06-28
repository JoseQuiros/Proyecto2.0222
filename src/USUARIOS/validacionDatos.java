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
public class validacionDatos {
    //ete metodo corresponde a validar los datos de el colaborador 
    public boolean validarUsuario(String nombreUsuario,String ruta){
    boolean existe = false;// esta variable va a cambiar a true si encuentra considencias en el txt colaborador
        File file = new File(ruta);

        try {
            if (!file.exists()) {//si no existe el archivo se crea 
                file.createNewFile();
            }
            String cadena = "";
            FileReader fileR = new FileReader(file);//se crea un archivo con la ruta del file
            BufferedReader buffReader = new BufferedReader(fileR);
            while ((cadena = buffReader.readLine()) != null) {//este while va a seguir hasta que la linea sea distinta a null
                if (cadena.indexOf(",") != -1) {
                    if (cadena.split(",")[1].equalsIgnoreCase(nombreUsuario)) {//busca en colaborador si lo que esta en el espacio 2 es iguala l nombre de usuario que se ingreso
                        System.out.println("Exists");
                        existe= true;//si entra en en el if existe se le asina a true 
                    }
                }
            }
            buffReader.close();
            fileR.close();
        } catch (IOException e) {
        }
        return existe;//retorna el valor de existe ya sea false o true
    }
    public boolean validarContraseña(String contraseña, String ruta){
        boolean existeContraseña=false;//una boolean que cambia de valor si encuentra la contraseña
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
                    if (cadena.split(",")[2].equalsIgnoreCase(contraseña)) {//compara la contraseña que a sido ingresada en el txfield 
                        System.out.println("Correct");
                        existeContraseña= true;//si encuentra la contraseña lo deja ingresar
                    }
                }
            }
            buffReader.close();
            fileR.close();
        } catch (IOException e) {
        }
        return existeContraseña;
    }
}
