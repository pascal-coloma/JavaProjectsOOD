/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author colom
 */
public class Apoderado {
    
    private String nombreApod, runApod, idApod, formaPago;
    private int pupilos, totalPagar;
    private Alumno alumno;

    public Apoderado() {
    }

    public Apoderado(String nombreApod, String runApod, String idApod, String formaPago, int pupilos, int totalPagar, Alumno alumno) {
        setNombreApod(nombreApod);
        this.runApod = runApod;
        setIdApod(idApod);
        this.formaPago = formaPago;
        setPupilos(pupilos);
        this.totalPagar = totalPagar;
        this.alumno = alumno;
    }

    public String getNombreApod() {
        return nombreApod;
    }

    public void setNombreApod(String nombreApod) {
        if (nombreApod.length() >= 3) {
            this.nombreApod = nombreApod;
        } else {
            System.out.println("Nombre apoderado debe tener minimo 3 caracteres");
        }
        
    }

    public String getRunApod() {
        return runApod;
    }

    public void setRunApod(String runApod) {
        this.runApod = runApod;
    }

    public String getIdApod() {
        return idApod;
    }

    public void setIdApod(String idApod) {
        if (idApod.length()>= 8) {
            this.idApod = idApod;
        } else {
            System.out.println("ID apoderado debe tener minimo 8 digitos");
        }
        
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public int getPupilos() {
        return pupilos;
    }

    public void setPupilos(int pupilos) {
        if (pupilos >= 1 && pupilos < 8) {
            this.pupilos = pupilos;
        } else {
            System.out.println("Cantidad de pupilos no admitida");
        }
        
    }

    public int getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(int totalPagar) {
        this.totalPagar = totalPagar;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

 

    public String mostrarDatos() {
        return "Apoderado: \nNombre: " + nombreApod + "\nRUN: " + runApod + "\nID: " + idApod + "\nForma de pago: " + formaPago + "\nPupilos: " + pupilos + "\nTotal a pagar: " + totalPagar + "\nAlumno: " + alumno;
    }
    
    public void validarID(){
        if (alumno.getIdAlumno().equalsIgnoreCase(idApod)) {
            System.out.println("Las ID's coinciden.");
        } else {
            System.out.println("ID's no coinciden.");
        }
    }
    
    public float obtenerDescuento(){
        float descuento = 0;
        
        if (this.pupilos > 1){
            descuento = 0.05f;
        }
        if (this.formaPago.equalsIgnoreCase("PAC")) {
            descuento += 0.10f;
        } else if (this.formaPago.equalsIgnoreCase("Cheque")) {
            descuento += 0.05f;
        }
        return descuento;
    }
    
    public int totalPago(){
        int totalPago;
        float descuento;
        
        descuento = obtenerDescuento();
        totalPago = ((this.totalPagar * pupilos) * 10);
        
        
        return totalPago;
    }
    
}
