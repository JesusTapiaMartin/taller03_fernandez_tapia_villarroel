
public class Sucursal {
    // ===== ATRIBUTOS =====
    private String codigoSucursal, regionSucursal;
    private Camion[][] camiones;



    // ===== CONSTRUCTORES =====
    public Sucursal(String codigoSucursal, String regionSucursal, Camion camiones) {
        this.codigoSucursal     = codigoSucursal;
        this.regionSucursal     = regionSucursal;
        this.camiones           = new Camion[10][5];
    }

    public Sucursal() {
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
