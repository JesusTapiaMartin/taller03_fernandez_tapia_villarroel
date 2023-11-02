import java.util.ArrayList;
import java.util.List;

public class Camion {
    // ===== ATRIBUTOS =====
    private String  codigoCamion        , patenteCamion,
                    descripcionCamion   , estadoCamion;
    private Flete[][] fletes;


    // ===== CONSTRUCTOR =====
    public Camion(  String codigoCamion         , String patenteCamion  ,
                    String descripcionCamion    , String estadoCamion   ,
                    Flete fletes) {
        this.codigoCamion       = codigoCamion;
        this.patenteCamion      = patenteCamion;
        this.descripcionCamion  = descripcionCamion;
        this.estadoCamion       = estadoCamion;
        this.fletes             = new Flete[10][2];
    }

    public Camion() {
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
