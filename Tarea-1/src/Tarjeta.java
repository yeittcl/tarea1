public class Tarjeta extends Pago{
    private String tipo;
    private String numTransaccion;
    public Tarjeta(float monto, OrdenCompra orden, String tipo, String numTransaccion) {
        super(monto, orden);
        this.tipo = tipo;
        this.numTransaccion = numTransaccion;
    }
}
