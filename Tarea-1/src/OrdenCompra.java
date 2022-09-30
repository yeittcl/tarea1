import java.util.ArrayList;
import java.util.Date;

public class OrdenCompra {
    private Date fecha;
    private String estado;
    private ArrayList<DetalleOrden> detalles;
    private Cliente cliente;
    private DocTributario documentoTrib;

    public OrdenCompra(DocTributario documentoTrib, Cliente cliente){
        this.estado = "Pago Pendiente";
        this.documentoTrib = documentoTrib;
        this.cliente = cliente;
        fecha = new Date();
        detalles = new ArrayList<DetalleOrden>();
    }
    public void setDetalleOrden(Articulo articulo, int cantidad){
        DetalleOrden aux = new DetalleOrden(cantidad,articulo);
        detalles.add(aux);
    }

    public float calcPrecioSinIVA(){
        float sum = 0;
        for(DetalleOrden detalle: detalles){
            sum += detalle.calcPrecioSinIVA();
        }
        return sum;
    }

    public float calcIVA(){
        return calcPrecioSinIVA() * 0.19f;
    }

    public float calcPrecio(){
        return calcPrecioSinIVA() + calcIVA();
    }

    public float calcPeso(){
        float sum = 0;
        for(DetalleOrden detalle: detalles){
            sum += detalle.calcPeso();
        }
        return sum;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(int num) {
        switch (num){
            case 1:
                this.estado = "Pagado";
        }
    }

    public String toString(){
        return documentoTrib.toString()+"\n"+cliente.toString()+"\nEstado: "+estado;
    }

}
