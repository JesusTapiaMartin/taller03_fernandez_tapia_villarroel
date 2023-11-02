
public class EmpresaTransportista {

    // ===== ATRIBUTOS =====
    private String nombreEmpresa, direccion;



    // ===== CONSTRUCTORES =====
    public EmpresaTransportista(String nombreEmpresa, String direccion) {
        this.nombreEmpresa  = nombreEmpresa;
        this.direccion      = direccion;
    }

    public EmpresaTransportista() {
    }



    // ===== GETTER Y SETTER =====
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
