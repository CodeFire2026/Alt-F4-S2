/* 
Ejercicio 6 (version Scanner): pedir numeros hasta que se teclee un 0, mostrar
la suma de todos los numeros introducidos
*/

package Clase04.Practica;

import java.util.Scanner;

public class Ciclos06Scan {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int acumulador = 0;
        int user_num;

        System.out.println("Ingrese numeros (finaliza al ingresar 0)");

        do {
            System.out.print("Numero: ");
            user_num = Integer.parseInt(entrada.nextLine());
            if (user_num != 0) {
                acumulador += user_num;
            }
        } while (user_num != 0);

        System.out.println("La suma de los numeros ingresados es: " + acumulador);

        entrada.close();
    }
}
