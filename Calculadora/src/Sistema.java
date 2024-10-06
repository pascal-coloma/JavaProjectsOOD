/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author colom
 */

import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int num1, num2, opc, result;
        
        do {            
            System.out.println("Ingrese su opcion: ");
            System.out.println("(1) SUMAR");
            System.out.println("(2) RESTAR");
            System.out.println("(3) MULTIPLICAR");
            System.out.println("(4) DIVIDIR");
            System.out.println("(5) SALIR");
            opc = teclado.nextInt();
            switch (opc) {
            case 1:
                System.out.println("Ingrese primer numero: ");
                num1 = teclado.nextInt();
                System.out.println("Ingrese segundo numero: ");
                num2 = teclado.nextInt();
                result =  num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
            case 2:
                System.out.println("Ingrese primer numero: ");
                num1 = teclado.nextInt();
                System.out.println("Ingrese segundo numero: ");
                num2 = teclado.nextInt();
                result =  num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;
            case 3:
                System.out.println("Ingrese primer numero: ");
                num1 = teclado.nextInt();
                System.out.println("Ingrese segundo numero: ");
                num2 = teclado.nextInt();
                result =  num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
            case 4:
                System.out.println("Ingrese primer numero: ");
                num1 = teclado.nextInt();
                System.out.println("Ingrese segundo numero: ");
                num2 = teclado.nextInt();
                result =  num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result);
                break;
            default:
                System.out.println("Saliendo...");
        }
        } while (opc != 5);

        
        
    }
}
