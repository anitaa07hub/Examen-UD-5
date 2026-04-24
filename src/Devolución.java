public class Devolución {
    private String fecha;
    private String motivo;
    private EstadoDevolucion estado;

    public Devolución(String fecha, String motivo, EstadoDevolucion estado) {
        this.fecha = fecha;
        this.motivo =motivo;
        this.estado = estado;
    }

    public void añadirDevolucion() {
        System.out.println("Devolución añadida");
    }

}
