/*
Ejercicio 5: Realizar un juego para adivinar un numero, para ello generar un
numero aleatorio entre 0-100, y luego ir pidiendo numeros indicando "es mayor" o
"es menor" segun sea mayor o menor con respecto a N. El proceso termina cuando
el usuario acierta y mostramos el numero de intentos hechos.
 */
package Ciclos05;

import java.util.Scanner;

public class Ciclos05Scanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        // Generar numero aleatorio 0-100
        int numeroSecreto = (int) (Math.random() * 101); // 0 a 100
        int intentos = 0;
        int numeroUsuario;
        System.out.println("Adivina el numero secreto entre 0 y 100!");
        
        // Pedir numero
        System.out.println("Digite un numero: ");
        numeroUsuario = Integer.parseInt(entrada.nextLine());
        intentos++; // contamos este intento
        
        // mientras no acierte
        while (numeroUsuario != numeroSecreto) {
            if (numeroUsuario > numeroSecreto) {
                System.out.println("El numero es MENOR que "+ numeroUsuario);
            } else {
                System.out.println("El numero es MAYOR que "+ numeroUsuario);
            }
            System.out.println("Ingresa otro numero: ");
            numeroUsuario = Integer.parseInt(entrada.nextLine());
            intentos++;
        }
        // cuando acierta
        System.out.println("¡Felicidades! Adivinaste el numero "+ numeroSecreto);
        System.out.println("Lo lograste en "+intentos+" intentos.");
    }
}
