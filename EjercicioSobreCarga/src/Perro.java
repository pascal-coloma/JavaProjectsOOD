/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author colom
 */
public class Perro extends Animal {

    public Perro() {
    }

    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra: Guau!");
    }

    public void hacerSonido(int veces) {

        for (int i = 0; i < veces; i++) {
            System.out.println("Guau!");
        }
    }
    
}
