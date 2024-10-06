/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author colom
 */
import java.awt.BorderLayout;
import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        Sede sede1 = new Sede(1320, "Chorrillos", "Vinna del Mar");
        Estudiante estudiante1 = new Estudiante("Pascal", 19058428, 18, "14-AUG-1995");
        Docente docente1 = new Docente("John Doe", 20012098, 1556, "20-MAR-2024", sede1);
        Asignatura asignatura1 = new Asignatura(1002, "Java", docente1, estudiante1, 4.3f, 4.3f, 4.9f);
        
        int opc;
        
        do {
            System.out.println("SISTEMA DE NOTAS");
            System.out.println("***************************");
            System.out.println("Ingrese opcion ");
            System.out.println("(1) Calcular nota de presentacion");
            System.out.println("(2) Revisar estado de eximicion");
            System.out.println("(3) Revisar nota de examen");
            System.out.println("(4) Mostrar datos");
            System.out.println("(5) SALIR");
            opc = teclado.nextInt();
            switch (opc) {
                case 1 -> System.out.println("Nota presentacion: " + asignatura1.notaPresentacion());
                case 2 -> asignatura1.calculoEximicion();
                case 3 -> asignatura1.notaExamen();
                case 4 -> System.out.println(asignatura1.mostrarDatos());
                
                default -> {
                    System.out.println("Saliendo..");
                }
            }
            
            
        } while (opc != 5);
        
        
    }
    
    
    
}
