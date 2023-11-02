
public class Flete {
    // ===== ATRIBUTOS =====
    private String codigoFlete, descripcionFlete;


    // ===== CONSTRUCTOR =====
    public Flete(String codigoFlete, String descripcionFlete) {
        this.codigoFlete        = codigoFlete;
        this.descripcionFlete   = descripcionFlete;
    }

    public Flete() {
    }

    // ===== GETTER Y SETTER =====
    public String getCodigoFlete() {
        return codigoFlete;
    }

    public void setCodigoFlete(String codigoFlete) {
        this.codigoFlete = codigoFlete;
    }

    public String getDescripcionFlete() {
        return descripcionFlete;
    }

    public void setDescripcionFlete(String descripcionFlete) {
        this.descripcionFlete = descripcionFlete;
    }



}
