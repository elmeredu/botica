package entidades;

import java.sql.Date;

public class compra {
    
    private int ID_COM;
    private String FECHA_COM;
    private double TOTAL;
    private int PROVEEDOR;

    public compra(int ID_COM, String FECHA_COM, double TOTAL, int PROVEEDOR) {
        this.ID_COM = ID_COM;
        this.FECHA_COM = FECHA_COM;
        this.TOTAL = TOTAL;
        this.PROVEEDOR = PROVEEDOR;
    }

    public compra(String FECHA_COM, double TOTAL, int PROVEEDOR) {
        this.FECHA_COM = FECHA_COM;
        this.TOTAL = TOTAL;
        this.PROVEEDOR = PROVEEDOR;
    }
    

    public int getID_COM() {
        return ID_COM;
    }

    public void setID_COM(int ID_COM) {
        this.ID_COM = ID_COM;
    }

    public String getFECHA_COM() {
        return FECHA_COM;
    }

    public void setFECHA_COM(String FECHA_COM) {
        this.FECHA_COM = FECHA_COM;
    }


    public double getTOTAL() {
        return TOTAL;
    }

    public void setTOTAL(double TOTAL) {
        this.TOTAL = TOTAL;
    }

    public int getPROVEEDOR() {
        return PROVEEDOR;
    }

    public void setPROVEEDOR(int PROVEEDOR) {
        this.PROVEEDOR = PROVEEDOR;
    }
    
}
