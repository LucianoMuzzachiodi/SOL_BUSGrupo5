package sol_busgrupo5.vistas;

public class Principal extends javax.swing.JFrame {
    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuGestionRutas = new javax.swing.JMenu();
        jAñadirRuta_ = new javax.swing.JMenuItem();
        jBuscarRuta_ = new javax.swing.JMenuItem();
        jListarRuta_ = new javax.swing.JMenuItem();
        jMenuGestionHorarios = new javax.swing.JMenu();
        jMenuGestionPasajeros = new javax.swing.JMenu();
        jMenuGestionPâsajes = new javax.swing.JMenu();
        jMenuSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPaneLayout = new javax.swing.GroupLayout(jDesktopPane);
        jDesktopPane.setLayout(jDesktopPaneLayout);
        jDesktopPaneLayout.setHorizontalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 727, Short.MAX_VALUE)
        );
        jDesktopPaneLayout.setVerticalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 586, Short.MAX_VALUE)
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
        jMenuBar1.add(jMenuGestionHorarios);

        jMenuGestionPasajeros.setText("Gestión de Pasajeros");
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
            .addComponent(jDesktopPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jAñadirRuta_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAñadirRuta_ActionPerformed
        jDesktopPane.removeAll();
        jDesktopPane.repaint();
        GestionRutas_Añadir gestionAñadir = new GestionRutas_Añadir();
        gestionAñadir.setVisible(true);
        jDesktopPane.add(gestionAñadir);
    }//GEN-LAST:event_jAñadirRuta_ActionPerformed

    private void jBuscarRuta_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarRuta_ActionPerformed
        jDesktopPane.removeAll();
        jDesktopPane.repaint();
        GestionRutas_Buscar gestionBuscar = new GestionRutas_Buscar();
        gestionBuscar.setVisible(true);
        jDesktopPane.add(gestionBuscar);
    }//GEN-LAST:event_jBuscarRuta_ActionPerformed

    private void jListarRuta_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jListarRuta_ActionPerformed
        jDesktopPane.removeAll();
        jDesktopPane.repaint();
        GestionRutas_Listar gestionListar = new GestionRutas_Listar();
        gestionListar.setVisible(true);
        jDesktopPane.add(gestionListar);
    }//GEN-LAST:event_jListarRuta_ActionPerformed

    private void jMenuSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSalirMouseClicked
        dispose();
    }//GEN-LAST:event_jMenuSalirMouseClicked

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
    private javax.swing.JMenuItem jAñadirRuta_;
    private javax.swing.JMenuItem jBuscarRuta_;
    private javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JMenuItem jListarRuta_;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuGestionHorarios;
    private javax.swing.JMenu jMenuGestionPasajeros;
    private javax.swing.JMenu jMenuGestionPâsajes;
    private javax.swing.JMenu jMenuGestionRutas;
    private javax.swing.JMenu jMenuSalir;
    // End of variables declaration//GEN-END:variables
}
