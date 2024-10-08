package PrincipioFPuraTaller11;
import java.util.Date;
import java.util.List;

public class Pedido {
    private int id;
    private Date fecha;
    private Cliente cliente;
    private List<Producto> productos;

    public Pedido(int id, Date fecha, Cliente cliente, List<Producto> productos) {
        this.id = id;
        this.fecha = fecha;
        this.cliente = cliente;
        this.productos = productos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Producto> getProductos() {
        return productos;
    }
    public Date getFecha() {
        return fecha;
    }
    public int getId() {
        return id;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public void setId(int id) {
        this.id = id;
    }
}