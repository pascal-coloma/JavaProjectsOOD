import java.util.Scanner;

public class CostoArt {
    public static void main(String[] args) {
        int precio, cantidad, result;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el precio del articulo: $");
        precio = teclado.nextInt();
        System.out.print("Ingrese la cantidad de articulos: ");
        cantidad = teclado.nextInt();
        result = precio * cantidad;
        System.out.println("El cliente debe abonar: $" + result);
    }
}
