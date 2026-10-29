/*
Ejercicio 1: Leer 10 numeros enteros y guardarlos en un arreglo. Debemos
mostrarlos en el siguiente orden: el primero, el ultimo, el segundo, el penultimo,
el tercero, etc.
*/
package Clase12.Practica10Noviembre;

import java.util.Scanner;

public class ArreglosEjercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeros[] = new int[10]; // Arreglo de 10 enteros
        
        // Leemos los 10 números
        System.out.println("Digite 10 números enteros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número " + (i + 1) + ": ");
            numeros[i] = Integer.parseInt(entrada.nextLine());
        }
        
        // Mostramos en el orden pedido
        System.out.println("\nOrden:");
        for (int i = 0; i < numeros.length / 2; i++) { // Dividido 2 = 5 iteraciones
            System.out.println(numeros[i]); // desde el inicio
            System.out.println(numeros[numeros.length - 1 - i]); // desde el final
        }
        
        entrada.close();
    }
}
