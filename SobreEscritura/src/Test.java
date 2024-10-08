/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author colom
 */
public class Test {
    public static void main(String[] args) {
        
        Sumar suma1 = new Sumar(20, 40);
        System.out.println("Resultado de la suma: " + suma1.operar());
        
        Restar resta1 = new Restar(30,10);
        System.out.println("Resultado de la resta: " + resta1.operar());
    }
}
