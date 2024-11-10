
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
public class OperacionCompra {
    
    int idOperacion;
    Cliente cliente;
    HashMap<Producto, Integer> productosComprados;

    public OperacionCompra() {
    }

    public OperacionCompra(int idOperacion, Cliente cliente, HashMap<Producto, Integer> productosComprados) {
        this.idOperacion = idOperacion;
        this.cliente = cliente;
        this.productosComprados = productosComprados;
    }

    public int getIdOperacion() {
        return idOperacion;
    }

    public void setIdOperacion(int idOperacion) {
        this.idOperacion = idOperacion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public HashMap<Producto, Integer> getProductosComprados() {
        return productosComprados;
    }

    public void setProductosComprados(HashMap<Producto, Integer> productosComprados) {
        this.productosComprados = productosComprados;
    }
    
    
    public double calcularTotalCompra(){
        double total = 0.0;
        
        for (Map.Entry<Producto, Integer> entry : productosComprados.entrySet()) {
            Producto producto = entry.getKey();
            int cantidad = entry.getValue();
            int precioProducto = producto.getPrecio();
            
            total += precioProducto * cantidad;
        }
       return total;
    }

    @Override
    public String toString() {
        return "OperacionCompra{" + "idOperacion=" + idOperacion + ", cliente=" + cliente + ", productosComprados=" + productosComprados + '}';
    }
    
    
    
    
}
