package modelos;

import controles.CADO;
import entidades.producto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.AbstractTableModel;

public class mdlproducto extends AbstractTableModel {

    CADO c = new CADO();

    private final String[] columnas = {"N°", "Producto", "Precio"};
    List<producto> lista = new ArrayList<>();

    public void tablaproducto() throws SQLException {
        lista.clear();
        ResultSet rs = c.recuperar("select * from producto");
        while (rs.next()) {
            producto e = new producto(rs.getInt(1), rs.getString(2), rs.getDouble(3));
            lista.add(e);
        }
    }

    public void tablaproducto2(String a) throws SQLException {
        lista.clear();
        ResultSet rs = c.recuperar("select * from producto where DES like '%" + a + "%'");
        while (rs.next()) {
            producto e = new producto(rs.getInt(1), rs.getString(2), rs.getDouble(3));
            lista.add(e);
        }
    }

    public DefaultComboBoxModel getCombo() throws SQLException {
        DefaultComboBoxModel cmbproducto = new DefaultComboBoxModel();
        ResultSet rs = c.recuperar("select * from producto ORDER BY `producto`.`DES` ASC");
        cmbproducto.addElement("");
        cmbproducto.addElement("+Nuevo Producto");

        while (rs.next()) {
            cmbproducto.addElement(rs.getString(2));
        }

        return cmbproducto;
    }

    public DefaultComboBoxModel getCombo1() throws SQLException {
        DefaultComboBoxModel cmbproducto = new DefaultComboBoxModel();
        ResultSet rs = c.recuperar("select * from producto ORDER BY `producto`.`DES` ASC");
        cmbproducto.addElement("");
        while (rs.next()) {
            cmbproducto.addElement(rs.getString(2));
        }
        return cmbproducto;
    }

    public DefaultComboBoxModel getCombo2(String b) throws SQLException {
        DefaultComboBoxModel cmbproducto = new DefaultComboBoxModel();
        ResultSet rs = c.recuperar("select * from producto where producto.DES like '%" + b + "%' ORDER BY `producto`.`DES` ASC");
        cmbproducto.addElement("");
        while (rs.next()) {
            cmbproducto.addElement(rs.getString(2));
        }
        return cmbproducto;
    }

    public DefaultComboBoxModel getCombo3(String b) throws SQLException {
        DefaultComboBoxModel cmbproducto = new DefaultComboBoxModel();
        ResultSet rs = c.recuperar("select * from producto where producto.DES like '%" + b + "%' ORDER BY `producto`.`DES` ASC");
        cmbproducto.addElement("");
        cmbproducto.addElement("+Nuevo Producto");
        while (rs.next()) {
            cmbproducto.addElement(rs.getString(2));
        }
        return cmbproducto;
    }

    public void bdagregarproducto(producto p) {
        String sql = "INSERT INTO `producto` (`ID_PROD`, `DES`, `PRECIO`) VALUES (NULL, '" + p.getDES() + "', '" + p.getPRECIO() + "')";
        c.ejecutar(sql);
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int fila, int columna) {
        Object resultado = null;
        switch (columna) {
            case 0:
                resultado = lista.get(fila).getID_PROD();
                break;
            case 1:
                resultado = lista.get(fila).getDES();
                break;
            case 2:
                resultado = lista.get(fila).getPRECIO();
                break;
            default:
                break;
        }
        return resultado;
    }

    public String getColumnName(int columna) {
        return columnas[columna];
    }

    public String nombre(int i) {
        return lista.get(i).getDES();
    }

    public String precio(int i) {
        return String.valueOf(lista.get(i).getPRECIO());
    }

    public String id(int i) {
        return String.valueOf(lista.get(i).getID_PROD());
    }

}
