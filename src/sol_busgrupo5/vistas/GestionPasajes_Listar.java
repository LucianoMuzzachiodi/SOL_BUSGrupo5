package sol_busgrupo5.vistas;

import javax.swing.table.*;
import sol_busgrupo5.accesoADatos.*;
import sol_busgrupo5.entidades.*;

public class GestionPasajes_Listar extends javax.swing.JInternalFrame {
    DefaultTableModel modelo = new DefaultTableModel();
    PasajeData pasajeData = new PasajeData();
    
    public GestionPasajes_Listar() {
        initComponents();
        llenarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jButton_Salir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

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
        ));
        jScrollPane1.setViewportView(jTabla);

        jButton_Salir.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jButton_Salir.setText("Salir");
        jButton_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SalirActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jButton1.setText("Administrar Pasaje");
        jPanel1.add(jButton1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 928, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 985, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(437, 437, 437)
                .addComponent(jButton_Salir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Salir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SalirActionPerformed
        dispose();
    }//GEN-LAST:event_jButton_SalirActionPerformed

    private void llenarTabla() {
        modelo.setRowCount(0);
        modelo.setColumnCount(0);
        modelo.setColumnIdentifiers(new Object[]{"", "ID", "Pasajero", "Colectivo", "Ruta", "Fecha", "Hora de Salida", "Asiento", "Precio ($)", "Estado"});
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
        columna4.setPreferredWidth(90);
        columna5.setPreferredWidth(120);
        columna6.setPreferredWidth(90);
        columna7.setPreferredWidth(90);
        columna8.setPreferredWidth(40);
        columna9.setPreferredWidth(40);
        columna0.setPreferredWidth(40);
        int contador = 0; String activo;
        for (Pasaje pasajes : pasajeData.visualizarPasajes()) {
            contador++;
            if(pasajes.isEstado()){activo = "Activo";}else{activo = "Inactivo";}
            modelo.addRow(new Object[]{contador, pasajes.getIdPasaje(), pasajes.getPasajero().getIdPasajero() + " - " + pasajes.getPasajero().getNombre() + " " + pasajes.getPasajero().getApellido(), pasajes.getColectivo().getIdColectivo() + " - " + pasajes.getColectivo().getMatricula(), pasajes.getRuta().getOrigen() + " - " + pasajes.getRuta().getDestino(), pasajes.getFechaViaje(), pasajes.getHoraViaje(), pasajes.getAsiento(), pasajes.getPrecio(), activo});
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_Salir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabla;
    // End of variables declaration//GEN-END:variables
}
