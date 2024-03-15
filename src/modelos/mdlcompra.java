package modelos;

import controles.CADO;
import entidades.compra;

public class mdlcompra {
    
    CADO c = new CADO();
    
        public void bdagregarcompra(compra p){
        String sql = "INSERT INTO `compra` (`ID_COM`, `FECHACOM`, `TOTAL`, `PROVEEDOR`) VALUES (NULL, STR_TO_DATE(REPLACE('"+p.getFECHA_COM()+"','/','.'),GET_FORMAT(date,'EUR')), '"+p.getTOTAL()+"', '"+p.getPROVEEDOR()+"');";
        c.ejecutar(sql);
    }
    
    
}
