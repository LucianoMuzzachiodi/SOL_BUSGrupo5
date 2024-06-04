package sol_busgrupo5.vistas;

import java.awt.event.KeyEvent;
import javax.swing.table.DefaultTableModel;
import sol_busgrupo5.accesoADatos.*;
import sol_busgrupo5.entidades.*;

public class GestionPasajeros_Buscar extends javax.swing.JInternalFrame {
    DefaultTableModel modelo = new DefaultTableModel();
    PasajeroData PD = new PasajeroData();
    KeyEvent evt;
    
    public GestionPasajeros_Buscar() {
        initComponents();
        llenarTabla(evt);
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

        jTexto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextoKeyReleased(evt);
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
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
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
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
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
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxActionPerformed
        jTexto.requestFocus();
    }//GEN-LAST:event_jComboBoxActionPerformed

    private void jTextoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextoKeyReleased
        llenarTabla(evt);
    }//GEN-LAST:event_jTextoKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void llenarTabla(java.awt.event.KeyEvent evt){
        vaciarTabla();
        modelo.setColumnCount(0);
        modelo.addColumn("");
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("DNI");
        modelo.addColumn("Correo");
        modelo.addColumn("Teléfono");
        modelo.addColumn("Estado");
        int contador = 0;
        for (Pasajero pasajeros : PD.listarPasajeros()) {
            contador++; String dni = String.valueOf(pasajeros.getDni());
            if (jComboBox.getSelectedItem().equals("Nombre") && pasajeros.getNombre().startsWith(jTexto.getText().toLowerCase())) {
                Pasajero pasajero = PD.buscarNombre(jTexto.getText()); String activo;
                if(pasajero.isEstado()){activo = "Activo";}else{activo = "Inactivo";}
                modelo.addRow(new Object[]{contador,pasajero.getIdPasajero(),pasajero.getNombre(),pasajero.getApellido(),pasajero.getDni(),pasajero.getCorreo(),pasajero.getTelefono(),activo});
            } else if (jComboBox.getSelectedItem().equals("Apellido") && pasajeros.getApellido().startsWith(jTexto.getText().toLowerCase())) {
                Pasajero pasajero = PD.buscarApellido(jTexto.getText()); String activo;
                if(pasajero.isEstado()){activo = "Activo";}else{activo = "Inactivo";}
                modelo.addRow(new Object[]{contador,pasajero.getIdPasajero(),pasajero.getNombre(),pasajero.getApellido(),pasajero.getDni(),pasajero.getCorreo(),pasajero.getTelefono(),activo});
            } else if (jComboBox.getSelectedItem().equals("DNI") && dni.startsWith(jTexto.getText())) {
                Pasajero pasajero = PD.buscar(Integer.parseInt(jTexto.getText())); String activo;
                if(pasajero.isEstado()){activo = "Activo";}else{activo = "Inactivo";}
                modelo.addRow(new Object[]{contador,pasajero.getIdPasajero(),pasajero.getNombre(),pasajero.getApellido(),pasajero.getDni(),pasajero.getCorreo(),pasajero.getTelefono(),activo});
            }
        }
        jTabla.setModel(modelo);
    }
    private void vaciarTabla(){
        for (int i = modelo.getRowCount() - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabla;
    private javax.swing.JTextField jTexto;
    // End of variables declaration//GEN-END:variables
}
