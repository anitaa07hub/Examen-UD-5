import java.util.ArrayList;
import java.util.List;

public class Clientes extends Tienda{
    private int id;
    private String nombre;
    private String email;
    private String direccion;
    private int telefono;
    private List<Pedido> pedidos;
    private List<Incidencia> incidencias;

    public Clientes(int id, String nombre, String email, String direccion, int telefono, List<Pedido> pedidos, List<Incidencia> incidencias) {
        this.id = id;
        this.direccion = direccion;
        this.email = email;
        this.nombre = nombre;
        this.telefono = telefono;
        this.pedidos = new ArrayList<>();
        this.incidencias = new ArrayList<>();
    }

    public void añadirCliente(){
        System.out.println("Cliente añadido");
    }
}
