/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vina
 */
public class PasajeroFrecuente {
    private String numeroPasajero;
    private int puntos;

    public PasajeroFrecuente() {
    }

    public PasajeroFrecuente(String numeroPasajero, int puntos) {
        this.numeroPasajero = numeroPasajero;
        this.puntos = puntos;
    }

    public String getNumeroPasajero() {
        return numeroPasajero;
    }

    public void setNumeroPasajero(String numeroPasajero) {
        this.numeroPasajero = numeroPasajero;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return "PasajeroFrecuente{" + "numeroPasajero=" + numeroPasajero + ", puntos=" + puntos + '}';
    }
    
    
}
