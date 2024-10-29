/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author colom
 */
public class ConsolaSobremesa extends Consola {

    public int numeroDeControles;
    public float dsctoSobremesa = .10f;

    public ConsolaSobremesa() {
    }

    public ConsolaSobremesa(String marca, String modelo, double precio, int numeroDeControles) {
        super(marca, modelo, precio);
        this.numeroDeControles = numeroDeControles;
        
    }

    public int getNumeroDeControles() {
        return numeroDeControles;
    }

    public void setNumeroDeControles(int numeroDeControles) {
        this.numeroDeControles = numeroDeControles;
    }

    public double getDsctoSobremesa() {
        return dsctoSobremesa;
    }

    public void setDsctoSobremesa(float dsctoSobremesa) {
        this.dsctoSobremesa = dsctoSobremesa;
    }

    @Override
    String tipoConsola() {
        return "Clasificación: Sobremesa";
    }

    @Override
    public double calcularPrecioFinal() {

        double dsctoTotal = dsctoSobremesa + super.IVA;
        double dsctoDinero = precio * dsctoTotal;
        double precioFinal = precio - dsctoDinero;

        return precioFinal;
    }
}


