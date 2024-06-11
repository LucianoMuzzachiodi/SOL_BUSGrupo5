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

        jButton_Salir.setText("Salir");
        jButton_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(816, Short.MAX_VALUE)
                .addComponent(jButton_Salir)
                .addGap(24, 24, 24))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        columna4.setPreferredWidth(100);
        columna5.setPreferredWidth(175);
        columna6.setPreferredWidth(75);
        columna7.setPreferredWidth(100);
        columna8.setPreferredWidth(50);
        columna9.setPreferredWidth(60);
        columna0.setPreferredWidth(40);
        int contador = 0;
        String activo;
        if (!pasajeData.visualizarPasajes().isEmpty()) {
            for (Pasaje pasajes : pasajeData.visualizarPasajes()) {
                contador++;
                if(pasajes.isEstado()){activo = "Activo";}else{activo = "Inactivo";}
                modelo.addRow(new Object[]{contador, pasajes.getIdPasaje(), pasajes.getPasajero().getNombre() + "" + pasajes.getPasajero().getApellido(), pasajes.getColectivo().getMatricula(), pasajes.getRuta().getOrigen() + "" + pasajes.getRuta().getDestino(), pasajes.getFechaViaje(), pasajes.getHoraViaje(), pasajes.getAsiento(), "$" + pasajes.getPrecio(), activo});
            }
        }
        jTabla.setModel(modelo);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Salir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabla;
    // End of variables declaration//GEN-END:variables
}
