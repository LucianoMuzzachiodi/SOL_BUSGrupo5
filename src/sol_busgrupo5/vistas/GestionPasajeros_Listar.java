package sol_busgrupo5.vistas;

import javax.swing.table.*;
import sol_busgrupo5.accesoADatos.PasajeroData;
import sol_busgrupo5.entidades.Pasajero;

public class GestionPasajeros_Listar extends javax.swing.JInternalFrame {
    DefaultTableModel modelo = new DefaultTableModel();
    PasajeroData PD = new PasajeroData();

    public GestionPasajeros_Listar() {
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton_Salir)
                        .addGap(18, 18, 18))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Salir)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SalirActionPerformed
        dispose();
    }//GEN-LAST:event_jButton_SalirActionPerformed

    private void llenarTabla() {
        modelo.setRowCount(0);
        modelo.setColumnCount(0);
        modelo.setColumnIdentifiers(new Object[]{"", "ID", "Nombre", "Apellido", "DNI", "Correo", "Teléfono", "Estado"});
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
        columna1.setPreferredWidth(0);
        columna2.setPreferredWidth(0);
        columna3.setPreferredWidth(100);
        columna4.setPreferredWidth(100);
        columna5.setPreferredWidth(50);
        columna6.setPreferredWidth(150);
        columna7.setPreferredWidth(70);
        columna8.setPreferredWidth(40);
        int contador = 0;
        if (!PD.listarPasajeros().isEmpty()) {
            for (Pasajero pasajero : PD.listarPasajeros()) {
                contador++;
                String activo;
                if (pasajero.isEstado()) {
                    activo = "Activo";
                } else {
                    activo = "Inactivo";
                }
                modelo.addRow(new Object[]{contador, pasajero.getIdPasajero(), pasajero.getNombre(), pasajero.getApellido(), pasajero.getDni(), pasajero.getCorreo(), pasajero.getTelefono(), activo});
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
