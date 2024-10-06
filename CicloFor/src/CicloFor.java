import java.util.Scanner;

public class CicloFor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int result;
        for (int i = 1; i <= 10; i++) {
            result = 5 * i;
            System.out.println(5 + "*"+  i + " = " + result);
        }
    }
}
