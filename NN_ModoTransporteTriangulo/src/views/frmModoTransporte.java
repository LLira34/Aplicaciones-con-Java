/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.Image;
import java.text.DecimalFormat;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import org.neuroph.core.NeuralNetwork;
import org.neuroph.core.data.DataSet;
import org.neuroph.core.data.DataSetRow;
import org.neuroph.nnet.MultiLayerPerceptron;

/**
 *
 * @author UTNG
 */
public class frmModoTransporte extends javax.swing.JFrame {

    /**
     * Creates new form frmModoTransporte
     */
    public frmModoTransporte() {
        initComponents();
        lblIcono.setText("");
        lblIcono.setIcon(new ImageIcon("F:\\Ingeniería\\Optativa\\Unidad 3\\NN_ModoTransporte\\src\\images\\signo.png"));
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rbtnSpeedSi = new javax.swing.JRadioButton();
        rbtnSpeedNo = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        rbtnSmallCity = new javax.swing.JRadioButton();
        rbtnLargeFamily = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        rbtnSmallFamily = new javax.swing.JRadioButton();
        rbtnLargeCity = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        lblSalida2 = new javax.swing.JLabel();
        lblSalida1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblIcono = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(202, 156, 197));

        jPanel1.setBackground(new java.awt.Color(226, 180, 221));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Entradas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tempus Sans ITC", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Speed:");

        rbtnSpeedSi.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbtnSpeedSi);
        rbtnSpeedSi.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        rbtnSpeedSi.setForeground(new java.awt.Color(255, 255, 255));
        rbtnSpeedSi.setSelected(true);
        rbtnSpeedSi.setText("Si");
        rbtnSpeedSi.setOpaque(false);
        rbtnSpeedSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnSpeedSiActionPerformed(evt);
            }
        });

        rbtnSpeedNo.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbtnSpeedNo);
        rbtnSpeedNo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        rbtnSpeedNo.setForeground(new java.awt.Color(255, 255, 255));
        rbtnSpeedNo.setText("No");
        rbtnSpeedNo.setOpaque(false);
        rbtnSpeedNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnSpeedNoActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("City Size:");

        rbtnSmallCity.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(rbtnSmallCity);
        rbtnSmallCity.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        rbtnSmallCity.setForeground(new java.awt.Color(255, 255, 255));
        rbtnSmallCity.setText("Small");
        rbtnSmallCity.setOpaque(false);
        rbtnSmallCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnSmallCityActionPerformed(evt);
            }
        });

        rbtnLargeFamily.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup3.add(rbtnLargeFamily);
        rbtnLargeFamily.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        rbtnLargeFamily.setForeground(new java.awt.Color(255, 255, 255));
        rbtnLargeFamily.setSelected(true);
        rbtnLargeFamily.setText("Large");
        rbtnLargeFamily.setOpaque(false);
        rbtnLargeFamily.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnLargeFamilyActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Family Size:");

        rbtnSmallFamily.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup3.add(rbtnSmallFamily);
        rbtnSmallFamily.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        rbtnSmallFamily.setForeground(new java.awt.Color(255, 255, 255));
        rbtnSmallFamily.setText("Small");
        rbtnSmallFamily.setOpaque(false);
        rbtnSmallFamily.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnSmallFamilyActionPerformed(evt);
            }
        });

        rbtnLargeCity.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(rbtnLargeCity);
        rbtnLargeCity.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        rbtnLargeCity.setForeground(new java.awt.Color(255, 255, 255));
        rbtnLargeCity.setSelected(true);
        rbtnLargeCity.setText("Large");
        rbtnLargeCity.setOpaque(false);
        rbtnLargeCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnLargeCityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbtnSmallCity)
                            .addComponent(rbtnSmallFamily)
                            .addComponent(rbtnSpeedNo))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbtnSpeedSi)
                            .addComponent(rbtnLargeFamily)
                            .addComponent(rbtnLargeCity))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnSpeedSi)
                    .addComponent(rbtnSpeedNo))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnSmallCity)
                    .addComponent(rbtnLargeCity))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnSmallFamily)
                    .addComponent(rbtnLargeFamily))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(226, 180, 221));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Salidas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tempus Sans ITC", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(217, 322));

        lblSalida2.setBackground(new java.awt.Color(255, 255, 255));
        lblSalida2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        lblSalida2.setForeground(new java.awt.Color(255, 255, 255));
        lblSalida2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSalida2.setText("------------");
        lblSalida2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Salida 2", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tempus Sans ITC", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        lblSalida1.setBackground(new java.awt.Color(255, 255, 255));
        lblSalida1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        lblSalida1.setForeground(new java.awt.Color(255, 255, 255));
        lblSalida1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSalida1.setText("------------");
        lblSalida1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Salida 1", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tempus Sans ITC", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSalida2, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                    .addComponent(lblSalida1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(lblSalida1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblSalida2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jLabel4.setBackground(new java.awt.Color(226, 180, 221));
        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Modo De Transporte");
        jLabel4.setOpaque(true);

        btnCalcular.setBackground(new java.awt.Color(249, 220, 246));
        btnCalcular.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(102, 102, 102));
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(249, 220, 246));
        btnLimpiar.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(102, 102, 102));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(249, 220, 246));
        btnSalir.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(102, 102, 102));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lblIcono.setBackground(new java.awt.Color(226, 180, 221));
        lblIcono.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        lblIcono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIcono.setOpaque(true);
        lblIcono.setPreferredSize(new java.awt.Dimension(160, 170));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblIcono, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtnSpeedSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnSpeedSiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnSpeedSiActionPerformed

    private void rbtnSpeedNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnSpeedNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnSpeedNoActionPerformed

    private void rbtnSmallCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnSmallCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnSmallCityActionPerformed

    private void rbtnLargeFamilyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnLargeFamilyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnLargeFamilyActionPerformed

    private void rbtnSmallFamilyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnSmallFamilyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnSmallFamilyActionPerformed

    private void rbtnLargeCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnLargeCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnLargeCityActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        NeuralNetwork nn = new MultiLayerPerceptron(3, 8, 2); // 2 entradas, 4 en la capa oculta, 1 salida.
        DataSet ds = new DataSet(3, 2);

        ds.addRow(new DataSetRow(new double[]{0, 1, 1}, new double[]{0, 0}));
        ds.addRow(new DataSetRow(new double[]{0, 0, 1}, new double[]{0, 0}));
        ds.addRow(new DataSetRow(new double[]{1, 1, 1}, new double[]{0, 1}));
        ds.addRow(new DataSetRow(new double[]{1, 0, 1}, new double[]{1, 0}));
        ds.addRow(new DataSetRow(new double[]{1, 1, 0}, new double[]{0, 1}));
        ds.addRow(new DataSetRow(new double[]{1, 0, 0}, new double[]{1, 1}));
        ds.addRow(new DataSetRow(new double[]{0, 0, 0}, new double[]{0, 0}));
        ds.addRow(new DataSetRow(new double[]{1, 1, 1}, new double[]{0, 1}));
        ds.addRow(new DataSetRow(new double[]{0, 1, 0}, new double[]{0, 0}));

        nn.learn(ds);
        nn.save("F:\\ModoTransporte.nnet");

        int velocidad, tamañoCiudad, tamañoFamilia;
        double salida1, salida2;

        DecimalFormat df = new DecimalFormat("##.##");

        if (rbtnSpeedSi.isSelected()) {
            velocidad = 1;
        } else {
            velocidad = 0;
        }

        if (rbtnSmallCity.isSelected()) {
            tamañoCiudad = 0;
        } else {
            tamañoCiudad = 1;
        }

        if (rbtnSmallFamily.isSelected()) {
            tamañoFamilia = 0;
        } else {
            tamañoFamilia = 1;
        }

        // Se procede a calcular la salida
        nn.setInput(velocidad, tamañoCiudad, tamañoFamilia);
        nn.calculate();
        salida1 = nn.getOutput()[0]; // Recuperamos el primer elemento
        salida2 = nn.getOutput()[1];

        double s1 = Math.round(salida1);
        double s2 = Math.round(salida2);

        if (s1 == 0 && s2 == 0) {

            lblIcono.setText("");
            lblIcono.setIcon(new ImageIcon("E:\\Ingeniería\\Optativa\\Unidad 3\\NN_ModoTransporte\\src\\images\\Imagen1.png"));

        } else if (s1 == 0 && s2 == 1) {
            lblIcono.setText("");
            lblIcono.setIcon(new ImageIcon("E:\\Ingeniería\\Optativa\\Unidad 3\\NN_ModoTransporte\\src\\images\\bus.png"));
        } else if (s1 == 1 && s2 == 1) {
            lblIcono.setText("");
            lblIcono.setIcon(new ImageIcon("E:\\Ingeniería\\Optativa\\Unidad 3\\NN_ModoTransporte\\src\\images\\car.png"));
        } else if (s1 == 1 && s2 == 0) {
            lblIcono.setText("");
            lblIcono.setIcon(new ImageIcon("E:\\Ingeniería\\Optativa\\Unidad 3\\NN_ModoTransporte\\src\\images\\van.png"));
        }

        lblSalida1.setText("" + df.format(salida1));
        lblSalida2.setText("" + df.format(salida2));


    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        lblSalida1.setText("");
        lblSalida2.setText("");
        lblIcono.setText("");
        rbtnLargeCity.setSelected(true);
        rbtnLargeFamily.setSelected(true);
        rbtnSpeedSi.setSelected(true);
        lblIcono.setIcon(new ImageIcon("E:\\Ingeniería\\Optativa\\Unidad 3\\NN_ModoTransporte\\src\\images\\signo.png"));

    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(frmModoTransporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmModoTransporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmModoTransporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmModoTransporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmModoTransporte().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblIcono;
    private javax.swing.JLabel lblSalida1;
    private javax.swing.JLabel lblSalida2;
    private javax.swing.JRadioButton rbtnLargeCity;
    private javax.swing.JRadioButton rbtnLargeFamily;
    private javax.swing.JRadioButton rbtnSmallCity;
    private javax.swing.JRadioButton rbtnSmallFamily;
    private javax.swing.JRadioButton rbtnSpeedNo;
    private javax.swing.JRadioButton rbtnSpeedSi;
    // End of variables declaration//GEN-END:variables
}
