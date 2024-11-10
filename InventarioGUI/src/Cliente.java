
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author colom
 */
public class Cliente {

    int idCliente;
    String nombre, infoContacto, preferencias;

    public Cliente() {
    }

    public Cliente(int idCliente, String nombre, String infoContacto, String preferencias) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.infoContacto = infoContacto;
        this.preferencias = preferencias;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInfoContacto() {
        return infoContacto;
    }

    public void setInfoContacto(String infoContacto) {
        this.infoContacto = infoContacto;
    }

    public String getPreferencias() {
        return preferencias;
    }

    public void setPreferencias(String preferencias) {
        this.preferencias = preferencias;
    }

    public void realizarCompra(Pedido pedido) {
        pedido.confirmarPedido();  // Procesa el pedido y reduce el inventario
        OperacionCompra operacion = new OperacionCompra(this, pedido.getProductosPedido());
        historialTransacciones.add(operacion);  // Guarda la operación en el historial
    }

    public void verHistorialTransacciones(OperacionCompra operacionCompra) {
        operacionCompra.toString();
    }
}
