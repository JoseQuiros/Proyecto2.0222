package GUI;

import MetodosColaborador.operacionesColaborador;
import MetodosGerente.operacionesGerente;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import vehiculo.bus;
import vehiculo.tren;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jose
 */
public class ModificarBusTren extends javax.swing.JFrame {

    /**
     * Creates new form unidadesGUI
     */
    public ModificarBusTren(String id, String lineaBorrar) {
        String lineaBorrarOb = lineaBorrar;
        initComponents();
        jTextField3_id.setText(id);
        jTextField3_id.setEnabled(false);
        String ruta = "RutasBusTren.txt";
        File file = new File(ruta);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }

            String cadena = "";
            FileReader fileR = new FileReader(file);
            BufferedReader buffReader = new BufferedReader(fileR);
            while ((cadena = buffReader.readLine()) != null) {
                jComboBox2_rutas.addItem(cadena);
            }
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField3_id = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1_modifcar = new javax.swing.JButton();
        jButton1_salir = new javax.swing.JButton();
        jComboBox2_rutas = new javax.swing.JComboBox<>();
        jLabel3_hora = new javax.swing.JLabel();
        jTextField1_hora = new javax.swing.JTextField();
        jLabel3_puntosHora = new javax.swing.JLabel();
        jTextField2_minutos = new javax.swing.JTextField();
        jLabel3_ejemploHora = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ruta asignada:");

        jTextField3_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3_idActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Id :");

        jButton1_modifcar.setText("Modificar");
        jButton1_modifcar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_modifcarActionPerformed(evt);
            }
        });

        jButton1_salir.setText("Salir");
        jButton1_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_salirActionPerformed(evt);
            }
        });

        jLabel3_hora.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3_hora.setText("Hora asignada:");

        jTextField1_hora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_horaActionPerformed(evt);
            }
        });

        jLabel3_puntosHora.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3_puntosHora.setText(":");

        jLabel3_ejemploHora.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3_ejemploHora.setText("    hh      :    mm");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox2_rutas, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField3_id, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3_hora)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1_modifcar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1_salir))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3_ejemploHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jTextField1_hora, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel3_puntosHora)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField2_minutos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(57, 57, 57))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox2_rutas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1_hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2_minutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3_puntosHora)
                    .addComponent(jLabel3_hora))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3_ejemploHora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1_salir)
                    .addComponent(jButton1_modifcar))
                .addGap(42, 42, 42))
        );

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Agregar nuevas unidades");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(122, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_salirActionPerformed
        this.dispose();
        try {
            Gui_2 gui_2 = new Gui_2();
            gui_2.setVisible(true);
            gui_2.setLocationRelativeTo(null);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton1_salirActionPerformed

    private void jTextField1_horaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_horaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_horaActionPerformed

    private void jButton1_modifcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_modifcarActionPerformed

// Se va a obtener la cadena nueva con el id y tipo ya declarado, se va a pasar al metodo modificarFichero para que se cambie en su txt respectivo
        String id = jTextField3_id.getText();
        String ruta = "Unidades.txt";
        String lineaBorrar = "";
        File file = new File(ruta);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }

            String cadena = "";

            FileReader fileR = new FileReader(file);
            BufferedReader buffReader = new BufferedReader(fileR);
            while ((cadena = buffReader.readLine()) != null) {
                if (cadena.split(",")[1].equalsIgnoreCase(id)) {
                    lineaBorrar = cadena;
                }
                System.out.println(lineaBorrar);
            }
            buffReader.close();
            fileR.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error");
        }
        operacionesGerente op = new operacionesGerente();
        String nuevaLinea = lineaBorrar.split(",")[0] + "," + lineaBorrar.split(",")[1] + "," + jComboBox2_rutas.getSelectedItem().toString() + ","
                + jTextField1_hora.getText() + ":" + jTextField2_minutos.getText() + "," + "0";

        op.ModificarFichero(lineaBorrar, nuevaLinea);
        this.dispose();
        try {
            Gui_2 gui_2 = new Gui_2();
            gui_2.setVisible(true);
            gui_2.setLocationRelativeTo(null);
        } catch (Exception e) {
        }

    }//GEN-LAST:event_jButton1_modifcarActionPerformed

    private void jTextField3_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3_idActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_modifcar;
    private javax.swing.JButton jButton1_salir;
    private javax.swing.JComboBox<String> jComboBox2_rutas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3_ejemploHora;
    private javax.swing.JLabel jLabel3_hora;
    private javax.swing.JLabel jLabel3_puntosHora;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1_hora;
    private javax.swing.JTextField jTextField2_minutos;
    private javax.swing.JTextField jTextField3_id;
    // End of variables declaration//GEN-END:variables
}