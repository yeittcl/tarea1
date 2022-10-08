public class Efectivo extends Pago{

    public Efectivo(float monto, OrdenCompra orden) {
        super(monto, orden);
    }

    public float calcDevolucion(){
        return super.getPrecio() - super.getMonto();
    }
}
