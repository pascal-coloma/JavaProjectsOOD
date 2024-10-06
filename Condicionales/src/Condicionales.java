import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
        
        int num1, num2, num3;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese primer numero");
        num1 = teclado.nextInt();
        System.out.println("Ingrese segundo numero");
        num2 = teclado.nextInt();
        System.out.println("Ingrese tercer numero");
        num3 = teclado.nextInt();
        
        if (num1 > num2 && num1 > num3) {
            System.out.println("El numero mayor es: " + num1);
            
        } else if (num2 > num3){
            System.out.println("El numero mayor es: " + num2);
            
        } else {
            System.out.println("Numero mayor: " + num3);
        }
        
    }
}
