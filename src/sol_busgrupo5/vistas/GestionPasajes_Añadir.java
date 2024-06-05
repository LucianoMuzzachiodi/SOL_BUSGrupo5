package sol_busgrupo5.vistas;

import java.awt.HeadlessException;
import java.sql.*;
import java.time.*;
import javax.swing.JOptionPane;
import sol_busgrupo5.accesoADatos.*;
import sol_busgrupo5.entidades.*;

public class GestionPasajes_Añadir extends javax.swing.JInternalFrame {
    ColectivoData colectivoData = new ColectivoData();
    PasajeroData pasajeroData = new PasajeroData();
    PasajeData pasajeData = new PasajeData();
    RutaData rutaData = new RutaData();

    public GestionPasajes_Añadir() {
        initComponents();
        llenarComboBoxes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextoNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextoIDColectivo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextoIDRuta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxDia = new javax.swing.JComboBox<>();
        jComboBoxMes = new javax.swing.JComboBox<>();
        jComboBoxAño = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxHora = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jTextoAsiento = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextoPrecio = new javax.swing.JTextField();
        jGuardar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jSalir = new javax.swing.JButton();

        jLabel1.setText("Nombre:");

        jLabel2.setText("ID del colectivo:");

        jLabel3.setText("ID de la ruta:");

        jLabel4.setText("Fecha:");

        jComboBoxDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBoxMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBoxAño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("Hora:");

        jComboBoxHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setText("Asiento:");

        jLabel7.setText("Precio: $");

        jGuardar.setText("Guardar");
        jGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGuardarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel8.setText("Añadir Pasaje");

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextoNombre))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextoIDColectivo))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextoIDRuta))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextoAsiento))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextoPrecio))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jComboBoxDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jComboBoxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 13, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextoIDColectivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextoIDRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBoxHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextoAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jGuardar)
                    .addComponent(jSalir))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGuardarActionPerformed
        if (pasajeroData.listarPasajeros().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay pasajeros. Agregá uno antes.");
        } else if (rutaData.listarRutas().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay rutas. Agregá una antes.");
        } else if (colectivoData.listarColectivos().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay colectivos.");
        } else {
            try {
                if (jTextoNombre.getText().equals("")) {
                    JOptionPane.showMessageDialog(this, "El campo está vacío");
                    jTextoNombre.requestFocus();
                } else if (jTextoIDColectivo.getText().equals("")) {
                    JOptionPane.showMessageDialog(this, "El campo está vacío");
                    jTextoIDColectivo.requestFocus();
                } else if (jTextoIDRuta.getText().equals("")) {
                    JOptionPane.showMessageDialog(this, "El campo está vacío");
                    jTextoIDRuta.requestFocus();
                } else if (jTextoAsiento.getText().equals("")) {
                    JOptionPane.showMessageDialog(this, "El campo está vacío");
                    jTextoAsiento.requestFocus();
                } else if (jTextoPrecio.getText().equals("")) {
                    JOptionPane.showMessageDialog(this, "El campo está vacío");
                    jTextoPrecio.requestFocus();
                } else {
                    LocalDate fechaViaje = LocalDate.of(Integer.parseInt(String.valueOf(jComboBoxAño.getSelectedItem())), Integer.parseInt(String.valueOf(jComboBoxMes.getSelectedItem())), Integer.parseInt(String.valueOf(jComboBoxDia.getSelectedItem())));
                    Time horaViaje = (Time) jComboBoxHora.getSelectedItem();
                    pasajeData.registrarVenta(new Pasaje(pasajeroData.buscarNombre(jTextoNombre.getText()), colectivoData.buscar(Integer.parseInt(jTextoIDColectivo.getText())), rutaData.buscarPorID(Integer.parseInt(jTextoIDRuta.getText())), Date.valueOf(fechaViaje), horaViaje, Integer.parseInt(jTextoAsiento.getText()), Double.parseDouble(jTextoPrecio.getText()), true));
                }
            } catch (HeadlessException | NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }
    }//GEN-LAST:event_jGuardarActionPerformed

    private void jSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jSalirActionPerformed

    private void llenarComboBoxes(){
        jComboBoxDia.removeAllItems();
        jComboBoxMes.removeAllItems();
        jComboBoxAño.removeAllItems();
        jComboBoxHora.removeAllItems();
        for (int i = 0; i < 31; i++) {
            jComboBoxDia.addItem((i + 1) + "");
        }
        for (int i = 0; i < 12; i++) {
            switch (i) {
                case 0: jComboBoxMes.addItem("Enero"); break;
                case 1: jComboBoxMes.addItem("Febrero"); break;
                case 2: jComboBoxMes.addItem("Marzo"); break;
                case 3: jComboBoxMes.addItem("Abril"); break;
                case 4: jComboBoxMes.addItem("Mayo"); break;
                case 5: jComboBoxMes.addItem("Junio"); break;
                case 6: jComboBoxMes.addItem("Julio"); break;
                case 7: jComboBoxMes.addItem("Agosto"); break;
                case 8: jComboBoxMes.addItem("Septiembre"); break;
                case 9: jComboBoxMes.addItem("Octubre"); break;
                case 10: jComboBoxMes.addItem("Noviembre"); break;
                case 11: jComboBoxMes.addItem("Diciembre"); break;
            }
        }
        for (int i = LocalDate.now().getYear(); i <= LocalDate.now().getYear() + 10; i++) {
            jComboBoxAño.addItem(i + "");
        }
        int aux = 0;
        for (int i = 0; i < 144; i++) {
            aux = aux + 10;
            LocalTime LT = LocalTime.of(00, 00, 00);
            jComboBoxHora.addItem("" + Time.valueOf(LT.plusMinutes(aux)));
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxAño;
    private javax.swing.JComboBox<String> jComboBoxDia;
    private javax.swing.JComboBox<String> jComboBoxHora;
    private javax.swing.JComboBox<String> jComboBoxMes;
    private javax.swing.JButton jGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton jSalir;
    private javax.swing.JTextField jTextoAsiento;
    private javax.swing.JTextField jTextoIDColectivo;
    private javax.swing.JTextField jTextoIDRuta;
    private javax.swing.JTextField jTextoNombre;
    private javax.swing.JTextField jTextoPrecio;
    // End of variables declaration//GEN-END:variables
}
