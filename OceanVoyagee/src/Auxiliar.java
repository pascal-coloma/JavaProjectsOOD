
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author colom
 */
public class Auxiliar {

    ArrayList<Crucero> listaCruceros;

    public Auxiliar() {
        listaCruceros = new ArrayList<>();
    }

    public boolean agregarCrucero(Crucero nuevoCrucero) {

        String nuevaId = nuevoCrucero.getIdCrucero();
        for (Crucero crucero : listaCruceros) {
            if (crucero.getIdCrucero().equals(nuevaId)) {
                System.out.println("La ID ya se encuentra registrada");
                return false;
            }
        }
        listaCruceros.add(nuevoCrucero);
        System.out.println("Crucero con ID " + nuevoCrucero.getIdCrucero() + " agregado");
        return true;

    }

    public void listarCruceros() {
        System.out.println("****************************");
        for (Crucero crucero : listaCruceros) {
            System.out.println(crucero.mostrarDatos());
            System.out.println("****************************");
        }
    }

    public void totalCruceros() {
        
        if (listaCruceros.size() < 1) {
            System.out.println("No existen registros");
        } else {
            System.out.println("Cantidad de cruceros registrados: " + listaCruceros.size());
        }

    }

    public void filtrarPorTipo(String tipo){
        for (Crucero crucero : listaCruceros) {
            if (tipo.equalsIgnoreCase(crucero.getTipoCrucero())) {
                System.out.println(crucero.mostrarDatos());
            }
        }
    
    }
    
}
