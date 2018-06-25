/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import MetodosColaborador.operacionesColaborador;
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
public class Gui_2 extends javax.swing.JFrame {

    DefaultTableModel modelo;
    private String ruta = "Unidades.txt";
    private File file = new File(ruta);

    public Gui_2() throws IOException {
        initComponents();

        modelo = new DefaultTableModel();
        tabla.setModel(modelo);

        modelo.addColumn("Unidad");

        modelo.addColumn("Id");
        modelo.addColumn("Ruta");
        modelo.addColumn("Hora");
        modelo.addColumn("Asientos Oc");

        if (!file.exists()) {
            file.createNewFile();
        }
        String ruta = "Unidades.txt";
        File file = new File(ruta);
        String cadena = "";
        FileReader fr = new FileReader("Unidades.txt");
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

                Object[] object = new Object[5];

                object[0] = cadena.split(",")[0];

                object[1] = cadena.split(",")[1];
                object[2] = cadena.split(",")[2];
                object[3] = cadena.split(",")[3];
                object[4] = cadena.split(",")[4];

//            
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jButtonEliminar = new javax.swing.JButton();
        jButton1Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jButton1Salir.setText("Salir");
        jButton1Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1Salir)
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEliminar)
                    .addComponent(jButton1Salir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed

        int fila = tabla.getSelectedRow();

        String lineaBorrar = (tabla.getValueAt(fila, 0).toString()) + ",";

        lineaBorrar = lineaBorrar + (tabla.getValueAt(fila, 1).toString());
        System.out.println(lineaBorrar);
//        lineaBorrar = lineaBorrar + (tabla.getValueAt(fila, 5).toString());
        operacionesColaborador op = new operacionesColaborador();
        op.eliminarCliente(lineaBorrar);

        if (fila != -1) {
            modelo.removeRow(fila);
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila");

        }


    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButton1SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1SalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1SalirActionPerformed
  public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Gui_2().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Gui_2.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    //quitar main

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1Salir;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
