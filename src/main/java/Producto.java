import java.util.Scanner;

public class Producto {
    // ===== ATRIBUTOS =====
    private static String[][] productos = new String[5][20];
    private String codigoProducto, tipoProducto;


    // ===== CONSTRUCTOR =====

    public Producto(String codigoProducto, String tipoProducto) {
        this.codigoProducto     = codigoProducto;
        this.tipoProducto       = tipoProducto;
    }

    public Producto() {
    }


    // ===== AGREGAR PRODUCTO =====
    public static void agregarProducto(){
        Scanner lector = new Scanner(System.in);

        System.out.println("            ---------- AGREGAR PRODUCTO ---------- ");
        System.out.print  ("                Código producto    : ");
        String codigoProducto   = lector.nextLine();

        System.out.print  ("                Tipo producto      : ");
        String tipoProducto     = lector.nextLine();

        Producto nuevoProducto  = new Producto(codigoProducto, tipoProducto);

        boolean productoAgregado = false;
        for (int i = 0; i < productos.length; i++) {
            for (int j = 0; j < productos[i].length; j++) {
                if (productos[i][j] == null) {
                    productos[i][j] = "Código: " + codigoProducto + ", Tipo: " + tipoProducto;
                    productoAgregado = true;
                    break;
                }
            }
            if (productoAgregado) {
                break;
            }
        }
    }

    // ===== MOSTRAR PRODUCTOS =====
    public static void mostrarProductos() {
        for (int i = 0; i < productos.length; i++) {
            for (int j = 0; j < productos[i].length; j++) {
                if (productos[i][j] != null) {
                    System.out.println(productos[i][j]);
                }
            }
        }
    }




    // ===== GETTER Y SETTER =====
    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }
}



