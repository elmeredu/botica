package entidades;

import java.sql.Date;

public class detcom {

    private int ID_DETCOM;
    private String NUM_LOTE;
    private String FECHA_VEN;
    private int STOCK;
    private int STOCKACTUAL;
    private double COSTO;
    private int PRODUCTO;
    private int COMPRA;

    public detcom(int ID_DETCOM, String NUM_LOTE, String FECHA_VEN, int STOCK, double COSTO, int PRODUCTO, int COMPRA) {
        this.ID_DETCOM = ID_DETCOM;
        this.NUM_LOTE = NUM_LOTE;
        this.FECHA_VEN = FECHA_VEN;
        this.STOCK = STOCK;
        this.COSTO = COSTO;
        this.PRODUCTO = PRODUCTO;
        this.COMPRA = COMPRA;
    }

    public detcom(String NUM_LOTE, String FECHA_VEN, int STOCK, double COSTO, int PRODUCTO) {
        this.NUM_LOTE = NUM_LOTE;
        this.FECHA_VEN = FECHA_VEN;
        this.STOCK = STOCK;
        this.STOCKACTUAL = STOCK;
        this.COSTO = COSTO;
        this.PRODUCTO = PRODUCTO;
    }

    public int getID_DETCOM() {
        return ID_DETCOM;
    }

    public void setID_DETCOM(int ID_DETCOM) {
        this.ID_DETCOM = ID_DETCOM;
    }

    public String getNUM_LOTE() {
        return NUM_LOTE;
    }

    public void setNUM_LOTE(String NUM_LOTE) {
        this.NUM_LOTE = NUM_LOTE;
    }

    public String getFECHA_VEN() {
        return FECHA_VEN;
    }

    public void setFECHA_VEN(String FECHA_VEN) {
        this.FECHA_VEN = FECHA_VEN;
    }

    public int getSTOCK() {
        return STOCK;
    }

    public void setSTOCK(int STOCK) {
        this.STOCK = STOCK;
    }

    public double getCOSTO() {
        return COSTO;
    }

    public void setCOSTO(double COSTO) {
        this.COSTO = COSTO;
    }

    public int getPRODUCTO() {
        return PRODUCTO;
    }

    public void setPRODUCTO(int PRODUCTO) {
        this.PRODUCTO = PRODUCTO;
    }

    public int getSTOCKACTUAL() {
        return STOCKACTUAL;
    }

    public void setSTOCKACTUAL(int STOCKACTUAL) {
        this.STOCKACTUAL = STOCKACTUAL;
    }

    public int getCOMPRA() {
        return COMPRA;
    }

    public void setCOOMPRA(int COMPRA) {
        this.COMPRA = COMPRA;
    }

}
