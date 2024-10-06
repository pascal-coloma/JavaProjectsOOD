import java.util.Scanner;

public class FechaNavidad {
    public static void main(String[] args) {
        int dia, mes, anno;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la fecha a buscar");
        System.out.println("Ingrese dia: ");
        dia = teclado.nextInt();
        System.out.println("Ingrese mes: ");
        mes = teclado.nextInt();
        System.out.println("Ingrese anho: ");
        anno = teclado.nextInt();
        
        if (dia == 24 && mes == 12 ) {
            System.out.println("Es navidad");
            
        } else {
            System.out.println("No es navidad");
        }
        
    }
}
