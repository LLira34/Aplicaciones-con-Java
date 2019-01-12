package views;

import java.text.DecimalFormat;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.neuroph.core.NeuralNetwork;
import org.neuroph.core.data.DataSet;
import org.neuroph.core.data.DataSetRow;
import org.neuroph.nnet.MultiLayerPerceptron;
import org.neuroph.nnet.Perceptron;

/**
 *
 * @author LLira
 */
public class frmMain extends javax.swing.JFrame {
    Icon user;

    /**
     * Creates new form frmMain
     */
    public frmMain() {
        initComponents();
        this.setLocationRelativeTo(this);
        user = new ImageIcon("src\\resources\\Luis_Hernan.jpg");
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtX1 = new javax.swing.JTextField();
        txtX2 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtY = new javax.swing.JTextField();
        btnCalcularOR = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnCalculaAND = new javax.swing.JButton();
        btnCalculaXOR = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnCreditos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Redes Neuronales");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Entradas"));

        jLabel2.setText("X1:");

        jLabel3.setText("X2");

        txtX1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtX1.setText("0");

        txtX2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtX2.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtX1, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(22, 22, 22)
                        .addComponent(txtX2)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtX1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtX2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Salidas"));
        jPanel3.setPreferredSize(new java.awt.Dimension(202, 103));

        jLabel4.setText("Y:");

        txtY.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtY.setText("0");
        txtY.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(txtY, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCalcularOR.setBackground(new java.awt.Color(255, 255, 255));
        btnCalcularOR.setText("Calcular OR");
        btnCalcularOR.setMaximumSize(new java.awt.Dimension(95, 25));
        btnCalcularOR.setMinimumSize(new java.awt.Dimension(95, 25));
        btnCalcularOR.setPreferredSize(new java.awt.Dimension(110, 30));
        btnCalcularOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularORActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.setMaximumSize(new java.awt.Dimension(75, 23));
        btnSalir.setPreferredSize(new java.awt.Dimension(75, 30));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnCalculaAND.setBackground(new java.awt.Color(255, 255, 255));
        btnCalculaAND.setText("Calcular AND");
        btnCalculaAND.setMaximumSize(new java.awt.Dimension(95, 25));
        btnCalculaAND.setMinimumSize(new java.awt.Dimension(95, 25));
        btnCalculaAND.setPreferredSize(new java.awt.Dimension(110, 30));
        btnCalculaAND.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculaANDActionPerformed(evt);
            }
        });

        btnCalculaXOR.setBackground(new java.awt.Color(255, 255, 255));
        btnCalculaXOR.setText("Calcular XOR");
        btnCalculaXOR.setMaximumSize(new java.awt.Dimension(95, 25));
        btnCalculaXOR.setMinimumSize(new java.awt.Dimension(95, 25));
        btnCalculaXOR.setPreferredSize(new java.awt.Dimension(110, 30));
        btnCalculaXOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculaXORActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setMaximumSize(new java.awt.Dimension(95, 25));
        btnLimpiar.setMinimumSize(new java.awt.Dimension(95, 25));
        btnLimpiar.setPreferredSize(new java.awt.Dimension(110, 30));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnCreditos.setBackground(new java.awt.Color(255, 255, 255));
        btnCreditos.setText("Creditos");
        btnCreditos.setMaximumSize(new java.awt.Dimension(75, 23));
        btnCreditos.setMinimumSize(new java.awt.Dimension(75, 23));
        btnCreditos.setPreferredSize(new java.awt.Dimension(75, 30));
        btnCreditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreditosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnCalculaXOR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCalculaAND, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addComponent(btnCalcularOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCalcularOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCalculaAND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCalculaXOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularORActionPerformed
        // TODO add your handling code here:
        NeuralNetwork nn = new Perceptron(2,1); // 2 entradas, 1 salida.
        DataSet ds = new DataSet(2,1); // Conjunto de datos de entrenamiento
        
        // Se agregan los pares de entrenamiento
        ds.addRow(new DataSetRow(new double[]{0,0}, new double[]{0}));
        ds.addRow(new DataSetRow(new double[]{0,1}, new double[]{1}));
        ds.addRow(new DataSetRow(new double[]{1,0}, new double[]{1}));
        ds.addRow(new DataSetRow(new double[]{1,1}, new double[]{1}));
        
        // Se procede a entrenar la red neuronal
        nn.learn(ds);
        nn.save("C:\\Users\\LLira\\Desktop\\nn\\OR.nnet");
        
        int x1, x2;
        double y;
        x1 = Integer.parseInt(txtX1.getText());
        x2 = Integer.parseInt(txtX2.getText());
        
        // Se procede a calcular la salida
        nn.setInput(x1,x2);
        nn.calculate();
        y = nn.getOutput()[0]; // Recuperamos el primer elemento
        
        txtY.setText("" + y);
    }//GEN-LAST:event_btnCalcularORActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        txtX1.setText("");
        txtX2.setText("");
        txtY.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnCalculaANDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculaANDActionPerformed
        // TODO add your handling code here:
        NeuralNetwork nn = new Perceptron(2,1); // 2 entradas, 1 salida.
        DataSet ds = new DataSet(2,1); // Conjunto de datos de entrenamiento
        
        // Se agregan los pares de entrenamiento
        ds.addRow(new DataSetRow(new double[]{0,0}, new double[]{0}));
        ds.addRow(new DataSetRow(new double[]{0,1}, new double[]{0}));
        ds.addRow(new DataSetRow(new double[]{1,0}, new double[]{0}));
        ds.addRow(new DataSetRow(new double[]{1,1}, new double[]{1}));
        
        // Se procede a entrenar la red neuronal
        nn.learn(ds);
        nn.save("C:\\Users\\LLira\\Desktop\\nn\\AND.nnet");
        
        int x1, x2;
        double y;
        x1 = Integer.parseInt(txtX1.getText());
        x2 = Integer.parseInt(txtX2.getText());
        
        // Se procede a calcular la salida
        nn.setInput(x1,x2);
        nn.calculate();
        y = nn.getOutput()[0]; // Recuperamos el primer elemento
        
        txtY.setText("" + y);
    }//GEN-LAST:event_btnCalculaANDActionPerformed

    private void btnCalculaXORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculaXORActionPerformed
        // TODO add your handling code here:
        NeuralNetwork nn = new MultiLayerPerceptron(2,4,1); // 2 entradas, 4 en la capa oculta, 1 salida.
        DataSet ds = new DataSet(2,1); // Conjunto de datos de entrenamiento
        
        // Se agregan los pares de entrenamiento
        ds.addRow(new DataSetRow(new double[]{0,0}, new double[]{0}));
        ds.addRow(new DataSetRow(new double[]{0,1}, new double[]{1}));
        ds.addRow(new DataSetRow(new double[]{1,0}, new double[]{1}));
        ds.addRow(new DataSetRow(new double[]{1,1}, new double[]{0}));
        
        // Se procede a entrenar la red neuronal
        nn.learn(ds);
        nn.save("C:\\Users\\LLira\\Desktop\\nn\\XOR.nnet");
        
        int x1, x2;
        double y;
        DecimalFormat df = new DecimalFormat("##.##");
        
        x1 = Integer.parseInt(txtX1.getText());
        x2 = Integer.parseInt(txtX2.getText());
        
        // Se procede a calcular la salida
        nn.setInput(x1,x2);
        nn.calculate();
        y = nn.getOutput()[0]; // Recuperamos el primer elemento
        
        txtY.setText("" + df.format(y));
    }//GEN-LAST:event_btnCalculaXORActionPerformed

    private void btnCreditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreditosActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Alumno: Luis Fernando Lira García" + "\nNo. Control: 1216100769" 
                + "\nGrupo: GITI10071-E" + "\nAsignatura: Ingenieria del conocimiento", "Créditos", 
                JOptionPane.WARNING_MESSAGE,user);
    }//GEN-LAST:event_btnCreditosActionPerformed

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
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculaAND;
    private javax.swing.JButton btnCalculaXOR;
    private javax.swing.JButton btnCalcularOR;
    private javax.swing.JButton btnCreditos;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtX1;
    private javax.swing.JTextField txtX2;
    private javax.swing.JTextField txtY;
    // End of variables declaration//GEN-END:variables
}
