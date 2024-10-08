/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author colom
 */
import java.util.ArrayList;

public class Reserva {
    
    private String idReserva;
    private Hotel hotel;
    private ArrayList<Habitacion> habitReserv;

    public Reserva() {
    }

    public Reserva(Hotel hotel, Habitacion habitReserv) {
        this.hotel = hotel;
        this.habitReserv = new ArrayList<>();
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public ArrayList<Habitacion> getHabitReserv() {
        return habitReserv;
    }

    public void aniadirReserva(Habitacion habitacion){
        if (habitacion.isDisponible()) {
            habitReserv.add(habitacion);
        } else {
            System.out.println("Habitacion " + habitacion.getNumHab()+" no disponible");
        }
        
    }

    public String getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(String idReserva) {
        this.idReserva = idReserva;
    }

    @Override
    public String toString() {
        return "\nReserva: " + idReserva + "\nHabitacion Reservada: " + habitReserv.toString();
    }
    
    
}
