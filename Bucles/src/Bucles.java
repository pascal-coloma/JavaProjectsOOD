import java.util.Scanner; 

public class Bucles {
    public static void main(String[] args) {
        // Problema Bucles 1 
        Scanner teclado = new Scanner(System.in);
        int num, x, aptos, cantidad;
        float largo;
        cantidad = 0;
        aptos = 0;
        largo = 0f;
        x = 0;
//        promedio = 0;
//        System.out.println("Ingrese 10 numeros: ");
//        while (x < 10) {            
//            num = teclado.nextInt();
//            x += 1;
//            suma += num;
//            promedio = suma / x;
//        } 
//        System.out.println("Resultado de la suma: " + suma + " Promedio: " + promedio);
        
        // Problema B. 2 
        
        System.out.println("Ingrese cantidad de piezas del lote: ");
        cantidad = teclado.nextInt();
        System.out.println("Ingrese los largos de las piezas: ");
        while (x < cantidad) {
            System.out.println("Largo " + (x + 1));
            largo = teclado.nextFloat();
            if (largo >= 1.20 && largo <= 1.30) {
                aptos += 1;
            }
            x += 1;
        }
        System.out.println("Tienes " + aptos + " piezas aptas");

        
    }
}
