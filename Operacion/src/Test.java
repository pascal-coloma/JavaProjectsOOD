
import java.util.ArrayList;

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
        
        ArrayList<Operacion> lista1 = new ArrayList<>();
        lista1.add(new Suma(30,40));
        lista1.add(new Resta(70, 40));
        lista1.add(new Suma(60,20));
        for (Operacion i : lista1) {
            i.operar();
            i.imprimir();
            
        }
    }
}
