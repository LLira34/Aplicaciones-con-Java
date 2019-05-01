/**
 * @Formulario Registro de Temas
 * @author Ulises García Ponce
 * @--ulisesgarcia060@gmail.com
 * @En este formulario se tomara el registro de cada materia y su calificación
 */
package views;

import dao.impl.MateriaDAOImplHibernate;
import dao.impl.TemaDAOImplHibernate;
import dao.impl.UnidadDAOImplHibernate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import modelo.ItemMateria;
import modelo.ItemUnidadTematica;
import modelo.Materia;
import modelo.Participante;
import modelo.Tema;
import modelo.Unidad;
import utils.SiscomException;
import utils.UtileriasStyle;
import viewsmodel.TemasTableModel;

public class viewTemas extends javax.swing.JFrame {

    //Encabezado de las columnas 
    private final String[] encabezadoColumnas = {"Nombre", "Eliminar", "Actualizar"};
    private final DefaultTableModel modelo = new DefaultTableModel(null, encabezadoColumnas); //definel las columnas
    
    private int id;
    
    private TemaDAOImplHibernate dao = new TemaDAOImplHibernate();
    /**
     * Creates new form viewTemas
     */
    public viewTemas() {
        initComponents();
        tableRegistro.setModel(modelo);

        //Utilerias para centrar la ventana en cualquier resolucion
        UtileriasStyle.centrarVentana(this);
        UtileriasStyle.initStyle(panelTemas.getComponents());//Dar formato al panel
        UtileriasStyle.initStyle(panelTitulos.getComponents());
        UtileriasStyle.initStyle(panelLabels.getComponents());
        //tableRegistro.setModel(modelo);
        //fin de centrar pantalla
        
        //Inicializa los metodos
        this.ComboMateria();
        this.ComboUnidadTematica();
        this.initTable();
        //Metodos
    }
    
    //Metodo que manda llamar los datos desde la base de datos
    private void initTable() {

        try {
            List<Tema> listaTemas = dao.findAll();
            TemasTableModel modelo = new TemasTableModel();
            for (Tema p : listaTemas) {
                modelo.inserData(new Object[]{p.getId(), p.getNombre()});

            }
            tableRegistro.setModel(modelo);
        } catch (SiscomException ex) {
            JOptionPane.showMessageDialog(this, "Error al cargar datos");
        }

    }
    
    //Limpia los campos una vez que se le haya dado click en agregar
    private void limpiar() {
        txtNombreTema.setText(null);
        txtSaber.setText(null);
        txtSaberHacer.setText(null);
        txtSer.setText(null);
        }

