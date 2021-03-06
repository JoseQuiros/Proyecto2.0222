/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import MetodosGerente.operacionesGerente;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

import tiquetes.operacionesTiquetes;

/**
 *
 * @author Jasson
 */
public class venderGUI extends javax.swing.JFrame {

    /**
     * Creates new form venderGUI
     */
    int opcion = 0;
    String datos = "";

    private String ruta = "Unidades.txt";
    private File file = new File(ruta);

    public venderGUI() {
        initComponents();
        String ruta = "Unidades.txt";
        File file = new File(ruta);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            String cadena = "";
            FileReader fileR = new FileReader(file);
            BufferedReader buffReader = new BufferedReader(fileR);
            while ((cadena = buffReader.readLine()) != null) {
                if (cadena.split(",")[0].equalsIgnoreCase("Bus")) {
                    int cantidadAsientosBus = Integer.parseInt(cadena.split(",")[4]);
                    if (cantidadAsientosBus < 10) {
                        jComboBox2_buses.addItem(cadena.split(",")[1] + "," + cadena.split(",")[2] + "," + cadena.split(",")[3]);
                    }
                } else {
                    if (cadena.split(",")[0].equalsIgnoreCase("Tren")) {
                        int cantidadAsientosTren = Integer.parseInt(cadena.split(",")[4]);
                        if (cantidadAsientosTren < 15) {
                            jComboBox1_trenes.addItem(cadena.split(",")[1] + "," + cadena.split(",")[2] + "," + cadena.split(",")[3]);
                        }
                    }
                }
            }
            fileR.close();
            buffReader.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error");

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3_aceptar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton2_ventaTren = new javax.swing.JButton();
        jComboBox1_trenes = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jButton1_ventaBus = new javax.swing.JButton();
        jComboBox2_buses = new javax.swing.JComboBox<>();
        jLabel1_tipoTiquete = new javax.swing.JLabel();
        jButtonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton3_aceptar.setText("Comprar");
        jButton3_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3_aceptarActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setPreferredSize(new java.awt.Dimension(250, 150));

        jButton2_ventaTren.setText("Tren");
        jButton2_ventaTren.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_ventaTrenActionPerformed(evt);
            }
        });

        jComboBox1_trenes.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2_ventaTren)
                    .addComponent(jComboBox1_trenes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(314, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2_ventaTren)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1_trenes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setPreferredSize(new java.awt.Dimension(250, 150));

        jButton1_ventaBus.setText("Bus");
        jButton1_ventaBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_ventaBusActionPerformed(evt);
            }
        });

        jComboBox2_buses.setEnabled(false);
        jComboBox2_buses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2_busesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1_ventaBus)
                    .addComponent(jComboBox2_buses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1_ventaBus)
                .addGap(18, 18, 18)
                .addComponent(jComboBox2_buses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jLabel1_tipoTiquete.setText("Seleccione el tipo de tiquete");

        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 148, Short.MAX_VALUE)
                .addComponent(jLabel1_tipoTiquete)
                .addGap(145, 145, 145))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jButton3_aceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jLabel1_tipoTiquete)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3_aceptar)
                    .addComponent(jButtonSalir))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1_ventaBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_ventaBusActionPerformed
        jButton2_ventaTren.setEnabled(false);
        jComboBox2_buses.setEnabled(true);
        opcion = 1;
    }//GEN-LAST:event_jButton1_ventaBusActionPerformed

    private void jButton2_ventaTrenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_ventaTrenActionPerformed
        jButton1_ventaBus.setEnabled(false);
        jComboBox1_trenes.setEnabled(true);
        opcion = 2;
    }//GEN-LAST:event_jButton2_ventaTrenActionPerformed

    private void jButton3_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3_aceptarActionPerformed
        if (opcion == 1) {
            datos = jComboBox2_buses.getSelectedItem().toString();
            operacionesTiquetes.obtenerdatos(datos);

        } else {
            if (opcion == 2) {
                datos = jComboBox1_trenes.getSelectedItem().toString();
            }
        }
        String ruta = "Unidades.txt";
        File file = new File(ruta);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }

            String cadena = "";
            FileReader fileR = new FileReader(file);
            BufferedReader buffReader = new BufferedReader(fileR);
            String nuevaCadena1 = "";
            String lineaBorrar = "";
            //Aqui lo que se hace es obtener una cadena de la linea en la que el numero de asientos decrece
            // Se obtiene una cadena que es la  que se va a modificar en el archivo de texto
            while ((cadena = buffReader.readLine()) != null) {

                if (cadena.split(",")[1].equalsIgnoreCase(datos.split(",")[0])) {
                    int enteroAsiento = Integer.parseInt(cadena.split(",")[4]);
                    String StringAsientoMod = cadena.split(",")[4];
                    System.out.println(StringAsientoMod);
                    enteroAsiento++;
                    String StringAsiento = "" + enteroAsiento;

                    String[] nuevaCadena = cadena.split(",");
                    String[] cadenaBorrar = cadena.split(",");
                    nuevaCadena[4] = StringAsiento;

                    for (int i = 0; i < nuevaCadena.length; i++) {
                        if (i == nuevaCadena.length - 1) {
                            nuevaCadena1 += nuevaCadena[i];
                            lineaBorrar += cadenaBorrar[i];
                        } else {
                            nuevaCadena1 += nuevaCadena[i] + ",";
                            lineaBorrar += nuevaCadena[i] + ",";
                        }

                    }
                    System.out.println(nuevaCadena1);
                    System.out.println(lineaBorrar);
                }
            }
            fileR.close();
            buffReader.close();
            operacionesGerente op = new operacionesGerente();
            op.ModificarFichero(lineaBorrar, nuevaCadena1);
            
            
            JOptionPane.showMessageDialog(null, "Su tiquete se vendio satisfactoriamente!!");
            this.dispose();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error");
        }


    }//GEN-LAST:event_jButton3_aceptarActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jComboBox2_busesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2_busesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2_busesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(venderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(venderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(venderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(venderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new venderGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_ventaBus;
    private javax.swing.JButton jButton2_ventaTren;
    private javax.swing.JButton jButton3_aceptar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JComboBox<String> jComboBox1_trenes;
    private javax.swing.JComboBox<String> jComboBox2_buses;
    private javax.swing.JLabel jLabel1_tipoTiquete;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
