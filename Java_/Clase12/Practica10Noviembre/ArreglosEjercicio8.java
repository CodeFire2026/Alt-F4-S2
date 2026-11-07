/*
Ejercicio 8: Utilizando dos matrices de tamaño 5x9 y 9x5, cargar la primera y
transponerla en la segunda
*/
package Clase12.Practica10Noviembre;

import java.util.Scanner;

public class ArreglosEjercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a[][] = new int[5][9]; // matriz original
        int b[][] = new int[9][5]; // matriz transpuesta
        
        // Cargamos la matriz A (5x9 = 45 números)
        System.out.println("CARGANDO MATRIZ A (5x9)");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.println("A[" + i + "][" + j + "]: ");
                a[i][j] = Integer.parseInt(entrada.nextLine());
            }
        }
        entrada.close();
        
        // Transponemos A en B
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                b[j][i] = a[i][j]; // fila y columna se intercambian
            }
        }
        
        // Mostramos la matriz A
        System.out.println("\nMATRIZ A");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(a[i][j] + "\t"); // \t = tabulador, alinea columnas
            }
            System.out.println(); // salto de línea al terminar cada fila
        }
        
        // Mostramos la matriz B
        System.out.println("\nMATRIZ B");
        for (int i = 0; i < 9; i++) { // B tiene 9 filas
            for (int j = 0; j < 5; j++) { // 5 columnas
                System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
