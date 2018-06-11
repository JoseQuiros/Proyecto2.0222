/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Andrew
 */
public class busGUI extends javax.swing.JFrame {

    /**
     * Creates new form busGUI
     */
    String asientosOcupados[] = new String[11];
    File file = new File("asientosBus.txt");
    String ruta = "asientosBus.txt";
    int contador=0;
    public busGUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        System.out.print("vector que lee:  ");

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
                        asientosOcupados[0] = "1";
                        contador++;
                    }else{
                        asientosOcupados[0]="0";
                    }
                    
                    if (cadena.split(",")[1].equalsIgnoreCase("1")) {
                        asiento2.setEnabled(false);
                        asientosOcupados[1] = "1";
                        contador++;
                    }else{
                        asientosOcupados[1]="0";
                    }
                    
                    if (cadena.split(",")[2].equalsIgnoreCase("1")) {
                        asiento3.setEnabled(false);
                        asientosOcupados[2] = "1";
                        contador++;
                    }else{
                        asientosOcupados[2]="0";
                    }
                    if (cadena.split(",")[3].equalsIgnoreCase("1")) {
                        asiento4.setEnabled(false);
                        asientosOcupados[3] = "1";
                        contador++;
                    }else{
                        asientosOcupados[3]="0";
                    }
                    if (cadena.split(",")[4].equalsIgnoreCase("1")) {
                        asiento5.setEnabled(false);
                        asientosOcupados[4] = "1";
                        contador++;
                    }else{
                        asientosOcupados[4]="0";
                    }
                    if (cadena.split(",")[5].equalsIgnoreCase("1")) {
                        asiento6.setEnabled(false);
                        asientosOcupados[5] = "1";
                        contador++;
                    }else{
                        asientosOcupados[5]="0";
                    }
                    if (cadena.split(",")[6].equalsIgnoreCase("1")) {
                        asiento7.setEnabled(false);
                        asientosOcupados[6] = "1";
                        contador++;
                    }else{
                        asientosOcupados[6]="0";
                    }
                    if (cadena.split(",")[7].equalsIgnoreCase("1")) {
                        asiento8.setEnabled(false);
                        asientosOcupados[7] = "1";
                        contador++;
                    }else{
                        asientosOcupados[7]="0";
                    }
                    if (cadena.split(",")[8].equalsIgnoreCase("1")) {
                        asiento9.setEnabled(false);
                        asientosOcupados[8] = "1";
                        contador++;
                    }else{
                        asientosOcupados[8]="0";
                    }
                    if (cadena.split(",")[9].equalsIgnoreCase("1")) {
                        asiento10.setEnabled(false);
                        asientosOcupados[9] = "1";
                        contador++;
                    }else{
                        asientosOcupados[9]="0";
                    }
