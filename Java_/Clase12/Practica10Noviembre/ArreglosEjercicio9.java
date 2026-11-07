/*
Ejercicio 9: Crear una matriz "marco" de tamaño 5x5. Todos sus elementos deben
ser 0 salvo los bordes que deben ser 1. Mostrarla.
*/
package Clase12.Practica10Noviembre;

public class ArreglosEjercicio9 {
    public static void main(String[] args) {
        int matriz[][] = new int[5][5];
        
        // Cargamos la matriz con el patrón "marco"
        // Borde = 1, interior = 0
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == 4 || j == 0 || j == 4) {
                    // Si estamos en la primera/última fila/columna es BORDE
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }
        
        // Mostramos la matriz
        System.out.println("MATRIZ MARCO");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t"); // tabulador para alinear
            }
            System.out.println(); // salto de línea al terminar cada fila
        }
    }
}
