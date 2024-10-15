/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author colom
 */
public abstract class Operacion {
    
    protected int valor1, valor2, resultado;
    
    public Operacion(int valor1, int valor2){
        this.valor1 = valor1;
        this.valor2 = valor2;
    }
    
    public void imprimir(){
        System.out.println("RESULTADO: " + resultado);
    }
    
    public abstract void operar();
}
