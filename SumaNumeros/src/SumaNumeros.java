import java.util.Scanner;

public class SumaNumeros {
    public static void main(String[] args) {
        int num1, num2, suma, producto;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        num1 = teclado.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = teclado.nextInt();
        suma = num1 + num2;
        producto = num1 * num2;
        System.out.println("La suma de " + num1 + " + "+ num2 + " es: " + suma);
        System.out.println("El producto de " + num1 + " * " + num2 + " es: " + producto);
                
        
        
    }
}
