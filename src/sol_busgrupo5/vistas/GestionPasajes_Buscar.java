package sol_busgrupo5.vistas;

import java.sql.Time;
import java.time.LocalTime;
import javax.swing.JOptionPane;
import javax.swing.table.*;
import sol_busgrupo5.accesoADatos.*;
import sol_busgrupo5.entidades.*;

public class GestionPasajes_Buscar extends javax.swing.JInternalFrame {
    DefaultTableModel modelo = new DefaultTableModel();
    PasajeroData pasajeroData = new PasajeroData();
    PasajeData pasajeData = new PasajeData();
    RutaData rutaData = new RutaData();

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

        setTitle("Busqueda de pasajes");

        JTabla_Pasajes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTabla_Pasajes.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(JTabla_Pasajes);
        if (JTabla_Pasajes.getColumnModel().getColumnCount() > 0) {
            JTabla_Pasajes.getColumnModel().getColumn(0).setResizable(false);
            JTabla_Pasajes.getColumnModel().getColumn(1).setResizable(false);
            JTabla_Pasajes.getColumnModel().getColumn(2).setResizable(false);
            JTabla_Pasajes.getColumnModel().getColumn(3).setResizable(false);
        }

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
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1105, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxActionPerformed

    }//GEN-LAST:event_jComboBoxActionPerformed

    private void jSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jSalirActionPerformed

    private void JComboBOX_Ruta_Horario_PasajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JComboBOX_Ruta_Horario_PasajeroActionPerformed
        modelo.setRowCount(0);
        if (JComboBOX_Ruta_Horario_Pasajero.getSelectedIndex() != -1 && JComboBOX_Ruta_Horario_Pasajero.getSelectedItem().equals("Rutas")) {
            if (!JComboBOX_Rutas.isVisible()) {
                JComboBOX_Rutas.removeAllItems();
                for (Ruta rutas : rutaData.listarRutas()) {
                    JComboBOX_Rutas.addItem(rutas);
                }
                JComboBOX_Rutas.setVisible(true);
                JComboBOX_Horarios.setVisible(false);
                JComboBOX_Pasajeros.setVisible(false);
            }
        } else if (JComboBOX_Ruta_Horario_Pasajero.getSelectedIndex() != -1 && JComboBOX_Ruta_Horario_Pasajero.getSelectedItem().equals("Horarios")) {
            if (!JComboBOX_Horarios.isVisible()) {
                JComboBOX_Horarios.setVisible(true);
                JComboBOX_Pasajeros.setVisible(false);
                JComboBOX_Rutas.setVisible(false);
            }
        } else if (JComboBOX_Ruta_Horario_Pasajero.getSelectedIndex() != -1 && JComboBOX_Ruta_Horario_Pasajero.getSelectedItem().equals("Pasajeros")) {
            if (!JComboBOX_Pasajeros.isVisible()) {
                JComboBOX_Horarios.setVisible(false);
                JComboBOX_Rutas.setVisible(false);
                JComboBOX_Pasajeros.removeAllItems();
                for (Pasajero pasajero : pasajeroData.listarPasajeros()) {
                    JComboBOX_Pasajeros.addItem(pasajero);
                }
                JComboBOX_Pasajeros.setVisible(true);
            }
        }
    }//GEN-LAST:event_JComboBOX_Ruta_Horario_PasajeroActionPerformed

    private void JComboBOX_RutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JComboBOX_RutasActionPerformed
        if (JComboBOX_Rutas.isVisible()) {
            modelo.setRowCount(0);
            Ruta ruta = (Ruta) JComboBOX_Rutas.getSelectedItem();
            if (pasajeData.visualizarPorRuta(ruta.getIdRuta()) != null) {
                for (Pasaje pasaje : pasajeData.visualizarPorRuta(ruta.getIdRuta())) {
                    modelo.addRow(new Object[]{pasaje.getIdPasaje(), pasaje.getPasajero().getIdPasajero(), pasaje.getColectivo().getIdColectivo(), pasaje.getRuta().getIdRuta(), pasaje.getFechaViaje(), pasaje.getHoraViaje(), pasaje.getAsiento(), pasaje.getPrecio(), pasaje.isEstado()});
                }
            } else if (pasajeData.visualizarPorRuta(ruta.getIdRuta()).isEmpty()) {
                JOptionPane.showMessageDialog(this, "No hay ventas para mostrar.");
            }
        }
    }//GEN-LAST:event_JComboBOX_RutasActionPerformed

    private void JComboBOX_HorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JComboBOX_HorariosActionPerformed
        if (JComboBOX_Horarios.isVisible() && JComboBOX_Horarios.getSelectedIndex() != -1) {
            modelo.setRowCount(0);
            for (Pasaje pasaje : pasajeData.visualizarPorHorario(((Time) JComboBOX_Horarios.getSelectedItem()))) {
                modelo.addRow(new Object[]{pasaje.getIdPasaje(), pasaje.getPasajero().getIdPasajero(), pasaje.getColectivo().getIdColectivo(), pasaje.getRuta().getIdRuta(), pasaje.getFechaViaje(), pasaje.getHoraViaje(), pasaje.getAsiento(), pasaje.getPrecio(), pasaje.isEstado()});
            }
        }
    }//GEN-LAST:event_JComboBOX_HorariosActionPerformed

    private void JComboBOX_PasajerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JComboBOX_PasajerosActionPerformed
        if (JComboBOX_Pasajeros.isVisible() && JComboBOX_Pasajeros.getSelectedIndex() != -1) {
            modelo.setRowCount(0);
            if (pasajeData.visualizarPorPasajero(((Pasajero) JComboBOX_Pasajeros.getSelectedItem()).getIdPasajero()) != null) {
                for (Pasaje pasaje : pasajeData.visualizarPorPasajero(((Pasajero) JComboBOX_Pasajeros.getSelectedItem()).getIdPasajero())) {
                    modelo.addRow(new Object[]{pasaje.getIdPasaje(), pasaje.getPasajero().getIdPasajero(), pasaje.getColectivo().getIdColectivo(), pasaje.getRuta().getIdRuta(), pasaje.getFechaViaje(), pasaje.getHoraViaje(), pasaje.getAsiento(), pasaje.getPrecio(), pasaje.isEstado()});
                }
            } else {
                JOptionPane.showMessageDialog(this, "no se encontraron pasajes con este id de pasjaero.");
            }
        }
    }//GEN-LAST:event_JComboBOX_PasajerosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void llenarTabla() {
        modelo.setColumnIdentifiers(new Object[]{"ID", "Pasajero", "Colectivo", "Ruta", "Fecha", "Hora de Salida", "Asiento", "Precio ($)", "Estado"});
        JTabla_Pasajes.setModel(modelo);
        modelo.setRowCount(0);

        JComboBOX_Pasajeros.setVisible(false);
        JComboBOX_Horarios.setVisible(false);
        JComboBOX_Rutas.setVisible(true);
        JComboBOX_Rutas.removeAllItems();
        JComboBOX_Rutas.setVisible(true);
        for (Ruta rutas : rutaData.listarRutas()) {
            JComboBOX_Rutas.addItem(rutas);
        }

        int aux = 0;
        JComboBOX_Horarios.removeAllItems();
        for (int i = 0; i <= 138; i++) {
            aux = aux + 10;
            LocalTime LT = LocalTime.of(23, 50, 00);
            JComboBOX_Horarios.addItem(Time.valueOf(LT.plusMinutes(aux)));
        }
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
