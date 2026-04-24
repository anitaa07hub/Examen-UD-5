public class Incidencia {
    private String descripcion;
    private String fecha;
    private EstadoIncidencia estado;

    public Incidencia(String descripcion, String fecha, EstadoIncidencia estado) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.estado = estado;
    }
    public void añadirIncidencia() {
        System.out.println("Incidencia añadida");
    }
}
