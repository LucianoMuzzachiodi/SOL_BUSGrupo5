package sol_busgrupo5.vistas;
import java.sql.Time;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import sol_busgrupo5.accesoADatos.HorarioData;
import sol_busgrupo5.accesoADatos.RutaData;
import sol_busgrupo5.entidades.Horario;
import sol_busgrupo5.entidades.Ruta;

public class GestionHorarios_Añadir extends javax.swing.JFrame {
    HorarioData HD = new HorarioData();
    public GestionHorarios_Añadir() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("SolBusIcon.png")).getImage());
        
        Configuracion();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JButton_Añadir = new javax.swing.JButton();
        JComboBOX_Rutas = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JText_Hora_Salida = new javax.swing.JTextField();
        JText_Hora_Llegada = new javax.swing.JTextField();
        JComboBOX_Hora_Salida = new javax.swing.JComboBox<>();
        JComboBOX_Hora_Llegada = new javax.swing.JComboBox<>();
        jButton_Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar horario");
        setResizable(false);

        jLabel7.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Horarios");

        jLabel2.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Elegir Ruta");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        JButton_Añadir.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        JButton_Añadir.setText("AGREGAR");
        JButton_Añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton_AñadirActionPerformed(evt);
            }
        });

        JComboBOX_Rutas.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        JComboBOX_Rutas.setMaximumRowCount(999);

        jLabel3.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Hora de Salida");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Hora de Llegada");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        JText_Hora_Salida.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JText_Hora_Salida.setForeground(new java.awt.Color(153, 153, 153));
        JText_Hora_Salida.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JText_Hora_Salida.setText("Hora de Salida");

        JText_Hora_Llegada.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JText_Hora_Llegada.setForeground(new java.awt.Color(153, 153, 153));
        JText_Hora_Llegada.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JText_Hora_Llegada.setText("Hora Llegada");

        JComboBOX_Hora_Salida.setMaximumRowCount(144);
        JComboBOX_Hora_Salida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JComboBOX_Hora_SalidaActionPerformed(evt);
            }
        });

        JComboBOX_Hora_Llegada.setMaximumRowCount(144);
        JComboBOX_Hora_Llegada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JComboBOX_Hora_LlegadaActionPerformed(evt);
            }
        });

        jButton_Salir.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
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
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JComboBOX_Rutas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JText_Hora_Salida))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JText_Hora_Llegada, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JComboBOX_Hora_Llegada, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JComboBOX_Hora_Salida, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JButton_Añadir)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(JComboBOX_Rutas))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JComboBOX_Hora_Salida, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                        .addComponent(JButton_Añadir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JText_Hora_Salida, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JText_Hora_Llegada, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JComboBOX_Hora_Llegada, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(jButton_Salir))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JButton_AñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton_AñadirActionPerformed
        try{
            
            Time D1 = (Time) JComboBOX_Hora_Salida.getSelectedItem();
            Time D2 = (Time) JComboBOX_Hora_Llegada.getSelectedItem();
            Horario horario = new Horario((Ruta)JComboBOX_Rutas.getSelectedItem(),D1,D2,true);
            if(HD.Añadir_Horario(horario)==1){
                JOptionPane.showMessageDialog(this, "Horario agregado.");
            } else if (HD.Añadir_Horario(horario)==0){
                JOptionPane.showMessageDialog(this, "No se pudo Agregar.");
            }
        }catch(NumberFormatException NFE){
            
        }
    }//GEN-LAST:event_JButton_AñadirActionPerformed

    private void JComboBOX_Hora_SalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JComboBOX_Hora_SalidaActionPerformed
        JText_Hora_Salida.setText(""+JComboBOX_Hora_Salida.getSelectedItem());
    }//GEN-LAST:event_JComboBOX_Hora_SalidaActionPerformed

    private void JComboBOX_Hora_LlegadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JComboBOX_Hora_LlegadaActionPerformed
        JText_Hora_Llegada.setText(""+JComboBOX_Hora_Llegada.getSelectedItem());
    }//GEN-LAST:event_JComboBOX_Hora_LlegadaActionPerformed

    private void jButton_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SalirActionPerformed
        dispose();
    }//GEN-LAST:event_jButton_SalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GestionHorarios_Añadir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionHorarios_Añadir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionHorarios_Añadir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionHorarios_Añadir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionHorarios_Añadir().setVisible(true);
            }
        });
    }
    public void Configuracion(){
        int aux=0;
        JComboBOX_Rutas.removeAllItems();
        RutaData RD = new RutaData();
        for(Ruta ruta:RD.listarRutas()){
            JComboBOX_Rutas.addItem(ruta);
        }
        for(int i=0;i<=138;i++){
            aux=aux+10;
            LocalTime LT = LocalTime.of(23, 50, 00);
            JComboBOX_Hora_Salida.addItem(Time.valueOf(LT.plusMinutes(aux)));
        }
        aux=0;
        for(int i=0;i<=138;i++){
            aux=aux+10;
            LocalTime LT = LocalTime.of(23, 50, 00);
            JComboBOX_Hora_Llegada.addItem(Time.valueOf(LT.plusMinutes(aux)));
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButton_Añadir;
    private javax.swing.JComboBox<Time> JComboBOX_Hora_Llegada;
    private javax.swing.JComboBox<Time> JComboBOX_Hora_Salida;
    private javax.swing.JComboBox<Ruta> JComboBOX_Rutas;
    private javax.swing.JTextField JText_Hora_Llegada;
    private javax.swing.JTextField JText_Hora_Salida;
    private javax.swing.JButton jButton_Salir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