       //Manda llamar mediante una consulta los datos de la tabla materia que se extraera solamente el nombre de la materia
    private void ComboMateria() {

        try {
            MateriaDAOImplHibernate dao = new MateriaDAOImplHibernate();
            List<Materia> materias = dao.findAll();

            List<ItemMateria> listaMateria = new ArrayList<>();

            for (Materia materia : materias) {
                listaMateria.add(new ItemMateria(materia.getId(), materia.getNombre()));
            }
            ComboBoxModel model = new DefaultComboBoxModel(listaMateria.toArray());
            comboMateria.setModel(model);
        } catch (SiscomException ex) {
            Logger.getLogger(viewTemas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      //Manda llamar mediante una consulta los datos de la tabla Unnidad que se extraera solamente el numero de la unidad
    private void ComboUnidadTematica() {

        try {
            UnidadDAOImplHibernate dao = new UnidadDAOImplHibernate();
            List<Unidad> unidades = dao.findAll();

            List<ItemUnidadTematica> listaUnidad = new ArrayList<>();

            for (Unidad unidad : unidades) {
                listaUnidad.add(new ItemUnidadTematica(unidad.getId(), unidad.getNombre()));
            }
            ComboBoxModel model = new DefaultComboBoxModel(listaUnidad.toArray());
            comboUnidad.setModel(model);
        } catch (SiscomException ex) {
            Logger.getLogger(viewTemas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        panelTemas = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableRegistro = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        panelTitulos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        panelLabels = new javax.swing.JPanel();
        comboMateria = new javax.swing.JComboBox<>();
        comboUnidad = new javax.swing.JComboBox<>();
        txtNombreTema = new javax.swing.JTextField();
        txtSaber = new javax.swing.JTextField();
        txtSaberHacer = new javax.swing.JTextField();
        txtSer = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        jLabel2.setBackground(new java.awt.Color(0, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Registro de Temas");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jLabel2.setOpaque(true);

        tableRegistro.setBackground(new java.awt.Color(204, 255, 255));
        tableRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Nombre", "Eliminar", "Actualizar"
            }
        ));
        tableRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableRegistroMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableRegistro);

        btnAgregar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(0, 0, 102));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnAgregar.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
        });
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnRegresar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(0, 0, 102));
        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btAtras.png"))); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegresarMouseClicked(evt);
            }
        });

        panelTitulos.setLayout(new java.awt.GridLayout(0, 1));

        jLabel1.setBackground(new java.awt.Color(0, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Materia");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jLabel1.setMaximumSize(new java.awt.Dimension(80, 23));
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(100, 100));
        jLabel1.setRequestFocusEnabled(false);
        panelTitulos.add(jLabel1);

        jLabel3.setBackground(new java.awt.Color(0, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("Unidad Temática");
        jLabel3.setToolTipText("");
        jLabel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jLabel3.setOpaque(true);
        panelTitulos.add(jLabel3);

        jLabel4.setBackground(new java.awt.Color(0, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("Nombre Tema");
        jLabel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jLabel4.setOpaque(true);
        panelTitulos.add(jLabel4);

        jLabel5.setBackground(new java.awt.Color(0, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText("Saber");
        jLabel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jLabel5.setOpaque(true);
        panelTitulos.add(jLabel5);

        jLabel6.setBackground(new java.awt.Color(0, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setText("Saber Hacer");
        jLabel6.setToolTipText("");
        jLabel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jLabel6.setOpaque(true);
        panelTitulos.add(jLabel6);

        jLabel7.setBackground(new java.awt.Color(0, 255, 255));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 102));
        jLabel7.setText("Ser");
        jLabel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jLabel7.setOpaque(true);
        panelTitulos.add(jLabel7);

        panelLabels.setLayout(new java.awt.GridLayout(0, 1));

        comboMateria.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        comboMateria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Desarrollo de Aplicaciones I" }));
        comboMateria.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        comboMateria.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        comboMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMateriaActionPerformed(evt);
            }
        });
        panelLabels.add(comboMateria);

        comboUnidad.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        comboUnidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Unida Conceptos Básicos" }));
        comboUnidad.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        comboUnidad.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelLabels.add(comboUnidad);

        txtNombreTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreTemaActionPerformed(evt);
            }
        });
        panelLabels.add(txtNombreTema);

        txtSaber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSaberActionPerformed(evt);
            }
        });
        panelLabels.add(txtSaber);
        panelLabels.add(txtSaberHacer);
        panelLabels.add(txtSer);

        btnUpdate.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(0, 0, 102));
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh.png"))); // NOI18N
        btnUpdate.setText("Actualizar");
        btnUpdate.setToolTipText("");
        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelTemasLayout = new javax.swing.GroupLayout(panelTemas);
        panelTemas.setLayout(panelTemasLayout);
        panelTemasLayout.setHorizontalGroup(
            panelTemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTemasLayout.createSequentialGroup()
                .addGroup(panelTemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelTemasLayout.createSequentialGroup()
                        .addGroup(panelTemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelTemasLayout.createSequentialGroup()
                                .addComponent(panelTitulos, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(panelLabels, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelTemasLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelTemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelTemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnUpdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        panelTemasLayout.setVerticalGroup(
            panelTemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTemasLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(panelTemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTemasLayout.createSequentialGroup()
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(183, 183, 183)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addComponent(panelTitulos, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(panelLabels, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTemas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTemas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
        try {
            /* Codigo para las validacion de campos vacios no podra
            ingresar datos si no llena los campos */
            
            //Validacion de los campos vacios
            String message = "";
            
            if (txtSer.getText().trim().isEmpty()) {
                message = "Debe ingresar el 'ser' \n";
            }
            if (txtSaberHacer.getText().trim().isEmpty()) {
                message = "Debe ingresar datos en el 'Saber hacer'\n";
            }
            if (txtSaber.getText().trim().isEmpty()) {
                message = "Debe ingresar datos en el 'Saber'\n";
            }
            if (txtNombreTema.getText().trim().isEmpty()) {
                message = "Debe ingresar 'Nombre del Tema'\n";
            }
           /*if (comboUnidad.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Selecciona una Unidad");
            }
            if (comboMateria.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Selecciona una Materia");
            }
            */
            if (!message.isEmpty()) {
                JOptionPane.showMessageDialog(this, message, "Ingreso de datos",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
            //Fin de la validacion de los campos vacios
            
            // Se crea el objeto para poder mandar los datos ingresados en los cspos para subirlos a la base de datos
            TemaDAOImplHibernate dao = new TemaDAOImplHibernate();
            
            Tema part = new Tema();
            
            part.setNombre(txtNombreTema.getText());
            part.setSaber(txtSaber.getText());
            part.setSaberHacer(txtSaberHacer.getText());
            part.setSer(txtSer.getText());
            
            ItemUnidadTematica itemUnidad = (ItemUnidadTematica) comboUnidad.getSelectedItem();
            Unidad unidad = new Unidad();
            unidad.setId(itemUnidad.getId());
            part.setUnidadId(unidad);
            
            dao.saveOrUpdate(part);
            this.initTable();
        } catch (SiscomException ex) {
            Logger.getLogger(viewTemas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Metodo para limpiar los campos una vez darle clic en el boton de agregar
        limpiar();

    }//GEN-LAST:event_btnAgregarMouseClicked

    private void btnRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseClicked
        //Boton de regresar 
        //this.setVisible(false);
        //ViewUnidadesTematicas ut= new ViewUnidadesTematicas();
        //ut.setVisible(true);
    }//GEN-LAST:event_btnRegresarMouseClicked

    private void tableRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableRegistroMouseClicked
        //En este codigo se implementa la opcion de si el usuario desea eliminar un curso
        int row = tableRegistro.rowAtPoint(evt.getPoint());
        int col = tableRegistro.columnAtPoint(evt.getPoint());

        if (col == 2) {
            int respuesta = JOptionPane.showConfirmDialog(this, "Desea eliminar el registro", "Eliminacion de registro", JOptionPane.YES_NO_OPTION);

            if (respuesta == 0) {
                try {
                    int id = Integer.valueOf(tableRegistro.getValueAt(row, 0).toString());
                    dao.delete(id);
                    this.initTable();
                } catch (SiscomException ex) {
                    JOptionPane.showMessageDialog(this, "No se pudo eliminar el registro");
                }

            }
        }
       if (col == 3){
           id = Integer.valueOf(tableRegistro.getValueAt(row, 0).toString());
           
       }

    }//GEN-LAST:event_tableRegistroMouseClicked

    private void comboMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboMateriaActionPerformed

    private void txtNombreTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreTemaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreTemaActionPerformed

    private void txtSaberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSaberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSaberActionPerformed

    private void btnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateMouseClicked

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarActionPerformed

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
            java.util.logging.Logger.getLogger(viewTemas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewTemas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewTemas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewTemas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            //dar el diseño al jframe 
            //y sus componentes
            public void run() {

                try {
                       // Aqui va a cachear la utileria del jtatoo para darle fromato a la pantalla
                    UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
                    new viewTemas().setVisible(true);

                    //Fin del estilo
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(viewTemas.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(viewTemas.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(viewTemas.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(viewTemas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> comboMateria;
    private javax.swing.JComboBox<String> comboUnidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel panelLabels;
    private javax.swing.JPanel panelTemas;
    private javax.swing.JPanel panelTitulos;
    private javax.swing.JTable tableRegistro;
    private javax.swing.JTextField txtNombreTema;
    private javax.swing.JTextField txtSaber;
    private javax.swing.JTextField txtSaberHacer;
    private javax.swing.JTextField txtSer;
    // End of variables declaration//GEN-END:variables

}
