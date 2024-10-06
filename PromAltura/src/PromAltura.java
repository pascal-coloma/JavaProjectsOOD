import java.util.Scanner;

public class PromAltura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cant, x;
        float altura, promedio, suma;
        x = 0;
        suma = 0;
        promedio = 0;
        System.out.println("Ingrese la cantidad de personas: ");
        cant = teclado.nextInt();
        while (x < cant) {
            System.out.println("Ingrese estatura " + (x + 1));
            altura = teclado.nextFloat();
            suma += altura;
            x += 1;
        }
        promedio = suma / cant;
        System.out.println("La estatura promedio es: " + promedio);
    
    }   
    
}
