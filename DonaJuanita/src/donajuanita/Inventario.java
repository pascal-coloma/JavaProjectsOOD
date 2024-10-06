/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package donajuanita;

/**
 *
 * @author GaboGrobier
 */
import java.util.ArrayList;
import java.util.List;
public class Inventario {
    private List<Producto> productos;
    
    public Inventario(){
        this.productos = new ArrayList<>();
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
    
    public void agregarProducto(Producto producto){
    
        productos.add(producto);
    }
    
    public void retirarproducto(Producto producto){
    
        if (productos.contains(producto)){
            productos.remove(producto);
   
        
        }
        else{System.out.println("El producto no se encuentra en el inventario ");}
    }
    
    public void mostrarInventario(){
        if (productos.isEmpty()){
            System.out.println("El inventario esta vacio ");
            
        
        }
        else{
        
            for (Producto producto : productos){
                producto.mostrarProductos();
                System.out.println();
                
            }
        
        }
    }
    
    
    
}
