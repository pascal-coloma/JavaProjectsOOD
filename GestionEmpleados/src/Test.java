
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author colom
 */
public class Test {
    public static void main(String[] args) {
        
        EmpleadoAsalariado emp1 = new EmpleadoAsalariado("PCP123", "PASCAL", 1_000_000);
        EmpleadoAsalariado emp2 = new EmpleadoAsalariado("NB123", "NICO", 2_000_000);
        Departamento depto1 = new Departamento("IT667", "Departamento Tecnologia");
        
        depto1.agregarEmpleado(emp2);
        depto1.agregarEmpleado(emp1);
        
        List<BonusCalculable> bonus = new ArrayList<>();
        bonus.add(emp2);
        bonus.add(emp1);
        for (BonusCalculable bonu : bonus ) {
            System.out.println(bonu.calcularBonus());
        }

        System.out.println("Costo total de salarios departamento: " + depto1.getIdDepto()+ " \n$" + depto1.calcularCostoSalarios());
    }
}
