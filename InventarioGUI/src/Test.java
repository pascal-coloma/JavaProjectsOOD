/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author colom
 */
public class Test {
    public static void main(String[] args) {
        
        Producto p1 =  new Producto("Zapatos", "Calzado", 001, 2 , 1, 35000);
        Producto p2 = new Producto("Pelota", "Deportes", 002, 15, 3, 8000);
                
        Pedido ped1 = new Pedido(0001);
        
        Cliente cl1 = new Cliente(0005, "Pascal", "+56940861596", "Deportes");
        
        ped1.agregarProducto(p1, 5);
        cl1.realizarCompra(ped1);
        
        OperacionCompra ope1 = new OperacionCompra(0, cl1, ped1);
        
    }
}
