
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author colom
 */
public class JuegoDados implements Juego {
    
    private int dado1, dado2;
    private String j1, j2;
    Scanner teclado = new Scanner(System.in);
    
    @Override
    public void iniciar(){
        System.out.println("INGRESE NOMBRE: ");
        j1 = teclado.nextLine();
        System.out.println("INGRESE NOMBRE: ");
        j2 = teclado.nextLine();
    }
    
    @Override
    public void jugar(){
        dado1 = 1 + (int) (Math.random() * 6);
        dado2 = 1 + (int) (Math.random() * 6);
        
    }
    
    @Override
    public void finalizar(){
        if (dado1 > dado2) {
            System.out.println("GANO " + j1 + " CON UN VALOR DE " + dado1 + " UN PREMIO DE $" + MONTO_PREMIO);
        } else if (dado2> dado1){
            System.out.println("GANO " + j2 + " CON UN VALOR DE " + dado2 + " UN PREMIO DE $" + MONTO_PREMIO);
        } else {
            System.out.println("EMPATE");
        }
    }
    
}
