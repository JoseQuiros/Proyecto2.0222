/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import MetodosGerente.operacionesGerente;
import USUARIOS.colaborador;

/**
 *
 * @author Jose
 */
public class Gui extends javax.swing.JFrame {

    DefaultTableModel modelo;//se crea un modelo para poder manejar jtablel
    private String ruta = "colaborador.txt";
    private File file = new File(ruta);

    public Gui() throws IOException {
        initComponents();

        modelo = new DefaultTableModel();
        tabla.setModel(modelo);
        // se añaden las columnas al Table
        modelo.addColumn("Nombre");

        modelo.addColumn("Id");

        modelo.addColumn("Contraseña");

        modelo.addColumn("Sexo");

        modelo.addColumn("Telefono");

        if (!file.exists()) {

            try {
                if (!file.exists()) {//si no esta el archivo se crea

                    file.createNewFile();
                }
                String ruta = "colaborador.txt";
                File file = new File(ruta);
                String cadena = "";
                FileReader fr = new FileReader("colaborador.txt");
                int lNumeroLineas = 0;

                BufferedReader bf = new BufferedReader(fr);
                while ((cadena = bf.readLine()) != null) {
                    lNumeroLineas++;
                }
                bf.close();
                Object[] data = new Object[lNumeroLineas];

                cadena = "";
                FileReader fileR = new FileReader(file);
                BufferedReader buffReader = new BufferedReader(fileR);

                int cantidadFilas = 0;

                //llenamos el Jtable
                while ((cadena = buffReader.readLine()) != null) {
                    if (cadena.indexOf(",") != -1) {

                        Object[] object = new Object[6];

                        object[0] = cadena.split(",")[0];

                        object[1] = cadena.split(",")[1];

                        object[2] = cadena.split(",")[2];

                        object[3] = cadena.split(",")[3];

                        object[4] = cadena.split(",")[4];

                        modelo.addRow(object);
                    }
                    //System.out.println(cadena);
                    cantidadFilas++;
                }
                buffReader.close();
                fileR.close();
            } catch (IOException ex) {
                System.out.println("upps algo salio mal" + ex);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldTelefono = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldContraseña = new javax.swing.JTextField();
        jButtonGuardar = new javax.swing.JButton();
        jTextFieldSNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldPUsuario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxSexo = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jButtonEliminar = new javax.swing.JButton();
        jButton1_salir = new javax.swing.JButton();
        jButtonEliminar1 = new javax.swing.JButton();
        jButton1_salir1 = new javax.swing.JButton();
        jTextFieldSNombre1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldPUsuario1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxSexo1 = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldTelefono1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldContraseña1 = new javax.swing.JTextField();
        jButtonGuardar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("    Telefono");
        jLabel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextFieldTelefono.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("  Contraseña");
        jLabel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextFieldContraseña.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextFieldContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldContraseñaActionPerformed(evt);
            }
        });

        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jTextFieldSNombre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextFieldSNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldSNombreKeyTyped1(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("       Nombre");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("       Usuario");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextFieldPUsuario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("       Sexo");
        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jComboBoxSexo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Femenino" }));

        jScrollPane1.setForeground(new java.awt.Color(102, 102, 102));

        tabla.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jButton1_salir.setText("Salir");
        jButton1_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldPUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldSNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jTextFieldContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(jButton1_salir)
                .addGap(244, 244, 244))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldSNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldPUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1_salir)
                    .addComponent(jButtonEliminar))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jButtonEliminar1.setText("Eliminar");
        jButtonEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jButton1_salir1.setText("Salir");
        jButton1_salir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_salirActionPerformed(evt);
            }
        });

        jTextFieldSNombre1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldSNombreKeyTyped(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre");
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setText("Usuario");
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextFieldPUsuario1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldPUsuarioKeyTyped(evt);
            }
        });

        jLabel7.setText("Sexo");
        jLabel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jComboBoxSexo1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Femenino" }));

        jLabel10.setText("Telefono");
        jLabel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextFieldTelefono1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldTelefonoKeyTyped(evt);
            }
        });

        jLabel11.setText("Contraseña");
        jLabel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextFieldContraseña1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldContraseñaActionPerformed(evt);
            }
        });
        jTextFieldContraseña1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldContraseñaKeyTyped(evt);
            }
        });

        jButtonGuardar1.setText("Guardar");
        jButtonGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed

        int fila = tabla.getSelectedRow();

        String lineaBorrar = (tabla.getValueAt(fila, 0).toString()) + ",";
        lineaBorrar = lineaBorrar + (tabla.getValueAt(fila, 1).toString()) + ",";
        lineaBorrar = lineaBorrar + (tabla.getValueAt(fila, 2).toString()) + ",";
        lineaBorrar = lineaBorrar + (tabla.getValueAt(fila, 3).toString()) + ",";
        lineaBorrar = lineaBorrar + (tabla.getValueAt(fila, 4).toString());

