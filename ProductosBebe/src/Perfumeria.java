/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author colom
 */
public class Perfumeria extends Productos {

    public int ml;
    public String aroma;

    public Perfumeria(int codigo, String nombreProd, String descripProd, double precio) {
        super(codigo, nombreProd, descripProd, precio);
    }

    public int getMl() {
        return ml;
    }

    public void setMl(int ml) {
        this.ml = ml;
    }

    public String getAroma() {
        return aroma;
    }

    public void setAroma(String aroma) {
        if (aroma.equalsIgnoreCase("V") || (aroma.equalsIgnoreCase("F")) || (aroma.equalsIgnoreCase("L"))) {
            this.aroma = aroma;
        } else {
            System.out.println("Debe ser de tipo (V)ainilla, (F)rutilla, (L)imon");
        }
    }

    @Override
    public String mostrarDatos() {
        return "Cantidad: + \n" + ml + "ML" + "Aroma: " + aroma;
    }

    @Override
    public void contarProducto() {
    }

}
