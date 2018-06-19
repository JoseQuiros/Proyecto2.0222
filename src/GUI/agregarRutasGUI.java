/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import MetodosColaborador.operacionesColaborador;
import javax.swing.JOptionPane;

/**
 *
 * @author Jasson
 */
public class agregarRutasGUI extends javax.swing.JFrame {

    /**
     * Creates new form agregarRutasGUI
     */
    public agregarRutasGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1_agregarRuta = new javax.swing.JButton();
        jLabel1_NuevaRuta = new javax.swing.JLabel();
        jLabel2_Inicio = new javax.swing.JLabel();
        jLabel3_Final = new javax.swing.JLabel();
        jTextField1_Inicio = new javax.swing.JTextField();
        jTextField2_final = new javax.swing.JTextField();
        jButton1_salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1_agregarRuta.setText("Agregar Ruta");
        jButton1_agregarRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_agregarRutaActionPerformed(evt);
            }
        });

        jLabel1_NuevaRuta.setText("Nueva Ruta");

        jLabel2_Inicio.setText("De:");

        jLabel3_Final.setText("Hasta:");

        jTextField1_Inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_InicioActionPerformed(evt);
            }
        });

        jTextField2_final.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2_finalActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1_NuevaRuta)
                .addGap(166, 166, 166))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2_Inicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1_Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3_Final))
                    .addComponent(jButton1_agregarRuta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1_salir)
                    .addComponent(jTextField2_final, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1_NuevaRuta)
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1_Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2_final, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2_Inicio)
                    .addComponent(jLabel3_Final))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1_agregarRuta)
                    .addComponent(jButton1_salir))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1_InicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_InicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_InicioActionPerformed

    private void jTextField2_finalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2_finalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2_finalActionPerformed

    private void jButton1_agregarRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_agregarRutaActionPerformed
        String nuevaRuta = jTextField1_Inicio.getText() + " - " + jTextField2_final.getText();
        operacionesColaborador agregar = new operacionesColaborador();

        if (agregar.agregarRuta(nuevaRuta) == 1) {
            JOptionPane.showMessageDialog(this, "Ruta insertada");
        } else {
            JOptionPane.showMessageDialog(this, "Ruta ya existente");
        }
        jTextField1_Inicio.setText("");
        jTextField2_final.setText("");

    }//GEN-LAST:event_jButton1_agregarRutaActionPerformed

    private void jButton1_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1_salirActionPerformed

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
            java.util.logging.Logger.getLogger(agregarRutasGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(agregarRutasGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(agregarRutasGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(agregarRutasGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new agregarRutasGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_agregarRuta;
    private javax.swing.JButton jButton1_salir;
    private javax.swing.JLabel jLabel1_NuevaRuta;
    private javax.swing.JLabel jLabel2_Inicio;
    private javax.swing.JLabel jLabel3_Final;
    private javax.swing.JTextField jTextField1_Inicio;
    private javax.swing.JTextField jTextField2_final;
    // End of variables declaration//GEN-END:variables
}