public class Pedido extends Tienda{
    private String fechaCreacion;
    private EstadoPedido estado;
    private double importe;

    public Pedido (String fechaCreacion, EstadoPedido estado, double importe) {
        this.fechaCreacion = fechaCreacion;
        this.importe = importe;
        this.estado = estado;
    }
    public void añadirPedido(){
        System.out.println("Pedido añadido");
    }
}
