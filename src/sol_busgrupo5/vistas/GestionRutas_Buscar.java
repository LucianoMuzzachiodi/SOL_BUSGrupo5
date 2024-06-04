package sol_busgrupo5.vistas;

import java.awt.event.KeyEvent;
import javax.swing.table.DefaultTableModel;
import sol_busgrupo5.accesoADatos.*;
import sol_busgrupo5.entidades.*;

public class GestionRutas_Buscar extends javax.swing.JInternalFrame {
    DefaultTableModel modelo = new DefaultTableModel();
    RutaData RD = new RutaData();
    KeyEvent evt;
    
    public GestionRutas_Buscar() {
        initComponents();
        llenarTabla(evt);
        jComboBox.removeAllItems();
        jComboBox.addItem("Origen");
        jComboBox.addItem("Destino");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jSalir = new javax.swing.JButton();
        jTexto = new javax.swing.JTextField();

        jLabel1.setText("Buscar por");

        jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActionPerformed(evt);
            }
        });

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

        jSalir.setText("Salir");
        jSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalirActionPerformed(evt);
            }
        });

        jTexto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSalir)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSalir)
                    .addComponent(jTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxActionPerformed
        jTexto.requestFocus();
    }//GEN-LAST:event_jComboBoxActionPerformed

    private void jSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jSalirActionPerformed

    private void jTextoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextoKeyReleased
        llenarTabla(evt);
    }//GEN-LAST:event_jTextoKeyReleased
    private void llenarTabla(java.awt.event.KeyEvent evt){
        vaciarTabla();
        modelo.setColumnCount(0);
        modelo.addColumn("");
        modelo.addColumn("ID");
        modelo.addColumn("Origen");
        modelo.addColumn("Destino");
        modelo.addColumn("Duración");
        modelo.addColumn("Estado");
        int contador = 0;
        for (Ruta rutas : RD.listarRutas()) {
            contador++; String activo;
            if (jComboBox.getSelectedItem().equals("Origen") && rutas.getOrigen().startsWith(jTexto.getText().toLowerCase())) {
                Ruta ruta = RD.buscarRuta("Origen",jTexto.getText());
                if(ruta.isEstado()){activo = "Activo";}else{activo = "Inactivo";}
                modelo.addRow(new Object[]{contador,ruta.getIdRuta(),ruta.getOrigen(),ruta.getDestino(),ruta.getDuracionEstimada(),activo});
            } else if (jComboBox.getSelectedItem().equals("Destino") && rutas.getDestino().startsWith(jTexto.getText().toLowerCase())) {
                Ruta ruta = RD.buscarRuta("Destino",jTexto.getText());
                if(ruta.isEstado()){activo = "Activo";}else{activo = "Inactivo";}
                modelo.addRow(new Object[]{contador,ruta.getIdRuta(),ruta.getOrigen(),ruta.getDestino(),ruta.getDuracionEstimada(),activo});
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
    private javax.swing.JComboBox<String> jComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabla;
    private javax.swing.JTextField jTexto;
    // End of variables declaration//GEN-END:variables
}
