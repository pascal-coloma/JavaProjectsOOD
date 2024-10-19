
import java.util.Timer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author colom
 */
public abstract class Vehiculo implements InterVehiculo {
    Timer t = new Timer();
    protected String marca, modelo;
    protected int bateria;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int bateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }
    
    public void cargarBateria() {
        if (bateria == 100) {
            System.out.println("No es necesario cargar la bateria");
        } else {
            System.out.println("Cargando bateria");
            do {
                System.out.println("Bateria en: " + bateria + "%");
                bateria ++;
            } while (bateria < 100);
            System.out.println("Bateria cargada al 100%");
        }
    }

    @Override
    public abstract void arrancar();
    
    @Override
    public abstract void frenar();
           
}
