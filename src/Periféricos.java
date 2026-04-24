public class Periféricos extends Productos{
    private String conexion;
    private double tamaño;

    public Periféricos(int id, String nombre, String descripcion, double precio, int stock, String conexion, double tamaño) {
        super(id, nombre, descripcion, precio, stock);
        this.conexion = conexion;
        this.tamaño = tamaño;
    }
}
