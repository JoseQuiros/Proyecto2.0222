/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author Andrew
 */
public class trenGUI extends javax.swing.JFrame {

    /**
     * Creates new form busGUI
     */
    int asientosOcupados[][] = new int[3][5];
    File file = new File("asientosTren.txt");
    String ruta = "asientosTren.txt";
    int contadorGlobal=0;
    boolean trenlleno=false;
    public trenGUI(JButton aceptarButton, JRadioButton asiento1, JRadioButton asiento10, JRadioButton asiento11, JRadioButton asiento12, JRadioButton asiento13, JRadioButton asiento14, JRadioButton asiento15, JRadioButton asiento2, JRadioButton asiento3, JRadioButton asiento4, JRadioButton asiento5, JRadioButton asiento6, JRadioButton asiento7, JRadioButton asiento8, JRadioButton asiento9, ButtonGroup buttonGroup1, JLabel imagenBus, JPanel jPanel1) throws HeadlessException {
        this.aceptarButton = aceptarButton;
        this.asiento1 = asiento1;
        this.asiento10 = asiento10;
        this.asiento11 = asiento11;
        this.asiento12 = asiento12;
        this.asiento13 = asiento13;
        this.asiento14 = asiento14;
        this.asiento15 = asiento15;
        this.asiento2 = asiento2;
        this.asiento3 = asiento3;
        this.asiento4 = asiento4;
        this.asiento5 = asiento5;
        this.asiento6 = asiento6;
        this.asiento7 = asiento7;
        this.asiento8 = asiento8;
        this.asiento9 = asiento9;
        this.buttonGroup1 = buttonGroup1;
        this.imagenBus = imagenBus;
        this.jPanel1 = jPanel1;
    }
    
    

