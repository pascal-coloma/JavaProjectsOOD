/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vina
 */
public class Cliente {
    private String idCliente, nombre;
    private Reserva reserva;
    private PasajeroFrecuente pasajeroFrecuente;
    

    public Cliente() {
    }

    public Cliente(String idCliente, String nombre, Reserva reserva, PasajeroFrecuente pasajeroFrecuente) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.reserva = reserva;
        this.pasajeroFrecuente = pasajeroFrecuente;
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

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public PasajeroFrecuente getPasajeroFrecuente() {
        return pasajeroFrecuente;
    }

    public void setPasajeroFrecuente(PasajeroFrecuente pasajeroFrecuente) {
        this.pasajeroFrecuente = pasajeroFrecuente;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", reserva=" + reserva + ", pasajeroFrecuente=" + pasajeroFrecuente + '}';
    }
    
    
}
