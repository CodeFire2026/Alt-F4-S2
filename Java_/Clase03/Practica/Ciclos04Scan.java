/*
Ejercicio 4 (versión Scanner): Pedir numeros hasta que se teclee uno negativo, y mostrar cuantos
numeros se han introducido. Lo hacemos primero con Scanner, luego con JOptionPane.
*/

package Clase03.Practica;

import java.util.Scanner;

public class Ciclos04Scan {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese numeros (hasta que haya uno negativo)");
        int cant_nums = 0;
        int user_num;
        do {
            System.out.print("Numero: ");
            user_num = Integer.parseInt(entrada.nextLine());
            cant_nums++;
        } while (user_num >= 0);
        System.out.println("\nNegativo encontrado, saliendo...");
        System.out.println("Cantidad de numeros positivos ingresados: " + (cant_nums - 1));

        entrada.close();
    }
}
