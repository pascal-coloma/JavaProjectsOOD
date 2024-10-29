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
        
        ConsolaPortatil consola1 =  new ConsolaPortatil(5, .15f, "Sony", "PS5", 500_000);
        ConsolaPortatil consola2 = new ConsolaPortatil(5, 0.15f, "Sony", "ps5", 600_000);
        
        RegistroConsola registro1 = new RegistroConsola();
        
        registro1.agregarConsola(consola1);
       
        
        System.out.println(consola1.calcularPrecioFinal());
        
        
        
    }
   
}
