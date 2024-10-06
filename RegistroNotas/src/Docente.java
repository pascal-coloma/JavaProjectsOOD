
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author colom
 */
public class Docente {
    
    private String nombre;
    private int run, nro_docente;
    private String fechaIngreso;
    private Sede sede;

    public Docente() {
    }

    public Docente(String nombre, int run, int nro_docente, String fechaIngreso, Sede sede) {
        this.nombre = nombre;
        this.run = run;
        this.nro_docente = nro_docente;
        this.fechaIngreso = fechaIngreso;
        this.sede = sede;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getNro_docente() {
        return nro_docente;
    }

    public void setNro_docente(int nro_docente) {
        this.nro_docente = nro_docente;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Sede getSede() {
        return sede;
    }

    public void setSede(Sede sede) {
        this.sede = sede;
    }

    @Override
    public String toString() {
        return "\nNombre: " +nombre + "\nRun: " + run + "\nNumero Docente: " + nro_docente + "\nFecha de Ingreso: " + fechaIngreso + "\nSede: " + sede;
    }
    
    
    
    
}
