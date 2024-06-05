package sol_busgrupo5.vistas;

import javax.swing.JOptionPane;
import sol_busgrupo5.accesoADatos.PasajeroData;
import sol_busgrupo5.entidades.Pasajero;

public class GestionPasajeros_Añadir extends javax.swing.JInternalFrame {
    PasajeroData PD = new PasajeroData();
    
    public GestionPasajeros_Añadir() {
        initComponents();
        jTextoID.setVisible(false);
        jLabelID.setVisible(false);
        jNuevo.setVisible(false);
        jEliminar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextoNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextoApellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextoDNI = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextoCorreo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextoTelefono = new javax.swing.JTextField();
        jGuardar = new javax.swing.JButton();
        jSalir = new javax.swing.JButton();
        jBuscar = new javax.swing.JButton();
        jLabelID = new javax.swing.JLabel();
        jTextoID = new javax.swing.JTextField();
        jLabelTextoPrincipal = new javax.swing.JLabel();
        jNuevo = new javax.swing.JButton();
        jEliminar = new javax.swing.JButton();

        jLabel1.setText("Nombre:");

        jTextoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextoNombreActionPerformed(evt);
            }
        });

        jLabel2.setText("Apellido:");

        jTextoApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextoApellidoActionPerformed(evt);
            }
        });

        jLabel3.setText("DNI:");

        jLabel4.setText("Correo electrónico:");

        jLabel5.setText("Teléfono:");

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

        jBuscar.setText("Buscar");
        jBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarActionPerformed(evt);
            }
        });

        jLabelID.setText("ID:");

        jTextoID.setEditable(false);

        jLabelTextoPrincipal.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabelTextoPrincipal.setText("Añadir Pasajero");

        jNuevo.setText("Nuevo");
        jNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNuevoActionPerformed(evt);
            }
        });

        jEliminar.setText("Eliminar");
        jEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jTextoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jTextoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jTextoDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jTextoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jTextoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelID)
                                .addGap(18, 18, 18)
                                .addComponent(jTextoID, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jEliminar)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jGuardar)
                                .addGap(4, 4, 4)
                                .addComponent(jBuscar)))
                        .addGap(88, 88, 88)
                        .addComponent(jSalir)
                        .addGap(18, 18, 18))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jNuevo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabelTextoPrincipal)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTextoPrincipal)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextoDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSalir)
                    .addComponent(jBuscar)
                    .addComponent(jGuardar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNuevo)
                    .addComponent(jEliminar))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGuardarActionPerformed
        if(jGuardar.getText().equals("Guardar")){
            if(jTextoNombre.getText().equals("")){
                JOptionPane.showMessageDialog(this,"Campo nombre vacío"); jTextoNombre.requestFocus();
            }else if(jTextoApellido.getText().equals("")){
                JOptionPane.showMessageDialog(this,"Campo apellido vacío"); jTextoApellido.requestFocus();
            }else if(jTextoDNI.getText().equals("")){
                JOptionPane.showMessageDialog(this,"Campo DNI vacío"); jTextoDNI.requestFocus();
            }else if(jTextoCorreo.getText().equals("")){
                JOptionPane.showMessageDialog(this,"Campo correo vacío"); jTextoCorreo.requestFocus();
            }else if(jTextoTelefono.getText().equals("")){
                JOptionPane.showMessageDialog(this,"Campo teléfono vacío"); jTextoTelefono.requestFocus();
            }else{
                PD.guardar(new Pasajero(jTextoNombre.getText(),jTextoApellido.getText(),Integer.parseInt(jTextoDNI.getText()),jTextoCorreo.getText(),jTextoTelefono.getText(),true));
                jNuevo.setVisible(true);
            }
        }else{
            PD.modificar(new Pasajero(Integer.parseInt(jTextoID.getText()),jTextoNombre.getText(),jTextoApellido.getText(),Integer.parseInt(jTextoDNI.getText()),jTextoCorreo.getText(),jTextoTelefono.getText(),true));
        }
    }//GEN-LAST:event_jGuardarActionPerformed
    private void jTextoApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextoApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextoApellidoActionPerformed
    private void jTextoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextoNombreActionPerformed

    private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarActionPerformed
        try {
            if(!jTextoNombre.getText().equals("") && jTextoApellido.getText().equals("") && jTextoDNI.getText().equals("")){
                Pasajero pasajero = PD.buscarNombre(jTextoNombre.getText());
                jTextoID.setText(""+pasajero.getIdPasajero());
                jTextoNombre.setText(""+pasajero.getNombre());
                jTextoApellido.setText(""+pasajero.getApellido());
                jTextoDNI.setText(""+pasajero.getDni());
                jTextoCorreo.setText(""+pasajero.getCorreo());
                jTextoTelefono.setText(""+pasajero.getTelefono());
                jLabelTextoPrincipal.setText("Buscar Pasajero");
                jGuardar.setText("Modificar");
                jTextoID.setVisible(true);
                jLabelID.setVisible(true);
                jEliminar.setVisible(true);
                jNuevo.setVisible(true);
            }else if(jTextoNombre.getText().equals("") && !jTextoApellido.getText().equals("") && jTextoDNI.getText().equals("")){
                Pasajero pasajero = PD.buscarApellido(jTextoApellido.getText());
                jTextoID.setText(""+pasajero.getIdPasajero());
                jTextoNombre.setText(""+pasajero.getNombre());
                jTextoApellido.setText(""+pasajero.getApellido());
                jTextoDNI.setText(""+pasajero.getDni());
                jTextoCorreo.setText(""+pasajero.getCorreo());
                jTextoTelefono.setText(""+pasajero.getTelefono());
                jLabelTextoPrincipal.setText("Buscar Pasajero");
                jGuardar.setText("Modificar");
                jTextoID.setVisible(true);
                jLabelID.setVisible(true);
                jEliminar.setVisible(true);
                jNuevo.setVisible(true);
            }else if(jTextoNombre.getText().equals("") && jTextoApellido.getText().equals("") && !jTextoDNI.getText().equals("")){
                Pasajero pasajero = PD.buscar(Integer.parseInt(jTextoDNI.getText()));
                jTextoID.setText(""+pasajero.getIdPasajero());
                jTextoNombre.setText(""+pasajero.getNombre());
                jTextoApellido.setText(""+pasajero.getApellido());
                jTextoDNI.setText(""+pasajero.getDni());
                jTextoCorreo.setText(""+pasajero.getCorreo());
                jTextoTelefono.setText(""+pasajero.getTelefono());
                jLabelTextoPrincipal.setText("Buscar Pasajero");
                jGuardar.setText("Modificar");
                jTextoID.setVisible(true);
                jLabelID.setVisible(true);
                jEliminar.setVisible(true);
                jNuevo.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(this,"Ingresá algún valor");
                jTextoNombre.requestFocus();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,"Valor inválido");
            jTextoDNI.setText(""); jTextoDNI.requestFocus();
        }
    }//GEN-LAST:event_jBuscarActionPerformed

    private void jSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jSalirActionPerformed

    private void jNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNuevoActionPerformed
        jTextoNombre.setText("");
        jTextoApellido.setText("");
        jTextoDNI.setText("");
        jTextoCorreo.setText("");
        jTextoTelefono.setText("");
        jTextoNombre.requestFocus();
        jNuevo.setVisible(false);
        jEliminar.setVisible(false);
        jGuardar.setText("Guardar");
        jLabelTextoPrincipal.setText("Añadir Pasajero");
        jLabelID.setVisible(false);
        jTextoID.setVisible(false);
    }//GEN-LAST:event_jNuevoActionPerformed

    private void jEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEliminarActionPerformed
        PD.eliminar(Integer.parseInt(jTextoID.getText()));
    }//GEN-LAST:event_jEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBuscar;
    private javax.swing.JButton jEliminar;
    private javax.swing.JButton jGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelTextoPrincipal;
    private javax.swing.JButton jNuevo;
    private javax.swing.JButton jSalir;
    private javax.swing.JTextField jTextoApellido;
    private javax.swing.JTextField jTextoCorreo;
    private javax.swing.JTextField jTextoDNI;
    private javax.swing.JTextField jTextoID;
    private javax.swing.JTextField jTextoNombre;
    private javax.swing.JTextField jTextoTelefono;
    // End of variables declaration//GEN-END:variables
}
