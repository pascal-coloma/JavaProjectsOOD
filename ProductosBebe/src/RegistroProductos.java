
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
public class RegistroProductos {

    Scanner teclado = new Scanner(System.in);
    private ArrayList<Productos> listProductos;

    public RegistroProductos() {
        this.listProductos = new ArrayList<>();
    }

    public void agregarProducto(Productos producto) {
        for (Productos prod : listProductos) {
            if (prod.getCodigo() == producto.getCodigo()) {
                System.out.println("Producto ya existe");
            } else {
                System.out.println("Agregando producto");
                listProductos.add(producto);
            }
        }
    }

    public void listarProducto() {
        for (Productos prod : listProductos) {
            System.out.println(prod.mostrarDatos());
        }
    }

    public void buscarProducto() {
        int codigo;
        System.out.println("Ingrese codigo producto a buscar: ");
        codigo = teclado.nextInt();
        for (Productos prod : listProductos) {
            if (codigo == prod.getCodigo()) {
                System.out.println(prod.mostrarDatos());
            } else {
                System.out.println("Codigo de producto no encontrado");
            }
        }
    }

    public void eliminarProducto() {
        int codigo;
        System.out.println("Ingrese codigo producto a buscar: ");
        codigo = teclado.nextInt();
        for (Productos prod : listProductos) {
            if (codigo == prod.getCodigo()) {
                listProductos.remove(prod);
                System.out.println("Producto removido");
            } else {
                System.out.println("Codigo de producto no encontrado");
            }
        }
    }

}
