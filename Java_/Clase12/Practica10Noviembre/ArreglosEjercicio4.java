/*
Ejercicio 4: Leer por teclado una tabla de 10 elementos numéricos enteros y una
posición (entre 0 y 9). Eliminar el elemento situado en la posición dada sin
dejar huecos.
*/
package Clase12.Practica10Noviembre;

import java.util.Scanner;

public class ArreglosEjercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tabla[] = new int[10];
        
        // Leemos los 10 números
        System.out.println("Digite 10 números enteros:");
        for (int i = 0; i < tabla.length; i++) {
            System.out.println("tabla[" + i + "]: ");
            tabla[i] = Integer.parseInt(entrada.nextLine());
        }
        
        // Leemos la posición a eliminar
        System.out.println("Digite la posición a eliminar (0-9): ");
        int posicion = Integer.parseInt(entrada.nextLine());
        entrada.close();
        
        // Validamos que la posición esté en rango
        if (posicion < 0 || posicion > 9) {
            System.out.println("Posición inválida. Debe estar entre 0 y 9.");
            return; // Salimos del programa
        }
        
        // Desplazamos a la izquierda los elementos posteriores a "posicion"
        for (int i = posicion; i < tabla.length - 1; i++) {
            tabla[i] = tabla[i + 1];
        }
        
        // Mostramos la tabla resultante (sin el último elemento sobrante)
        System.out.println("\nTabla después de eliminar la posición " + posicion + ":");
        for (int i = 0; i < tabla.length - 1; i++) {
            System.out.println("tabla[" + i + "]: " + tabla[i]);
        }
    }
}
