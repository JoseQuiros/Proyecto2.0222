/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import USUARIOS.validacionDatos;
import USUARIOS.validacionDatosUsuario;
import vehiculo.bus;

/**
 *
 * @author Andrew
 */
public class menuLogin extends javax.swing.JFrame {

    /**
     * Creates new form menuLogin
     */
    public menuLogin() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonSalir = new javax.swing.JButton();
        imagenLogin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usuarioTextField = new javax.swing.JTextField();
        contraseñaTextField = new javax.swing.JPasswordField();
        iniciarSesion = new javax.swing.JButton();
        botonRegistro = new javax.swing.JButton();
        ImagenFondoLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonSalir.setBackground(new java.awt.Color(0, 0, 0));
        botonSalir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(255, 255, 255));
        botonSalir.setText("Salir");
        botonSalir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(botonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 363, 70, 30));

        imagenLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user_male2-128.png"))); // NOI18N
        getContentPane().add(imagenLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        usuarioTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(usuarioTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 130, -1));

        contraseñaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseñaTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(contraseñaTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 130, -1));

        iniciarSesion.setBackground(new java.awt.Color(0, 0, 0));
        iniciarSesion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        iniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        iniciarSesion.setText("Iniciar Sesión");
        iniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(iniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, -1, 30));

        botonRegistro.setBackground(new java.awt.Color(0, 0, 0));
        botonRegistro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonRegistro.setForeground(new java.awt.Color(255, 255, 255));
        botonRegistro.setText("Registrarse");
        botonRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistroActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, 30));

        ImagenFondoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo1.jpg"))); // NOI18N
        getContentPane().add(ImagenFondoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        System.exit(0);

    }//GEN-LAST:event_botonSalirActionPerformed

    private void usuarioTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioTextFieldActionPerformed

    private void contraseñaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseñaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contraseñaTextFieldActionPerformed

    private void iniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarSesionActionPerformed
        // TODO add your handling code here:
        this.dispose();
        validacionDatos validacion = new validacionDatos();
        String nombreUsuario = usuarioTextField.getText();
        String contraseña = contraseñaTextField.getText();
        if (nombreUsuario.equalsIgnoreCase("rolo")) {
            if (contraseña.equals("programacion")) {
                gerenteGUI gerente = new gerenteGUI();
                gerente.setVisible(true);
                gerente.setLocationRelativeTo(null);
                this.dispose();
                limpiar();
            }
        }
        if (validacion.validarUsuario(nombreUsuario, "colaborador.txt") == true) {
            System.out.println("usuario existe");
            if (validacion.validarContraseña(contraseña, "colaborador.txt") == true) {
                System.out.println("contraseña correcta");
                colaboradorGUI cola = new colaboradorGUI();
                cola.setVisible(true);
                cola.setLocationRelativeTo(null);
                this.dispose();
                limpiar();
            } else {
                System.out.println("EL usuario existe pero la contraseña es incorrecta");
            }
        } else {
            System.out.println("Usuario no existe en colaborador.txt");

        }
        validacionDatosUsuario validacionUsuario = new validacionDatosUsuario();
        if (validacionUsuario.validarUsuario(nombreUsuario, "Clientes.txt") == true) {
            System.out.println("usuario existe");
            if (validacionUsuario.validarContraseña(contraseña, "Clientes.txt") == true) {
                System.out.println("contraseña correcta");
                venderGUI venta = new venderGUI();
                venta.setVisible(true);
                venta.setLocationRelativeTo(null);
                limpiar();
            } else {
                System.out.println("EL usuario existe pero la contraseña es incorrecta");
            }
        } else {
            System.out.println("Usuario no existe en Clientes.txt");

        }


    }//GEN-LAST:event_iniciarSesionActionPerformed
    public void limpiar() {
        contraseñaTextField.setText("");
        usuarioTextField.setText("");

    }
    private void botonRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistroActionPerformed
        // TODO add your handling code here:
        this.dispose();
        int opcion=1;
        agregarCliente nuevoCliente = new agregarCliente(opcion);
        nuevoCliente.setVisible(true);
        nuevoCliente.setLocationRelativeTo(null);
    }//GEN-LAST:event_botonRegistroActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImagenFondoLogin;
    private javax.swing.JButton botonRegistro;
    private javax.swing.JButton botonSalir;
    private javax.swing.JPasswordField contraseñaTextField;
    private javax.swing.JLabel imagenLogin;
    private javax.swing.JButton iniciarSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField usuarioTextField;
    // End of variables declaration//GEN-END:variables

}
