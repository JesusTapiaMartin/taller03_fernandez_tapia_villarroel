import java.util.Scanner;

public class Camion {
    // ===== ATRIBUTOS =====
    private String codigoCamion, patenteCamion, descripcionCamion, estadoCamion;
    private Flete[][] fletes;
    private static Camion[][] camiones = new Camion[10][4];


    // ===== CONSTRUCTOR =====
    public Camion(  String codigoCamion         , String patenteCamion,
                    String descripcionCamion    , String estadoCamion) {
        this.codigoCamion       = codigoCamion;
        this.patenteCamion      = patenteCamion;
        this.descripcionCamion  = descripcionCamion;
        this.estadoCamion       = estadoCamion;
    }


    // ===== AGREGAR CAMION =====
    public static void agregarCamion() {
        Scanner lector = new Scanner(System.in);

        System.out.println("            ---------- AGREGAR CAMIÓN ---------- ");
        System.out.print  ("                Código camión       : ");
        String codigoCamion = lector.nextLine();

        System.out.print  ("                Patente camión      : ");
        String patenteCamion = lector.nextLine();

        System.out.print  ("                Descripción Camión  : ");
        String descripcionCamion = lector.nextLine();

        System.out.print  ("                Estado camión       : ");
        String estadoCamion = lector.nextLine();

        Camion nuevoCamion = new Camion(codigoCamion        , patenteCamion,
                                        descripcionCamion   , estadoCamion);

        boolean camionAgregado = false;
        for (int i = 0; i < camiones.length; i++) {
            for (int j = 0; j < camiones[i].length; j++) {
                if (camiones[i][j] == null) {
                    camiones[i][j] = nuevoCamion;
                    camionAgregado = true;
                    break;
                }
            }
            if (camionAgregado) {
                break;
            }
        }
    }



    // ===== MOSTRAR CAMIONES =====
    public static void mostrarCamiones() {
        for (int i = 0; i < camiones.length; i++) {
            for (int j = 0; j < camiones[i].length; j++) {
                if (camiones[i][j] != null) {
                    System.out.println(
                            " Código        : " + camiones[i][j].getCodigoCamion() +
                            ", Patente      : " + camiones[i][j].getPatenteCamion() +
                            ", Descripción  : " + camiones[i][j].getDescripcionCamion() +
                            ", Estado       : " + camiones[i][j].getEstadoCamion());
                }
            }
        }
    }

    // ===== GETTER Y SETTER =====
    public String getCodigoCamion() {
        return codigoCamion;
    }

    public void setCodigoCamion(String codigoCamion) {
        this.codigoCamion = codigoCamion;
    }

    public String getPatenteCamion() {
        return patenteCamion;
    }

    public void setPatenteCamion(String patenteCamion) {
        this.patenteCamion = patenteCamion;
    }

    public String getDescripcionCamion() {
        return descripcionCamion;
    }

    public void setDescripcionCamion(String descripcionCamion) {
        this.descripcionCamion = descripcionCamion;
    }

    public String getEstadoCamion() {
        return estadoCamion;
    }

    public void setEstadoCamion(String estadoCamion) {
        this.estadoCamion = estadoCamion;
    }
}
