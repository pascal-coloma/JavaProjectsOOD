/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author colom
 */
public abstract class Crucero implements Cotizacion{
    
    protected String idCrucero, nombre, destino;
    protected int diasDuracion, numPasajeros;
    protected int costoDiario;
    protected String tipoCrucero;
    
    public Crucero(){
    
    }

    public Crucero(String idCrucero, String nombre, String destino, int diasDuracion, int numPasajeros) {
        this.idCrucero = idCrucero;
        this.nombre = nombre;
        this.destino = destino;
        this.diasDuracion = diasDuracion;
        this.numPasajeros = numPasajeros;
        this.costoDiario = VALOR_BASE_DAY;
    }
    
    
    public String getIdCrucero() {
        return idCrucero;
    }

    public void setIdCrucero(String idCrucero) {
        this.idCrucero = idCrucero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getDiasDuracion() {
        return diasDuracion;
    }

    public void setDiasDuracion(int diasDuracion) {
        this.diasDuracion = diasDuracion;
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    public String getTipoCrucero() {
        return tipoCrucero;
    }

    public void setTipoCrucero(String tipoCrucero) {
        this.tipoCrucero = tipoCrucero;
    }
    
    public String mostrarDatos() {
        return "ID Crucero: " + idCrucero + "\nNombre: " + nombre + "\nDestino: " + destino + "\nDias Duracion: " + diasDuracion + "\nNumero Pax: " + numPasajeros + "\nTipo crucero: " + tipoCrucero;
    }

    @Override
    public float calcularValorFinal() {
        return diasDuracion * costoDiario;
    }

    
    
    
    
}
