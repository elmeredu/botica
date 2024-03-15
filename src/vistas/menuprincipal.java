package vistas;

import controles.CADO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import ds.desktop.notify.DesktopNotify;
import ds.desktop.notify.NotifyTheme;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class menuprincipal extends javax.swing.JFrame {

    CADO c = new CADO();

    public menuprincipal() {
        initComponents();
        Notificaciones();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 788, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 512, Short.MAX_VALUE)
        );

        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        jMenu1.setText("Registrar     ");
        jMenu1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setText("Compra");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem2.setText("Venta");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Reportes     ");
        jMenu2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jMenuItem4.setText("Compras del mes");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Ventas del mes");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("Ventas del dia");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem3.setText("Producto mas vendido");
        jMenuItem3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem3MousePressed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem7.setText("Utilidad");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Configuracion");
        jMenu3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jMenuItem8.setText("Productos");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        try {
            regcompras vc = new regcompras();
            vc.setVisible(true);
            this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(menuprincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        try {
            regventas vv = new regventas();
            vv.setVisible(true);
            this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(menuprincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem3MousePressed
        try {
            JasperReport reportproducto = null;
            reportproducto = (JasperReport) JRLoader.loadObjectFromFile("C:\\Users\\ASUS\\Documents\\NetBeansProjects-copiadeseguridad\\botica\\src\\reportes\\prodmasvend.jasper");
            JasperPrint print = JasperFillManager.fillReport(reportproducto, null, c.conectar());
            JasperViewer ver = new JasperViewer(print, false);
            ver.setTitle("Producto mas vendido");
            ver.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(menuprincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem3MousePressed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        String mes = JOptionPane.showInputDialog("Introduzca un mes:");
        String año = JOptionPane.showInputDialog("Introduzca un año:");
        try {
            JasperReport reportcompras = null;
            reportcompras = (JasperReport) JRLoader.loadObjectFromFile("C:\\Users\\ASUS\\Documents\\NetBeansProjects-copiadeseguridad\\botica\\src\\reportes\\comprasdelmes.jasper");
            Map<String, Object> parametros = new HashMap<String, Object>();
            parametros.put("mes", mes);
            parametros.put("año", año);
            JasperPrint print = JasperFillManager.fillReport(reportcompras, parametros, c.conectar());
            JasperViewer ver = new JasperViewer(print, false);
            ver.setTitle("Compras del mes");
            ver.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(menuprincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        String mes = JOptionPane.showInputDialog("Introduzca un mes:");
        String año = JOptionPane.showInputDialog("Introduzca un año:");
        try {
            JasperReport reportventas = null;
            reportventas = (JasperReport) JRLoader.loadObjectFromFile("C:\\Users\\ASUS\\Documents\\NetBeansProjects-copiadeseguridad\\botica\\src\\reportes\\ventasdelmes.jasper");
            Map<String, Object> parametros = new HashMap<String, Object>();
            parametros.put("mes", mes);
            parametros.put("año", año);
            JasperPrint print = JasperFillManager.fillReport(reportventas, parametros, c.conectar());
            JasperViewer ver = new JasperViewer(print, false);
            ver.setTitle("Ventas del mes");
            ver.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(menuprincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        try {
            JasperReport reportventasdia = null;
            reportventasdia = (JasperReport) JRLoader.loadObjectFromFile("C:\\Users\\ASUS\\Documents\\NetBeansProjects-copiadeseguridad\\botica\\src\\reportes\\ventasdia.jasper");
            JasperPrint print = JasperFillManager.fillReport(reportventasdia, null, c.conectar());
            JasperViewer ver = new JasperViewer(print, false);
            ver.setTitle("Ventas del dia");
            ver.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(menuprincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        try {
            JasperReport reportutilidad = null;
            reportutilidad = (JasperReport) JRLoader.loadObjectFromFile("C:\\Users\\ASUS\\Documents\\NetBeansProjects-copiadeseguridad\\botica\\src\\reportes\\utilidad.jasper");
            JasperPrint print = JasperFillManager.fillReport(reportutilidad, null, c.conectar());
            JasperViewer ver = new JasperViewer(print, false);
            ver.setTitle("Utilidad");
            ver.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(menuprincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        try {
            confproductos vp = new confproductos();
            vp.setVisible(true);
            this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(menuprincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    public static void main(String args[]) {

        try {
            javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(regcompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(regcompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(regcompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(regcompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuprincipal().setVisible(true);
            }
        });
    }

    public void Notificaciones() {
        try {
            stock30();
            stock20();
            stock10();
            fechavenci3M();
            fechavenci2M();
            fechavenci1M();
        } catch (SQLException ex) {
            Logger.getLogger(menuprincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void stock30() throws SQLException {
        ResultSet rs = c.recuperar("select count(*) from detcom WHERE (detcom.STOCK * 20 / 100) <= detcom.STOCKACTUAL and detcom.STOCKACTUAL < (detcom.STOCK * 30 / 100)");
        rs.next();
        if (0 < rs.getInt(1)) {
            ResultSet rs2 = c.recuperar("select * from detcom d inner join producto p on p.ID_PROD = d.PRODUCTO WHERE (d.STOCK * 20 / 100) <= d.STOCKACTUAL and d.STOCKACTUAL < (d.STOCK * 30 / 100)");

            for (int i = 0; i < rs.getInt(1); i++) {
                rs2.next();
                DesktopNotify.showDesktopMessage("Existencias 30%", "El producto: " + rs2.getString(10).toUpperCase() + " le queda menos de 30% de Existencias", DesktopNotify.TIP);
            }
        }
    }

    public void stock20() throws SQLException {
        ResultSet rs = c.recuperar("select count(*) from detcom WHERE (detcom.STOCK * 10 / 100) <= detcom.STOCKACTUAL and detcom.STOCKACTUAL < (detcom.STOCK * 20 / 100)");
        rs.next();
        if (0 < rs.getInt(1)) {
            ResultSet rs2 = c.recuperar("select * from detcom d inner join producto p on p.ID_PROD = d.PRODUCTO WHERE (d.STOCK * 10 / 100) <= d.STOCKACTUAL and d.STOCKACTUAL < (d.STOCK * 20 / 100)");

            for (int i = 0; i < rs.getInt(1); i++) {
                rs2.next();
                DesktopNotify.showDesktopMessage("Existencias 20%", "El producto: " + rs2.getString(10).toUpperCase() + " le quedan menos de 20% de Existencias", DesktopNotify.INFORMATION);
            }
        }
    }

    public void stock10() throws SQLException {
        ResultSet rs = c.recuperar("select count(*) from detcom WHERE (detcom.STOCK * 0 ) < detcom.STOCKACTUAL and detcom.STOCKACTUAL < (detcom.STOCK * 10 / 100)");
        rs.next();
        if (0 < rs.getInt(1)) {
            ResultSet rs2 = c.recuperar("select * from detcom d inner join producto p on p.ID_PROD = d.PRODUCTO WHERE (d.STOCK * 0) <= d.STOCKACTUAL and d.STOCKACTUAL < (d.STOCK * 10 / 100)");

            for (int i = 0; i < rs.getInt(1); i++) {
                rs2.next();
                DesktopNotify.showDesktopMessage("Existencias 10%", "El producto: " + rs2.getString(10).toUpperCase() + " le queda menos de 10% de Existencias", DesktopNotify.WARNING);
            }
        }
    }

    public void fechavenci3M() throws SQLException {
        Calendar hoy = Calendar.getInstance();
        ResultSet rs = c.recuperar("SELECT count(*) FROM detcom WHERE 200 < FECHA_VEN - CURRENT_DATE and FECHA_VEN - CURRENT_DATE <= 300");
        rs.next();
        if (0 < rs.getInt(1)) {
            ResultSet rs2 = c.recuperar("SELECT * FROM detcom d inner JOIN producto p ON d.PRODUCTO = p.ID_PROD WHERE 200 < d.FECHA_VEN - CURRENT_DATE and d.FECHA_VEN - CURRENT_DATE <= 300");

            for (int i = 0; i < rs.getInt(1); i++) {
                rs2.next();
                DesktopNotify.showDesktopMessage("Fecha de vencimiento 3 Meses: ", "El producto: " + rs2.getString(10).toUpperCase() + " caduca en menos de 3 meses.", DesktopNotify.TIP);
            }
        }
    }

    public void fechavenci2M() throws SQLException {
        Calendar hoy = Calendar.getInstance();
        ResultSet rs = c.recuperar("SELECT count(*) FROM detcom WHERE 100 < FECHA_VEN - CURRENT_DATE and FECHA_VEN - CURRENT_DATE <= 200");
        rs.next();
        if (0 < rs.getInt(1)) {
            ResultSet rs2 = c.recuperar("SELECT * FROM detcom d inner JOIN producto p ON d.PRODUCTO = p.ID_PROD WHERE 100 < d.FECHA_VEN - CURRENT_DATE and d.FECHA_VEN - CURRENT_DATE <= 200");

            for (int i = 0; i < rs.getInt(1); i++) {
                rs2.next();
                DesktopNotify.showDesktopMessage("Fecha de vencimiento 2 Meses: ", "El producto: " + rs2.getString(10).toUpperCase() + " caduca en menos de 2 meses.", DesktopNotify.TIP);
            }
        }
    }

    public void fechavenci1M() throws SQLException {
        Calendar hoy = Calendar.getInstance();
        ResultSet rs = c.recuperar("SELECT count(*) FROM detcom WHERE 0 < FECHA_VEN - CURRENT_DATE and FECHA_VEN - CURRENT_DATE <= 100 AND STOCKACTUAL <> 0");
        rs.next();
        if (0 < rs.getInt(1)) {
            ResultSet rs2 = c.recuperar("SELECT * FROM detcom d inner JOIN producto p ON d.PRODUCTO = p.ID_PROD WHERE 0 < d.FECHA_VEN - CURRENT_DATE and d.FECHA_VEN - CURRENT_DATE <= 100");

            for (int i = 0; i < rs.getInt(1); i++) {
                rs2.next();
                DesktopNotify.showDesktopMessage("Fecha de vencimiento 1 Meses: ", "El producto: " + rs2.getString(10).toUpperCase() + " caduca en menos de 1 meses.", DesktopNotify.TIP);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}


//Falta reabastecimiento de productos y estados de resultados
