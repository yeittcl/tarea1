import java.sql.Date;

abstract class DocTributario {
    private String numero;
    private String rut;
    private Date fecha;

    public DocTributario(String numero, String rut, Date fecha){
        this.numero = numero;
        this.rut = rut;
        this.fecha = fecha;
    }
    public String getNumero(){
        return numero;
    }
    public String getRut(){
        return rut;
    }
    public Date getFecha(){
        return fecha;
    }
    public String toString(){
        return "Numero: "+numero+"\nRut: "+rut+"\fecha: "+fecha;
    }
}
class Boleta extends DocTributario{
    public Boleta(String numero, String rut, Date fecha){
        super(numero, rut , fecha);
    }
}
class Factura extends DocTributario{
    public Factura(String numero, String rut, Date fecha){
        super(numero, rut , fecha);
    }
}
