/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package USUARIOS;

/**
 *
 * @author Andrew
 */
public class colaborador extends gerente {

    String fechaDeIngreso;
    String fechaDeRetiro;

    public colaborador() {
    }

    public colaborador(String fechaDeIngreso, String fechaDeRetiro, String usuario, String contraseña, String nombre, int edad, int numeroCelular) {
        super(usuario, contraseña, nombre, edad, numeroCelular);
        this.fechaDeIngreso = fechaDeIngreso;
        this.fechaDeRetiro = fechaDeRetiro;
    }

    public String getFechaDeIngreso() {
        return fechaDeIngreso;
    }

    public void setFechaDeIngreso(String fechaDeIngreso) {
        this.fechaDeIngreso = fechaDeIngreso;
    }

    public String getFechaDeRetiro() {
        return fechaDeRetiro;
    }

    public void setFechaDeRetiro(String fechaDeRetiro) {
        this.fechaDeRetiro = fechaDeRetiro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(int numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

}
