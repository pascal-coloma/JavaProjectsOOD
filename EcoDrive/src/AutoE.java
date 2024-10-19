/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author colom
 */
public class AutoE extends Vehiculo {
    
    public AutoE() {
    }
    
    public AutoE(String marca, String modelo, int bateria) {
        super(marca, modelo, bateria);
    }
    
    @Override
    public void arrancar() {
        System.out.println("El vehiculo: " + marca + " modelo: " + modelo + " esta andando ");
    }
   
    @Override
    public void frenar(){
        System.out.println("El vehiculo: " + marca + " modelo: " + modelo + " esta andando ");

    };

    
}
