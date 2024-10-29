/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author colom
 */
public class ConsolaPortatil extends Consola {

    public int autonomiaBateria;
    public float dsctoPortatil;
    
    public ConsolaPortatil() {
    }

    public ConsolaPortatil(int autonomiaBateria, float dsctoPortatil, String marca, String modelo, double precio) {
        super(marca, modelo, precio);
        this.autonomiaBateria = autonomiaBateria;
        this.dsctoPortatil = dsctoPortatil;
    }  

    public int getAutonomiaBateria() {
        return autonomiaBateria;
    }

    public void setAutonomiaBateria(int autonomiaBateria) {
        this.autonomiaBateria = autonomiaBateria;
    }

    public double getDsctoPortatil() {
        return dsctoPortatil;
    }

    public void setDsctoPortatil(float dsctoPortatil) {
        this.dsctoPortatil = dsctoPortatil;
    }

    @Override
    String tipoConsola() {
        return "Clasificacion : Portátil";
    }

    @Override
    public double calcularPrecioFinal() {
        double dsctoTipo = precio * dsctoPortatil;
        double dineroIVA = precio * super.IVA;
        
        double precioFinal = (precio - dsctoTipo) + dineroIVA;

        return precioFinal;
    }

    @Override
    public String toString() {
        return super.toString() + "\nConsola Portatil \nAutonomia Bateria: " + autonomiaBateria + " horas \nDescuento: " + (dsctoPortatil) * 100 + "%";
    }

    
    
    
    
}
