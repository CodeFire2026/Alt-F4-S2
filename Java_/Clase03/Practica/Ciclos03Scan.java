/*
Ejercicio 3 (version Scanner): Leer numeros hasta que se introduzca un cero. Para cada uno
indicar si es par o impar. Primero con la clase Scanner, luego con JOptionPane.
*/

package Clase03.Practica;

import java.util.Scanner;

public class Ciclos03Scan {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;

        do {
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = entrada.nextInt();

            if (numero != 0) {
                if (numero % 2 == 0) {
                    System.out.println("El número es par");
                } else {
                    System.out.println("El número es impar");
                }
            }

        } while (numero != 0);

        System.out.println("Programa terminado.");

        entrada.close();
    }
}
