package sol_busgrupo5.vistas;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import javax.swing.table.*;
import sol_busgrupo5.accesoADatos.*;
import sol_busgrupo5.entidades.*;

public class GestionPasajeros_Buscar extends javax.swing.JInternalFrame {
    DefaultTableModel modelo = new DefaultTableModel();
    PasajeroData PD = new PasajeroData();
    
    public GestionPasajeros_Buscar() {
        initComponents();
        configurarTabla();
        jComboBox.removeAllItems();
        jComboBox.addItem("Nombre");
        jComboBox.addItem("Apellido");
        jComboBox.addItem("DNI");
        jTexto.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jTexto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSalir = new javax.swing.JButton();

        jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActionPerformed(evt);
            }
        });

        jLabel1.setText("Buscar por:");

        jTabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTabla);

        jTexto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextoKeyReleased(evt);
            }
        });

        jLabel2.setText("Ingresá:");

        jSalir.setText("Salir");
        jSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(jSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jSalir))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxActionPerformed
        jTexto.setText("");
        jTexto.requestFocus();
        configurarTabla();
        jTexto.requestFocus();
        jTexto.setText("");
    }//GEN-LAST:event_jComboBoxActionPerformed

    private void jTextoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextoKeyReleased
        llenarTabla();
    }//GEN-LAST:event_jTextoKeyReleased

    private void jSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jSalirActionPerformed

    private void JTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextKeyReleased
        llenarTabla();
    }//GEN-LAST:event_JTextKeyReleased
    
    private void llenarTabla() {
        configurarTabla();
        if (!PD.listarPasajeros().isEmpty()) {
            try {
                int contador = 0; String activo;
                if(!jTexto.getText().isEmpty()){
                    modelo.setRowCount(0);
                    for (Pasajero pasajero : PD.buscar_Lista(jComboBox.getSelectedItem().toString(), jTexto.getText())) {
                        contador++;
                        if (pasajero.isEstado()) {activo = "Activo";} else {activo = "Inactivo";}
                        modelo.addRow(new Object[]{contador, pasajero.getIdPasajero(), pasajero.getNombre(), pasajero.getApellido(), pasajero.getDni(), pasajero.getCorreo(), pasajero.getTelefono(), activo});                    
                    }
                }
            } catch (HeadlessException | NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "No se permiten letras. " + ex.getMessage());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Ocurrió un error inesperado. " + ex.getMessage());
            }
        }
    }

    private void configurarTabla(){
        modelo.setRowCount(0);
        modelo.setColumnCount(0);
        modelo.setColumnIdentifiers(new Object[]{"", "ID", "Nombre", "Apellido", "DNI", "Correo", "Teléfono", "Estado"});
        jTabla.setModel(modelo);
        TableColumnModel modeloColumna = jTabla.getColumnModel();
        TableColumn columna1 = modeloColumna.getColumn(0);
        TableColumn columna2 = modeloColumna.getColumn(1);
        TableColumn columna3 = modeloColumna.getColumn(2);
        TableColumn columna4 = modeloColumna.getColumn(3);
        TableColumn columna5 = modeloColumna.getColumn(4);
        TableColumn columna6 = modeloColumna.getColumn(5);
        TableColumn columna7 = modeloColumna.getColumn(6);
        TableColumn columna8 = modeloColumna.getColumn(7);
        columna1.setPreferredWidth(0);
        columna2.setPreferredWidth(0);
        columna3.setPreferredWidth(100);
        columna4.setPreferredWidth(100);
        columna5.setPreferredWidth(50);
        columna6.setPreferredWidth(150);
        columna7.setPreferredWidth(70);
        columna8.setPreferredWidth(40);
        int contador = 0;
        if (!PD.listarPasajeros().isEmpty()) {
            for (Pasajero pasajero : PD.listarPasajeros()) {
                contador++; String activo;
                if (pasajero.isEstado()) {activo = "Activo";} else {activo = "Inactivo";}
                modelo.addRow(new Object[]{contador, pasajero.getIdPasajero(), pasajero.getNombre(), pasajero.getApellido(), pasajero.getDni(), pasajero.getCorreo(), pasajero.getTelefono(), activo});          
            }
        }
        jTabla.setModel(modelo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabla;
    private javax.swing.JTextField jTexto;
    // End of variables declaration//GEN-END:variables
}
