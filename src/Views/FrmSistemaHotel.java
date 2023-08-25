/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

/**
 *
 * @author Usuario
 */
public class FrmSistemaHotel extends javax.swing.JFrame {

    private InternalFrameHabitación habitacion;

    /**
     * Creates new form FrmSistemaBanco
     */
    public FrmSistemaHotel() {
        initComponents();
        habitacion = new InternalFrameHabitación();
        View.maximize(this);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jLabelTextoEntrada = new javax.swing.JLabel();
        jDesktopPaneSistema = new javax.swing.JDesktopPane();
        jMenuBarSistema = new javax.swing.JMenuBar();
        jMenuSistema = new javax.swing.JMenu();
        jMenuItemClientes = new javax.swing.JMenuItem();
        jMenuItemEmpleados = new javax.swing.JMenuItem();
        jMenuItemHabitaciones = new javax.swing.JMenuItem();
        jMenuItemReserva = new javax.swing.JMenuItem();
        jMenuItemServicios = new javax.swing.JMenuItem();
        jMenuItemRegistrarUsuarios = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelTextoEntrada.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelTextoEntrada.setText("Azure Horizons Hotel System");

        javax.swing.GroupLayout jDesktopPaneSistemaLayout = new javax.swing.GroupLayout(jDesktopPaneSistema);
        jDesktopPaneSistema.setLayout(jDesktopPaneSistemaLayout);
        jDesktopPaneSistemaLayout.setHorizontalGroup(
            jDesktopPaneSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1376, Short.MAX_VALUE)
        );
        jDesktopPaneSistemaLayout.setVerticalGroup(
            jDesktopPaneSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 618, Short.MAX_VALUE)
        );

        jMenuSistema.setText("Administración");

        jMenuItemClientes.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jMenuItemClientes.setText("Clientes");
        jMenuItemClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClientesActionPerformed(evt);
            }
        });
        jMenuSistema.add(jMenuItemClientes);

        jMenuItemEmpleados.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jMenuItemEmpleados.setText("Empleados");
        jMenuItemEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEmpleadosActionPerformed(evt);
            }
        });
        jMenuSistema.add(jMenuItemEmpleados);

        jMenuItemHabitaciones.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jMenuItemHabitaciones.setText("Habitaciones");
        jMenuItemHabitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemHabitacionesActionPerformed(evt);
            }
        });
        jMenuSistema.add(jMenuItemHabitaciones);

        jMenuItemReserva.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jMenuItemReserva.setText("Reserva");
        jMenuItemReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemReservaActionPerformed(evt);
            }
        });
        jMenuSistema.add(jMenuItemReserva);

        jMenuItemServicios.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jMenuItemServicios.setText("Servicios");
        jMenuItemServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemServiciosActionPerformed(evt);
            }
        });
        jMenuSistema.add(jMenuItemServicios);

        jMenuItemRegistrarUsuarios.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jMenuItemRegistrarUsuarios.setText("RegistrarUsuarios");
        jMenuItemRegistrarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRegistrarUsuariosActionPerformed(evt);
            }
        });
        jMenuSistema.add(jMenuItemRegistrarUsuarios);

        jMenuBarSistema.add(jMenuSistema);

        setJMenuBar(jMenuBarSistema);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPaneSistema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(513, 513, 513)
                .addComponent(jLabelTextoEntrada)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabelTextoEntrada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jDesktopPaneSistema)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClientesActionPerformed
        // TODO add your handling code here:
        InternalFrameClientes clientes = new InternalFrameClientes();
        View.showInternal(jDesktopPaneSistema, clientes);

    }//GEN-LAST:event_jMenuItemClientesActionPerformed

    private void jMenuItemServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemServiciosActionPerformed
        // TODO add your handling code here:
        InternalFrameServicios servicios = new InternalFrameServicios();
        View.showInternal(jDesktopPaneSistema, servicios);
    }//GEN-LAST:event_jMenuItemServiciosActionPerformed

    private void jMenuItemEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEmpleadosActionPerformed
        // TODO add your handling code here:
        InternalFrameEmpleados empleados = new InternalFrameEmpleados();
        View.showInternal(jDesktopPaneSistema, empleados);

    }//GEN-LAST:event_jMenuItemEmpleadosActionPerformed

    private void jMenuItemHabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemHabitacionesActionPerformed
        // TODO add your handling code here:
        InternalFrameHabitación habitaciones = new InternalFrameHabitación();
        View.showInternal(jDesktopPaneSistema, habitaciones);

    }//GEN-LAST:event_jMenuItemHabitacionesActionPerformed

    private void jMenuItemReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemReservaActionPerformed
        // TODO add your handling code here:
        InternalFrameReserva reserva = new InternalFrameReserva();
        View.showInternal(jDesktopPaneSistema, reserva);

    }//GEN-LAST:event_jMenuItemReservaActionPerformed

    private void jMenuItemRegistrarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRegistrarUsuariosActionPerformed
        // TODO add your handling code here:
        InternalFrameUsuarios usuarios = new InternalFrameUsuarios();
        View.showInternal(jDesktopPaneSistema, usuarios);
    }//GEN-LAST:event_jMenuItemRegistrarUsuariosActionPerformed

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
            java.util.logging.Logger.getLogger(FrmSistemaHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmSistemaHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmSistemaHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmSistemaHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmSistemaHotel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPaneSistema;
    private javax.swing.JLabel jLabelTextoEntrada;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBarSistema;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemClientes;
    private javax.swing.JMenuItem jMenuItemEmpleados;
    private javax.swing.JMenuItem jMenuItemHabitaciones;
    private javax.swing.JMenuItem jMenuItemRegistrarUsuarios;
    private javax.swing.JMenuItem jMenuItemReserva;
    private javax.swing.JMenuItem jMenuItemServicios;
    private javax.swing.JMenu jMenuSistema;
    // End of variables declaration//GEN-END:variables
}