import java.util.Date;

public class Pago {
    private float monto;
    private Date fecha;

    public Pago(float monto){
        this.monto = monto;
        fecha = new Date();
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
