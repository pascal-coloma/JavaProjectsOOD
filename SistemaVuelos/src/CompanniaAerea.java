/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vina
 */
public class CompanniaAerea {
    
    private String idCompannia, nombre, vuelosDisponibles;

    public CompanniaAerea() {
    }

    public CompanniaAerea(String idCompannia, String nombre, String vuelosDisponibles) {
        this.idCompannia = idCompannia;
        this.nombre = nombre;
        this.vuelosDisponibles = vuelosDisponibles;
    }

    public String getIdCompannia() {
        return idCompannia;
    }

    public void setIdCompannia(String idCompannia) {
        this.idCompannia = idCompannia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVuelosDisponibles() {
        return vuelosDisponibles;
    }

    public void setVuelosDisponibles(String vuelosDisponibles) {
        this.vuelosDisponibles = vuelosDisponibles;
    }

    @Override
    public String toString() {
        return "CompanniaAerea{" + "idCompannia=" + idCompannia + ", nombre=" + nombre + ", vuelosDisponibles=" + vuelosDisponibles + '}';
    }
    
    
}
