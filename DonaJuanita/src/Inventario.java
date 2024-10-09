
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author colom
 */
public class Inventario {

    Scanner teclado = new Scanner(System.in);

    private ArrayList<Producto> listaProd;

    public Inventario() {
        this.listaProd = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        listaProd.add(producto);
    }

    public void retirarProducto(String nombre, int cantidad) {

        if (listaProd.isEmpty()) {
            System.out.println("El inventario esta vacio, agregue productos");
        } else {
            System.out.println("Ingrese producto a retirar: ");
            String nombreBusq = teclado.next();
            for (Producto producto : listaProd) {
                if (nombreBusq.equalsIgnoreCase(producto.getNombre())) {
                    System.out.println("Ingrese cantidad a retirar: ");
                    int cantRetiro = teclado.nextInt();
                    producto.setCantidad(producto.getCantidad() - cantRetiro);
                }
            }
        }
    }

    public void mostrarProductos() {
        if (listaProd.isEmpty()) {
            System.out.println("No hay productos para mostrar");
        } else {
            
            for (Producto producto : listaProd) {
                System.out.println("-------------------------");
                System.out.println(producto.mostrarDetalles());
            }
        }

    }

}
