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

    DefaultTableModel modelo;
    private String ruta = "colaborador.txt";
    private File file = new File(ruta);

    public Gui() throws IOException {
        initComponents();

        modelo = new DefaultTableModel();
        tabla.setModel(modelo);

        modelo.addColumn("Nombre");

        modelo.addColumn("Id");

        modelo.addColumn("Contraseña");

        modelo.addColumn("Sexo");

        modelo.addColumn("Telefono");


        modelo.addColumn("edad");

        if (!file.exists()) {
            file.createNewFile();
        }
        String ruta = "colaborador.txt";
        File file = new File(ruta);
        String cadena = "";
        FileReader fr = new FileReader("colaborador.txt");
        int lNumeroLineas = 0;
        //crear el archivo en disco duro, 

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

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldSNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldPUsuario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxSexo = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldTelefono = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldContraseña = new javax.swing.JTextField();
        jButtonGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jButtonEliminar = new javax.swing.JButton();
        jButton1_salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Formulario"));
        jPanel1.setLayout(new java.awt.GridLayout(9, 0));

        jLabel2.setText("Nombre");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel2);
        jPanel1.add(jTextFieldSNombre);

        jLabel3.setText("Usuario");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel3);
        jPanel1.add(jTextFieldPUsuario);

        jLabel6.setText("Sexo");
        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel6);

        jComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Femenino" }));
        jPanel1.add(jComboBoxSexo);

        jLabel8.setText("Telefono");
        jLabel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel8);
        jPanel1.add(jTextFieldTelefono);

        jLabel10.setText("Contraseña");
        jLabel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 124, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel2);

        jTextFieldContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldContraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldContraseña);

        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonGuardar);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jButton1_salir)
                        .addGap(233, 233, 233)
                        .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonEliminar)
                            .addComponent(jButton1_salir))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
//        colaborador trabajador = new colaborador();
//        trabajador.setNombre(jTextFieldSNombre.getText());
//        trabajador.setNumeroCelular(jTextFieldTelefono.getText());
//        trabajador.setUsuario(jTextFieldPUsuario.getText());
//        trabajador.setContraseña(jTextFieldContraseña.getText());
//
//        operacionesGerente agregar = new operacionesGerente();

        limpiar();
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jTextFieldContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldContraseñaActionPerformed

    private void jButton1_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1_salirActionPerformed

    private void limpiar() {

        jTextFieldPUsuario.setText("");
        jTextFieldSNombre.setText("");

        jComboBoxSexo.setSelectedIndex(0);

        jTextFieldTelefono.setText("");
        jTextFieldContraseña.setText(" ");
     
    }

    //quitar main
    public static void main(String args[]) {

//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>

        /* Create and display the form */
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
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JComboBox jComboBoxSexo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldContraseña;
    private javax.swing.JTextField jTextFieldPUsuario;
    private javax.swing.JTextField jTextFieldSNombre;
    private javax.swing.JTextField jTextFieldTelefono;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
