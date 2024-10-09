/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author colom
 */
import java.util.ArrayList;
import java.util.Scanner;

public class SistemaInventario {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        ArrayList<Trabajador> listaTrab = new ArrayList<>();
        Inventario inventario1 = new Inventario();
        int opc;
        
        do {
            System.out.println("0. Registrar trabajadores: ");
            System.out.println("1. Agregar productos: ");
            System.out.println("2. Retirar productos: ");
            System.out.println("3. Mostrar productos: ");
            System.out.println("4. Salir");
            
            System.out.println("Ingrese su opcion: ");
            opc = teclado.nextInt();
            switch (opc) {
                case 0 -> {
                    Trabajador trab1 = new Trabajador();
                    System.out.println("Ingrese ID del trabajador: ");
                    trab1.setIdTrabajador(teclado.next());
                    System.out.println("Ingrese nombre del trabajador: ");
                    trab1.setNombre(teclado.next());
                    listaTrab.add(trab1);
                    System.out.println("Trabajador registrado");
                    System.out.println(listaTrab.toString());
                }
                case 1 -> {
                    Producto producto = new Producto();
                    System.out.println("Ingrese nombre del producto: ");
                    producto.setNombre(teclado.next());
                    System.out.println("Ingrese cantidad del producto: ");
                    producto.setCantidad(teclado.nextInt());
                    System.out.println("Ingrese precio del producto: ");
                    producto.setPrecio(teclado.nextDouble());
                    inventario1.agregarProducto(producto);
                }
                case 2 -> inventario1.retirarProducto("taza", 4);
                case 3 -> inventario1.mostrarProductos();
                default -> System.out.println("Saliendo del sistema...");
            }
                    
        } while (opc != 4);

    }
}

