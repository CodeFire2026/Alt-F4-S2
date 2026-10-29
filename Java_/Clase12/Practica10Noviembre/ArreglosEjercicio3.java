/*
Ejercicio 3: Leer 5 números que se introducirán ordenados de forma creciente.
Estos los guardaremos en una tabla de tamaño 10. Leer un número N, e insertarlo
en el lugar adecuado para que la tabla continúe ordenada.
*/
package Clase12.Practica10Noviembre;

import java.util.Scanner;

public class ArreglosEjercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tabla[] = new int[10]; // Capacidad máxima: 10
        int contador = 5; // Ocupamos 5 posiciones
        
        // Leemos los 5 números ordenados de forma creciente
        System.out.println("Digite 5 números ordenados de forma creciente:");
        for (int i = 0; i < contador; i++) {
            System.out.println("Número " + (i + 1) + ": ");
            tabla[i] = Integer.parseInt(entrada.nextLine());
        }
        
        // Leemos N (número a insertar)
        System.out.println("Digite un número a insertar: ");
        int N = Integer.parseInt(entrada.nextLine());
        entrada.close();
        
        // Primero buscamos la posición donde debe ir N
        int posicion = contador; // por defecto, al final (si N es el mayor)
        for (int i = 0; i < contador; i++) {
            if (N < tabla[i]) {
                posicion = i;
                break; // ya encontramos el primer mayor que N
            }
        }
        
        // Ahora desplazamos a la derecha los elementos desde "posicion"
        for (int i = contador; i > posicion; i--) {
            tabla[i] = tabla[i - 1];
        }
        
        // Insertamos N en el hueco
        tabla[posicion] = N;
        contador++; // Ahora hay 6 elementos
        
        // Mostramos la tabla resultante
        System.out.println("\nTabla con el numero insertado:");
        for (int i = 0; i < contador; i++) {
            System.out.println("tabla[" + i + "]: " + tabla[i]);
        }

        entrada.close();
    }
}
