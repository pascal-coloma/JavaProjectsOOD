/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author colom
 */
public abstract class Productos implements Calculable {
    
    protected int codigo;
    protected String nombreProd, descripProd;
    protected double precio;

    public Productos(int codigo, String nombreProd, String descripProd, double precio) {
        this.codigo = codigo;
        setNombreProd(nombreProd);
        this.descripProd = descripProd;
        setPrecio(precio);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombreProd() {
        return nombreProd;
    }

    public void setNombreProd(String nombreProd) {
        if (nombreProd.isBlank()) {
            System.out.println("El nombre no debe estar vacio");
        } else {
            this.nombreProd = nombreProd;
        } 
    }

    public String getDescripProd() {
        return descripProd;
    }

    public void setDescripProd(String descripProd) {
        this.descripProd = descripProd;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio > 0) {
            this.precio = precio;
        } else{
            System.out.println("El precio debe ser mayor a cero");
        }
        
    }

    public String mostrarDatos() {
        return "Producto: \nCodigo: " + codigo + "\nNombre: " + nombreProd + "\nDescripcion: " + descripProd + "\nPrecio: " + precio;
    }
    
    public abstract void contarProducto();
    
    @Override
    public void calcularPrecioFinal() {
        
    }
          
}
