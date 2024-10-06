import java.util.Scanner;

public class SueldoOperario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int sueldo, antiguedad;
        System.out.println("Ingrese datos del operario");
        System.out.println("Ingrese sueldo: ");
        sueldo = teclado.nextInt();
        System.out.println("Ingrese anhos de antiguedad: ");
        antiguedad = teclado.nextInt();
        
        if (sueldo < 500 && antiguedad >= 10) {
            sueldo *= 1.20;
            System.out.println("Su sueldo es de: " + sueldo);
            
        } else if (sueldo < 500 && antiguedad < 10){
            sueldo *= 1.005;
            System.out.println("Su sueldo es de: " + sueldo);
        } else {
            System.out.println("Sueldo sin cambios: " + sueldo);
        }
    }
}
