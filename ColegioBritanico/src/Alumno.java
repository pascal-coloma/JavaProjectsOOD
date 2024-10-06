/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author colom
 */
public class Alumno {
    private String idAlumno, nombreAlumno, runAlumno, nivelIngles, taller;
    private float promNotas;

    public Alumno() {
    }

    public Alumno(String idAlumno, String nombreAlumno, String runAlumno, String nivelIngles, String taller, float promNotas) {
        setIdAlumno(idAlumno);
        setNombreAlumno(nombreAlumno);
        this.runAlumno = runAlumno;
        this.nivelIngles = nivelIngles;
        this.taller = taller;
        this.promNotas = promNotas;
    }

    public String getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(String idAlumno) {
        if (idAlumno.length()>= 8) {
            this.idAlumno = idAlumno;
        } else {
            System.out.println("ID alumno debe tener minimo 8 digitos");
        }
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        if (nombreAlumno.length() >= 3) {
            this.nombreAlumno = nombreAlumno;
        } else {
            System.out.println("Nombre alumno debe tener minimo 3 caracteres");
        }
    }

    public String getRunAlumno() {
        return runAlumno;
    }

    public void setRunAlumno(String runAlumno) {
        this.runAlumno = runAlumno;
    }

    public String getNivelIngles() {
        return nivelIngles;
    }

    public void setNivelIngles(String nivelIngles) {
        this.nivelIngles = nivelIngles;
    }

    public String getTaller() {
        return taller;
    }

    public void setTaller(String taller) {
        this.taller = taller;
    }

    public float getPromNotas() {
        return promNotas;
    }

    public void setPromNotas(float promNotas) {
        this.promNotas = promNotas;
    }

    @Override
    public String toString() {
        return "\nID:" + idAlumno + "\nNombre alumno: " + nombreAlumno + "\nRUN: " + runAlumno + "\nNivel de Ingles: " + nivelIngles + "\nTaller: " + taller + "\nPromedio de notas: " + promNotas;
    }
    
    
}
