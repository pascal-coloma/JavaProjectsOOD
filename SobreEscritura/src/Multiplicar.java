/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author colom
 */
public class Multiplicar extends Operar{

    public Multiplicar(int numero1, int numero2) {
        super(numero1, numero2);
    }
    
    //metodo1
    public int multiplicar(){
        resultado = numero1 * numero2;
        return resultado;
    }
    
    //metodo2
    public float multiplicar(float numero1, float numero2){
        float resultado = numero1 * numero2;
        return resultado;
    }
    
}
