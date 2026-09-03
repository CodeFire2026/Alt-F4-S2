package practica;

import java.util.Scanner;

public class Ciclos6 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int acumulador = 0;
        int user_num = 0;

        System.out.println("Ingrese numeros (finaliza al ingresar uno negativo)");

        do {
            System.out.print("Numero: ");
            user_num = Integer.parseInt(entrada.nextLine());
            if (user_num >= 0) {
                acumulador += user_num;
            }
        } while (user_num >= 0);

        System.out.println("La suma de los numeros ingresados es: " + acumulador);

        entrada.close();
    }
}
