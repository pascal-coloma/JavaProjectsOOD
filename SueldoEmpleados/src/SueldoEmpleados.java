import java.util.Scanner;

public class SueldoEmpleados {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cant, sueldo, contMenor, contMayor, total, x;
        contMenor = 0;
        contMayor = 0;
        x = 0;
        total = 0;
        System.out.println("Ingrese cantidad de empleados: ");
        cant = teclado.nextInt();
        while (x < cant) {            
            System.out.println("Ingrese sueldo " + (x + 1));
            sueldo = teclado.nextInt();
            if (sueldo >= 100 && sueldo <= 300) {
                contMenor += 1;
            } else {
                contMayor += 1;
            }
            total += sueldo;
            x += 1;
        }
        System.out.println("Tiene un total de " + contMayor + " empleados sobre los $300");
        System.out.println("Y un total de " + contMenor + " entre $100 y $300");
        System.out.println("El total pagado en sueldos es: $" + total);
    }
}
