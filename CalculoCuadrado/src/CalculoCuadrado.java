import java.util.Scanner;

public class CalculoCuadrado {
    
    public static void main(String[] args) {
        int lado, resultado;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el valor del lado del cuadrado: ");
        lado = teclado.nextInt();
        resultado = lado * 4;
        System.out.println("El perimetro del cuadrado es: " + resultado);
        
    }
}
