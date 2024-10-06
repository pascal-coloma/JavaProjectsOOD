import java.util.Random;
import java.util.ArrayList;
import java.util.List; 

public class ImpresionSerie {
    public static void main(String[] args) {
        int suma1, suma2;
        suma1 = 0;
        suma2 = 0;
        Random rand = new Random();
        List<Integer> lis_num1 = new ArrayList<>();
        List<Integer> lis_num2 = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            int rand_int = rand.nextInt(100);
            int rand_int2 = rand.nextInt(100);
            lis_num1.add(rand_int);
            lis_num2.add(rand_int2);
        }
       
        for (int i : lis_num1) {
            suma1 += i;
        }
        for (int i : lis_num2) {
            suma2 += i;
        }
        if (suma1 > suma2) {
            System.out.println("Lista 1 mayor");
        } else {
            System.out.println("Lista 2 mayor");
        }
        System.out.println(lis_num1 + "Su suma es: " + suma1);
        System.out.println(lis_num2 + "Su suma es: " + suma2);
    }
}
