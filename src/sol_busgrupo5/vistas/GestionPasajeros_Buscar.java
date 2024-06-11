package sol_busgrupo5.vistas;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import javax.swing.table.*;
import sol_busgrupo5.accesoADatos.*;
import sol_busgrupo5.entidades.*;

public class GestionPasajeros_Buscar extends javax.swing.JInternalFrame {
    DefaultTableModel modelo = new DefaultTableModel();
    PasajeroData PD = new PasajeroData();
    RutaData RD = new RutaData();
    
    public GestionPasajeros_Buscar() {
        initComponents();
        configurarTabla();
        jComboBox.removeAllItems();
        jComboBox.addItem("Nombre");
        jComboBox.addItem("Apellido");
        jComboBox.addItem("DNI");
        JText.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        JText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

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

        JText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTextKeyReleased(evt);
            }
        });

        jLabel2.setText("Ingresá:");

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                .addComponent(JText, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(JText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxActionPerformed
        JText.requestFocus();
        JText.setText("");
    }//GEN-LAST:event_jComboBoxActionPerformed

    private void jTextoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextoKeyReleased
        
    }//GEN-LAST:event_jTextoKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void JTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextKeyReleased
        llenarTabla();
    }//GEN-LAST:event_JTextKeyReleased
    
    private void llenarTabla() {
        if (!PD.listarPasajeros().isEmpty()) {
            try {
                int contador = 0; String activo;
                if(!JText.getText().isEmpty()){
                    modelo.setRowCount(0);
                    for (Pasajero pasajero : PD.buscar_Lista(jComboBox.getSelectedItem().toString(), JText.getText())) {
                        contador++;
                        if (pasajero.isEstado()) {activo = "Activo";} else {activo = "Inactivo";}
                        modelo.addRow(new Object[]{contador, pasajero.getIdPasajero(), pasajero.getNombre(), pasajero.getApellido(), pasajero.getDni(), pasajero.getCorreo(), pasajero.getTelefono(), activo});                    
                    }
                }
            } catch (HeadlessException | NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "No se permiten letras. " + ex.getMessage());
            }
        }
    }

    private void configurarTabla(){
        modelo.setColumnIdentifiers(new Object[]{"ID", "Nombre", "Apellido", "DNI", "Correo", "Teléfono", "Estado"});
        jTabla.setModel(modelo);
        if (!PD.listarPasajeros().isEmpty() && !RD.listarRutas().isEmpty()) {
            
            try {
                if (jComboBox.getSelectedItem().equals("Nombre") && !JText.getText().isEmpty() && PD.buscarNombre(JText.getText()) != null) {
                    for(Pasajero pasajero:PD.buscarNombre(JText.getText())){
                        modelo.addRow(new Object[]{pasajero.getIdPasajero(),pasajero.getNombre(),pasajero.getApellido(),pasajero.getDni(),pasajero.getCorreo(), pasajero.getTelefono(), pasajero.isEstado()});
                    }
                } else if (jComboBox.getSelectedItem().equals("Apellido") && !JText.getText().isEmpty() && PD.buscarApellido(JText.getText()) != null) {
                    for(Pasajero pasajero:PD.buscarApellido(JText.getText())){
                        modelo.addRow(new Object[]{pasajero.getIdPasajero(),pasajero.getNombre(),pasajero.getApellido(),pasajero.getDni(),pasajero.getCorreo(), pasajero.getTelefono(), pasajero.isEstado()});
                    }
                } else if (jComboBox.getSelectedItem().equals("DNI") && !JText.getText().isEmpty() && PD.buscarDNI(Integer.parseInt(JText.getText())) != null) {
                    for(Pasajero pasajero:PD.buscarDNI(Integer.parseInt(JText.getText()))){
                        modelo.addRow(new Object[]{pasajero.getIdPasajero(),pasajero.getNombre(),pasajero.getApellido(),pasajero.getDni(),pasajero.getCorreo(), pasajero.getTelefono(), pasajero.isEstado()});
                    }
                }
            } catch (NumberFormatException ex) {
                
            }
        }
        jTabla.setModel(modelo);
    }

    private void vaciarTabla() {
        for (int i = modelo.getRowCount() - 1; i >= 0; i--) {modelo.removeRow(i);}
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JText;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabla;
    // End of variables declaration//GEN-END:variables
}
