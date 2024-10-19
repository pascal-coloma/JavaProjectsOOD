/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author colom
 */
public class EmpleadoAsalariado extends Empleado implements BonusCalculable {

    public EmpleadoAsalariado() {
    }

    public EmpleadoAsalariado(String idEmpleado, String nombre, double sueldoBase) {
        super(idEmpleado, nombre, sueldoBase);
    }

    @Override
    public String getIdEmpleado() {
        return idEmpleado;
    }

    @Override
    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public double getSueldoBase() {
        return sueldoBase;
    }

    @Override
    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    @Override
    public double calcularBonus() {
        double bono = 100_000;
        
        return bono;
    }

    

    
}
