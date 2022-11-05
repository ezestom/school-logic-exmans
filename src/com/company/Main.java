package com.company;

public class Main {

    public static void main(String[] args) {

        Alumno alumno= new Alumno("Juan", "Perez","111");
        Examen examenParcial=new ExamenParcial("Parcial","aaaa",alumno,2);
        ExamenFinal examenFinal1= new ExamenFinal("Final", "aaa", alumno,"aaaa");
        ExamenFinal examenFinal2= new ExamenFinal("Final", "aaa", alumno,"aaaa");
        examenFinal1.setNota(5);
        examenFinal1.setNotaOral(6);
        examenFinal2.setNota(8);
        examenFinal2.setNotaOral(9);

        if (examenFinal1.compareTo(examenFinal2)>0)
            System.out.println("Examen 1 mayor");
        if (examenFinal1.compareTo(examenFinal2)<0)
            System.out.println("Examen 2 mayor");
        if (examenFinal1.compareTo(examenFinal2)==0)
            System.out.println("Son iguales");
    }
}
