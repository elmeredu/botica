package vistas;

import controles.CADO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelos.mdlproducto;

public class confproductos extends javax.swing.JFrame {

    mdlproducto mdlprod = new mdlproducto();
    CADO c = new CADO();

    public confproductos() throws SQLException {
        initComponents();
        paneleditar.setVisible(false);
        mdlprod.tablaproducto();
        tbproductos.setModel(mdlprod);
        btnreabastecer.setEnabled(false);
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelproducto = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbproductos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        paneleditar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtdescripcion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtprecio = new javax.swing.JTextField();
        btnreabastecer = new javax.swing.JButton();
        btnvolver = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        tbproductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbproductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbproductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbproductos);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Busca: ");

        txtbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbuscarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout panelproductoLayout = new javax.swing.GroupLayout(panelproducto);
        panelproducto.setLayout(panelproductoLayout);
        panelproductoLayout.setHorizontalGroup(
            panelproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelproductoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelproductoLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbuscar))
                    .addGroup(panelproductoLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelproductoLayout.setVerticalGroup(
            panelproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelproductoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Descripcion:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Precio: ");

        btnreabastecer.setText("Reabastecer");
        btnreabastecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreabastecerActionPerformed(evt);
            }
        });

        btnvolver.setText("Volver");
        btnvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvolverActionPerformed(evt);
            }
        });

        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneleditarLayout = new javax.swing.GroupLayout(paneleditar);
        paneleditar.setLayout(paneleditarLayout);
        paneleditarLayout.setHorizontalGroup(
            paneleditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneleditarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneleditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(paneleditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtdescripcion)
                    .addGroup(paneleditarLayout.createSequentialGroup()
                        .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnreabastecer)
                        .addGap(18, 18, 18)
                        .addComponent(btnguardar)
                        .addGap(18, 18, 18)
                        .addComponent(btnvolver)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        paneleditarLayout.setVerticalGroup(
            paneleditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneleditarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneleditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(paneleditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnreabastecer)
                    .addComponent(btnguardar)
                    .addComponent(btnvolver))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(paneleditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 130, Short.MAX_VALUE)
                    .addComponent(paneleditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 130, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        menuprincipal vm = new menuprincipal();
        vm.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void btnvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvolverActionPerformed
        paneleditar.setVisible(false);
        panelproducto.setVisible(true);
        this.setSize(495, 390);
    }//GEN-LAST:event_btnvolverActionPerformed

    private void tbproductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbproductosMouseClicked
        try {
            paneleditar.setVisible(true);
            panelproducto.setVisible(false);
            this.setSize(495, 150);
            txtdescripcion.setText(mdlprod.nombre(tbproductos.getSelectedRow()));
            txtprecio.setText(mdlprod.precio(tbproductos.getSelectedRow()));
            ResultSet rs = c.recuperar("SELECT * from detcom where detcom.FECHA_VEN > (SELECT MIN(detcom.FECHA_VEN) from detcom WHERE detcom.PRODUCTO ="+mdlprod.id(tbproductos.getSelectedRow())+" AND detcom.STOCKACTUAL <> 0) AND detcom.PRODUCTO = "+mdlprod.id(tbproductos.getSelectedRow())+" AND detcom.STOCKACTUAL <> 0 group BY detcom.FECHA_VEN ORDER BY `detcom`.`FECHA_VEN` ASC limit 1");
            if (rs.next()){
                btnreabastecer.setEnabled(true);
            }else{
                btnreabastecer.setEnabled(false);
            }
        } catch (SQLException ex) {
            Logger.getLogger(confproductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tbproductosMouseClicked

    private void txtbuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyReleased
        try {
            String a = txtbuscar.getText();
            mdlprod.tablaproducto2(a);
            mdlprod.fireTableDataChanged();
        } catch (SQLException ex) {
            Logger.getLogger(confproductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtbuscarKeyReleased

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        try {
            String desc = txtdescripcion.getText();
            Double precio = Double.valueOf(txtprecio.getText());
            c.ejecutar("UPDATE `producto` SET `DES` =\"" + desc + "\",`PRECIO`=\"" + precio + "\" WHERE ID_PROD =" + mdlprod.id(tbproductos.getSelectedRow()));
            mdlprod.tablaproducto();
            mdlprod.fireTableDataChanged();
            paneleditar.setVisible(false);
            panelproducto.setVisible(true);
            this.setSize(495, 390);
        } catch (SQLException ex) {
            Logger.getLogger(confproductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnreabastecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreabastecerActionPerformed
    c.ejecutar("CALL `reabastecimiento`("+mdlprod.id(tbproductos.getSelectedRow())+");");
    c.ejecutar("CALL `reabastecimiento2`("+mdlprod.id(tbproductos.getSelectedRow())+");");
    paneleditar.setVisible(false);
            panelproducto.setVisible(true);
            this.setSize(495, 390);
    }//GEN-LAST:event_btnreabastecerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnreabastecer;
    private javax.swing.JButton btnvolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel paneleditar;
    private javax.swing.JPanel panelproducto;
    private javax.swing.JTable tbproductos;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtdescripcion;
    private javax.swing.JTextField txtprecio;
    // End of variables declaration//GEN-END:variables
}
