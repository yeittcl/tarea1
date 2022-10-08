public class Main {
    public static void main(String[] args) {
        Articulo manzana = new Articulo(0.01f,"Manzana","Fruta",1f);
        Articulo naranja = new Articulo(0.02f,"Naranja","Fruta",1f);
        Articulo platano = new Articulo(0.01f,"Platano","Fruta",2f);
        Articulo zanahoria = new Articulo(0.02f,"Zanahoria","Verdura",2f);
        Articulo cebolla = new Articulo(0.05f,"Cebolla","Verdura",5f);

        Cliente c1 = new Cliente("Juan Rojas","123123","calle falsa 123");
        Cliente c2 = new Cliente("Alberto Melo","871263","avenida falsa 352");

        DocTributario doc1 = new Boleta("81723","9182736");

        OrdenCompra orden1 = new OrdenCompra(doc1,c1);

        orden1.setDetalleOrden(manzana,2);
        System.out.println(orden1.calcPeso());
        System.out.println(orden1.calcPrecioSinIVA());
        System.out.println(orden1.calcPrecio());
        System.out.println(orden1.calcIVA());
        
    }
}