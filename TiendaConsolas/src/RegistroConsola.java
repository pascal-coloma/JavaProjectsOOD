
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author colom
 */
public class RegistroConsola {

    Scanner teclado = new Scanner(System.in);

    public ArrayList<Consola> listaConsolas;

    public RegistroConsola() {
        listaConsolas = new ArrayList<>();
    }

    public boolean buscarConsola(String modelo) {
        for (Consola consola : listaConsolas) {
            if (modelo.equalsIgnoreCase(consola.getModelo())) {
                System.out.println("El modelo " + modelo + " ya existe");
                return true;
            }
        }
        return false;
    }

    public void agregarConsola(Consola consola) {
        System.out.println("Agregando consola");
        if (buscarConsola(consola.getModelo())) {
            System.out.println("Consola no agregada");
        } else {
            listaConsolas.add(consola);
            System.out.println("Consola " + consola.getModelo() + " agregada.");
            
        }
    }

    public void listarConsolas() {
        if (listaConsolas.isEmpty()) {
            System.out.println("Lista vacia");
        } else {
            for (Consola consola : listaConsolas) {
                System.out.println(consola.toString());
            }
        }

    }

    public void eliminarConsola(String modelo) {
        for (Consola consola : listaConsolas) {
            if (consola.getModelo().equalsIgnoreCase(modelo)) {
                listaConsolas.remove(consola);
                System.out.println("Consola eliminada");
                break;
            }
        }
    }
    
    public void consolasValiosas(double precio){
        int cantidadCaras = 0;
        for (Consola consola : listaConsolas) {
            if (consola.getPrecio() > precio) {
                cantidadCaras += 1;
                System.out.println("Existen " + cantidadCaras + " consolas con precio mayor a " + precio);
            }
        }
    }
    
    public void clasificacionConsolas(){
        int cantPortatil = 0;
        int cantSobremesa = 0;
        
        for (Consola consola : listaConsolas) {
            if (consola instanceof ConsolaPortatil) {
                cantPortatil++;
            } else {
                cantSobremesa += 1;
            }
        }
        System.out.println("Hay " + cantPortatil + " consolas portatiles");
        if (cantSobremesa != 0) {
            System.out.println("Hay " + cantSobremesa + " consolas de sobremesa");
        }
        
        
    
    }
    
    
    
    
}
