public class Productos extends Tienda {
    private int id;
    private String nombre;
    private String descripcion;
    private double precio;
    private int stock;

    public Productos(int id, String nombre, String descripcion, double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
    }
    public boolean comprobarStock() {
        if (stock > 0) {
            return true;
        }
        return false;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    public double precioFinal(double precio) {
        return precio;
    }
    public void agregarProducto() {
        System.out.println("Producto agregado");
    }
}
