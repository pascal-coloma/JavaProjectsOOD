/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author colom
 */
public class Sistema {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("12345678", "Enzo Botto", "190584283", "Avanzado", "Musica", 6.2f);
        Apoderado apoderado1 = new Apoderado("Nico Botto", "200120982", "12345678", "PAC", 1, 150_000, alumno1);
        
        System.out.println(apoderado1.mostrarDatos());
        apoderado1.validarID();
        System.out.println(apoderado1.totalPago());
        System.out.println(apoderado1.obtenerDescuento());
        
    }
}
