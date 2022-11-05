package com.company;

public class ExamenFinal  extends  Examen implements  Comparable<ExamenFinal>{
    private double notaOral;
    private String descripcion;

    public ExamenFinal(String titulo, String enunciado, Alumno alumno, String descripcion) {
        super(titulo, enunciado, alumno);
        this.descripcion = descripcion;
    }

    public double promedio()
    {
        return (getNota()+notaOral)/2;
    }
    @Override
    public boolean estaAprobado() {

        return getNota()>=4 && notaOral>=4;
    }

    @Override
    public int compareTo(ExamenFinal examenFinal) {
        return (int)(this.promedio()- examenFinal.promedio());
    }

    public void setNotaOral(double notaOral) {
        this.notaOral = notaOral;
    }

    @Override
    public String toString() {
        return "Examen:  " + super.toString() + " ExamenFinal{" +
                "notaOral=" + notaOral +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
    /*
    positivo   obj1>obj2
    negativo    obj2>obj1
    0
    obj1.compareTo(obj2)

     */

}
