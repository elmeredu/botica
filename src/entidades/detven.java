package entidades;

public class detven {

    private int ID_DETVEN;
    private int CANTIDAD;
    private double PRECIO;
    private double SUBTOTAL;
    private int PRODUCTO;
    private int VENTA;

    public detven(int ID_DETVEN, int CANTIDAD, double PRECIO, int PRODUCTO, int VENTA) {
        this.ID_DETVEN = ID_DETVEN;
        this.CANTIDAD = CANTIDAD;
        this.PRECIO = PRECIO;
        this.SUBTOTAL = PRECIO * CANTIDAD;
        this.PRODUCTO = PRODUCTO;
        this.VENTA = VENTA;
    }

    public detven(int CANTIDAD, double PRECIO, int PRODUCTO, int VENTA) {
        this.CANTIDAD = CANTIDAD;
        this.PRECIO = PRECIO;
        this.SUBTOTAL = CANTIDAD * PRECIO;
        this.PRODUCTO = PRODUCTO;
        this.VENTA = VENTA;
    }

    public detven(int CANTIDAD, double PRECIO, int PRODUCTO) {
        this.CANTIDAD = CANTIDAD;
        this.PRECIO = PRECIO;
        this.SUBTOTAL = PRECIO * CANTIDAD;
        this.PRODUCTO = PRODUCTO;
    }

    public int getID_DETVEN() {
        return ID_DETVEN;
    }

    public void setID_DETVEN(int ID_DETVEN) {
        this.ID_DETVEN = ID_DETVEN;
    }

    public int getCANTIDAD() {
        return CANTIDAD;
    }

    public void setCANTIDAD(int CANTIDAD) {
        this.CANTIDAD = CANTIDAD;
    }

    public double getPRECIO() {
        return PRECIO;
    }

    public void setPRECIO(double PRECIO) {
        this.PRECIO = PRECIO;
    }

    public double getSUBTOTAL() {
        return SUBTOTAL;
    }

    public void setSUBTOTAL(double SUBTOTAL) {
        this.SUBTOTAL = SUBTOTAL;
    }

    public int getPRODUCTO() {
        return PRODUCTO;
    }

    public void setPRODUCTO(int PRODUCTO) {
        this.PRODUCTO = PRODUCTO;
    }

    public int getVENTA() {
        return VENTA;
    }

    public void setVENTA(int VENTA) {
        this.VENTA = VENTA;
    }

}
