public class AlmacenamientoExterno extends Productos{
    private int almacenamiento;
    private TipoTecnologia tecnologia;
    public AlmacenamientoExterno(int id, String nombre, String descripcion, double precio, int stock, int almacenamiento, TipoTecnologia tecnologia) {
        super(id, nombre, descripcion, precio, stock);
        this.almacenamiento =almacenamiento;
        this.tecnologia = tecnologia;
    }
}
