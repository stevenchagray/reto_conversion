/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertidor;

import javax.swing.JOptionPane;

/**
 *
 * @author gemin_7bxj2ds
 */
public class ConvertidorTemperatura extends javax.swing.JInternalFrame {

    private static double celcius;
    private static double nTemperatura;
    private static double result;
    String temperatura1;
    String temperatura;

    public ConvertidorTemperatura() {
        initComponents();
        this.setSize(491, 387);
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtIngreso = new javax.swing.JTextField();
        txtResultado = new javax.swing.JTextField();
        cbxConvertirDe = new javax.swing.JComboBox<>();
        cbxConvertirA = new javax.swing.JComboBox<>();
        btnConvertir = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel1.setText("Convertidor de Temperatura");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel2.setText("INGRESO DE TEMPERATURA :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 83, -1, -1));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel3.setText("CONVERTIR DE :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 125, -1, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel4.setText("CONVERTIR A :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 174, -1, -1));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel5.setText("RESULTADO DE TEMPERATURA :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 217, -1, -1));

        txtIngreso.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        getContentPane().add(txtIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 83, 150, -1));

        txtResultado.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        getContentPane().add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 213, 150, -1));

        cbxConvertirDe.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        cbxConvertirDe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celsius", "Fahrenheit", "Kelvin", "Rankine" }));
        cbxConvertirDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxConvertirDeActionPerformed(evt);
            }
        });
        getContentPane().add(cbxConvertirDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 125, 150, -1));

        cbxConvertirA.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        cbxConvertirA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celsius", "Fahrenheit", "Kelvin", "Rankine" }));
        cbxConvertirA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxConvertirAActionPerformed(evt);
            }
        });
        getContentPane().add(cbxConvertirA, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 169, 150, -1));

        btnConvertir.setBackground(new java.awt.Color(0, 0, 255));
        btnConvertir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono/temperatura.png"))); // NOI18N
        btnConvertir.setText("Convertir");
        btnConvertir.setBorder(null);
        btnConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertirActionPerformed(evt);
            }
        });
        getContentPane().add(btnConvertir, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 150, 50));

        btnSalir.setBackground(new java.awt.Color(255, 0, 0));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono/salir.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setBorder(null);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 150, 50));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxConvertirDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxConvertirDeActionPerformed
        temperatura = cbxConvertirDe.getSelectedItem().toString();
        convertirDe(temperatura);
    }//GEN-LAST:event_cbxConvertirDeActionPerformed

    private void cbxConvertirAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxConvertirAActionPerformed
        temperatura1 = cbxConvertirA.getSelectedItem().toString();
        convertirA(temperatura1);
    }//GEN-LAST:event_cbxConvertirAActionPerformed

    private void btnConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertirActionPerformed
        String valor = txtIngreso.getText();

        if ("".equals(valor)) {
            JOptionPane.showMessageDialog(rootPane, "Se debe ingresar un valor.");
        } else {
            String vacio = null;
            if ((vacio == null ? temperatura1 != null : !vacio.equals(temperatura1))
                    && (vacio == null ? temperatura != null : !vacio.equals(temperatura))) {

                double conver = Math.round(result * 1000.0) / 1000.0;
                txtResultado.setText(String.valueOf(conver));

            } else {
                JOptionPane.showMessageDialog(rootPane, "Debe seleccionar ambos tipos de cambio");
            }
        }
    }//GEN-LAST:event_btnConvertirActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConvertir;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbxConvertirA;
    private javax.swing.JComboBox<String> cbxConvertirDe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtIngreso;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables

    private void convertirA(String temperatura) {

        if (!"".equals(temperatura)) {
            switch (temperatura) {

                case "Celsius":
                    celcius = 1;
                    result = nTemperatura * celcius;
                    break;

                case "Fahrenheit":
                    celcius = 1.8;
                    result = (nTemperatura * celcius) + 32;
                    break;

                case "Kelvin":
                    celcius = 273.15;
                    result = nTemperatura + celcius;
                    break;

                case "Rankine":
                    celcius = 1.8;
                    result = (nTemperatura * celcius) + 491.67;
                    break;
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar un tipo a convertir");

        }
    }

    private void convertirDe(String temperatura) {
        if (!"".equals(temperatura)) {
            double temp = Double.parseDouble(txtIngreso.getText());
            switch (temperatura) {

                case "Celsius":
                    celcius = 1;
                    nTemperatura = temp * celcius;
                    //  System.out.println(nTemperatura);
                    break;

                case "Fahrenheit":

                    celcius = 0.55555555555555555555555555555556;
                    double num = temp - 32;
                    nTemperatura = num * celcius;
                    //System.out.println(nTemperatura);
                    break;

                case "Kelvin":
                    celcius = 273.15;
                    nTemperatura = temp - celcius;
                    // System.out.println(nTemperatura);
                    break;

                case "Rankine":
                    celcius = 0.55555555555555555555555555555556;
                    double nun = temp - 491.67;
                    nTemperatura = nun * celcius;
                    break;

            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar un tipo de conversion");

        }
    }

}