package entidades;

public class producto {

    private int ID_PROD;
    private String DES;
    private double PRECIO;

    public producto(int ID_PROD, String DES, double PRECIO) {
        this.ID_PROD = ID_PROD;
        this.DES = DES;
        this.PRECIO = PRECIO;
    }

    public producto(String DES, double PRECIO) {
        this.DES = DES;
        this.PRECIO = PRECIO;
    }


    public int getID_PROD() {
        return ID_PROD;
    }

    public void setID_PROD(int ID_PROD) {
        this.ID_PROD = ID_PROD;
    }

    public String getDES() {
        return DES;
    }

    public void setDES(String DES) {
        this.DES = DES;
    }

    public double getPRECIO() {
        return PRECIO;
    }

    public void setPRECIO(double PRECIO) {
        this.PRECIO = PRECIO;
    }


}
