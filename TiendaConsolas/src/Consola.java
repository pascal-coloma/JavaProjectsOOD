/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author colom
 */
public abstract class Consola implements ICalculable{
    
    protected String marca, modelo;
    protected double precio;
    protected final double IVA = .19f;
    
    public Consola() {
    }

    public Consola(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    abstract String tipoConsola();

    @Override
    public String toString() {
        return "Consola \nMarca: " + marca + "\nModelo: " + modelo + "\nPrecio: " + precio;
    }
    
    
    
    

}
