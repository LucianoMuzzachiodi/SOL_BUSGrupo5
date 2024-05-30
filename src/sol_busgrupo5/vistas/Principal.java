package sol_busgrupo5.vistas;

public class Principal extends javax.swing.JInternalFrame {
    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jGestionRutas_ = new javax.swing.JMenu();
        jAñadirRuta_ = new javax.swing.JMenuItem();
        jListarRutas_ = new javax.swing.JMenuItem();
        jBuscarRuta_ = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jSalir = new javax.swing.JMenu();

        setResizable(true);
        setTitle("Terminal");

        javax.swing.GroupLayout jDesktopPaneLayout = new javax.swing.GroupLayout(jDesktopPane);
        jDesktopPane.setLayout(jDesktopPaneLayout);
        jDesktopPaneLayout.setHorizontalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 698, Short.MAX_VALUE)
        );
        jDesktopPaneLayout.setVerticalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 565, Short.MAX_VALUE)
        );

        jGestionRutas_.setText("Gestión de Rutas");

        jAñadirRuta_.setText("Añadir");
        jAñadirRuta_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAñadirRuta_ActionPerformed(evt);
            }
        });
        jGestionRutas_.add(jAñadirRuta_);

        jListarRutas_.setText("Listar");
        jListarRutas_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jListarRutas_ActionPerformed(evt);
            }
        });
        jGestionRutas_.add(jListarRutas_);

        jBuscarRuta_.setText("Buscar");
        jBuscarRuta_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarRuta_ActionPerformed(evt);
            }
        });
        jGestionRutas_.add(jBuscarRuta_);

        jMenuBar1.add(jGestionRutas_);

        jMenu2.setText("Gestión de Horarios");
        jMenuBar1.add(jMenu2);

        jMenu1.setText("Gestión de Pasajeros");
        jMenuBar1.add(jMenu1);

        jMenu3.setText("Gestión de Pasajes");
        jMenuBar1.add(jMenu3);

        jSalir.setText("Salir");
        jMenuBar1.add(jSalir);

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

    private void jBuscarRuta_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarRuta_ActionPerformed
        jDesktopPane.removeAll();
        jDesktopPane.repaint();
        GestionRuta_Buscar gestionBuscar = new GestionRuta_Buscar();
        gestionBuscar.setVisible(true);
        jDesktopPane.add(gestionBuscar);
    }//GEN-LAST:event_jBuscarRuta_ActionPerformed

    private void jAñadirRuta_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAñadirRuta_ActionPerformed
        jDesktopPane.removeAll();
        jDesktopPane.repaint();
        GestionRuta_Añadir gestionAñadir = new GestionRuta_Añadir();
        gestionAñadir.setVisible(true);
        jDesktopPane.add(gestionAñadir);
    }//GEN-LAST:event_jAñadirRuta_ActionPerformed

    private void jListarRutas_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jListarRutas_ActionPerformed
        jDesktopPane.removeAll();
        jDesktopPane.repaint();
        GestionRuta_Listar gestionListar = new GestionRuta_Listar();
        gestionListar.setVisible(true);
        jDesktopPane.add(gestionListar);
    }//GEN-LAST:event_jListarRutas_ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jAñadirRuta_;
    private javax.swing.JMenuItem jBuscarRuta_;
    private javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JMenu jGestionRutas_;
    private javax.swing.JMenuItem jListarRutas_;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jSalir;
    // End of variables declaration//GEN-END:variables
}
