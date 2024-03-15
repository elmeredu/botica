package vistas;

import controles.CADO;
import entidades.compra;
import entidades.detcom;
import entidades.producto;
import entidades.proveedor;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelos.mdlcompra;
import modelos.mdldetcom;
import modelos.mdlproducto;
import modelos.mdlproveedor;

public final class regcompras extends javax.swing.JFrame {

    mdlproveedor mdlprov = new mdlproveedor();
    mdlproducto mdlprod = new mdlproducto();
    mdldetcom mdldc = new mdldetcom();
    mdlcompra mdlcomp = new mdlcompra();

    public regcompras() throws SQLException {
        initComponents();
        btnseleccionar.setEnabled(false);
        btnregresar.setEnabled(false);
        controlagregarproveedor(false);
        controlagregarproducto(false);
        controlardetalleproducto(false);
        controlarcompra(false);
        cargarcmbproveedor();
        cargarcmbproducto();
    }

    public void cargarcmbproveedor() throws SQLException {
        cmbproveedor.setModel(mdlprov.getCombo());
    }

    public void cargarcmbproducto() throws SQLException {
        cmbproducto.setModel(mdlprod.getCombo());
    }

    public void controlagregarproveedor(boolean valor) {
        if (valor) {
            panelagregarproveedor.setEnabled(true);
            txtnombreorz.setEnabled(true);
            txtrucodni.setEnabled(true);
            txttelefono.setEnabled(true);
            btnguardarprovee.setEnabled(true);
        } else {
            panelagregarproveedor.setEnabled(false);
            txtnombreorz.setEnabled(false);
            txtrucodni.setEnabled(false);
            txttelefono.setEnabled(false);
            btnguardarprovee.setEnabled(false);
        }
    }

    public void controlagregarproducto(boolean valor) {
        if (valor) {
            panelagregarproducto.setEnabled(true);
            txtdescripcion.setEnabled(true);
            txtprecio.setEnabled(true);
            btnguardarprod.setEnabled(true);
        } else {
            panelagregarproducto.setEnabled(false);
            txtdescripcion.setEnabled(false);
            txtprecio.setEnabled(false);
            btnguardarprod.setEnabled(false);
        }
    }

    public void controlardetalleproducto(boolean valor) {
        if (valor) {
            paneldetalleproducto.setEnabled(true);
            txtnumerodelote.setEnabled(true);
            txtfechadevencimiento.setEnabled(true);
            txtstock.setEnabled(true);
            txtcosto.setEnabled(true);
            btnagregar.setEnabled(true);
        } else {
            paneldetalleproducto.setEnabled(false);
            txtnumerodelote.setEnabled(false);
            txtfechadevencimiento.setEnabled(false);
            txtstock.setEnabled(false);
            txtcosto.setEnabled(false);
            btnagregar.setEnabled(false);
        }
    }

    public void controlarproveedor(boolean valor) {
        if (valor) {
            panelproveedor.setEnabled(true);
            cmbproveedor.setEnabled(true);
            btnseleccionar.setEnabled(false);
        } else {
            panelproveedor.setEnabled(false);
            cmbproveedor.setEnabled(false);
            btnseleccionar.setEnabled(false);
            controlagregarproveedor(false);
        }
    }

    public void controlarcompra(boolean valor) {
        if (valor) {
            panelcompra.setEnabled(true);
            panelproducto.setEnabled(true);
            cmbproducto.setEnabled(true);
            paneldetalle.setEnabled(true);
            tbldetalle.setEnabled(true);
            txtfechacompra.setEnabled(true);
            btnguardarcompra.setEnabled(true);
        } else {
            panelcompra.setEnabled(false);
            panelproducto.setEnabled(false);
            cmbproducto.setEnabled(false);
            paneldetalle.setEnabled(false);
            tbldetalle.setEnabled(false);
            txtfechacompra.setEnabled(false);
            btnguardarcompra.setEnabled(false);
            controlardetalleproducto(false);
            controlagregarproducto(false);
        }
    }

    public int codigoproducto(String nombre) throws SQLException {
        String sql = "SELECT * FROM `producto` WHERE DES = \"" + nombre + "\"";
        CADO c = new CADO();
        ResultSet rs = c.recuperar(sql);
        rs.next();
        return rs.getInt(1);
    }

