import java.util.Scanner;

public class ValidarNumero {
    public static void main(String[] args) {
        int num;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        num = teclado.nextInt();
        if (num < 0) {
            System.out.println("El numero es negativo");
            
        } else if (num > 0) {
            System.out.println("El numero es positivo");
        } else {
            System.out.println("El numero es 0");
        }
        
    }
}
