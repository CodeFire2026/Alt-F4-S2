/*
Ejercicio 7: Leer 10 enteros ordenados crecientemente. Leer N y buscarlo en la
tabla. Se debe mostrar la posición en la que se encuentra. Si no está, indicarlo
con un mensaje.
*/
package Clase12.Practica10Noviembre;

import java.util.Scanner;

public class ArreglosEjercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tabla[] = new int[10];
        int posicion = -1; // -1 significa "no encontrado"
        
        // Leemos los 10 números
        System.out.println("Digite 10 enteros (ordenados crecientemente):");
        for (int i = 0; i < tabla.length; i++) {
            System.out.println("tabla[" + i + "]: ");
            tabla[i] = Integer.parseInt(entrada.nextLine());
        }
        
        // Leemos N (número a buscar)
        System.out.println("Digite un número a buscar: ");
        int N = Integer.parseInt(entrada.nextLine());
        entrada.close();
        
        // Buscamos N recorriendo la tabla
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] == N) {
                posicion = i; // guardamos la posición
                break; // ya lo encontramos, no hace falta seguir5
            }
        }
        
        // Mostramos el resultado
        if (posicion != -1) {
            System.out.println("El número " + N + " se encuentra en la posición " + posicion);
        } else {
            System.out.println("El número " + N + " NO se encuentra en la tabla.");
        }
    }
}
