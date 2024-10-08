/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author colom
 */
public class Sumar extends Operar {

    public Sumar(int numero1, int numero2) {
        super(numero1, numero2);
    }
    
    @Override
    public int operar(){
        resultado = numero1 + numero2;
        return resultado;
    }
}
