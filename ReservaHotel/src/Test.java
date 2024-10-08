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
        Habitacion habit2 = new Habitacion("320A", 60_000, false);
        
        Hotel hotel1 = new Hotel("SH123", "Sheraton Vinna");
        Hotel hotel2 = new Hotel("NEV55", "Nevados de Chillan");
        Hotel hotel3 = new Hotel("HYA06", "Hyatt Santiago");
        
        Cliente cl1 = new Cliente("190584283", "Pascal Coloma");
        
        Reserva reserva1 = new Reserva(hotel1, habit1);
        
//        Menu menu1 =  new Menu();
//        
//        menu1.menu(0);
        
        
        hotel1.aniadirHabitacion(habit1);
        hotel1.aniadirHabitacion(habit2);
        reserva1.aniadirReserva(habit1);
        reserva1.aniadirReserva(habit2);
        cl1.asignarReserva(reserva1);
        System.out.println(cl1.toString());
    }
          
}
