package entidades;

import java.sql.Date;

public class venta {
    
    private int ID_VEN;
    private String FECHAVEN;
    private double TOTAL;

    public venta(int ID_VEN, String FECHAVEN, double TOTAL) {
        this.ID_VEN = ID_VEN;
        this.FECHAVEN = FECHAVEN;
        this.TOTAL = TOTAL;
    }

    public int getID_VEN() {
        return ID_VEN;
    }

    public void setID_VEN(int ID_VEN) {
        this.ID_VEN = ID_VEN;
    }

    public String getFECHAVEN() {
        return FECHAVEN;
    }

    public void setFECHAVEN(String FECHAVEN) {
        this.FECHAVEN = FECHAVEN;
    }

    public double getTOTAL() {
        return TOTAL;
    }

    public void setTOTAL(double TOTAL) {
        this.TOTAL = TOTAL;
    }
    
}