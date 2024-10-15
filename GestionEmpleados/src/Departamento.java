
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author colom
 */
public class Departamento {
    
    private String idDepto, nombre;
    private ArrayList<Empleado> listEmpleados;

    public Departamento() {
    }

    public Departamento(String idDepto, String nombre) {
        this.idDepto = idDepto;
        this.nombre = nombre;
        this.listEmpleados = new ArrayList<>();
    }

    public String getIdDepto() {
        return idDepto;
    }

    public void setIdDepto(String idDepto) {
        this.idDepto = idDepto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Empleado> getListEmpleados() {
        return listEmpleados;
    }

    public void setListEmpleados(ArrayList<Empleado> listEmpleados) {
        this.listEmpleados = listEmpleados;
    }
    
    public void agregarEmpleado(Empleado empleado){
        listEmpleados.add(empleado);          
    }
    
    public double calcularCostoSalarios(){
        double total = 0;
        for (Empleado empleado : listEmpleados) {
            total += empleado.getSueldoBase();
        }
        return total;
    }
    
    
    
    
}
