
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author colom
 */
public class Empleado {
    
    protected String idEmpleado, nombre;
    protected double sueldoBase;

    public Empleado() {
    }

    public Empleado(String idEmpleado, String nombre, double sueldoBase) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }
    
    public double calcularSalario(){
        double porcDescto = 17.6f;
        double dsctoDinero = sueldoBase * porcDescto;
        double salarioLiquido = sueldoBase - dsctoDinero;
        
        return salarioLiquido;
    }
}
