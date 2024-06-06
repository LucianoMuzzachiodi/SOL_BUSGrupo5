package sol_busgrupo5.vistas;

import java.sql.Time;
import javax.swing.table.*;
import sol_busgrupo5.accesoADatos.*;
import sol_busgrupo5.entidades.*;

public class GestionPasajes_Buscar extends javax.swing.JInternalFrame {
    DefaultTableModel modelo = new DefaultTableModel();
    RutaData rutaData = new RutaData();
    PasajeData pasajeData = new PasajeData();
    PasajeroData pasajeroData = new PasajeroData();
    Pasaje pasaje = new Pasaje();

    public GestionPasajes_Buscar() {
        initComponents();
        jComboBox.removeAllItems();
        jComboBox.addItem("Ruta");
        jComboBox.addItem("Horario");
        jComboBox.addItem("Pasajero");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jComboBox = new javax.swing.JComboBox<>();
        jSalir = new javax.swing.JButton();

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

        jLabel1.setText("Filtrar por");

        jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActionPerformed(evt);
            }
        });

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
                .addGap(249, 249, 249)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSalir)
                .addGap(93, 93, 93))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSalir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxActionPerformed
        llenarTabla(jComboBox.getSelectedItem());
    }//GEN-LAST:event_jComboBoxActionPerformed

    private void jSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jSalirActionPerformed

    private void llenarTabla(Object o){
        vaciarTabla();
        modelo.setColumnCount(0);
        modelo.setColumnIdentifiers(new Object[]{"","ID","Pasajero","Colectivo","Ruta","Fecha","Hora de Salida","Asiento","Precio ($)","Estado"});
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
        TableColumn columna9 = modeloColumna.getColumn(8);
        TableColumn columna0 = modeloColumna.getColumn(9);
        columna1.setPreferredWidth(0);
        columna2.setPreferredWidth(0);
        columna3.setPreferredWidth(175);
        columna4.setPreferredWidth(100);
        columna5.setPreferredWidth(175);
        columna6.setPreferredWidth(75);
        columna7.setPreferredWidth(100);
        columna8.setPreferredWidth(50);
        columna9.setPreferredWidth(60);
        columna0.setPreferredWidth(40);
        int contador = 0; String activo;
        if(o != null && o.equals("Ruta") && !rutaData.listarRutas().isEmpty()){
            for (Pasaje pasajes : pasajeData.visualizarPorRuta(rutaData.listarRutas().get(contador).getIdRuta())) {
                contador++;
                if(pasajes.isEstado()){activo = "Activo";}else{activo = "Inactivo";}
                modelo.addRow(new Object[]{contador, pasajes.getPasajero().getNombre() + "" + pasajes.getPasajero().getApellido(), pasajes.getColectivo().getMatricula(), pasajes.getRuta().getOrigen() + "" + pasajes.getRuta().getDestino(), pasajes.getFechaViaje(), pasajes.getHoraViaje(), pasajes.getAsiento(), "$" + pasajes.getPrecio(), activo});
            }
        } else if (o != null && o.equals("Horario")) {
            for (Pasaje pasajes : pasajeData.visualizarPorHorario((Time)pasaje.getFechaViaje())) {
                contador++;
                if(pasajes.isEstado()){activo = "Activo";}else{activo = "Inactivo";}
                modelo.addRow(new Object[]{contador, pasajes.getPasajero().getNombre() + "" + pasajes.getPasajero().getApellido(), pasajes.getColectivo().getMatricula(), pasajes.getRuta().getOrigen() + "" + pasajes.getRuta().getDestino(), pasajes.getFechaViaje(), pasajes.getHoraViaje(), pasajes.getAsiento(), "$" + pasajes.getPrecio(), activo});
            }
        } else if (o != null && o.equals("Pasajero") && !pasajeroData.listarPasajeros().isEmpty()) {
            for (Pasaje pasajes : pasajeData.visualizarPorPasajero(pasajeroData.listarPasajeros().get(contador).getIdPasajero())) {
                contador++;
                if(pasajes.isEstado()){activo = "Activo";}else{activo = "Inactivo";}
                modelo.addRow(new Object[]{contador, pasajes.getPasajero().getNombre() + "" + pasajes.getPasajero().getApellido(), pasajes.getColectivo().getMatricula(), pasajes.getRuta().getOrigen() + "" + pasajes.getRuta().getDestino(), pasajes.getFechaViaje(), pasajes.getHoraViaje(), pasajes.getAsiento(), "$" + pasajes.getPrecio(), activo});
            }
        }
        jTabla.setModel(modelo);
    }
    private void vaciarTabla(){
        for (int i = modelo.getRowCount() - 1; i >= 0; i--) {modelo.removeRow(i);}
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabla;
    // End of variables declaration//GEN-END:variables
}
