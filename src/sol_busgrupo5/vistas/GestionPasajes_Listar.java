package sol_busgrupo5.vistas;

import java.sql.*;
import javax.swing.table.*;
import sol_busgrupo5.accesoADatos.*;
import sol_busgrupo5.entidades.*;

public class GestionPasajes_Listar extends javax.swing.JInternalFrame {
    DefaultTableModel modelo = new DefaultTableModel();
    PasajeData pasajeData = new PasajeData();
    Ver_Pasaje VP = new Ver_Pasaje();
    public GestionPasajes_Listar() {
        initComponents();
        llenarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton_Salir = new javax.swing.JButton();

        setTitle("Lista de pasajes");

        jTabla.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTabla);
        if (jTabla.getColumnModel().getColumnCount() > 0) {
            jTabla.getColumnModel().getColumn(0).setResizable(false);
            jTabla.getColumnModel().getColumn(1).setResizable(false);
            jTabla.getColumnModel().getColumn(2).setResizable(false);
            jTabla.getColumnModel().getColumn(3).setResizable(false);
        }

        jButton1.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jButton1.setText("Administrar Pasaje");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        jLabel1.setText("                                                                                                                                             ");
        jPanel1.add(jLabel1);

        jButton2.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jButton2.setText("Actualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);

        jLabel2.setText("                                        ");
        jPanel1.add(jLabel2);

        jButton_Salir.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jButton_Salir.setText("Salir");
        jButton_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SalirActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Salir);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SalirActionPerformed
        dispose();
    }//GEN-LAST:event_jButton_SalirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(jTabla.getSelectedRow()==-1){
            if(!VP.isVisible()){
                VP.Listar_Pasaje();
                VP.setVisible(true);
            }
        } else {
            VP.dispose();
            if(!VP.isVisible() && modelo.getRowCount()>=0){
                for(Pasaje pasaje:pasajeData.visualizarPasajes()){
                    if(pasaje.getIdPasaje()==((int)jTabla.getValueAt(jTabla.getSelectedRow(), 0))){
                        VP.Listar_Pasaje(pasaje);
                        break;
                    }
                }
                VP.setVisible(true);
                
            } else {
                VP.Listar_Pasaje();
            }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        for(int i=modelo.getRowCount()-1;i>=0;i--){
            modelo.removeRow(i);
        }
        for(Pasaje pasaje:pasajeData.visualizarPasajes()){
            modelo.addRow(new Object[]{pasaje.getIdPasaje(),pasaje.getPasajero().getIdPasajero(),pasaje.getColectivo().getIdColectivo(),pasaje.getRuta().getIdRuta(),pasaje.getFechaViaje(),pasaje.getHoraViaje(),pasaje.getAsiento(),pasaje.getPrecio(),pasaje.isEstado()});
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void llenarTabla() {
        modelo.setColumnIdentifiers(new Object[]{"ID", "Pasajero", "Colectivo", "Ruta", "Fecha", "Hora de Salida", "Asiento", "Precio ($)", "Estado"});
        jTabla.setModel(modelo);
        for(Pasaje pasaje:pasajeData.visualizarPasajes()){
            modelo.addRow(new Object[]{pasaje.getIdPasaje(),pasaje.getPasajero().getIdPasajero(),pasaje.getColectivo().getIdColectivo(),pasaje.getRuta().getIdRuta(),pasaje.getFechaViaje(),pasaje.getHoraViaje(),pasaje.getAsiento(),pasaje.getPrecio(),pasaje.isEstado()});
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton_Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabla;
    // End of variables declaration//GEN-END:variables
}
