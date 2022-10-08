import java.util.Date;

public class Pago {
    private float monto;
    private Date fecha;
    private OrdenCompra orden;

    public Pago(float monto, OrdenCompra orden){
        this.monto = monto;
        fecha = new Date();
        this.orden = orden;
    }

    public float getPrecio(){
        return orden.calcPrecio();
    }

    public float getMonto() {
        return monto;
    }
    public Date getFecha() {
        return fecha;
    }

    public String toString() {
        return "monto: "+monto+"\nfecha: "+fecha;
    }
}
