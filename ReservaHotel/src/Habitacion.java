/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author colom
 */
public class Habitacion {
    
    private String numHab;
    private double precioNoche;
    private boolean disponible;

    public Habitacion() {
    }

    public Habitacion(String numHab, double precioNoche, boolean disponible) {
        this.numHab = numHab;
        this.precioNoche = precioNoche;
        this.disponible = disponible;
    }

    public String getNumHab() {
        return numHab;
    }

    public void setNumHab(String numHab) {
        this.numHab = numHab;
    }

    public double getPrecioNoche() {
        return precioNoche;
    }

    public void setPrecioNoche(double precioNoche) {
        this.precioNoche = precioNoche;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "\nNumero Habitacion: " + numHab + " Precio por noche: $" + precioNoche;
    }
    
    
    
    
        
}
