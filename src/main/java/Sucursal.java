import java.util.Scanner;

public class Sucursal {
    // ===== ATRIBUTOS =====
    private String codigoSucursal, regionSucursal;
    private Camion[][] camiones;



    // ===== CONSTRUCTORES =====
    public Sucursal(String codigoSucursal, String regionSucursal) {
        this.codigoSucursal     = codigoSucursal;
        this.regionSucursal     = regionSucursal;
    }

    public Sucursal() {
    }



    // ===== CREAR SUCURSAL =====
    public static void crearSucursal(){
        Scanner lector = new Scanner(System.in);

        System.out.println("        ---------- CREAR SUCURSAL ---------- ");
        System.out.println("           Código sucursal  : ");
        String codigoSucursal   = lector.nextLine();

        System.out.println("            Región sucursal : ");
        String regionSucursal   = lector.nextLine();

        Sucursal nuevaSucursal  = new Sucursal(codigoSucursal, regionSucursal);
    }



    // ===== AGREGAR CAMION =====
    public void agregarCamion(Camion camion, int fila, int columna) {
        camiones[fila][columna] = camion;
    }


    // ===== GETTER Y SETTER =====
    public String getCodigoSucursal() {
        return codigoSucursal;
    }

    public void setCodigoSucursal(String codigoSucursal) {
        this.codigoSucursal = codigoSucursal;
    }

    public String getRegionSucursal() {
        return regionSucursal;
    }

    public void setRegionSucursal(String regionSucursal) {
        this.regionSucursal = regionSucursal;
    }
}
