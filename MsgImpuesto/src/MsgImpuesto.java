import java.util.Scanner;

public class MsgImpuesto {
    public static void main(String[] args) {
        int sueldo;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el sueldo: ");
        sueldo = teclado.nextInt();
        if (sueldo > 3000) {
            System.out.println("Debe abonar impuestos");
            
        } else {
            System.out.println("No debe abonar impuestos");
        }
    }
}