    public int codigoproveedor(String nombre) {
        try {
            String sql = "SELECT * FROM `proveedor` WHERE NOM_PRO = \"" + nombre + "\"";
            CADO c = new CADO();
            ResultSet rs = c.recuperar(sql);
            rs.next();
            return rs.getInt(1);
        } catch (SQLException ex) {
            System.out.println(ex);;
        }
        return 0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngrouprm = new javax.swing.ButtonGroup();
        panelproveedor = new javax.swing.JPanel();
        cmbproveedor = new javax.swing.JComboBox<>();
        panelagregarproveedor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtrucodni = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtnombreorz = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        btnguardarprovee = new javax.swing.JButton();
        btnseleccionar = new javax.swing.JButton();
        btnregresar = new javax.swing.JButton();
        panelcompra = new javax.swing.JPanel();
        panelproducto = new javax.swing.JPanel();
        cmbproducto = new javax.swing.JComboBox<>();
        panelagregarproducto = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtdescripcion = new javax.swing.JTextField();
        btnguardarprod = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtprecio = new javax.swing.JTextField();
        paneldetalleproducto = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtnumerodelote = new javax.swing.JTextField();
        txtfechadevencimiento = new javax.swing.JTextField();
        btnagregar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtstock = new javax.swing.JTextField();
        txtcosto = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        paneldetalle = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbldetalle = new javax.swing.JTable();
        txttotal = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnborrar = new javax.swing.JButton();
        btnguardarcompra = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtfechacompra = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        panelproveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Proveedor"));

        cmbproveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Vacio>", "+ Nuevo Proveedor", "pedrito", "juanito", "carlitos", "etc etc etc" }));
        cmbproveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbproveedorActionPerformed(evt);
            }
        });

        panelagregarproveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Nuevo Proveedor"));
        panelagregarproveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Ruc o DNI :");

        txtrucodni.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Nombre o Razon Social :");

        txtnombreorz.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Telefono :");

        txttelefono.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        btnguardarprovee.setText("Guardar");
        btnguardarprovee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarproveeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelagregarproveedorLayout = new javax.swing.GroupLayout(panelagregarproveedor);
        panelagregarproveedor.setLayout(panelagregarproveedorLayout);
        panelagregarproveedorLayout.setHorizontalGroup(
            panelagregarproveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelagregarproveedorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelagregarproveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelagregarproveedorLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtnombreorz, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelagregarproveedorLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(175, 175, 175)
                        .addComponent(btnguardarprovee))
                    .addGroup(panelagregarproveedorLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtrucodni, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11))
        );
        panelagregarproveedorLayout.setVerticalGroup(
            panelagregarproveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelagregarproveedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelagregarproveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnombreorz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelagregarproveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtrucodni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelagregarproveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnguardarprovee))
                .addContainerGap())
        );

        btnseleccionar.setText("Seleccionar");
        btnseleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnseleccionarActionPerformed(evt);
            }
        });

        btnregresar.setText("Regresar");
        btnregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelproveedorLayout = new javax.swing.GroupLayout(panelproveedor);
        panelproveedor.setLayout(panelproveedorLayout);
        panelproveedorLayout.setHorizontalGroup(
            panelproveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelproveedorLayout.createSequentialGroup()
                .addGroup(panelproveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelproveedorLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addGroup(panelproveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnregresar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnseleccionar)))
                    .addGroup(panelproveedorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cmbproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelagregarproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelproveedorLayout.setVerticalGroup(
            panelproveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelagregarproveedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelproveedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnseleccionar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnregresar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelcompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Compra"));

        panelproducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Producto"));

        cmbproducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Vacio>", "+ Nuevo Producto", "pastillas", "jarabes", "cordones", "suero", "drogas" }));
        cmbproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbproductoActionPerformed(evt);
            }
        });

        panelagregarproducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Nuevo Producto"));
        panelagregarproducto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Descripcion :");

        txtdescripcion.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        btnguardarprod.setText("Guardar");
        btnguardarprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarprodActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText("Precio :");

        txtprecio.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        javax.swing.GroupLayout panelagregarproductoLayout = new javax.swing.GroupLayout(panelagregarproducto);
        panelagregarproducto.setLayout(panelagregarproductoLayout);
        panelagregarproductoLayout.setHorizontalGroup(
            panelagregarproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelagregarproductoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panelagregarproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelagregarproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelagregarproductoLayout.createSequentialGroup()
                        .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnguardarprod))
                    .addComponent(txtdescripcion))
                .addContainerGap())
        );
        panelagregarproductoLayout.setVerticalGroup(
            panelagregarproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelagregarproductoLayout.createSequentialGroup()
                .addGroup(panelagregarproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelagregarproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnguardarprod)
                    .addGroup(panelagregarproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)))
                .addGap(10, 10, 10))
        );

        paneldetalleproducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle Producto"));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Numero de Lote :");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Fecha de Vencimiento :");

        txtnumerodelote.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txtfechadevencimiento.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtfechadevencimiento.setToolTipText("");

        btnagregar.setText("Agregar");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("Stock :");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setText("Costo :");

        txtstock.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txtcosto.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        javax.swing.GroupLayout paneldetalleproductoLayout = new javax.swing.GroupLayout(paneldetalleproducto);
        paneldetalleproducto.setLayout(paneldetalleproductoLayout);
        paneldetalleproductoLayout.setHorizontalGroup(
            paneldetalleproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneldetalleproductoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneldetalleproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paneldetalleproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(paneldetalleproductoLayout.createSequentialGroup()
                        .addComponent(txtnumerodelote, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7))
                    .addGroup(paneldetalleproductoLayout.createSequentialGroup()
                        .addComponent(txtstock, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)))
                .addGap(18, 18, 18)
                .addGroup(paneldetalleproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneldetalleproductoLayout.createSequentialGroup()
                        .addComponent(txtfechadevencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(paneldetalleproductoLayout.createSequentialGroup()
                        .addComponent(txtcosto, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnagregar)))
                .addContainerGap())
        );
        paneldetalleproductoLayout.setVerticalGroup(
            paneldetalleproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneldetalleproductoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneldetalleproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtnumerodelote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtfechadevencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paneldetalleproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtstock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtcosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnagregar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelproductoLayout = new javax.swing.GroupLayout(panelproducto);
        panelproducto.setLayout(panelproductoLayout);
        panelproductoLayout.setHorizontalGroup(
            panelproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelproductoLayout.createSequentialGroup()
                .addGroup(panelproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paneldetalleproducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelproductoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(cmbproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelagregarproducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelproductoLayout.setVerticalGroup(
            panelproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelproductoLayout.createSequentialGroup()
                .addGroup(panelproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelagregarproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelproductoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbproducto)
                            .addComponent(btnbuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(paneldetalleproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        paneldetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle"));

        tbldetalle.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tbldetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "Producto", "Stock", "SubTotal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbldetalle.setEnabled(false);
        jScrollPane1.setViewportView(tbldetalle);

        txttotal.setEditable(false);
        txttotal.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txttotal.setToolTipText("");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("Total :");

        btnborrar.setText("Borrar");
        btnborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnborrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneldetalleLayout = new javax.swing.GroupLayout(paneldetalle);
        paneldetalle.setLayout(paneldetalleLayout);
        paneldetalleLayout.setHorizontalGroup(
            paneldetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneldetalleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneldetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(paneldetalleLayout.createSequentialGroup()
                        .addComponent(btnborrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        paneldetalleLayout.setVerticalGroup(
            paneldetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneldetalleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paneldetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(btnborrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnguardarcompra.setText("Guardar");
        btnguardarcompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarcompraActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Fecha de Compra: ");

        txtfechacompra.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        javax.swing.GroupLayout panelcompraLayout = new javax.swing.GroupLayout(panelcompra);
        panelcompra.setLayout(panelcompraLayout);
        panelcompraLayout.setHorizontalGroup(
            panelcompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelcompraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelcompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paneldetalle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelcompraLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(txtfechacompra, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnguardarcompra))
                    .addComponent(panelproducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelcompraLayout.setVerticalGroup(
            panelcompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelcompraLayout.createSequentialGroup()
                .addComponent(panelproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paneldetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelcompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnguardarcompra)
                    .addComponent(jLabel8)
                    .addComponent(txtfechacompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelcompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelproveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelcompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbproveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbproveedorActionPerformed
        if (cmbproveedor.getSelectedIndex() == 1) {
            controlagregarproveedor(true);
            btnseleccionar.setEnabled(false);
        } else {
            controlagregarproveedor(false);
            if (cmbproveedor.getSelectedIndex() == 0) {
                btnseleccionar.setEnabled(false);
            } else {
                btnseleccionar.setEnabled(true);
            }
        }
    }//GEN-LAST:event_cmbproveedorActionPerformed

    private void btnseleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnseleccionarActionPerformed
        controlarproveedor(false);
        controlarcompra(true);
        btnregresar.setEnabled(true);
    }//GEN-LAST:event_btnseleccionarActionPerformed

    private void cmbproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbproductoActionPerformed
        if (cmbproducto.getSelectedIndex() == 1) {
            controlagregarproducto(true);
            controlardetalleproducto(false);
        } else {
            controlagregarproducto(false);
            if (cmbproducto.getSelectedIndex() == 0) {
                controlardetalleproducto(false);
            } else {
                controlardetalleproducto(true);
            }
        }
    }//GEN-LAST:event_cmbproductoActionPerformed

    private void btnregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresarActionPerformed
        cmbproveedor.setSelectedIndex(0);
        cmbproducto.setSelectedIndex(0);
        controlarcompra(false);
        controlarproveedor(true);
        btnregresar.setEnabled(false);

    }//GEN-LAST:event_btnregresarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        menuprincipal vm = new menuprincipal();
        vm.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void btnguardarproveeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarproveeActionPerformed
        try {
            proveedor p = new proveedor(txtrucodni.getText(), txtnombreorz.getText(), Integer.parseInt(txttelefono.getText()));
            txtrucodni.setText("");
            txtnombreorz.setText("");
            txttelefono.setText("");
            mdlprov.bdagregarproveedor(p);
            controlagregarproveedor(false);
            cargarcmbproveedor();
        } catch (SQLException ex) {
            Logger.getLogger(regcompras.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnguardarproveeActionPerformed

    private void btnguardarprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarprodActionPerformed
        try {
            producto p;
            p = new producto(txtdescripcion.getText(), Double.parseDouble(txtprecio.getText()));
            txtdescripcion.setText("");
            txtprecio.setText("");
            mdlprod.bdagregarproducto(p);
            controlagregarproducto(false);
            cargarcmbproducto();
        } catch (SQLException ex) {
            Logger.getLogger(regcompras.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnguardarprodActionPerformed

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        try {
            detcom dc = new detcom(txtnumerodelote.getText(), txtfechadevencimiento.getText(), Integer.parseInt(txtstock.getText()), Double.parseDouble(txtcosto.getText()), codigoproducto(cmbproducto.getSelectedItem().toString()));
            txtnumerodelote.setText("");
            txtfechadevencimiento.setText("");
            txtstock.setText("");
            txtcosto.setText("");
            mdldc.agregarlista(dc);
            mdldc.fireTableDataChanged();
            tbldetalle.setModel(mdldc);
            controlardetalleproducto(false);
            cmbproducto.setSelectedIndex(0);
            txttotal.setText(String.valueOf(mdldc.sumatotal()));
        } catch (SQLException ex) {
            Logger.getLogger(regcompras.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnagregarActionPerformed

    private void btnguardarcompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarcompraActionPerformed
        compra c = new compra(txtfechacompra.getText(), Double.parseDouble(txttotal.getText()), codigoproveedor(cmbproveedor.getSelectedItem().toString()));
        mdlcomp.bdagregarcompra(c);
        mdldc.bdagregardetcom();
        controlarcompra(false);
        controlarproveedor(true);
        cmbproveedor.setSelectedIndex(0);
        txtfechacompra.setText("");
        txttotal.setText("");
        btnregresar.setEnabled(false);
    }//GEN-LAST:event_btnguardarcompraActionPerformed

    private void btnborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnborrarActionPerformed
        if (tbldetalle.getSelectedRow() > -1) {
            mdldc.eliminarlista(tbldetalle.getSelectedRow());
        }
        mdldc.fireTableDataChanged();
    }//GEN-LAST:event_btnborrarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        try {
            String respuesta = JOptionPane.showInputDialog("Buscar");
            cmbproducto.setModel(mdlprod.getCombo3(respuesta));
        } catch (SQLException ex) {
            Logger.getLogger(regventas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnbuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btnborrar;
    private javax.swing.JButton btnbuscar;
    private javax.swing.ButtonGroup btngrouprm;
    private javax.swing.JButton btnguardarcompra;
    private javax.swing.JButton btnguardarprod;
    private javax.swing.JButton btnguardarprovee;
    private javax.swing.JButton btnregresar;
    private javax.swing.JButton btnseleccionar;
    private javax.swing.JComboBox<String> cmbproducto;
    private javax.swing.JComboBox<String> cmbproveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelagregarproducto;
    private javax.swing.JPanel panelagregarproveedor;
    private javax.swing.JPanel panelcompra;
    private javax.swing.JPanel paneldetalle;
    private javax.swing.JPanel paneldetalleproducto;
    private javax.swing.JPanel panelproducto;
    private javax.swing.JPanel panelproveedor;
    private javax.swing.JTable tbldetalle;
    private javax.swing.JTextField txtcosto;
    private javax.swing.JTextField txtdescripcion;
    private javax.swing.JTextField txtfechacompra;
    private javax.swing.JTextField txtfechadevencimiento;
    private javax.swing.JTextField txtnombreorz;
    private javax.swing.JTextField txtnumerodelote;
    private javax.swing.JTextField txtprecio;
    private javax.swing.JTextField txtrucodni;
    private javax.swing.JTextField txtstock;
    private javax.swing.JTextField txttelefono;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}
