
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author colom
 */
public class Trabajador {
    
    private String nombre, idTrabajador;
    

    public Trabajador() {
    }

    public Trabajador(String nombre, String idTrabajador) {
        this.nombre = nombre;
        this.idTrabajador = idTrabajador;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(String idTrabajador) {
        this.idTrabajador = idTrabajador;
    }

    @Override
    public String toString() {
        return "Nombre trabajador: " + nombre + "\nID Trabajador: " + idTrabajador ;
    }
    
    
    
}
