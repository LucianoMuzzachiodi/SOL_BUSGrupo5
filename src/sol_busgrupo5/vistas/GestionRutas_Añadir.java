package sol_busgrupo5.vistas;

import java.awt.HeadlessException;
import java.sql.Time;
import java.time.LocalTime;
import javax.swing.JOptionPane;
import sol_busgrupo5.accesoADatos.RutaData;
import sol_busgrupo5.entidades.Ruta;

public class GestionRutas_Añadir extends javax.swing.JInternalFrame {
    RutaData RD = new RutaData();

    public GestionRutas_Añadir() {
        initComponents();
        vaciarFormulario();
        jEliminar.setVisible(false);
        jNuevo.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextoOrigen = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextoDestino = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jGuardar = new javax.swing.JButton();
        jSalir = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
        jBuscar = new javax.swing.JButton();
        jEliminar = new javax.swing.JButton();
        jNuevo = new javax.swing.JButton();
        jLabelID = new javax.swing.JLabel();
        jTextoID = new javax.swing.JTextField();
        jComboBox = new javax.swing.JComboBox<>();

        jLabel1.setText("Origen:");

        jLabel2.setText("Destino:");

        jLabel3.setText("Duración estimada (hs):");

        jGuardar.setText("Guardar");
        jGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGuardarActionPerformed(evt);
            }
        });

        jSalir.setText("Salir");
        jSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalirActionPerformed(evt);
            }
        });

        jLabelTitulo.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabelTitulo.setText("Añadir una Ruta");

        jBuscar.setText("Buscar");
        jBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarActionPerformed(evt);
            }
        });

        jEliminar.setText("Eliminar");
        jEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEliminarActionPerformed(evt);
            }
        });

        jNuevo.setText("Nuevo");
        jNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNuevoActionPerformed(evt);
            }
        });

        jLabelID.setText("ID:");

        jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabelTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSalir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jEliminar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jNuevo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextoOrigen))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextoDestino)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabelID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextoID, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextoOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextoDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jGuardar)
                    .addComponent(jBuscar)
                    .addComponent(jNuevo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jEliminar)
                    .addComponent(jSalir))
                .addGap(4, 4, 4))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jSalirActionPerformed

    private void jGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGuardarActionPerformed
        try {
            jTextoID.setText("");
            jTextoID.setEditable(false);
            if (validar()) {
                Time duracion = Time.valueOf(jComboBox.getSelectedItem().toString());
                if (jGuardar.getText().equals("Guardar")) {
                    RD.agregarRuta(new Ruta(jTextoOrigen.getText(), jTextoDestino.getText(), duracion, true));
                } else {
                    RD.modificarRuta(new Ruta(Integer.parseInt(jTextoID.getText()), jTextoOrigen.getText(), jTextoDestino.getText(), duracion, true));
                }
                vaciarFormulario();
            }
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error inesperado");
        }
    }//GEN-LAST:event_jGuardarActionPerformed

    private void jNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNuevoActionPerformed
        vaciarFormulario();
    }//GEN-LAST:event_jNuevoActionPerformed

    private void jEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEliminarActionPerformed
        RD.eliminarRuta(Integer.parseInt(jTextoID.getText()));
        jNuevoActionPerformed(evt);
    }//GEN-LAST:event_jEliminarActionPerformed

    private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarActionPerformed
        try {
            jTextoID.requestFocus();
            llenarFormulario(RD.buscarPorID(Integer.parseInt(jTextoID.getText())));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Valor inválido");
            jTextoID.requestFocus();
        }
    }//GEN-LAST:event_jBuscarActionPerformed
        
    private boolean validar() {
        if (jTextoOrigen.getText().isEmpty() || !jTextoOrigen.getText().matches("[a-zA-Z ]+")) {
            JOptionPane.showMessageDialog(this, "Valor inválido");
            jTextoOrigen.requestFocus();
            return false;
        } else if (jTextoDestino.getText().isEmpty() || !jTextoDestino.getText().matches("[a-zA-Z ]+")) {
            JOptionPane.showMessageDialog(this, "Valor inválido");
            jTextoDestino.requestFocus();
            return false;
        }
        return true;
    }

    private void vaciarFormulario() {
        jComboBox.removeAllItems();
        int aux = 0;
        for (int i = 0; i < 144; i++) {
            aux = aux + 10;
            LocalTime LT = LocalTime.of(23, 50, 00);
            jComboBox.addItem("" + Time.valueOf(LT.plusMinutes(aux)));
        }
        jTextoDestino.setText("");
        jTextoOrigen.setText("");
        jTextoID.setText("");
        jLabelTitulo.setText("Añadir una Ruta");
        jGuardar.setText("Guardar");
        jEliminar.setVisible(false);
        jTextoID.setEditable(true);
        jNuevo.setVisible(false);
        jTextoOrigen.requestFocus();
    }

    private void llenarFormulario(Ruta ruta) {
        jComboBox.removeAllItems();
        jNuevo.setVisible(true);
        jTextoID.setEditable(false);
        jEliminar.setVisible(true);
        jGuardar.setText("Modificar");
        jLabelTitulo.setText("Buscar una ruta");
        jTextoID.setText("" + ruta.getIdRuta());
        jTextoOrigen.setText(ruta.getOrigen());
        jTextoDestino.setText(ruta.getDestino());
        jComboBox.addItem("" + ruta.getDuracionEstimada());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBuscar;
    private javax.swing.JComboBox<String> jComboBox;
    private javax.swing.JButton jEliminar;
    private javax.swing.JButton jGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JButton jNuevo;
    private javax.swing.JButton jSalir;
    private javax.swing.JTextField jTextoDestino;
    private javax.swing.JTextField jTextoID;
    private javax.swing.JTextField jTextoOrigen;
    // End of variables declaration//GEN-END:variables
}
