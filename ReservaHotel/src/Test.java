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
        
        Habitacion habit1 = new Habitacion("510B", 15_000, true);
        
        Hotel hotel1 = new Hotel("SH123", "Sheraton Vinna");
        
        System.out.println(hotel1);
        hotel1.aniadirHabitacion(habit1);
        System.out.println(hotel1);
    }
          
}
