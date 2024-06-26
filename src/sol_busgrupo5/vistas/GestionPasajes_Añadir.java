package sol_busgrupo5.vistas;

import java.sql.*;
import java.time.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sol_busgrupo5.accesoADatos.*;
import sol_busgrupo5.entidades.*;

public class GestionPasajes_Añadir extends javax.swing.JInternalFrame {
    DefaultTableModel DTMT = new DefaultTableModel();
    ColectivoData CD = new ColectivoData();
    PasajeData PasajeD = new PasajeData();
    PasajeroData PD = new PasajeroData();
    HorarioData HD = new HorarioData();
    RutaData RD = new RutaData();
    private boolean ventanaInicializada = false;

    public GestionPasajes_Añadir() {
        initComponents();
        JComboS();
        EstoEsCine();
        DTMT.setColumnIdentifiers(new String[]{"Destino", "Hora Salida", "Hora Llegada"});
        JTable_Destinos.setModel(DTMT);
        DTMT.setRowCount(0);
        for (Horario horario : HD.Listar_Horarios("Por ruta", RD.buscarRuta("Origen", String.valueOf(JCombo_Origen.getSelectedItem())).getIdRuta(), null)) {
            DTMT.addRow(new Object[]{horario.getRuta().getDestino(), horario.getHoraSalida(), horario.getHoraLlegada()});
        }
        JTable_Destinos.setModel(DTMT);
        ventanaInicializada = true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        JDNI = new javax.swing.JTextField();
        JButton_BuscarPasajero = new javax.swing.JButton();
        JTextNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JTextApellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JTextGmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        JTextTelefono = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        JCombo_Origen = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTable_Destinos = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        JComboBox_Transportes = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        JTextMarca = new javax.swing.JTextField();
        JTextMatricula = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        JTextCapacidad = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        JCombo_Asientos_Disponibles = new javax.swing.JComboBox<>();
        jPanel10 = new javax.swing.JPanel();
        JButton_Nuevo = new javax.swing.JButton();
        JButton_Guardar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        JTextID_Pasajero = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        JTextID_Colectivo = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        JTextID_Ruta = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        JTextAsiento = new javax.swing.JTextField();
        JTextHora_viaje = new javax.swing.JTextField();
        FF = new javax.swing.JLabel();
        JTextPrecio = new javax.swing.JTextField();
        Fecha = new javax.swing.JLabel();
        JCombo_Dia = new javax.swing.JComboBox<>();
        JCombo_Mes = new javax.swing.JComboBox<>();
        JCombo_Año = new javax.swing.JComboBox<>();
        JTextFecha = new javax.swing.JTextField();
        JButton_Aplicar = new javax.swing.JButton();
        FF1 = new javax.swing.JLabel();
        JText_FechaVenta = new javax.swing.JTextField();

        setTitle("Venta de pasajes");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jLabel2.setText("Datos del Pasajero");
        jPanel2.add(jLabel2, new java.awt.GridBagConstraints());

        jLabel1.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DNI");

        JDNI.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        JButton_BuscarPasajero.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        JButton_BuscarPasajero.setText("Buscar pasajero");
        JButton_BuscarPasajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton_BuscarPasajeroActionPerformed(evt);
            }
        });

        JTextNombre.setEditable(false);
        JTextNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Apellido");

        JTextApellido.setEditable(false);
        JTextApellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Gmail");

        JTextGmail.setEditable(false);
        JTextGmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel6.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Telefono");

        JTextTelefono.setEditable(false);
        JTextTelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTextApellido))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTextNombre)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JButton_BuscarPasajero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTextGmail))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(4, 4, 4)
                        .addComponent(JTextTelefono)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JButton_BuscarPasajero)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTextGmail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JTextTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JTextApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel4.setLayout(new java.awt.GridBagLayout());

        jLabel7.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jLabel7.setText("Origen : Destino");
        jPanel4.add(jLabel7, new java.awt.GridBagConstraints());

        jPanel5.setLayout(new java.awt.GridBagLayout());

        jLabel12.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Seleccionar Origen");
        jPanel5.add(jLabel12, new java.awt.GridBagConstraints());

        jLabel13.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText(" ");
        jPanel5.add(jLabel13, new java.awt.GridBagConstraints());

        JCombo_Origen.setMaximumRowCount(999);
        JCombo_Origen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCombo_OrigenActionPerformed(evt);
            }
        });
        jPanel5.add(JCombo_Origen, new java.awt.GridBagConstraints());

        jPanel6.setLayout(new java.awt.GridBagLayout());

        jLabel14.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Destinos Disponibles");
        jPanel6.add(jLabel14, new java.awt.GridBagConstraints());

        JTable_Destinos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre del Destino"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTable_Destinos.getTableHeader().setReorderingAllowed(false);
        JTable_Destinos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTable_DestinosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTable_Destinos);
        if (JTable_Destinos.getColumnModel().getColumnCount() > 0) {
            JTable_Destinos.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel8.setLayout(new java.awt.GridBagLayout());

        jLabel8.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jLabel8.setText("Transporte");
        jPanel8.add(jLabel8, new java.awt.GridBagConstraints());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Transporte");

        JComboBox_Transportes.setMaximumRowCount(999);
        JComboBox_Transportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JComboBox_TransportesActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Marca");

        JTextMarca.setForeground(new java.awt.Color(153, 153, 153));
        JTextMarca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTextMarca.setText("Marca");

        JTextMatricula.setForeground(new java.awt.Color(153, 153, 153));
        JTextMatricula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTextMatricula.setText("Matricula");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Matricula");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Capacidad del transporte");

        JTextCapacidad.setForeground(new java.awt.Color(153, 153, 153));
        JTextCapacidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTextCapacidad.setText("Capacidad");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Lugares Disponibles");

        JCombo_Asientos_Disponibles.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        JCombo_Asientos_Disponibles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCombo_Asientos_DisponiblesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(JComboBox_Transportes, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTextMarca))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(162, 162, 162)
                                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(JTextMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTextCapacidad, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                            .addComponent(JCombo_Asientos_Disponibles, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(JComboBox_Transportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(JTextMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(JTextMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(JTextCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(JCombo_Asientos_Disponibles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        JButton_Nuevo.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        JButton_Nuevo.setText("Nueva Venta");
        JButton_Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton_NuevoActionPerformed(evt);
            }
        });
        jPanel10.add(JButton_Nuevo);

        JButton_Guardar.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        JButton_Guardar.setText("Vender");
        JButton_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton_GuardarActionPerformed(evt);
            }
        });
        jPanel10.add(JButton_Guardar);

        jButton3.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton3);

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel17.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("ID Pasajero");

        JTextID_Pasajero.setEditable(false);
        JTextID_Pasajero.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        JTextID_Pasajero.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTextID_Pasajero.setText("ID Pasajero");

        jLabel18.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("ID Colectivo");

        JTextID_Colectivo.setEditable(false);
        JTextID_Colectivo.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        JTextID_Colectivo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTextID_Colectivo.setText("ID Colectivo");

        jLabel19.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("ID Ruta");

        JTextID_Ruta.setEditable(false);
        JTextID_Ruta.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        JTextID_Ruta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTextID_Ruta.setText("ID Ruta");

        jLabel20.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Hora del Viaje");

        jLabel21.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Asiento");

        JTextAsiento.setEditable(false);
        JTextAsiento.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        JTextAsiento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTextAsiento.setText("Asiento");

        JTextHora_viaje.setEditable(false);
        JTextHora_viaje.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        JTextHora_viaje.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTextHora_viaje.setText("Hora");

        FF.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        FF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FF.setText("Precio");

        JTextPrecio.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        JTextPrecio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTextPrecio.setText("Precio");

        Fecha.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        Fecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fecha.setText("Fecha");

        JCombo_Dia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JCombo_Dia.setMaximumRowCount(31);

        JCombo_Mes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JCombo_Mes.setMaximumRowCount(31);

        JCombo_Año.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JCombo_Año.setMaximumRowCount(31);
        JCombo_Año.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2024" }));

        JTextFecha.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        JTextFecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTextFecha.setText("Fecha");

        JButton_Aplicar.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        JButton_Aplicar.setText("Aplicar");
        JButton_Aplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton_AplicarActionPerformed(evt);
            }
        });

        FF1.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        FF1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FF1.setText("Fecha Venta");

        JText_FechaVenta.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        JText_FechaVenta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JText_FechaVenta.setText("Fecha venta");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JTextID_Pasajero, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(JTextID_Colectivo, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(JTextID_Ruta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(FF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)))
                    .addComponent(FF1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(JTextAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTextHora_viaje, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTextPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JText_FechaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(JButton_Aplicar, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTextFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(Fecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JCombo_Mes, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JCombo_Dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JCombo_Año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(JTextID_Pasajero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(JTextAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20)
                            .addComponent(JTextHora_viaje, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JTextID_Colectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FF)
                        .addComponent(JTextPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Fecha)
                        .addComponent(JCombo_Dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JCombo_Mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JCombo_Año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTextID_Ruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FF1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JText_FechaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTextFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JButton_Aplicar))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JButton_BuscarPasajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton_BuscarPasajeroActionPerformed
        try {
            if (JDNI.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Campo vacío.");
                limpiarTextos();
            } else if (!JDNI.getText().matches("[1-9][0-9]{7}+")) {
                JOptionPane.showMessageDialog(this, "Valor inválido.");
                limpiarTextos();
            } else {
                if (PD.buscar("DNI", JDNI.getText()) != null) {
                    Pasajero pasajero = PD.buscar("DNI", JDNI.getText());
                    JTextID_Pasajero.setText("" + pasajero.getIdPasajero());
                    JTextNombre.setText(pasajero.getNombre());
                    JTextApellido.setText(pasajero.getApellido());
                    JTextGmail.setText(pasajero.getCorreo());
                    JTextTelefono.setText(pasajero.getTelefono());
                } else {
                    JOptionPane.showMessageDialog(this, "Pasajero no encontrado, DNI inválido o no registrado.");
                    limpiarTextos();
                }
            }
        } catch (NumberFormatException NFE) {
            JOptionPane.showMessageDialog(this, "No debe contener letras.");
            limpiarTextos();
        }
    }//GEN-LAST:event_JButton_BuscarPasajeroActionPerformed

    private void JCombo_OrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCombo_OrigenActionPerformed
        DTMT.setRowCount(0);
        for (Horario horario : HD.Listar_Horarios("Por ruta", ((Ruta)JCombo_Origen.getSelectedItem()).getIdRuta(), null)) {
            JTextID_Ruta.setText("" + horario.getRuta().getIdRuta());
            DTMT.addRow(new Object[]{horario.getRuta().getDestino(), horario.getHoraSalida(), horario.getHoraLlegada()});
        }
        JTable_Destinos.setModel(DTMT);
    }//GEN-LAST:event_JCombo_OrigenActionPerformed

    private void JComboBox_TransportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JComboBox_TransportesActionPerformed
        if (!ventanaInicializada) {
        return;
        }
        
        Colectivo colectivo = ((Colectivo) JComboBox_Transportes.getSelectedItem());
        ArrayList<Integer> asientosOcupados = new ArrayList<>();
    
        JTextMarca.setText(colectivo.getMarca());
        JTextCapacidad.setText(String.valueOf(colectivo.getCapacidad()));
        JTextMatricula.setText(colectivo.getMatricula());
        JTextID_Colectivo.setText(String.valueOf(colectivo.getIdColectivo()));
    
        JCombo_Asientos_Disponibles.removeAllItems();
    
        for (Pasaje pasaje : PasajeD.visualizarPasajes()) {
            if (pasaje.getColectivo().getIdColectivo() == colectivo.getIdColectivo()) {
                asientosOcupados.add(pasaje.getAsiento());
            }
        }
    
        boolean hayAsientosDisponibles = false;
        for (int i = 1; i <= colectivo.getCapacidad(); i++) {
            if (!asientosOcupados.contains(i)) {
                JCombo_Asientos_Disponibles.addItem(i);
                hayAsientosDisponibles = true;
            }
        }
    
        if (!hayAsientosDisponibles) {
            JOptionPane.showMessageDialog(this, "No hay más lugares en el transporte seleccionado.");
            JComboBox_Transportes.removeItemAt(JComboBox_Transportes.getSelectedIndex());
        }
    }//GEN-LAST:event_JComboBox_TransportesActionPerformed

    private void JTable_DestinosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTable_DestinosMouseClicked
        JTextHora_viaje.setText("" + DTMT.getValueAt(JTable_Destinos.getSelectedRow(), 1));
    }//GEN-LAST:event_JTable_DestinosMouseClicked

    private void JButton_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton_NuevoActionPerformed
        Clean();
    }//GEN-LAST:event_JButton_NuevoActionPerformed

    private void JButton_AplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton_AplicarActionPerformed
        JTextFecha.setText(JCombo_Año.getSelectedItem() + "-" + JCombo_Mes.getSelectedItem() + "-" + JCombo_Dia.getSelectedItem());
    }//GEN-LAST:event_JButton_AplicarActionPerformed

    private void JButton_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton_GuardarActionPerformed
        try {
            Pasaje pasaje = new Pasaje(PD.buscar("ID", JTextID_Pasajero.getText()), CD.buscar(Integer.parseInt(JTextID_Colectivo.getText())), RD.buscarPorID(Integer.parseInt(JTextID_Ruta.getText())), Date.valueOf(JTextFecha.getText()), Time.valueOf(JTextHora_viaje.getText()), Integer.parseInt(JTextAsiento.getText()), Double.parseDouble(JTextPrecio.getText()), true, Date.valueOf(LocalDate.now()));
            int aux = PasajeD.registrarVenta(pasaje);
            if (aux == 1) {
                JOptionPane.showMessageDialog(this, "Venta agregada.");
                
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo agregar la venta.");
            }
        } catch (NumberFormatException NFE) {
            if (JTextID_Pasajero.getText().equals("ID Pasajero")) {
                JOptionPane.showMessageDialog(this, "Falta el ID del Pasajero");
            } else if (JTextID_Colectivo.getText().equals("ID Colectivo")) {
                JOptionPane.showMessageDialog(this, "Falta el ID del Colectivo");
            } else if (JTextID_Ruta.getText().equals("ID Ruta")) {
                JOptionPane.showMessageDialog(this, "Falta el ID de la Ruta");
            } else if (JTextAsiento.getText().equals("Asiento")) {
                JOptionPane.showMessageDialog(this, "Asiento debe contener un número.");
            } else if (JTextPrecio.getText().equals("Precio")) {
                JOptionPane.showMessageDialog(this, "Precio debe contener solamente números.");
            }
        } catch (IllegalArgumentException IAE) {
            JOptionPane.showMessageDialog(this, "Fecha y Hora deben contener valores válidos.");
        }
    }//GEN-LAST:event_JButton_GuardarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void JCombo_Asientos_DisponiblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCombo_Asientos_DisponiblesActionPerformed
        JTextAsiento.setText(""+JCombo_Asientos_Disponibles.getSelectedItem());
    }//GEN-LAST:event_JCombo_Asientos_DisponiblesActionPerformed

    public void Clean() {
        limpiarTextos();
        JTextID_Pasajero.setText("ID Pasajero");
        JTextID_Colectivo.setText("ID Colectivo");
        JTextID_Ruta.setText("ID Ruta");
        JTextPrecio.setText("Precio");
        JTextHora_viaje.setText("Hora");
    }

    public void limpiarTextos() {
        JDNI.setText("");
        JTextNombre.setText("");
        JTextGmail.setText("");
        JTextApellido.setText("");
        JTextTelefono.setText("");
    }

    public void JComboS() {
        JText_FechaVenta.setText(""+LocalDate.now());
        for (Ruta ruta : RD.listarRutas()) {
            if(!HD.Listar_Horarios("Por ruta", ruta.getIdRuta(), null).isEmpty()){
                JCombo_Origen.addItem(ruta);
            }
        }
        for (Colectivo colectivo : CD.listarColectivos()) {
            JComboBox_Transportes.addItem(colectivo);
        }
    }

    public void EstoEsCine() {
        for (int i = LocalDate.now().getDayOfMonth(); i <= 31; i++) {
            if (i <= 9) {
                JCombo_Dia.addItem("0" + i);
            } else {
                JCombo_Dia.addItem("" + i);
            }
        }
        for (int i = LocalDate.now().getMonth().getValue(); i <= 12; i++) {
            if (i >= 1 && i < 10) {
                JCombo_Mes.addItem("0" + i);
            } else {
                JCombo_Mes.addItem("" + i);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FF;
    private javax.swing.JLabel FF1;
    private javax.swing.JLabel Fecha;
    private javax.swing.JButton JButton_Aplicar;
    private javax.swing.JButton JButton_BuscarPasajero;
    private javax.swing.JButton JButton_Guardar;
    private javax.swing.JButton JButton_Nuevo;
    private javax.swing.JComboBox<Colectivo> JComboBox_Transportes;
    private javax.swing.JComboBox<Integer> JCombo_Asientos_Disponibles;
    private javax.swing.JComboBox<String> JCombo_Año;
    private javax.swing.JComboBox<String> JCombo_Dia;
    private javax.swing.JComboBox<String> JCombo_Mes;
    private javax.swing.JComboBox<Ruta> JCombo_Origen;
    private javax.swing.JTextField JDNI;
    private javax.swing.JTable JTable_Destinos;
    private javax.swing.JTextField JTextApellido;
    private javax.swing.JTextField JTextAsiento;
    private javax.swing.JTextField JTextCapacidad;
    private javax.swing.JTextField JTextFecha;
    private javax.swing.JTextField JTextGmail;
    private javax.swing.JTextField JTextHora_viaje;
    private javax.swing.JTextField JTextID_Colectivo;
    private javax.swing.JTextField JTextID_Pasajero;
    private javax.swing.JTextField JTextID_Ruta;
    private javax.swing.JTextField JTextMarca;
    private javax.swing.JTextField JTextMatricula;
    private javax.swing.JTextField JTextNombre;
    private javax.swing.JTextField JTextPrecio;
    private javax.swing.JTextField JTextTelefono;
    private javax.swing.JTextField JText_FechaVenta;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