    public trenGUI() {
        initComponents();
        this.setLocationRelativeTo(null);

        try {
            if (!file.exists()) {
                file.createNewFile();
            }

            String cadena = "";
            FileReader fileR = new FileReader(file);
            BufferedReader buffReader = new BufferedReader(fileR);
            while ((cadena = buffReader.readLine()) != null) {
                if (cadena.indexOf(",") != -1) {
                    if (cadena.split(",")[0].equalsIgnoreCase("1")) {
                        asiento1.setEnabled(false);
                        System.out.println("uno");
                    }
                    if (cadena.split(",")[1].equalsIgnoreCase("1")) {
                        asiento2.setEnabled(false);
                    }
                    if (cadena.split(",")[2].equalsIgnoreCase("1")) {
                        asiento3.setEnabled(false);
                    }
                    if (cadena.split(",")[3].equalsIgnoreCase("1")) {
                        asiento4.setEnabled(false);
                    }
                    if (cadena.split(",")[4].equalsIgnoreCase("1")) {
                        asiento5.setEnabled(false);
                    } 
                    if (cadena.split(",")[5].equalsIgnoreCase("1")) {
                        asiento6.setEnabled(false);
                    }
                    if (cadena.split(",")[6].equalsIgnoreCase("1")) {
                        asiento7.setEnabled(false);
                    }
                    if (cadena.split(",")[7].equalsIgnoreCase("1")) {
                        asiento8.setEnabled(false);
                    }
                    if (cadena.split(",")[8].equalsIgnoreCase("1")) {
                        asiento9.setEnabled(false);
                    }
                    if (cadena.split(",")[9].equalsIgnoreCase("1")) {
                        asiento10.setEnabled(false);
                    }
                    if (cadena.split(",")[10].equalsIgnoreCase("1")) {
                        asiento11.setEnabled(false);
                    }
                    if (cadena.split(",")[11].equalsIgnoreCase("1")) {
                        asiento12.setEnabled(false);
                    }
                    if (cadena.split(",")[12].equalsIgnoreCase("1")) {
                        asiento13.setEnabled(false);
                    }
                    if (cadena.split(",")[13].equalsIgnoreCase("1")) {
                        asiento14.setEnabled(false);
                    }
                    if (cadena.split(",")[14].equalsIgnoreCase("1")) {
                        asiento15.setEnabled(false);
                    }
                    if (cadena.split(",")[15].equalsIgnoreCase("15")) {
                        trenlleno=true;
                        
                    }
                    
                }
                System.out.println(cadena);
                System.out.println("Variable global de contador: "+contadorGlobal);
                
            }
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        asiento2 = new javax.swing.JRadioButton();
        asiento1 = new javax.swing.JRadioButton();
        asiento4 = new javax.swing.JRadioButton();
        asiento5 = new javax.swing.JRadioButton();
        asiento6 = new javax.swing.JRadioButton();
        asiento7 = new javax.swing.JRadioButton();
        asiento9 = new javax.swing.JRadioButton();
        asiento3 = new javax.swing.JRadioButton();
        asiento8 = new javax.swing.JRadioButton();
        asiento10 = new javax.swing.JRadioButton();
        asiento11 = new javax.swing.JRadioButton();
        asiento12 = new javax.swing.JRadioButton();
        asiento13 = new javax.swing.JRadioButton();
        asiento14 = new javax.swing.JRadioButton();
        asiento15 = new javax.swing.JRadioButton();
        imagenBus = new javax.swing.JLabel();
        aceptarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setFocusTraversalPolicyProvider(true);
        jPanel1.setFocusable(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(asiento2);
        asiento2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento2ActionPerformed(evt);
            }
        });
        jPanel1.add(asiento2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 20, 20));

        buttonGroup1.add(asiento1);
        asiento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento1ActionPerformed(evt);
            }
        });
        jPanel1.add(asiento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 20, 20));

        buttonGroup1.add(asiento4);
        asiento4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento4ActionPerformed(evt);
            }
        });
        jPanel1.add(asiento4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 20, 20));

        buttonGroup1.add(asiento5);
        asiento5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento5ActionPerformed(evt);
            }
        });
        jPanel1.add(asiento5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 20, 20));

        buttonGroup1.add(asiento6);
        asiento6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento6ActionPerformed(evt);
            }
        });
        jPanel1.add(asiento6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 20, 20));

        buttonGroup1.add(asiento7);
        asiento7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento7ActionPerformed(evt);
            }
        });
        jPanel1.add(asiento7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 20, 20));

        buttonGroup1.add(asiento9);
        asiento9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento9ActionPerformed(evt);
            }
        });
        jPanel1.add(asiento9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 20, 20));

        buttonGroup1.add(asiento3);
        asiento3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento3ActionPerformed(evt);
            }
        });
        jPanel1.add(asiento3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 20, 20));

        buttonGroup1.add(asiento8);
        asiento8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento8ActionPerformed(evt);
            }
        });
        jPanel1.add(asiento8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 20, 20));

        buttonGroup1.add(asiento10);
        asiento10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento10ActionPerformed(evt);
            }
        });
        jPanel1.add(asiento10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 20, 20));

        buttonGroup1.add(asiento11);
        asiento11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento11ActionPerformed(evt);
            }
        });
        jPanel1.add(asiento11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 20, 20));

        buttonGroup1.add(asiento12);
        asiento12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento12ActionPerformed(evt);
            }
        });
        jPanel1.add(asiento12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 20, 20));

        buttonGroup1.add(asiento13);
        asiento13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento13ActionPerformed(evt);
            }
        });
        jPanel1.add(asiento13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 20, 20));

        buttonGroup1.add(asiento14);
        asiento14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento14ActionPerformed(evt);
            }
        });
        jPanel1.add(asiento14, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 20, 20));

        buttonGroup1.add(asiento15);
        asiento15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento15ActionPerformed(evt);
            }
        });
        jPanel1.add(asiento15, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 20, 20));

        imagenBus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/asientos.jpg"))); // NOI18N
        imagenBus.setDoubleBuffered(true);
        jPanel1.add(imagenBus, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        aceptarButton.setText("Aceptar");
        aceptarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(aceptarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void asiento2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_asiento2ActionPerformed

    private void asiento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_asiento1ActionPerformed

    private void asiento4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_asiento4ActionPerformed

    private void asiento5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_asiento5ActionPerformed

    private void asiento6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_asiento6ActionPerformed

    private void asiento7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_asiento7ActionPerformed

    private void asiento9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_asiento9ActionPerformed

    private void asiento3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_asiento3ActionPerformed

    private void asiento8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_asiento8ActionPerformed

    private void asiento10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_asiento10ActionPerformed

    private void asiento11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_asiento11ActionPerformed

    private void asiento12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_asiento12ActionPerformed

    private void asiento13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_asiento13ActionPerformed

    private void asiento14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_asiento14ActionPerformed

    private void asiento15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_asiento15ActionPerformed


    private void aceptarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarButtonActionPerformed
        
        if(trenlleno==true){
            JOptionPane.showMessageDialog(null, "el tren esta lleno");
            contadorGlobal=15;
        }
        if (asiento1.isSelected()) {
            asientosOcupados[0][0] = 1;
            asiento1.setEnabled(false);
            contadorGlobal++;
        }
        if (asiento2.isSelected()) {
            asientosOcupados[0][1] = 1;
            asiento2.setEnabled(false);
            contadorGlobal++;
        }
        if (asiento3.isSelected()) {
            asientosOcupados[0][2] = 1;
            asiento3.setEnabled(false);
            contadorGlobal++;
        }
        if (asiento4.isSelected()) {
            asientosOcupados[0][3] = 1;
            asiento4.setEnabled(false);
            contadorGlobal++;
        }
        if (asiento5.isSelected()) {
            asientosOcupados[0][4] = 1;
            asiento5.setEnabled(false);
            contadorGlobal++;
        }
        if (asiento6.isSelected()) {
            asientosOcupados[1][0] = 1;
            asiento6.setEnabled(false);
            contadorGlobal++;
        }
        if (asiento7.isSelected()) {
            asientosOcupados[1][1] = 1;
            asiento7.setEnabled(false);
            contadorGlobal++;
        }
        if (asiento8.isSelected()) {
            asientosOcupados[1][2] = 1;
            asiento8.setEnabled(false);
            contadorGlobal++;
        }
        if (asiento9.isSelected()) {
            asientosOcupados[1][3] = 1;
            asiento9.setEnabled(false);
            contadorGlobal++;
        }
        if (asiento10.isSelected()) {
            asientosOcupados[1][4] = 1;
            asiento10.setEnabled(false);
            contadorGlobal++;
        }
        if (asiento11.isSelected()) {
            asientosOcupados[2][0] = 1;
            asiento11.setEnabled(false);
            contadorGlobal++;
        }
        if (asiento12.isSelected()) {
            asientosOcupados[2][1] = 1;
            asiento12.setEnabled(false);
            contadorGlobal++;
        }
        if (asiento13.isSelected()) {
            asientosOcupados[2][2] = 1;
            asiento13.setEnabled(false);
            contadorGlobal++;
        }
        if (asiento14.isSelected()) {
            asientosOcupados[2][3] = 1;
            asiento14.setEnabled(false);
            contadorGlobal++;
        }
        if (asiento15.isSelected()) {
            asientosOcupados[2][4] = 1;
            asiento15.setEnabled(false);
            contadorGlobal++;
        }
        for (int x = 0; x < asientosOcupados.length; x++) {
            for (int y = 0; y < asientosOcupados[x].length; y++) {
                System.out.print(asientosOcupados[x][y]);
            }
            System.out.println("");
        }
        System.out.println("");

        FileWriter flWriter = null;
        try {
            //crear el archivo en disco duro, 
            if (!file.exists()) {
                System.out.println("archivo no existe");
                file.createNewFile();
            }
            flWriter = new FileWriter(file);//true hace otra linea

            BufferedWriter brWriter = new BufferedWriter(flWriter);

            for (int x = 0; x < asientosOcupados.length; x++) {
                for (int y = 0; y < asientosOcupados[x].length; y++) {
                    brWriter.write(String.valueOf(asientosOcupados[x][y]) + ",");
                }
            }
            brWriter.write(String.valueOf(contadorGlobal));

            brWriter.newLine();
            System.out.println("Cerramos conexion");
            brWriter.close();
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        } finally {
            if (flWriter != null) {
                try {
                    flWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
       

    }//GEN-LAST:event_aceptarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(trenGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(trenGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(trenGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(trenGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new trenGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarButton;
    private javax.swing.JRadioButton asiento1;
    private javax.swing.JRadioButton asiento10;
    private javax.swing.JRadioButton asiento11;
    private javax.swing.JRadioButton asiento12;
    private javax.swing.JRadioButton asiento13;
    private javax.swing.JRadioButton asiento14;
    private javax.swing.JRadioButton asiento15;
    private javax.swing.JRadioButton asiento2;
    private javax.swing.JRadioButton asiento3;
    private javax.swing.JRadioButton asiento4;
    private javax.swing.JRadioButton asiento5;
    private javax.swing.JRadioButton asiento6;
    private javax.swing.JRadioButton asiento7;
    private javax.swing.JRadioButton asiento8;
    private javax.swing.JRadioButton asiento9;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel imagenBus;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
