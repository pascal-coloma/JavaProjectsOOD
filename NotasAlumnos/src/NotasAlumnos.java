import java.util.Scanner;

public class NotasAlumnos {
    public static void main(String[] args) {
        int nota, x, contMayor, contMenor;
        Scanner teclado = new Scanner(System.in);
        x = 1;
        nota = 0;
        contMayor = 0;
        contMenor = 0;
        while (x < 10) {            
            System.out.println("Ingrese la nota " + x);
            nota = teclado.nextInt();
            if (nota >= 7 ) {
                contMayor += 1;
                
            } else {
                contMenor += 1;
            }
            x += 1;
        }
        System.out.println("Tienes " + contMayor + " notas mayores o iguales a 7");
        System.out.println("Tienes " + contMenor + " notas menores a 7" );
        
    }
}
