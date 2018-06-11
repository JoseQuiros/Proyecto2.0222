/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JTable;

/**
 *
 * @author Jasson
 */
public class resultadoGUI extends javax.swing.JFrame {

    /**
     * Creates new form resultadoGUI
     */
    public resultadoGUI(int tipoReporte, String rutaArchivo) {
        initComponents();
        switch (tipoReporte) {
            case 1:
                String[] columnasDiario = {
                    "Fecha:",
                    "Ruta:",
                    "Tiquetes Vendidos"
                };

                File fileDiario = new File(rutaArchivo);

                int filasDiario = 0;

                try {
                    if (!fileDiario.exists()) {
                        fileDiario.createNewFile();
                    }
                    FileReader fileR = new FileReader(fileDiario);
                    BufferedReader buffReader = new BufferedReader(fileR);
                    while ((buffReader.readLine()) != null) {

                        filasDiario++;
                    }
                } catch (Exception e) {
                }

                Object[][] datosDiario = new Object[filasDiario][3];
                try {
                    if (!fileDiario.exists()) {
                        fileDiario.createNewFile();
                    }

                    String cadena = "";
                    FileReader fileR = new FileReader(fileDiario);
                    BufferedReader buffReader = new BufferedReader(fileR);

                    filasDiario = 0;

                    while ((cadena = buffReader.readLine()) != null) {
                        if (cadena.indexOf(",") != -1) {
                            datosDiario[filasDiario][0] = cadena.split(",")[0];
                            datosDiario[filasDiario][1] = cadena.split(",")[1];
                            datosDiario[filasDiario][2] = cadena.split(",")[2];
                        }
                        filasDiario++;
                    }
                } catch (Exception e) {
                }

                JTable tableDiario = new JTable(datosDiario, columnasDiario);
                this.setLayout(new BorderLayout());
                this.add(tableDiario.getTableHeader(), BorderLayout.PAGE_START);
                this.add(tableDiario, BorderLayout.CENTER);
                break;

            case 2:
                String[] columnasSemanal = {
                    "Semana:",
                    "Ruta:",
                    "Tiquetes Vendidos"
                };
                //String rutaArchivo = "Diairio.txt";

                File fileSemanal = new File(rutaArchivo);

                int filasSemanal = 0;

                try {
                    if (!fileSemanal.exists()) {
                        fileSemanal.createNewFile();
                    }
                    FileReader fileR = new FileReader(fileSemanal);
                    BufferedReader buffReader = new BufferedReader(fileR);
                    while ((buffReader.readLine()) != null) {

                        filasSemanal++;
                    }
                } catch (Exception e) {
                }

                Object[][] datosSemanal = new Object[filasSemanal][3];
                try {
                    if (!fileSemanal.exists()) {
                        fileSemanal.createNewFile();
                    }

                    String cadena = "";
                    FileReader fileR = new FileReader(fileSemanal);
                    BufferedReader buffReader = new BufferedReader(fileR);

                    filasSemanal = 0;

                    while ((cadena = buffReader.readLine()) != null) {
                        if (cadena.indexOf(",") != -1) {
                            datosSemanal[filasSemanal][0] = cadena.split(",")[0];
                            datosSemanal[filasSemanal][1] = cadena.split(",")[1];
                            datosSemanal[filasSemanal][2] = cadena.split(",")[2];
                        }
                        filasSemanal++;
                    }
                } catch (Exception e) {
                }

                JTable tableSemanal = new JTable(datosSemanal, columnasSemanal);
                this.setLayout(new BorderLayout());
                this.add(tableSemanal.getTableHeader(), BorderLayout.PAGE_START);
                this.add(tableSemanal, BorderLayout.CENTER);
                break;
            case 3:
                String[] columnasMensual = {
                    "Mes:",
                    "Ruta:",
                    "Tiquetes Vendidos"
                };
                //String rutaArchivo = "Diairio.txt";

                File fileMensual = new File(rutaArchivo);

                int filaMensual = 0;

                try {
                    if (!fileMensual.exists()) {
                        fileMensual.createNewFile();
                    }
                    FileReader fileR = new FileReader(fileMensual);
                    BufferedReader buffReader = new BufferedReader(fileR);
                    while ((buffReader.readLine()) != null) {

                        filaMensual++;
                    }
                } catch (Exception e) {
                }

                Object[][] datosMensual = new Object[filaMensual][3];
                try {
                    if (!fileMensual.exists()) {
                        fileMensual.createNewFile();
                    }

                    String cadena = "";
                    FileReader fileR = new FileReader(fileMensual);
                    BufferedReader buffReader = new BufferedReader(fileR);

                    filaMensual = 0;

                    while ((cadena = buffReader.readLine()) != null) {
                        if (cadena.indexOf(",") != -1) {
                            datosMensual[filaMensual][0] = cadena.split(",")[0];
                            datosMensual[filaMensual][1] = cadena.split(",")[1];
                            datosMensual[filaMensual][2] = cadena.split(",")[2];
                        }
                        filaMensual++;
                    }
                } catch (Exception e) {
                }

                JTable tableMensual = new JTable(datosMensual, columnasMensual);
                this.setLayout(new BorderLayout());
                this.add(tableMensual.getTableHeader(), BorderLayout.PAGE_START);
                this.add(tableMensual, BorderLayout.CENTER);
                break;
            default:
                break;
        }
    }

    private resultadoGUI() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(jButton1)
                .addContainerGap(278, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(308, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(resultadoGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(resultadoGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(resultadoGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(resultadoGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new resultadoGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