//        lineaBorrar = lineaBorrar + (tabla.getValueAt(fila, 5).toString());
        operacionesGerente op = new operacionesGerente();
        op.eliminarEmpleado(lineaBorrar);

        if (fila != -1) {
            modelo.removeRow(fila);
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila");

        }


    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed

        Object[] object = new Object[5];

        object[0] = jTextFieldSNombre.getText();

        object[1] = jTextFieldPUsuario.getText();

        object[2] = jTextFieldContraseña.getText();

        object[3] = jComboBoxSexo.getSelectedItem();

        object[4] = jTextFieldTelefono.getText();

        modelo.addRow(object);
        String ruta = "colaborador.txt";
        File file = new File(ruta);

        System.out.println("Creamos un FIleWriter");
        FileWriter flWriter = null;
        try {
            //crear el archivo en disco duro, 
            if (!file.exists()) {
                file.createNewFile();
            }

            System.out.println("Inicializamos el flWriter");
            flWriter = new FileWriter(file, true);

            System.out.println("Creamos un BufferedWriter");
            BufferedWriter brWriter = new BufferedWriter(flWriter);

            // for (int i = 0; i < 1; i++) {
            System.out.println("dentro de for");
            brWriter.write(object[0] + "," + object[1] + "," + object[2] + "," + object[3] + "," + object[4]);
            System.out.println("saliendo");
            //}

            brWriter.newLine();

            System.out.println("Cerramos conexion");
            brWriter.close();

        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }

        limpiar();
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jTextFieldContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldContraseñaActionPerformed

    private void jButton1_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1_salirActionPerformed

    private void jTextFieldSNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSNombreKeyTyped
        try {
            char c = evt.getKeyChar();
            if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
                evt.consume();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Solamente se aceptan letras");
        }        // TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSNombreKeyTyped

    private void jTextFieldPUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPUsuarioKeyTyped
        try {
            char c = evt.getKeyChar();
            if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
                evt.consume();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Solamente se aceptan letras");
        }        // TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPUsuarioKeyTyped

    private void jTextFieldTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTelefonoKeyTyped
        try {
            char c = evt.getKeyChar();
            if ((c < '0' || c > '9')) {
                evt.consume();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Solamente numeros");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTelefonoKeyTyped

    private void jTextFieldContraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldContraseñaKeyTyped
        try {
            char c = evt.getKeyChar();
            if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < '0' || c > '9')) {
                evt.consume();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pueden ingresar simbolos");
        }
    }//GEN-LAST:event_jTextFieldContraseñaKeyTyped

    private void jTextFieldSNombreKeyTyped1(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSNombreKeyTyped1

    }//GEN-LAST:event_jTextFieldSNombreKeyTyped1

    private void limpiar() {

        jTextFieldPUsuario.setText("");
        jTextFieldSNombre.setText("");

        jComboBoxSexo.setSelectedIndex(0);

        jTextFieldTelefono.setText("");
        jTextFieldContraseña.setText(" ");

    }

    //quitar main
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Gui().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_salir;
    private javax.swing.JButton jButton1_salir1;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonEliminar1;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonGuardar1;
    private javax.swing.JComboBox jComboBoxSexo;
    private javax.swing.JComboBox jComboBoxSexo1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldContraseña;
    private javax.swing.JTextField jTextFieldContraseña1;
    private javax.swing.JTextField jTextFieldPUsuario;
    private javax.swing.JTextField jTextFieldPUsuario1;
    private javax.swing.JTextField jTextFieldSNombre;
    private javax.swing.JTextField jTextFieldSNombre1;
    private javax.swing.JTextField jTextFieldTelefono;
    private javax.swing.JTextField jTextFieldTelefono1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
