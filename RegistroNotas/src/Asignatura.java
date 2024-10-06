/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author colom
 */

import java.util.Scanner;

public class Asignatura {
    Scanner teclado = new Scanner(System.in);
    private int nroAsignatura;
    private String nombreAsignatura;
    private Docente docente;
    private Estudiante estudiante;
    private float nota1, nota2, nota3;

    public Asignatura() {
    }

    public Asignatura(int nroAsignatura, String nombreAsignatura, Docente docente, Estudiante estudiante, float nota1, float nota2, float nota3) {
        this.nroAsignatura = nroAsignatura;
        this.nombreAsignatura = nombreAsignatura;
        this.docente = docente;
        this.estudiante = estudiante;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public int getNroAsignatura() {
        return nroAsignatura;
    }

    public void setNroAsignatura(int nroAsignatura) {
        this.nroAsignatura = nroAsignatura;
    }

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    public String mostrarDatos() {
        return "Asignatura: \nNumero: " + nroAsignatura + "\nNombre: " + nombreAsignatura + "\nDocente: " + docente + ", estudiante=" + estudiante + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + '}';
    }
    
    public float notaPresentacion(){
        float ponde1 = 30.0f;
        float ponde2 = 30.0f;
        float ponde3 = 30.0f;

        float promedio = (nota1 * ponde1 + nota2 * ponde2 + nota3 * ponde3) / (ponde1 + ponde2 + ponde3);

        return promedio;
    
    }
    
    public void calculoEximicion(){
        float promedio = notaPresentacion();
        if (promedio >= 5.0f) {
            System.out.println("El estudiante esta eximido");
        } else {
            System.out.println("No eximido");
        }
    }
    
    public float notaExamen(){
        float notaEx;
        float notaIngr;
        
        System.out.println("Ingrese nota de examen: ");
        notaIngr = teclado.nextFloat();
        notaEx = (notaPresentacion() * 60.0f + notaIngr * 40.0f) / (60.0f + 40.0f);
        if (notaEx >= 4.0f) {
            System.out.println("Aprobado con nota: " + notaEx);
        } else {
            System.out.println("Reprobado con nota: " + notaEx);
        }
        
        return notaEx;
        
    }
    
    

    
}

