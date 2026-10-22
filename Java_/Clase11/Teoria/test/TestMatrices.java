package Clase11.Teoria.test;

import Clase11.Teoria.domain.Persona;

public class TestMatrices {
    public static void main(String[] args) {
        int edades[][] = new int[3][2];
        System.out.println("edades matriz = " + edades);

        edades[0][0] = 5; // llenado manual
        edades[0][1] = 7; // columna distinta
        edades[1][0] = 8;
        edades[1][1] = 4;
        edades[2][0] = 9;
        edades[2][1] = 2;

        System.out.println("edades 0-0: " + edades[0][0]);
        System.out.println("edades 0-1: " + edades[0][1]);
        System.out.println("edades 1-0: " + edades[1][0]);
        System.out.println("edades 1-1: " + edades[1][1]);
        System.out.println("edades 2-0: " + edades[2][0]);
        System.out.println("edades 2-1: " + edades[2][1]);

        System.out.println("Recorriendo matriz con for");
        for (int fila = 0; fila < edades.length; fila++) {
            for (int col = 0; col < edades[fila].length; col++) {
                System.out.println("Edades[" + fila + "][" + col + "] = " + edades[fila][col]);
            }
        }

        // Sintaxis clasica
        // String frutas[][] = new String[3][2];

        // Sintaxis simplificada
        String frutas[][] = { { "Limon", "Pomelo" }, { "Ciruela", "Kiwi" }, { "Banana", "Manzana" } };
        for (int i = 0; i < frutas.length; i++) {
            for (int j = 0; j < frutas[i].length; j++) {
                System.out.println("fruta " + i + "-" + j + " = " + frutas[i][j]);
            }
        }

        // Creamos una matriz de objetos
        Persona personas[][] = new Persona[2][3];
        // Asignamos manualmente
        personas[0][0] = new Persona("Leonel");
        personas[0][1] = new Persona("Cristian");
        personas[0][2] = new Persona("Abel");
        personas[1][0] = new Persona("Joel");
        personas[1][1] = new Persona("Manu");
        personas[1][2] = new Persona("Natalia");

        // Probando imprimir()
        imprimir(frutas);
        imprimir(personas);
    }

    public static void imprimir(Object matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Matriz " + i + "-" + j + " = " + matriz[i][j]);
            }
        }
    }
}
