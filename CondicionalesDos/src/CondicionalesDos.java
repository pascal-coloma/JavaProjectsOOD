import java.util.Scanner;

public class CondicionalesDos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dia, mes, anno;
        System.out.println("Ingrese dia: ");
        dia = teclado.nextInt();
        System.out.println("Ingrese mes: ");
        mes = teclado.nextInt();
        System.out.println("Ingrese anho: ");
        anno = teclado.nextInt();
        
        if (mes == 1 || mes == 2 || mes == 3) {
            System.out.println("Corresponde al primer trimestre");
            
        } else {
            System.out.println("No se encuentra en el primer trimestre");
        }
        
        
    }
}
