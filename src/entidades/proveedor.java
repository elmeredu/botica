package entidades;

public class proveedor {
    
    private int ID_PRO;
    private String RD_PRO;
    private String NOM_PRO;
    private int TELEFONO;

    public proveedor(String RD_PRO, String NOM_PRO, int TELEFONO) {
        this.RD_PRO = RD_PRO;
        this.NOM_PRO = NOM_PRO;
        this.TELEFONO = TELEFONO;
    }
    
    public proveedor(int ID_PRO, String RD_PRO, String NOM_PRO, int TELEFONO) {
        this.ID_PRO = ID_PRO;
        this.RD_PRO = RD_PRO;
        this.NOM_PRO = NOM_PRO;
        this.TELEFONO = TELEFONO;
    }

    public int getID_PRO() {
        return ID_PRO;
    }

    public void setID_PRO(int ID_PRO) {
        this.ID_PRO = ID_PRO;
    }

    public String getRD_PRO() {
        
        return RD_PRO;
    }

    public void setRD_PRO(String RD_PRO) {
        this.RD_PRO = RD_PRO;
    }

    public String getNOM_PRO() {
        return NOM_PRO;
    }

    public void setNOM_PRO(String NOM_PRO) {
        this.NOM_PRO = NOM_PRO;
    }

    public long getTELEFONO() {
        return TELEFONO;
    }

    public void setTELEFONO(int TELEFONO) {
        this.TELEFONO = TELEFONO;
    }
        
}
