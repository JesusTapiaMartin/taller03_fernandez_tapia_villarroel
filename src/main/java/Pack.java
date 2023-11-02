
public class Pack {
    // ===== ATRIBUTOS =====
    Producto[][] producto;

    public Pack(Producto[][] producto) {
        this.producto = new Producto[1][20];
    }

    public Producto[][] getProducto() {

        return producto;
    }

    public void setProducto(Producto[][] producto) {

        this.producto = producto;
    }

}
