
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author colom
 */
public class Hotel {
    
    private String idHotel, nombreHotel;
    private ArrayList<Habitacion> habitDispo;

    public Hotel() {
        this.habitDispo = new ArrayList<>();
    }

    public Hotel(String idHotel, String nombreHotel) {
        this.idHotel = idHotel;
        this.nombreHotel = nombreHotel;
    }

    public String getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(String idHotel) {
        this.idHotel = idHotel;
    }

    public String getNombreHotel() {
        return nombreHotel;
    }

    public void setNombreHotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
    }

    public ArrayList<Habitacion> getHabitDispo() {
        return habitDispo;
    }

    public void setHabitDispo(ArrayList<Habitacion> habitDispo) {
        this.habitDispo = habitDispo;
    }
    
    public void aniadirHabitacion(Habitacion habitacion){
        habitDispo.add(habitacion);
    }

    @Override
    public String toString() {
        return "Hotel{" + "idHotel=" + idHotel + ", nombreHotel=" + nombreHotel + ", habitDispo=" + habitDispo + '}';
    }
    
    
}
