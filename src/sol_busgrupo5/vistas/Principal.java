package sol_busgrupo5.vistas;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Principal extends javax.swing.JFrame {
    GestionHorarios_Añadir AH = new GestionHorarios_Añadir();

    public Principal() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("SolBusIcon.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("SolBus.png"));
        Image image = icon.getImage();
        JDesktop = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuGestionRutas = new javax.swing.JMenu();
        jAñadirRuta_ = new javax.swing.JMenuItem();
        jBuscarRuta_ = new javax.swing.JMenuItem();
        jListarRuta_ = new javax.swing.JMenuItem();
        jMenuGestionHorarios = new javax.swing.JMenu();
        jAñadirHorario = new javax.swing.JMenuItem();
        jListarHorario = new javax.swing.JMenuItem();
        jMenuGestionPasajeros = new javax.swing.JMenu();
        jAñadirPasajero_ = new javax.swing.JMenuItem();
        jBuscarPasajero_ = new javax.swing.JMenuItem();
        jListarPasajero_ = new javax.swing.JMenuItem();
        jMenuGestionPasajes = new javax.swing.JMenu();
        jAñadirPasaje_ = new javax.swing.JMenuItem();
        jBuscarPasaje_ = new javax.swing.JMenuItem();
        jListarPasaje_ = new javax.swing.JMenuItem();
        jMenuSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SOLBUS LA PUNTA");
        setResizable(false);

        javax.swing.GroupLayout JDesktopLayout = new javax.swing.GroupLayout(JDesktop);
        JDesktop.setLayout(JDesktopLayout);
        JDesktopLayout.setHorizontalGroup(
            JDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1356, Short.MAX_VALUE)
        );
        JDesktopLayout.setVerticalGroup(
            JDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 658, Short.MAX_VALUE)
        );

        jMenuGestionRutas.setText("Rutas");

        jAñadirRuta_.setText("Gestionar Rutas");
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

        jListarRuta_.setText("Listar Rutas");
        jListarRuta_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jListarRuta_ActionPerformed(evt);
            }
        });
        jMenuGestionRutas.add(jListarRuta_);

        jMenuBar1.add(jMenuGestionRutas);

        jMenuGestionHorarios.setText("Horarios");

        jAñadirHorario.setText("Agregar");
        jAñadirHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAñadirHorarioActionPerformed(evt);
            }
        });
        jMenuGestionHorarios.add(jAñadirHorario);

        jListarHorario.setText("Listar Horarios");
        jListarHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jListarHorarioActionPerformed(evt);
            }
        });
        jMenuGestionHorarios.add(jListarHorario);

        jMenuBar1.add(jMenuGestionHorarios);

        jMenuGestionPasajeros.setText("Pasajeros");

        jAñadirPasajero_.setText("Gestionar Pasajeros");
        jAñadirPasajero_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAñadirPasajero_ActionPerformed(evt);
            }
        });
        jMenuGestionPasajeros.add(jAñadirPasajero_);

        jBuscarPasajero_.setText("Buscar");
        jBuscarPasajero_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarPasajero_ActionPerformed(evt);
            }
        });
        jMenuGestionPasajeros.add(jBuscarPasajero_);

        jListarPasajero_.setText("Listar Pasajeros");
        jListarPasajero_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jListarPasajero_ActionPerformed(evt);
            }
        });
        jMenuGestionPasajeros.add(jListarPasajero_);

        jMenuBar1.add(jMenuGestionPasajeros);

        jMenuGestionPasajes.setText("Pasajes");

        jAñadirPasaje_.setText("Vender");
        jAñadirPasaje_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAñadirPasaje_ActionPerformed(evt);
            }
        });
        jMenuGestionPasajes.add(jAñadirPasaje_);

        jBuscarPasaje_.setText("Buscar");
        jBuscarPasaje_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarPasaje_ActionPerformed(evt);
            }
        });
        jMenuGestionPasajes.add(jBuscarPasaje_);

        jListarPasaje_.setText("Listar Pasajes");
        jListarPasaje_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jListarPasaje_ActionPerformed(evt);
            }
        });
        jMenuGestionPasajes.add(jListarPasaje_);

        jMenuBar1.add(jMenuGestionPasajes);

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
            .addComponent(JDesktop, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jAñadirRuta_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAñadirRuta_ActionPerformed
        JDesktop.removeAll();
        JDesktop.repaint();
        GestionRutas_Añadir gestionRutas_Añadir = new GestionRutas_Añadir();
        gestionRutas_Añadir.setVisible(true);
        JDesktop.add(gestionRutas_Añadir);
    }//GEN-LAST:event_jAñadirRuta_ActionPerformed

    private void jBuscarRuta_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarRuta_ActionPerformed
        JDesktop.removeAll();
        JDesktop.repaint();
        GestionRutas_Buscar gestionRutas_Buscar = new GestionRutas_Buscar();
        gestionRutas_Buscar.setVisible(true);
        JDesktop.add(gestionRutas_Buscar);
    }//GEN-LAST:event_jBuscarRuta_ActionPerformed

    private void jListarRuta_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jListarRuta_ActionPerformed
        JDesktop.removeAll();
        JDesktop.repaint();
        GestionRutas_Listar gestionRutas_Listar = new GestionRutas_Listar();
        gestionRutas_Listar.setVisible(true);
        JDesktop.add(gestionRutas_Listar);
    }//GEN-LAST:event_jListarRuta_ActionPerformed

    private void jMenuSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSalirMouseClicked
        dispose();
    }//GEN-LAST:event_jMenuSalirMouseClicked

    private void jAñadirHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAñadirHorarioActionPerformed
        if (!AH.isVisible()) {
            AH.setVisible(true);
        }
    }//GEN-LAST:event_jAñadirHorarioActionPerformed

    private void jAñadirPasajero_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAñadirPasajero_ActionPerformed
        JDesktop.removeAll();
        JDesktop.repaint();
        GestionPasajeros_Añadir gestionPasajeros_Añadir = new GestionPasajeros_Añadir();
        gestionPasajeros_Añadir.setVisible(true);
        JDesktop.add(gestionPasajeros_Añadir);
    }//GEN-LAST:event_jAñadirPasajero_ActionPerformed

    private void jListarHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jListarHorarioActionPerformed
        JDesktop.removeAll();
        JDesktop.repaint();
        GestionHorarios_Buscar BH = new GestionHorarios_Buscar();
        BH.setVisible(true);
        JDesktop.add(BH);
    }//GEN-LAST:event_jListarHorarioActionPerformed

    private void jListarPasajero_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jListarPasajero_ActionPerformed
        JDesktop.removeAll();
        JDesktop.repaint();
        GestionPasajeros_Listar gestionPasajeros_Listar = new GestionPasajeros_Listar();
        gestionPasajeros_Listar.setVisible(true);
        JDesktop.add(gestionPasajeros_Listar);
    }//GEN-LAST:event_jListarPasajero_ActionPerformed

    private void jBuscarPasajero_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarPasajero_ActionPerformed
        JDesktop.removeAll();
        JDesktop.repaint();
        GestionPasajeros_Buscar gestionPasajeros_Buscar = new GestionPasajeros_Buscar();
        gestionPasajeros_Buscar.setVisible(true);
        JDesktop.add(gestionPasajeros_Buscar);
    }//GEN-LAST:event_jBuscarPasajero_ActionPerformed

    private void jAñadirPasaje_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAñadirPasaje_ActionPerformed
        JDesktop.removeAll();
        JDesktop.repaint();
        GestionPasajes_Añadir VP = new GestionPasajes_Añadir();
        VP.setVisible(true);
        JDesktop.add(VP);
    }//GEN-LAST:event_jAñadirPasaje_ActionPerformed

    private void jBuscarPasaje_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarPasaje_ActionPerformed
        JDesktop.removeAll();
        JDesktop.repaint();
        GestionPasajes_Buscar gestionPasajes_Buscar = new GestionPasajes_Buscar();
        gestionPasajes_Buscar.setVisible(true);
        JDesktop.add(gestionPasajes_Buscar);
    }//GEN-LAST:event_jBuscarPasaje_ActionPerformed

    private void jListarPasaje_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jListarPasaje_ActionPerformed
        JDesktop.removeAll();
        JDesktop.repaint();
        GestionPasajes_Listar gestionPasajes_Listar = new GestionPasajes_Listar();
        gestionPasajes_Listar.setVisible(true);
        JDesktop.add(gestionPasajes_Listar);
    }//GEN-LAST:event_jListarPasaje_ActionPerformed

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
    private javax.swing.JMenuItem jAñadirPasaje_;
    private javax.swing.JMenuItem jAñadirPasajero_;
    private javax.swing.JMenuItem jAñadirRuta_;
    private javax.swing.JMenuItem jBuscarPasaje_;
    private javax.swing.JMenuItem jBuscarPasajero_;
    private javax.swing.JMenuItem jBuscarRuta_;
    private javax.swing.JMenuItem jListarHorario;
    private javax.swing.JMenuItem jListarPasaje_;
    private javax.swing.JMenuItem jListarPasajero_;
    private javax.swing.JMenuItem jListarRuta_;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuGestionHorarios;
    private javax.swing.JMenu jMenuGestionPasajeros;
    private javax.swing.JMenu jMenuGestionPasajes;
    private javax.swing.JMenu jMenuGestionRutas;
    private javax.swing.JMenu jMenuSalir;
    // End of variables declaration//GEN-END:variables
}
