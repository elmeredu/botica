package modelos;

import controles.CADO;
import entidades.detcom;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

public class mdldetcom extends AbstractTableModel {

    CADO c = new CADO();

    private final String[] columnas = {"N°", "Producto", "Stock", "SubTotal"};
    List<detcom> lista = new ArrayList<>();

    public void agregarlista(detcom dc) {
        lista.add(dc);
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
        try {
            Object resultado = null;
            switch (columna) {
                case 0:
                    resultado = fila + 1;
                    break;
                case 1:
                    ResultSet rs = c.recuperar("select * from producto where ID_PROD = " + lista.get(fila).getPRODUCTO());
                    if (rs.next()) {
                        resultado = rs.getString(2);
                    }
                    break;
                case 2:
                    resultado = lista.get(fila).getSTOCK();
                    break;
                case 3:
                    resultado = lista.get(fila).getCOSTO();
                    break;
                default:
                    break;
            }
            return resultado;
        } catch (SQLException ex) {
            Logger.getLogger(mdldetcom.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public String getColumnName(int columna) {
        return columnas[columna];
    }

    public double sumatotal() {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = suma + lista.get(i).getCOSTO();
        }
        return suma;
    }

    public void bdagregardetcom() {
        for (int i = 0; i < lista.size(); i++) {
            detcom dc = lista.get(i);
            String sql = "INSERT INTO `detcom` (`ID_DETCOM`, `NUM_LOTE`, `FECHA_VEN`, `STOCK`, `STOCKACTUAL`, `COSTO`, `PRODUCTO`, `COMPRA`) "
                    + "VALUES ( null , '" + dc.getNUM_LOTE() + "', STR_TO_DATE(REPLACE('" + dc.getFECHA_VEN() + "','/','.') ,GET_FORMAT(date,'EUR')), '" + dc.getSTOCK() + "', '" + dc.getSTOCKACTUAL()+ "', '" + dc.getCOSTO() + "', '" + dc.getPRODUCTO() + "', (SELECT MAX(ID_COM) FROM compra));";
            c.ejecutar(sql);
        }
        lista.clear();
    }
    
    public void eliminarlista(int i){
        lista.remove(i);
    }

}
