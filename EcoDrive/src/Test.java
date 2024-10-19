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
        
        CamionE camion1 = new CamionE("Mercedes Benz", "AX120", 100);
        AutoE auto1 = new AutoE("Mazda", "Mazda 3", 80);
        
        camion1.cargarBateria();
        auto1.cargarBateria();
    }   
}
