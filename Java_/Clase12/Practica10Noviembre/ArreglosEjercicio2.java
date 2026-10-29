/*
Ejercicio 2: Leer por teclado dos tablas de 10 numeros enteros y mezclarlas en
una tercera tabla de la forma: el primero de A, el primero de B, el segundo de A,
el segundo de B, etc.
*/
package Clase12.Practica10Noviembre;

import java.util.Scanner;

public class ArreglosEjercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a[] = new int[10];
        int b[] = new int[10];
        int c[] = new int[20]; // A + B = 10 + 10

        // Leemos la tabla A
        System.out.println("TABLA A");
        for (int i = 0; i < a.length; i++) {
            System.out.println("A[" + i + "]: ");
            a[i] = Integer.parseInt(entrada.nextLine());
        }

        // Leemos la tabla B
        System.out.println("TABLA B");
        for (int i = 0; i < b.length; i++) {
            System.out.println("B[" + i + "]: ");
            b[i] = Integer.parseInt(entrada.nextLine());
        }

        // Mezclamos en C
        // Posiciones pares seran A y posiciones impares seran B
        for (int i = 0; i < 10; i++) {
            c[2 * i] = a[i]; // posición par
            c[2 * i + 1] = b[i]; // posición impar
        }

        // Mostramos el resultado
        System.out.println("\nTABLA C");
        for (int i = 0; i < c.length; i++) {
            System.out.println("C[" + i + "]: " + c[i]);
        }

        entrada.close();
    }
}
