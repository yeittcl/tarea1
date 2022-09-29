public class DetalleOrden {
    private int cantidad;
    private Articulo articulo;

    public DetalleOrden(int cantidad, Articulo articulo){
        this.cantidad = cantidad;
        this.articulo = articulo;
    }

    public float calcPrecioSinIVA(){
        return articulo.getPrecio() * cantidad;
    }

    public float calcPrecio(){
        return calcPrecioSinIVA() + calcIVA();
    }

    public float calcIVA(){
        return articulo.getPrecio() * 0.19f;
    }

    public float calcPeso(){
        return articulo.getPeso() * cantidad;
    }

    public String toString() {
        return "articulo: "+articulo.getNombre()+"\ncantidad: "+cantidad;
    }
}
