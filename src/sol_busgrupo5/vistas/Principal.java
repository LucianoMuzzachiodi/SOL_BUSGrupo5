package sol_busgrupo5.vistas;

public class Principal extends javax.swing.JFrame {
    Añadir_Horario AH = new Añadir_Horario();
    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JDesktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuGestionRutas = new javax.swing.JMenu();
        jAñadirRuta_ = new javax.swing.JMenuItem();
        jBuscarRuta_ = new javax.swing.JMenuItem();
        jListarRuta_ = new javax.swing.JMenuItem();
        jMenuGestionHorarios = new javax.swing.JMenu();
        jAñadirHorario = new javax.swing.JMenuItem();
        jAñadirHorario1 = new javax.swing.JMenuItem();
        jMenuGestionPasajeros = new javax.swing.JMenu();
        jAñadirPasajero_ = new javax.swing.JMenuItem();
        jMenuGestionPâsajes = new javax.swing.JMenu();
        jMenuSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        javax.swing.GroupLayout JDesktopLayout = new javax.swing.GroupLayout(JDesktop);
        JDesktop.setLayout(JDesktopLayout);
        JDesktopLayout.setHorizontalGroup(
            JDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 920, Short.MAX_VALUE)
        );
        JDesktopLayout.setVerticalGroup(
            JDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 607, Short.MAX_VALUE)
        );

        jMenuGestionRutas.setText("Gestión de Rutas");

        jAñadirRuta_.setText("Añadir");
        jAñadirRuta_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAñadirRuta_ActionPerformed(evt);
            }
        });
        jMenuGestionRutas.add(jAñadirRuta_);

        jBuscarRuta_.setText("Buscar");
        jBuscarRuta_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarRuta_ActionPerformed(evt);
            }
        });
        jMenuGestionRutas.add(jBuscarRuta_);

        jListarRuta_.setText("Listar");
        jListarRuta_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jListarRuta_ActionPerformed(evt);
            }
        });
        jMenuGestionRutas.add(jListarRuta_);

        jMenuBar1.add(jMenuGestionRutas);

        jMenuGestionHorarios.setText("Gestión de Horarios");

        jAñadirHorario.setText("Añadir");
        jAñadirHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAñadirHorarioActionPerformed(evt);
            }
        });
        jMenuGestionHorarios.add(jAñadirHorario);

        jAñadirHorario1.setText("Listar");
        jAñadirHorario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAñadirHorario1ActionPerformed(evt);
            }
        });
        jMenuGestionHorarios.add(jAñadirHorario1);

        jMenuBar1.add(jMenuGestionHorarios);

        jMenuGestionPasajeros.setText("Gestión de Pasajeros");

        jAñadirPasajero_.setText("Añadir");
        jMenuGestionPasajeros.add(jAñadirPasajero_);

        jMenuBar1.add(jMenuGestionPasajeros);

        jMenuGestionPâsajes.setText("Gestión de Pasajes");
        jMenuBar1.add(jMenuGestionPâsajes);

        jMenuSalir.setText("Salir");
        jMenuSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSalirMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JDesktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JDesktop)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jAñadirRuta_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAñadirRuta_ActionPerformed
        JDesktop.removeAll();
        JDesktop.repaint();
        GestionRutas_Añadir gestionAñadir = new GestionRutas_Añadir();
        gestionAñadir.setVisible(true);
        JDesktop.add(gestionAñadir);
    }//GEN-LAST:event_jAñadirRuta_ActionPerformed

    private void jBuscarRuta_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarRuta_ActionPerformed
        JDesktop.removeAll();
        JDesktop.repaint();
        GestionRutas_Buscar gestionBuscar = new GestionRutas_Buscar();
        gestionBuscar.setVisible(true);
        JDesktop.add(gestionBuscar);
    }//GEN-LAST:event_jBuscarRuta_ActionPerformed

    private void jListarRuta_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jListarRuta_ActionPerformed
        JDesktop.removeAll();
        JDesktop.repaint();
        GestionRutas_Listar gestionListar = new GestionRutas_Listar();
        gestionListar.setVisible(true);
        JDesktop.add(gestionListar);
    }//GEN-LAST:event_jListarRuta_ActionPerformed

    private void jMenuSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSalirMouseClicked
        dispose();
    }//GEN-LAST:event_jMenuSalirMouseClicked

    private void jAñadirHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAñadirHorarioActionPerformed
        if(!AH.isVisible()){
            AH.setVisible(true);
        }
    }//GEN-LAST:event_jAñadirHorarioActionPerformed

    private void jAñadirPasajero_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAñadirPasajero_ActionPerformed
        JDesktop.removeAll();
        JDesktop.repaint();
        GestionPasajeros_Añadir gestionPasajeroAñadir = new GestionPasajeros_Añadir();
        gestionPasajeroAñadir.setVisible(true);
        JDesktop.add(gestionPasajeroAñadir);
    }//GEN-LAST:event_jAñadirPasajero_ActionPerformed

    private void jAñadirHorario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAñadirHorario1ActionPerformed
        JDesktop.removeAll();
        JDesktop.repaint();
        Buscar_Horarios BH = new Buscar_Horarios();
        BH.setVisible(true);
        JDesktop.add(BH);
    }//GEN-LAST:event_jAñadirHorario1ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane JDesktop;
    private javax.swing.JMenuItem jAñadirHorario;
    private javax.swing.JMenuItem jAñadirHorario1;
    private javax.swing.JMenuItem jAñadirPasajero_;
    private javax.swing.JMenuItem jAñadirRuta_;
    private javax.swing.JMenuItem jBuscarRuta_;
    private javax.swing.JMenuItem jListarRuta_;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuGestionHorarios;
    private javax.swing.JMenu jMenuGestionPasajeros;
    private javax.swing.JMenu jMenuGestionPâsajes;
    private javax.swing.JMenu jMenuGestionRutas;
    private javax.swing.JMenu jMenuSalir;
    // End of variables declaration//GEN-END:variables
}
