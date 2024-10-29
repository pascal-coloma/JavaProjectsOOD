/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author colom
 */
public class cruceFamiliar extends Crucero {

    public cruceFamiliar() {
    }

    public cruceFamiliar(String idCrucero, String nombre, String destino, int diasDuracion, int numPasajeros) {
        super(idCrucero, nombre, destino, diasDuracion, numPasajeros);
        super.tipoCrucero = "Familiar";
    }

    @Override
    public String getIdCrucero() {
        return idCrucero;
    }

    @Override
    public void setIdCrucero(String idCrucero) {
        this.idCrucero = idCrucero;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getDestino() {
        return destino;
    }

    @Override
    public void setDestino(String destino) {
        this.destino = destino;
    }

    @Override
    public int getDiasDuracion() {
        return diasDuracion;
    }

    @Override
    public void setDiasDuracion(int diasDuracion) {
        this.diasDuracion = diasDuracion;
    }

    @Override
    public int getNumPasajeros() {
        return numPasajeros;
    }

    @Override
    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    public int getCostoDiario() {
        return costoDiario;
    }

    public void setCostoDiario(int costoDiario) {
        this.costoDiario = costoDiario;
    }
    
    @Override
    public float calcularValorFinal() {
        float recargo;
        float valorFinal = super.calcularValorFinal();
        float recargoDinero;
        
        if (numPasajeros > 200) {
            recargo = 0.08f;
            recargoDinero = valorFinal * recargo;
            valorFinal += recargoDinero;
        }
        return valorFinal;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos(); 
    }

    
    
    
    

    
    
    
    
    
    
}
