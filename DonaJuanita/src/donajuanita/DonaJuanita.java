/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package donajuanita;

/**
 *
 * @author GaboGrobier
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class DonaJuanita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Inventario inventario = new Inventario();
        List<Trabajador> trabajadores = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("0. Agregar Trabajador");
            System.out.println("1. Agregar producto");
            System.out.println("2. Retirar producto");
            System.out.println("3. Mostrar inventario");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir nueva línea

            switch (opcion) {
                case 0:
                    System.out.print("Ingrese el id: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consumir nueva línea
                    System.out.print("Nombre del trabajador: ");
                    String nombreTrabajador = scanner.nextLine();
                    System.out.print("Ingrese el Rol: ");
                    String rol = scanner.nextLine();

                    Trabajador nuevoTrabajador = new Trabajador(id, nombreTrabajador, rol);
                    trabajadores.add(nuevoTrabajador);
                    System.out.println("Trabajador " + nombreTrabajador + " creado exitosamente.");
                    break;

                case 1:
                    if (trabajadores.isEmpty()) {
                        System.out.println("No hay trabajadores registrados. Primero, registre un trabajador.");
                    } else {
                        System.out.print("Seleccione el trabajador que agrega el producto: ");
                        for (int i = 0; i < trabajadores.size(); i++) {
                            System.out.println((i + 1) + ". " + trabajadores.get(i).getNombre());
                        }
                        int trabajadorIndex = scanner.nextInt() - 1;
                        scanner.nextLine(); // Consumir nueva línea

                        if (trabajadorIndex < 0 || trabajadorIndex >= trabajadores.size()) {
                            System.out.println("Trabajador no válido.");
                            break;
                        }

                        System.out.print("Nombre del producto: ");
                        String nombreProducto = scanner.nextLine();
                        System.out.print("Precio del producto: ");
                        double precio = scanner.nextDouble();
                        System.out.print("Cantidad del producto: ");
                        int cantidad = scanner.nextInt();

                        Producto nuevoProducto = new Producto(nombreProducto, precio, cantidad);
                        trabajadores.get(trabajadorIndex).agregarProducto(inventario, nuevoProducto);
                    }
                    break;

                case 2:
                    System.out.print("Nombre del producto a retirar: ");
                    String nombreRetiro = scanner.nextLine();
                    Producto productoARetirar = null;

                    // Busca el producto en el inventario
                    for (Producto producto : inventario.getProductos()) {
                        if (producto.getNombre().equalsIgnoreCase(nombreRetiro)) {
                            productoARetirar = producto;
                            break;
                        }
                    }
                    if (productoARetirar != null) {
                        System.out.print("Seleccione el trabajador que retira el producto: ");
                        for (int i = 0; i < trabajadores.size(); i++) {
                            System.out.println((i + 1) + ". " + trabajadores.get(i).getNombre());
                        }
                        int trabajadorRetiroIndex = scanner.nextInt() - 1;
                        scanner.nextLine(); // Consumir nueva línea

                        if (trabajadorRetiroIndex < 0 || trabajadorRetiroIndex >= trabajadores.size()) {
                            System.out.println("Trabajador no válido.");
                            break;
                        }

                        trabajadores.get(trabajadorRetiroIndex).retirarProducto(inventario, productoARetirar);
                    } else {
                        System.out.println("Producto no encontrado en el inventario.");
                    }
                    break;

                case 3:
                    System.out.println("Inventario:");
                    inventario.mostrarInventario();
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 4);
        scanner.close();
    }
}
