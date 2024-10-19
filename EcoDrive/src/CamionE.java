/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author colom
 */
public class CamionE extends Vehiculo implements PilotoAutomatico {

    public CamionE() {
    }

    public CamionE(String marca, String modelo, int bateria) {
        super(marca, modelo, bateria);
    }
    
  
    @Override
    public void arrancar() {
    }

    @Override
    public void frenar() {
    }

    @Override
    public void activarPiloto() {
        System.out.println("Piloto automatico activado");
    }
    
}
