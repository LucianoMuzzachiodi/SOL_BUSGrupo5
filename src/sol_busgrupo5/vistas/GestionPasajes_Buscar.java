package sol_busgrupo5.vistas;

import java.sql.Time;
import java.time.LocalTime;
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
        llenarTabla();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTabla_Pasajes = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JComboBOX_Ruta_Horario_Pasajero = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        JComboBOX_Rutas = new javax.swing.JComboBox<>();
        JComboBOX_Horarios = new javax.swing.JComboBox<>();
        JComboBOX_Pasajeros = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        JTabla_Pasajes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(JTabla_Pasajes);

        jLabel1.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Filtrar por");
        jPanel1.add(jLabel1);

        JComboBOX_Ruta_Horario_Pasajero.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        JComboBOX_Ruta_Horario_Pasajero.setMaximumRowCount(3);
        JComboBOX_Ruta_Horario_Pasajero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rutas", "Horarios", "Pasajeros" }));
        JComboBOX_Ruta_Horario_Pasajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JComboBOX_Ruta_Horario_PasajeroActionPerformed(evt);
            }
        });
        jPanel1.add(JComboBOX_Ruta_Horario_Pasajero);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("                                                  ");
        jPanel1.add(jLabel4);

        JComboBOX_Rutas.setFont(new java.awt.Font("DialogInput", 0, 10)); // NOI18N
        JComboBOX_Rutas.setMaximumRowCount(999);
        JComboBOX_Rutas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JComboBOX_RutasActionPerformed(evt);
            }
        });
        jPanel1.add(JComboBOX_Rutas);

        JComboBOX_Horarios.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        JComboBOX_Horarios.setMaximumRowCount(999);
        JComboBOX_Horarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JComboBOX_HorariosActionPerformed(evt);
            }
        });
        jPanel1.add(JComboBOX_Horarios);

        JComboBOX_Pasajeros.setFont(new java.awt.Font("DialogInput", 0, 10)); // NOI18N
        JComboBOX_Pasajeros.setMaximumRowCount(999);
        JComboBOX_Pasajeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JComboBOX_PasajerosActionPerformed(evt);
            }
        });
        jPanel1.add(JComboBOX_Pasajeros);

        jButton1.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        jButton1.setText("Salir");
        jPanel1.add(jButton1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1313, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxActionPerformed
        
    }//GEN-LAST:event_jComboBoxActionPerformed

    private void jSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jSalirActionPerformed

    private void JComboBOX_Ruta_Horario_PasajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JComboBOX_Ruta_Horario_PasajeroActionPerformed
        
        vaciarTabla();
        if(JComboBOX_Ruta_Horario_Pasajero.getSelectedIndex()!=-1 && JComboBOX_Ruta_Horario_Pasajero.getSelectedItem().equals("Rutas")){
            JComboBOX_Rutas.removeAllItems();
            JComboBOX_Rutas.setVisible(true);
            JComboBOX_Horarios.setVisible(false);
            JComboBOX_Pasajeros.setVisible(false);
            for(Ruta rutas:rutaData.listarRutas()){
                JComboBOX_Rutas.addItem(rutas);
            }
        } else if(JComboBOX_Ruta_Horario_Pasajero.getSelectedIndex()!=-1 && JComboBOX_Ruta_Horario_Pasajero.getSelectedItem().equals("Horarios")){
            JComboBOX_Horarios.setVisible(true);
            JComboBOX_Pasajeros.setVisible(false);
            JComboBOX_Rutas.setVisible(false);
        } else if(JComboBOX_Ruta_Horario_Pasajero.getSelectedIndex()!=-1 && JComboBOX_Ruta_Horario_Pasajero.getSelectedItem().equals("Pasajeros")){
            JComboBOX_Horarios.setVisible(false);
            JComboBOX_Rutas.setVisible(false);
            JComboBOX_Pasajeros.removeAllItems();
            JComboBOX_Pasajeros.setVisible(true);
            for(Pasajero pasajero:pasajeroData.listarPasajeros()){
                JComboBOX_Pasajeros.addItem(pasajero);
            }
        }
    }//GEN-LAST:event_JComboBOX_Ruta_Horario_PasajeroActionPerformed

    private void JComboBOX_RutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JComboBOX_RutasActionPerformed

        if(JComboBOX_Rutas.isVisible()){
            vaciarTabla();
            Ruta ruta = (Ruta)JComboBOX_Rutas.getSelectedItem();
            for(Pasaje pasaje:pasajeData.visualizarPorRuta(ruta.getIdRuta())){
                modelo.addRow(new Object[]{pasaje.getIdPasaje(),pasaje.getPasajero().getIdPasajero(),pasaje.getColectivo().getIdColectivo(),pasaje.getRuta().getIdRuta(),pasaje.getFechaViaje(),pasaje.getHoraViaje(),pasaje.getAsiento(),pasaje.getPrecio(),pasaje.isEstado()});
            }
        }
    }//GEN-LAST:event_JComboBOX_RutasActionPerformed

    private void JComboBOX_HorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JComboBOX_HorariosActionPerformed
        if(JComboBOX_Horarios.isVisible() && JComboBOX_Horarios.getSelectedIndex()!=-1){
            vaciarTabla();
            for(Pasaje pasaje:pasajeData.visualizarPorHorario(((Time)JComboBOX_Horarios.getSelectedItem()))){
                modelo.addRow(new Object[]{pasaje.getIdPasaje(),pasaje.getPasajero().getIdPasajero(),pasaje.getColectivo().getIdColectivo(),pasaje.getRuta().getIdRuta(),pasaje.getFechaViaje(),pasaje.getHoraViaje(),pasaje.getAsiento(),pasaje.getPrecio(),pasaje.isEstado()});
            }
        }
    }//GEN-LAST:event_JComboBOX_HorariosActionPerformed

    private void JComboBOX_PasajerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JComboBOX_PasajerosActionPerformed
        if(JComboBOX_Pasajeros.isVisible() && JComboBOX_Pasajeros.getSelectedIndex()!=-1){
            
        }
    }//GEN-LAST:event_JComboBOX_PasajerosActionPerformed

    private void llenarTabla(){
        modelo.setColumnIdentifiers(new Object[]{"ID","Pasajero","Colectivo","Ruta","Fecha","Hora de Salida","Asiento","Precio ($)","Estado"});
        JTabla_Pasajes.setModel(modelo);
        vaciarTabla();
        
        JComboBOX_Pasajeros.setVisible(false);
        JComboBOX_Horarios.setVisible(false);
        JComboBOX_Rutas.setVisible(true);
        JComboBOX_Rutas.removeAllItems();
        JComboBOX_Rutas.setVisible(true);
            for(Ruta rutas:rutaData.listarRutas()){
                JComboBOX_Rutas.addItem(rutas);
            }
            
        
            int aux=0;
            JComboBOX_Horarios.removeAllItems();
            for(int i=0;i<=138;i++){
            aux=aux+10;
            LocalTime LT = LocalTime.of(23, 50, 00);
            JComboBOX_Horarios.addItem(Time.valueOf(LT.plusMinutes(aux)));
            }
    }
    private void vaciarTabla(){
        for (int i = modelo.getRowCount() - 1; i >= 0; i--) {modelo.removeRow(i);}
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Time> JComboBOX_Horarios;
    private javax.swing.JComboBox<Pasajero> JComboBOX_Pasajeros;
    private javax.swing.JComboBox<String> JComboBOX_Ruta_Horario_Pasajero;
    private javax.swing.JComboBox<Ruta> JComboBOX_Rutas;
    private javax.swing.JTable JTabla_Pasajes;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
