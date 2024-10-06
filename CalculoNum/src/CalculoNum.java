import java.util.Scanner;

public class CalculoNum {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2, num3, num4, suma, producto;
        System.out.println("Ingrese primer numero: ");
        num1 = teclado.nextInt();
        System.out.println("Ingrese segundo numero: ");
        num2 = teclado.nextInt();
        System.out.println("Ingrese tercer numero: ");
        num3 = teclado.nextInt();
        System.out.println("Ingrese cuarto numero: ");
        num4 = teclado.nextInt();
        suma = num1 + num2;
        producto = num3 * num4;
        System.out.println("La suma de " + num1 + " + " + num2 + " es: " + suma);
        System.out.println("El producto de: " + num3 + " * " + num4 + " es: " + producto );
             
    }
}
