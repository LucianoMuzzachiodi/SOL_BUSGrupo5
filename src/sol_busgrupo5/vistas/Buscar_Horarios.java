/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package sol_busgrupo5.vistas;
import java.sql.Time;
import javax.swing.table.DefaultTableModel;
import sol_busgrupo5.accesoADatos.HorarioData;
import sol_busgrupo5.accesoADatos.RutaData;
import sol_busgrupo5.entidades.Horario;
import sol_busgrupo5.entidades.Ruta;

/**
 *
 * @author DANIELALEJANDROMIRAN
 */
public class Buscar_Horarios extends javax.swing.JInternalFrame {
    DefaultTableModel DTMT = new DefaultTableModel();
    H_L hl = new H_L();
    RutaData RD = new RutaData();
    HorarioData HD = new HorarioData();
    /**
     * Creates new form Buscar_Horarios
     */
    public Buscar_Horarios() {
        initComponents();
        Config("Rutas");
        JTable.setModel(DTMT);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JComboBOX_Ruta_Fecha = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        R1 = new javax.swing.JLabel();
        JComboBOX_Rutas = new javax.swing.JComboBox<>();
        R2 = new javax.swing.JLabel();
        JComboBOX_Salida = new javax.swing.JComboBox<>();
        R3 = new javax.swing.JLabel();
        JComboBOX_Llegada = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTable = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ordenar por");
        jPanel1.add(jLabel1);

        JComboBOX_Ruta_Fecha.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        JComboBOX_Ruta_Fecha.setMaximumRowCount(2);
        JComboBOX_Ruta_Fecha.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ruta", "Fecha" }));
        JComboBOX_Ruta_Fecha.setToolTipText("");
        JComboBOX_Ruta_Fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JComboBOX_Ruta_FechaActionPerformed(evt);
            }
        });
        jPanel1.add(JComboBOX_Ruta_Fecha);

        R1.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        R1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R1.setText("Rutas Disponibles");
        jPanel2.add(R1);

        JComboBOX_Rutas.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        JComboBOX_Rutas.setMaximumRowCount(999);
        JComboBOX_Rutas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JComboBOX_RutasActionPerformed(evt);
            }
        });
        jPanel2.add(JComboBOX_Rutas);

        R2.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        R2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R2.setText("de Salida");
        jPanel2.add(R2);

        JComboBOX_Salida.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        JComboBOX_Salida.setMaximumRowCount(999);
        jPanel2.add(JComboBOX_Salida);

        R3.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        R3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R3.setText("de llegada");
        jPanel2.add(R3);

        JComboBOX_Llegada.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        JComboBOX_Llegada.setMaximumRowCount(999);
        jPanel2.add(JComboBOX_Llegada);

        JTable.setModel(new javax.swing.table.DefaultTableModel(
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
        JTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(JTable);
        if (JTable.getColumnModel().getColumnCount() > 0) {
            JTable.getColumnModel().getColumn(0).setResizable(false);
            JTable.getColumnModel().getColumn(1).setResizable(false);
            JTable.getColumnModel().getColumn(2).setResizable(false);
            JTable.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 837, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JComboBOX_Ruta_FechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JComboBOX_Ruta_FechaActionPerformed
        switch((String)JComboBOX_Ruta_Fecha.getSelectedItem()){
            case ("Ruta"):
                Config("Rutas");
                
                break;
            case ("Fecha"):
                Config("Fechas");
                
                break;
        }
    }//GEN-LAST:event_JComboBOX_Ruta_FechaActionPerformed

    private void JComboBOX_RutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JComboBOX_RutasActionPerformed
        if(JComboBOX_Rutas.isVisible() && JComboBOX_Rutas.getSelectedIndex()!=-1){
            for(int i=DTMT.getRowCount()-1;i>=0;i--){
                DTMT.removeRow(i);
            }
            for(Horario horario:HD.Listar_Horarios("Por ruta",((Ruta)JComboBOX_Rutas.getSelectedItem()).getIdRuta(), null)){
                DTMT.addRow(new Object[]{horario.getIdHorario(),horario.getRuta().getIdRuta(),horario.getHoraSalida(),horario.getHoraLlegada()});
            }
        }
    }//GEN-LAST:event_JComboBOX_RutasActionPerformed
    public void Config(String S){
        switch(S){
            case ("Rutas"):
                hl.dispose();
                R2.setVisible(false);
                JComboBOX_Salida.setVisible(false);
                JComboBOX_Rutas.removeAllItems();
                JComboBOX_Rutas.setVisible(true);
                R1.setVisible(true);
                JComboBOX_Llegada.setVisible(false);
                R3.setVisible(false);
                for(Ruta ruta:RD.listarRutas()){
                    JComboBOX_Rutas.addItem(ruta);
                }
                for(int i=DTMT.getRowCount()-1;i>=0;i--){
                    DTMT.removeRow(i);
                }
                DTMT.setColumnIdentifiers(new Object[]{"ID Horario","ID Ruta","Hora Salida","Hora Llegada"});
                Ruta ruta = (Ruta)JComboBOX_Rutas.getSelectedItem();
                if(HD.Listar_Horarios("Por ruta", ruta.getIdRuta(), null)!=null){
                    for(Horario horario:HD.Listar_Horarios("Por ruta", ruta.getIdRuta(), null)){
                        DTMT.addRow(new Object[]{horario.getIdHorario(),horario.getRuta().getIdRuta(),horario.getHoraSalida(),horario.getHoraLlegada()});
                    }
                }
                
                break;
            case ("Fechas"):
                R1.setVisible(false);
                hl.setVisible(true);
                JComboBOX_Salida.setVisible(true);
                JComboBOX_Salida.removeAllItems();
                JComboBOX_Rutas.setVisible(false);
                R2.setVisible(true);
                R3.setVisible(true);
                JComboBOX_Llegada.setVisible(true);
                for(int i=DTMT.getRowCount()-1;i>=0;i--){
                    DTMT.removeRow(i);
                }
                if(HD.Listar_Horarios("Listar fecha", 0, null)!=null){
                    for(Horario horario:HD.Listar_Horarios("Listar fecha", 0, null)){
                        DTMT.addRow(new Object[]{horario.getIdHorario(),horario.getRuta().getIdRuta(),horario.getHoraSalida(),horario.getHoraLlegada()});
                    }
                }
                break;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Time> JComboBOX_Llegada;
    private javax.swing.JComboBox<String> JComboBOX_Ruta_Fecha;
    private javax.swing.JComboBox<Ruta> JComboBOX_Rutas;
    private javax.swing.JComboBox<Time> JComboBOX_Salida;
    private javax.swing.JTable JTable;
    private javax.swing.JLabel R1;
    private javax.swing.JLabel R2;
    private javax.swing.JLabel R3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
