/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package donajuanita;

/**
 *
 * @author GaboGrobier
 */
public class Trabajador {
    private int id;
    private String nombre;
    private String rol;

    public Trabajador(int id, String nombre, String rol) {
        this.id = id;
        this.nombre = nombre;
        this.rol = rol;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    public void agregarProducto(Inventario inventario, Producto producto){
        inventario.agregarProducto(producto);
        System.out.println("Se ha agregado el producto " + producto.getNombre());
    
    }
    public void retirarProducto(Inventario inventario, Producto producto){
    
        inventario.retirarproducto(producto);
        System.out.println("Se ha retirado el producto " +  producto.getNombre());
        
    }
    public void actualizarProductoAum(Producto producto){
        if(producto.aumentarProducto(producto)){
            System.out.println("Se ha actualizado la cantidad ");
        }
        else{
            System.out.println("Existe un error en el producto agregado ");
        }
    }
    
    public void actualizarProductoDism(Producto producto){
        if (producto.descontarProducto(producto)){
            System.out.println("Se ha descontado producto ");
            
        }
        else{
            System.out.println("no se ha podido descontar ");
            
        }
        
        
    }
    
    
    
    
}
