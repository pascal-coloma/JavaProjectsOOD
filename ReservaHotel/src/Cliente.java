
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author colom
 */
public class Cliente {
    
    private String idCliente, nombre;
    private ArrayList<Reserva> reservasRealizadas;
    
    public Cliente() {
    }

    public Cliente(String idCliente, String nombre) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.reservasRealizadas = new ArrayList<>();
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Reserva> getReservasRealizadas() {
        return reservasRealizadas;
    }

    public void setReservasRealizadas(ArrayList<Reserva> reservasRealizadas) {
        this.reservasRealizadas = reservasRealizadas;
    }
    
    @Override
    public String toString() {
        return "Cliente: \nID: " + idCliente + "\nNombre: " + nombre + reservasRealizadas;
    }
    
    public void asignarReserva(Reserva reserva){
        reservasRealizadas.add(reserva);
        reserva.setIdReserva(idCliente);
    }
}
