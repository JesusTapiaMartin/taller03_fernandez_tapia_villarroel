import java.util.Scanner;

public class Pack {
    // ===== ATRIBUTOS =====
    private String codigoPack;
    Producto[][] producto;
    private static Pack[][] pack = new Pack[1][5];


    public Pack(String codigoPack) {
        this.codigoPack = codigoPack;
    }

    public String getCodigoPack() {
        return codigoPack;
    }

    public void setCodigoPack(String codigoPack) {
        this.codigoPack = codigoPack;
    }

    public static void crearPack() {
        Scanner lector = new Scanner(System.in);

        System.out.println(" --------- CrearPack --------- ");
        System.out.println("       codigo paquete        : ");
        String codigoPack = lector.nextLine();

        Pack crearPack = new Pack(codigoPack);

        boolean packCreado = false;
        for (int i = 0; i < pack.length; i++) {
            for (int j = 0; j < pack[i].length; j++) {
                if (pack[i][j] == null) {
                    pack[i][j] = crearPack;
                    packCreado = true;
                    break;
                }
            }
            if (packCreado) {
                break;
            }
        }

    }

}
