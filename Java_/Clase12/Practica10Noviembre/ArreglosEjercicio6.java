/*
Ejercicio 6: Leer dos series de 10 enteros, que estarán ordenados crecientemente.
Copiar(fusionar) las dos tablas en una tercera de forma que sigan ordenadas.
*/
package Clase12.Practica10Noviembre;

import java.util.Scanner;

public class ArreglosEjercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a[] = new int[10];
        int b[] = new int[10];
        int c[] = new int[20]; // A + B = 10 + 10
        
        // Tabla A
        System.out.println("Tabla A (ordenada crecientemente)");
        for (int i = 0; i < a.length; i++) {
            System.out.println("A[" + i + "]: ");
            a[i] = Integer.parseInt(entrada.nextLine());
        }
        
        // Tabla B
        System.out.println("Tabla B (ordenada crecientemente)");
        for (int i = 0; i < b.length; i++) {
            System.out.println("B[" + i + "]: ");
            b[i] = Integer.parseInt(entrada.nextLine());
        }
        entrada.close();
        
        // Fusionamos manteniendo el orden
        int i = 0; // Índice para A
        int j = 0; // Índice para B
        int k = 0; // Índice para C
        
        // Mientras ambas tablas tengan elementos por comparar
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) { // Comparamos A < B
                c[k] = a[i]; // Copiamos el elemento de A a la posición actual de C
                i++; // Avanzamos en A para comprobar el siguiente
            } else { // Si A no es menor, entonces B es menor o igual
                c[k] = b[j]; // Copiamos el elemento de B a la posición actual de C
                j++; // Avanzamos en B para comprobar el siguiente
            }
            k++; // Avanzamos en C para que la próxima copia no sobreescriba la actual
        }
        
        // Copiamos los elementos restantes de A (si quedaron)
        while (i < a.length) {
            c[k] = a[i]; // Copia el elemento restante de A a la posición actual de C
            i++; // Avanza A
            k++; // Avanza C
        }
        
        // Copiamos los elementos restantes de B (si quedaron)
        while (j < b.length) {
            c[k] = b[j]; // Copia el elemento restante de B a la posición actual de C
            j++; // Avanza B
            k++; // Avanza C
        }
        
        // Mostramos la tabla fusionada
        System.out.println("\nTABLA C");
        for (int m = 0; m < c.length; m++) {
            System.out.println("C[" + m + "]: " + c[m]);
        }
    }
}
