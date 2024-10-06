
import java.util.Date;
import java.text.SimpleDateFormat;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author colom
 */
public class Estudiante {
    
    private String nombre;
    private int run, edad;
    private String fechaNacto;

    public Estudiante() {
    }

    public Estudiante(String nombre, int run, int edad, String fechaNacto) {
        setNombre(nombre);
        this.run = run;
        setEdad(edad);
        this.fechaNacto = fechaNacto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre.length() >= 1){
            this.nombre = nombre;
        } else{
            System.out.println("El nombre no puede estar vacio.");
        }
        
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad >= 18 && edad < 100){
            this.edad = edad;
        } else{
            System.out.println("Edad no valida");
        }
    }

    public String getFechaNacto() {
        return fechaNacto;
    }

    public void setFechaNacto(String fechaNacto) {
        this.fechaNacto = fechaNacto;
    }

    @Override
    public String toString() {
        return "Estudiante:\nNombre: " + nombre + "\nRUN: " + run + "\nEdad: " + edad + "\nFecha Nacimiento" + fechaNacto;
    }
    
    
    
    
    
    
    
    
}
