public class ComponentesInternos extends Productos{
    private double velocidad;
    private int capacidad;
    public ComponentesInternos(int id, String nombre, String descripcion, double precio, int stock, double velocidad, int capacidad) {
        super(id, nombre, descripcion, precio, stock);
        this.velocidad = velocidad;
        this.capacidad = capacidad;
    }
}
