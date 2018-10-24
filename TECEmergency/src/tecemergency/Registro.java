/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecemergency;

/**
 *
 * @author Melina
 */
public class Registro extends javax.swing.JFrame {
    
    /**
     * Creates new form Registro
     */
    public Registro() {
        initComponents();
        cmbTipo.removeAllItems();
        for (Enfermedades e : Enfermedades.values()){
            cmbTipo.addItem(e.getEnfermedad());
        }
        cmbSeccion.removeAllItems();
        cmbSeccion.addItem("AMARILLO");
        cmbSeccion.addItem("VERDE");
        setSize(680,627);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRegistro = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        lblDetalles = new javax.swing.JLabel();
        lblSeccion = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDetalles = new javax.swing.JTextArea();
        cmbTipo = new javax.swing.JComboBox<>();
        cmbSeccion = new javax.swing.JComboBox<>();
        btnRegistrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        getContentPane().setLayout(null);

        lblRegistro.setFont(new java.awt.Font("Perpetua Titling MT", 1, 22)); // NOI18N
        lblRegistro.setForeground(new java.awt.Color(51, 51, 51));
        lblRegistro.setText("REGISTRO DEL PACIENTE");
        getContentPane().add(lblRegistro);
        lblRegistro.setBounds(190, 20, 340, 50);

        lblNombre.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(51, 51, 51));
        lblNombre.setText("Nombre:");
        getContentPane().add(lblNombre);
        lblNombre.setBounds(50, 100, 100, 30);

        lblFecha.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(51, 51, 51));
        lblFecha.setText("Fecha nacimiento:");
        getContentPane().add(lblFecha);
        lblFecha.setBounds(50, 180, 210, 30);

        lblTipo.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        lblTipo.setForeground(new java.awt.Color(51, 51, 51));
        lblTipo.setText("Tipo padecimiento:");
        getContentPane().add(lblTipo);
        lblTipo.setBounds(50, 260, 220, 30);

        lblDetalles.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        lblDetalles.setForeground(new java.awt.Color(51, 51, 51));
        lblDetalles.setText("detalles:");
        getContentPane().add(lblDetalles);
        lblDetalles.setBounds(50, 340, 100, 30);

        lblSeccion.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        lblSeccion.setForeground(new java.awt.Color(51, 51, 51));
        lblSeccion.setText("Sección:");
        getContentPane().add(lblSeccion);
        lblSeccion.setBounds(50, 430, 100, 30);

        txtNombre.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre);
        txtNombre.setBounds(160, 90, 370, 40);

        txtFecha.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });
        getContentPane().add(txtFecha);
        txtFecha.setBounds(270, 170, 310, 40);

        txtDetalles.setColumns(20);
        txtDetalles.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        txtDetalles.setRows(5);
        jScrollPane1.setViewportView(txtDetalles);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(170, 310, 440, 90);

        cmbTipo.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cmbTipo);
        cmbTipo.setBounds(280, 250, 160, 40);

        cmbSeccion.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        cmbSeccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cmbSeccion);
        cmbSeccion.setBounds(170, 420, 170, 40);

        btnRegistrar.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar);
        btnRegistrar.setBounds(260, 500, 150, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/257a75c1-2119-4e74-b908-cf7a24d02f58.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-40, -20, 740, 650);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarActionPerformed

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cmbSeccion;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDetalles;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRegistro;
    private javax.swing.JLabel lblSeccion;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JTextArea txtDetalles;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}