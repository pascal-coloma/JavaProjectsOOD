/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author colom
 */
public class Alimentos extends Productos {
    
    public int pesoGramos;
    public String tipo;
    
    public Alimentos(int codigo, String nombreProd, String descripProd, double precio) {
        super(codigo, nombreProd, descripProd, precio);
    }

    public int getPesoGramos() {
        return pesoGramos;
    }

    public void setPesoGramos(int pesoGramos) {
        this.pesoGramos = pesoGramos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo.equals('L') || (tipo.equals('C'))) {
            this.tipo = tipo;
        } else {
            System.out.println("Producto debe ser (L)eche o (C)olado");
        }

    }

    @Override
    public String mostrarDatos(){
        return "Peso:  " + pesoGramos + "Tipo: " + tipo;
    }
    @Override
    public void contarProducto() {
    }
    
}
