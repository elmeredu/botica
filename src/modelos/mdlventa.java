package modelos;

import controles.CADO;
import entidades.venta;

public class mdlventa {
    
        CADO c = new CADO();
    
        public void bdagregarventa(venta p){
        String sql = "INSERT INTO `venta` (`ID_VEN`, `FECHAVEN`, `TOTAL`) VALUES (NULL, STR_TO_DATE(REPLACE('"+p.getFECHAVEN()+"','/','.'),GET_FORMAT(date,'EUR')), '"+p.getTOTAL()+"');";
        c.ejecutar(sql);
    }
    
}
