package com.company;

public abstract class Examen {

    private String titulo;
    private String enunciado;
    private double nota;
    private Alumno alumno;

    public Examen() {
    }

    public Examen(String titulo, String enunciado, Alumno alumno)
    {
        this.titulo=titulo;
        this.enunciado=enunciado;
        this.alumno=alumno;
    }

    public abstract boolean estaAprobado();

    public void setNota(double nota) {
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return "Examen{" +
                "titulo='" + titulo + '\'' +
                ", nota=" + nota +
                '}' + " Alumno: " +alumno.toString();
    }
}
