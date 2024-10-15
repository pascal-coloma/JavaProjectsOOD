/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author colom
 */
public class Resta extends Operacion {

    public Resta(int valor1, int valor2) {
        super(valor1, valor2);
    }

    
    @Override
    public void operar() {
        resultado = valor1 - valor2;
    }
    
}
