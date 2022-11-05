package com.company;

public class ExamenParcial extends  Examen{

   private int nroUnidad;
   private int nroIntentos;

    public ExamenParcial() {
        super();
    }

    public ExamenParcial(String titulo, String enunciado, Alumno alumno, int nroUnidad) {
        super(titulo, enunciado, alumno);
        this.nroUnidad=nroUnidad;
    }

    public boolean puedeRecuperar()
    {
        if( nroUnidad<=3 &&nroIntentos<3)
            return true;
        if(nroUnidad>3&&nroIntentos<2)
            return true;
        return false;
    }
    public void recuperar()
    {
        nroIntentos++;
    }
    @Override
    public boolean estaAprobado() {
        return getNota()>=4;
    }

    @Override
    public String toString() {
        return super.toString() + "ExamenParcial{" +
                "nroUnidad=" + nroUnidad +
                '}';
    }
}
