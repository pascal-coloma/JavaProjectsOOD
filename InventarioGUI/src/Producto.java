/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author colom
 */
public class Producto {
    
    String nombre, categoria;
    int idProducto, cantidadStock, umbralReabastecimiento, precio;
    

    public Producto() {
    }

    public Producto(String nombre, String categoria, int idProducto, int cantidadStock, int umbralReabastecimiento, int precio) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.idProducto = idProducto;
        this.cantidadStock = cantidadStock;
        this.umbralReabastecimiento = umbralReabastecimiento;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public int getUmbralReabastecimiento() {
        return umbralReabastecimiento;
    }

    public void setUmbralReabastecimiento(int umbralReabastecimiento) {
        this.umbralReabastecimiento = umbralReabastecimiento;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    
    public double calcularCostoStock(){
        return cantidadStock * precio;
    }
        
    public void agregarStock(int cantidad){
        cantidadStock += cantidad;
        System.out.println("Cantidad: " + cantidad + " agregada a " + nombre);
        System.out.println("Cantidad actualizada: " + cantidadStock);   
    }
    
    public void registrarVenta(int cantidad){
        
        System.out.println("Venderas: " + cantidad + " unidad(es) de " + nombre + "\nStock disponible: " + cantidadStock);
        cantidadStock -= cantidad;
        System.out.println("Has vendido: " + cantidad + " unidad(es) de " + nombre);
        System.out.println("Stock disponible: " + cantidadStock);  
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nCategoria: " + categoria + "\nID: " + idProducto + "\nCantidad Stock: " + cantidadStock + "\nUmbral de reabastecimiento: " + umbralReabastecimiento + "\nPrecio: " + precio;
    }
    
    
    
    
    
}
