package practica;

import java.util.Scanner;

public class Ciclos07 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int acumulador = 0;
        int contador = 0;
        int user_num = 0;
        
        System.out.println("Ingrese numeros (finaliza al ingresar uno negativo)");
        do {
            System.out.print("Numero: ");
            user_num = Integer.parseInt(entrada.nextLine());
            if (user_num >= 0) {
                acumulador += user_num;
                contador++;
            } else if (contador == 0) {
                contador = 1;
            }
        } while (user_num >= 0);
        
        System.out.println("Suma: " + acumulador);
        System.out.println("Cantidad: " + contador);
        System.out.println("Media: " + (double) acumulador / contador);
        entrada.close();
    }
}
