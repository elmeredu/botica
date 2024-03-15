package modelos;

import controles.CADO;
import entidades.proveedor;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;

public class mdlproveedor {

    CADO c = new CADO();

    public DefaultComboBoxModel getCombo() throws SQLException {
        DefaultComboBoxModel cmbproveedor = new DefaultComboBoxModel();
        ResultSet rs = c.recuperar("select * from proveedor");
        cmbproveedor.addElement("");
        cmbproveedor.addElement("+Nuevo Proveedor");

        while (rs.next()) {
            cmbproveedor.addElement(rs.getString(3));
        }
        
        return cmbproveedor;
    }
    
    public void bdagregarproveedor(proveedor p){
        String sql = "INSERT INTO `proveedor` (`ID_PRO`, `RD_PRO`, `NOM_PRO`, `TELEFONO`) VALUES (NULL, '"+p.getRD_PRO()+"', '"+p.getNOM_PRO()+"', '"+p.getTELEFONO()+"');";
        c.ejecutar(sql);
    }

}
