package modelos;

import controles.CADO;
import entidades.detven;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

public class mdldetven extends AbstractTableModel {

    CADO c = new CADO();

    private final String[] columnas = {"N°", "Producto", "Precio", "Cantidad", "SubTotal"};
    List<detven> lista = new ArrayList<>();

    public void agregarlista(detven dv) {
        lista.add(dv);
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
            ResultSet rs = c.recuperar("select * from producto where ID_PROD = " + lista.get(fila).getPRODUCTO());
            if (rs.next()) {
                switch (columna) {
                    case 0:
                        resultado = fila + 1;
                        break;
                    case 1:
                        resultado = rs.getString(2);
                        break;
                    case 2:
                        resultado = rs.getDouble(3);
                        break;
                    case 3:
                        resultado = lista.get(fila).getCANTIDAD();
                        break;
                    case 4:
                        resultado = rs.getDouble(3) * lista.get(fila).getCANTIDAD();
                        break;
                    default:
                        break;
                }
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
            suma = suma + lista.get(i).getSUBTOTAL();
        }
        return suma;
    }

    public void bdagregardetven() {
        for (int i = 0; i < lista.size(); i++) {
            detven dv = lista.get(i);
            String sql = "INSERT INTO `detven` (`ID_DETVEN`, `CANTIDAD`, `PRECIO`, `SUBTOTAL`, `PRODUCTO`, `VENTA`) "
                    + "VALUES ( null , '" + dv.getCANTIDAD() + "', '" + dv.getPRECIO() + "' , '" + dv.getSUBTOTAL() + "', '" + dv.getPRODUCTO() + "',(SELECT MAX(ID_VEN) FROM venta));";
            c.ejecutar(sql);
        }
        lista.clear();
    }
    
    public void eliminarlista(int i){
        lista.remove(i);
    }

}
