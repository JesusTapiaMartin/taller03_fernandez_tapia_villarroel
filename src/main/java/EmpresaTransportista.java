import java.util.Scanner;

public class EmpresaTransportista {

    // ===== ATRIBUTOS =====
    private static EmpresaTransportista instancia;
    private String nombreEmpresa, direccion;



    // ===== CONSTRUCTORES =====
    public EmpresaTransportista(String nombreEmpresa, String direccion) {
        this.nombreEmpresa  = nombreEmpresa;
        this.direccion      = direccion;
    }

    public EmpresaTransportista() {
    }



    // ===== CREAR EMPRESA =====
    public static void crearEmpresa(){
        Scanner lector = new Scanner(System.in);

        System.out.println(" ---------- CREAR EMPRESA ---------- ");
        System.out.print  ("        Nombre empresa  : ");
        String nombreEmpresa    = lector.nextLine();

        System.out.print  ("        Dirección       : ");
        String direccionEmpresa = lector.nextLine();

        instancia = new EmpresaTransportista(nombreEmpresa, direccionEmpresa);
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

    public static EmpresaTransportista getInstancia() {
        return instancia;
    }

    public static void setInstancia(EmpresaTransportista instancia) {
        EmpresaTransportista.instancia = instancia;
    }
}
