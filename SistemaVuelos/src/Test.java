/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vina
 */
public class Test {
    public static void main(String[] args) {
        
        Vuelo vuelo1 = new Vuelo("AC123", "Santiago", "Concepcion", "35");
        PasajeroFrecuente pax1 = new PasajeroFrecuente("6653", 1500);
        CompanniaAerea compa1 = new CompanniaAerea("LT1235", "TRANSAEREO", "120" );
        Reserva reserva1 = new Reserva("33F", vuelo1);
        
        Cliente cliente1 = new Cliente("133XC", "AQUILES BAILO", reserva1, pax1);
        
        System.out.println(compa1);
        System.out.println(cliente1);
        
        Vuelo vuelo2 = new Vuelo("FX22", "Concepcion", "Puerto Natales", "2");
        PasajeroFrecuente pax2 = new PasajeroFrecuente("6653", 1500);
        CompanniaAerea compa2 = new CompanniaAerea("HH224", "LATAM", "20" );
        Reserva reserva2 = new Reserva("26G", vuelo2);
        
        Cliente cliente2 = new Cliente("133XC", "PABLO SALTO", reserva2, pax2);
        
        System.out.println(compa2);
        System.out.println(cliente2);
    }
}
