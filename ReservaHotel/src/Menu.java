
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author colom
 */
public class Menu {
    Scanner teclado = new Scanner(System.in);
    
    private Reserva reserva;
    private Cliente cliente;
    private Hotel hotel;
    
    private int opc;
    
    public void menu(int opc){
        
        int ultOpc = 5;
        do {            
            System.out.println("1. Aniadir habitaciones");
            System.out.println("2. Realizar reserva");
            System.out.println("3. Registrar cliente");
            System.out.println("4. Mostrar reservas ");
            System.out.println("5. Salir");
            System.out.println("Ingrese su opcion: ");
            opc = teclado.nextInt();
            switch (opc) {
                case 2:
                    cliente.asignarReserva(reserva);
                    break;
                default:
                    throw new AssertionError();
            }
        } while (opc != ultOpc);
    }
}
