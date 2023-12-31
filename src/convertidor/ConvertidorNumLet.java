/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertidor;

import java.awt.HeadlessException;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import logic.LetraANumero;
import logic.NumeroaLetra;

/**
 *
 * @author gemin_7bxj2ds
 */
public class ConvertidorNumLet extends javax.swing.JInternalFrame {

    ButtonGroup objButtonGroup = new ButtonGroup();

    public ConvertidorNumLet() {

        initComponents();
        objButtonGroup.add(rdLetra);
        objButtonGroup.add(rdNumero);
        this.setSize(451, 342);
        this.setVisible(true);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rdNumero = new javax.swing.JRadioButton();
        rdLetra = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnConvertir = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        txtResultado = new javax.swing.JTextField();
        txtngreso = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rdNumero.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        rdNumero.setText("Numeros");
        rdNumero.setBorder(null);
        rdNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdNumeroActionPerformed(evt);
            }
        });
        getContentPane().add(rdNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 70, 90, 30));

        rdLetra.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        rdLetra.setText("Letras");
        rdLetra.setBorder(null);
        rdLetra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdLetraActionPerformed(evt);
            }
        });
        getContentPane().add(rdLetra, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 70, 90, 30));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel3.setText("Convertidos de Letras y Numeros");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 20, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnConvertir.setBackground(new java.awt.Color(0, 0, 255));
        btnConvertir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono/numeros.png"))); // NOI18N
        btnConvertir.setText("Convertir");
        btnConvertir.setBorder(null);
        btnConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertirActionPerformed(evt);
            }
        });
        jPanel1.add(btnConvertir, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 150, 50));

        btnSalir.setBackground(new java.awt.Color(255, 0, 0));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono/salir.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setBorder(null);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 150, 50));

        txtResultado.setEditable(false);
        jPanel1.add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 290, -1));
        jPanel1.add(txtngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 290, -1));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel1.setText("INGRESO :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 144, -1, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel2.setText("RESULTADO :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 194, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdNumeroActionPerformed
        txtResultado.setText(null);
        txtngreso.setText(null);
    }//GEN-LAST:event_rdNumeroActionPerformed

    private void btnConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertirActionPerformed
        try {
            String valor = txtngreso.getText();

            if ("".equals(valor)) {
                JOptionPane.showMessageDialog(rootPane, "Debe ingresar un valor");
            } else {
                if (rdLetra.isSelected()) {
                    String resultadoNumero = String.valueOf(LetraANumero.convertirANumeros(valor));
                    txtResultado.setText(resultadoNumero);
                } else if (rdNumero.isSelected()) {
                    int ingresoNumero = Integer.parseInt(valor);
                    String resultadoLetra = NumeroaLetra.convertirALetras(ingresoNumero);
                    txtResultado.setText(resultadoLetra);
                } else if (!rdLetra.isSelected() || !rdNumero.isSelected()) {
                    JOptionPane.showMessageDialog(rootPane, "Debe seleccionar algun tipo");
                }
            }

        } catch (HeadlessException | NumberFormatException e) {
        }
    }//GEN-LAST:event_btnConvertirActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void rdLetraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdLetraActionPerformed
        txtResultado.setText(null);
        txtngreso.setText(null);
    }//GEN-LAST:event_rdLetraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConvertir;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rdLetra;
    private javax.swing.JRadioButton rdNumero;
    private javax.swing.JTextField txtResultado;
    private javax.swing.JTextField txtngreso;
    // End of variables declaration//GEN-END:variables
}