//                    if (cadena.split(",")[10].equalsIgnoreCase("10")) {
//                        System.out.println("bus lleno");
//                        this.dispose();
//                    }else{
//                        asientosOcupados[10]=String.valueOf(contador);
//                    }
                    
                    if(contador==10){
                        JOptionPane.showMessageDialog(null,"Bus esta lleno, se cerra");
                        System.exit(0);
                    }

                }
                System.out.println("Esta es la cadena que lee:  " + cadena);

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
        asiento1 = new javax.swing.JRadioButton();
        asiento2 = new javax.swing.JRadioButton();
        asiento3 = new javax.swing.JRadioButton();
        asiento4 = new javax.swing.JRadioButton();
        asiento5 = new javax.swing.JRadioButton();
        asiento6 = new javax.swing.JRadioButton();
        asiento7 = new javax.swing.JRadioButton();
        asiento8 = new javax.swing.JRadioButton();
        asiento9 = new javax.swing.JRadioButton();
        asiento10 = new javax.swing.JRadioButton();
        imagenbus = new javax.swing.JLabel();
        botonAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(asiento1);
        getContentPane().add(asiento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        buttonGroup1.add(asiento2);
        getContentPane().add(asiento2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));

        buttonGroup1.add(asiento3);
        getContentPane().add(asiento3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        buttonGroup1.add(asiento4);
        getContentPane().add(asiento4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));

        buttonGroup1.add(asiento5);
        getContentPane().add(asiento5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        buttonGroup1.add(asiento6);
        getContentPane().add(asiento6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));

        buttonGroup1.add(asiento7);
        getContentPane().add(asiento7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        buttonGroup1.add(asiento8);
        getContentPane().add(asiento8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, -1, -1));

        buttonGroup1.add(asiento9);
        getContentPane().add(asiento9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        buttonGroup1.add(asiento10);
        getContentPane().add(asiento10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, -1, -1));

        imagenbus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/asientos.jpg"))); // NOI18N
        getContentPane().add(imagenbus, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 36, -1, -1));

        botonAceptar.setText("Aceptar");
        botonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(botonAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
        // TODO add your handling code here:

        if (asiento1.isSelected()) {
            asientosOcupados[0] = String.valueOf("1");
            asiento1.setEnabled(false);

        }
        if (asiento2.isSelected()) {
            asientosOcupados[1] = String.valueOf("1");
            asiento2.setEnabled(false);

        }
        if (asiento3.isSelected()) {
            asientosOcupados[2] = String.valueOf("1");
            asiento3.setEnabled(false);

        }
        if (asiento4.isSelected()) {
            asientosOcupados[3] = String.valueOf("1");
            asiento4.setEnabled(false);

        }
        if (asiento5.isSelected()) {
            asientosOcupados[4] = String.valueOf("1");
            asiento5.setEnabled(false);

        }
        if (asiento6.isSelected()) {
            asientosOcupados[5] = String.valueOf("1");
            asiento6.setEnabled(false);

        }
        if (asiento7.isSelected()) {
            asientosOcupados[6] = String.valueOf("1");
            asiento7.setEnabled(false);

        }
        if (asiento8.isSelected()) {
            asientosOcupados[7] = String.valueOf("1");
            asiento8.setEnabled(false);

        }
        if (asiento9.isSelected()) {
            asientosOcupados[8] = String.valueOf("1");
            asiento9.setEnabled(false);

        }
        if (asiento10.isSelected()) {
            asientosOcupados[9] = String.valueOf("1");
            asiento10.setEnabled(false);

        }
        System.out.print("Sale del los if antes de escribir:    ");
        for (int x = 0; x < asientosOcupados.length; x++) {
            System.out.print(asientosOcupados[x] + ",");
        }

        FileWriter flWriter = null;
        try {
            //crear el archivo en disco duro, 
            if (!file.exists()) {
                System.out.println("archivo no existe");
                file.createNewFile();
            }
            flWriter = new FileWriter(file);

            BufferedWriter brWriter = new BufferedWriter(flWriter);
            System.out.print("  Antes de escribir bwwriter:    ");
            for (int x = 0; x < asientosOcupados.length; x++) {

                System.out.print(asientosOcupados[x] + ",");

            }

            for (int x = 0; x < asientosOcupados.length; x++) {

                brWriter.write(String.valueOf(asientosOcupados[x]) + ",");

            }
            
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
    }//GEN-LAST:event_botonAceptarActionPerformed

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
            java.util.logging.Logger.getLogger(busGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(busGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(busGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(busGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new busGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton asiento1;
    private javax.swing.JRadioButton asiento10;
    private javax.swing.JRadioButton asiento2;
    private javax.swing.JRadioButton asiento3;
    private javax.swing.JRadioButton asiento4;
    private javax.swing.JRadioButton asiento5;
    private javax.swing.JRadioButton asiento6;
    private javax.swing.JRadioButton asiento7;
    private javax.swing.JRadioButton asiento8;
    private javax.swing.JRadioButton asiento9;
    private javax.swing.JButton botonAceptar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel imagenbus;
    // End of variables declaration//GEN-END:variables
}
