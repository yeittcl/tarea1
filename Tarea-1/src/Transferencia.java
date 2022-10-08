public class Transferencia extends Pago{
    private String banco;
    private String numCuenta;

    public Transferencia(float monto, OrdenCompra orden, String banco, String numCuenta) {
        super(monto, orden);
        this.banco = banco;
        this.numCuenta = numCuenta;
    }
}
