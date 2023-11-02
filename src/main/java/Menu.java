import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Menu();
    }
    public static void Menu(){
        Scanner lector = new Scanner(System.in);
        String opcion;

        do {
            System.out.println("========================================");
            System.out.println("                 EMPRESA                ");
            System.out.println("                 sucursal               ");
            System.out.println("========================================");
            System.out.println("        [1] Productos                   ");
            System.out.println("        [2] Flete                       ");
            System.out.println("        [3] Camión                      ");
            System.out.println("        [4] Salir                       ");
            System.out.println("========================================");
            System.out.print("            Ingrese su opción  : ");
            opcion = lector.nextLine();
            System.out.println("========================================");

            switch (opcion) {
                case "1":
                    Scanner lectorProductos = new Scanner(System.in);
                    String opcionProductos;

                    do{
                        System.out.println("        ---------- PRODUCTOS ---------- ");
                        Producto.mostrarProductos();
                        System.out.println("            (1) Agregar producto   ");
                        System.out.println("            (2) Eliminar producto  ");
                        System.out.println("            (3) Salir              ");
                        System.out.print  ("            Opción  : ");
                        opcionProductos = lectorProductos.nextLine();

                        switch (opcionProductos){
                            case "1":
                                Producto.agregarProducto();
                                break;

                            case "2":
                                break;

                            case "3":
                                break;

                            default:
                                System.out.println("                Ingrese una opción válida... ");
                                break;
                        }
                    } while (!opcionProductos.equals("3"));
                    break;




                case "2":
                    Scanner lectorFlete = new Scanner(System.in);
                    String opcionFlete;

                    do{
                        System.out.println("        ---------- FLETES ----------   ");
                        System.out.println("            (1) Crear Flete             ");
                        System.out.println("            (2) Salir                   ");
                        System.out.print  ("            Opción  : ");
                        opcionFlete = lectorFlete.nextLine();

                        switch (opcionFlete){
                            case "1":
                                break;

                            case "2":
                                break;

                            default:
                                System.out.println("                Ingrese una opción válida... ");
                                break;
                        }
                    }  while (!opcionFlete.equals("2"));
                    break;




                case "3":
                    Scanner lectorCamion = new Scanner(System.in);
                    String opcionCamion;

                    do{
                        System.out.println("        ---------- CAMIÓN ----------   ");
                        Camion.mostrarCamiones();
                        System.out.println("            (1) Crear Flete             ");
                        System.out.println("            (2) Salir                   ");
                        System.out.print  ("            Opción  : ");
                        opcionCamion = lectorCamion.nextLine();

                        switch (opcionCamion){
                            case "1":
                                Camion.agregarCamion();
                                break;

                            case "2":
                                break;

                            default:
                                System.out.println("                Ingrese una opción válida... ");
                                break;
                        }
                    } while (!opcionCamion.equals("2"));

                    break;



                case "4":
                    System.out.println("        Hasta luego... ");
                    break;


                default:
                    System.out.println("        Ingrese una opción válida... ");
                    break;
            }
        } while (!opcion.equals("4"));
    }
}
