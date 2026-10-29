/*
Ejercicio 5: Leer 10 enteros en una tabla. Guardar en otra tabla los elementos
pares, y a continuación los elementos impares.
*/
package Clase12.Practica10Noviembre;

import java.util.Scanner;

public class ArreglosEjercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int original[] = new int[10];
        int resultado[] = new int[10]; // misma cantidad total: 10
        int posicion = 0; // índice para ir llenando la tabla resultado
        
        // Leemos los 10 números
        System.out.println("Digite 10 números enteros:");
        for (int i = 0; i < original.length; i++) {
            System.out.println("Número " + (i + 1) + ": ");
            original[i] = Integer.parseInt(entrada.nextLine());
        }
        entrada.close();
        
        // Copiamos los PARES
        for (int i = 0; i < original.length; i++) {
            if (original[i] % 2 == 0) {
                resultado[posicion] = original[i];
                posicion++;
            }
        }
        
        // Copiamos los IMPARES
        for (int i = 0; i < original.length; i++) {
            if (original[i] % 2 != 0) {
                resultado[posicion] = original[i];
                posicion++;
            }
        }
        
        // Mostramos las dos tablas
        System.out.println("\nTabla original:");
        for (int i = 0; i < original.length; i++) {
            System.out.println("original[" + i + "]: " + original[i]);
        }
        
        System.out.println("\nTabla resultado:");
        for (int i = 0; i < resultado.length; i++) {
            System.out.println("resultado[" + i + "]: " + resultado[i]);
        }
    }
}
