/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package donajuanita;

/**
 *
 * @author GaboGrobier
 */
public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public void mostrarProductos(){
        System.out.println("El nombre del producto es " + this.nombre);
        System.out.println("La cantidad es " + this.cantidad);
        System.out.println("El precio unitario es " + this.precio);
    }
    
    public boolean descontarProducto(Producto producto){
        if (producto.getCantidad()>0){
            producto.cantidad--;
            return true;
        }
        else{
            return false;
        }
    }
    public boolean aumentarProducto(Producto producto){
        if (producto.cantidad <0){
            return false;
        
        }
        else{
            producto.cantidad++;
            return true;
        }
            
    }
    
    
}
