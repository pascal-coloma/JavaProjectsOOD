
import java.util.HashMap;
import java.util.Map;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author colom
 */
public class Pedido {

    public int idPedido;
    HashMap<Producto, Integer> productosPedido;

    public Pedido(int idPedido) {
        this.idPedido = idPedido;
        this.productosPedido = new HashMap<>();
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public HashMap<Producto, Integer> getProductosPedido() {
        return productosPedido;
    }

    public void setProductosPedido(HashMap<Producto, Integer> productosPedido) {
        this.productosPedido = productosPedido;
    }

    public void agregarProducto(Producto producto, int cantidad) {
        System.out.println("Agregaras " + cantidad + " de " + producto.getNombre());
        productosPedido.put(producto, cantidad);
        System.out.println("Producto agregado con exito");
    }

    public void confirmarPedido() {
        for (Map.Entry<Producto, Integer> entry : productosPedido.entrySet()) {
            Producto producto = entry.getKey();
            int cantidad = entry.getValue();
            producto.registrarVenta(cantidad); 
    }
}

    

    @Override
    public String toString() {
        return "Pedido: \n" + productosPedido;
    }

}
