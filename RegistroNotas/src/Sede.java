/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author colom
 */
public class Sede {
    
    private int nroSede;
    private String nombreSede, comuna;

    public Sede() {
    }

    
    public Sede(int nroSede, String nombreSede, String comuna) {
        this.nroSede = nroSede;
        this.nombreSede = nombreSede;
        this.comuna = comuna;
    }

    public int getNroSede() {
        return nroSede;
    }

    public void setNroSede(int nroSede) {
        this.nroSede = nroSede;
    }

    public String getNombreSede() {
        return nombreSede;
    }

    public void setNombreSede(String nombreSede) {
        this.nombreSede = nombreSede;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    @Override
    public String toString() {
        return "Sede{" + "nroSede=" + nroSede + ", nombreSede=" + nombreSede + ", comuna=" + comuna + '}';
    }
    
    
    
}
