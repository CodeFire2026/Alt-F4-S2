/*
Ejercicio 11: Diseñar un programa que muestre el producto de los 10 primeros
numeros impares. Hacerlo con Scanner y JOptionPane
 */
package ciclos11;

import java.util.Scanner;

public class Ciclos11Scanner {
    public static void main(String[] args) {
        /*
        El ejercicio no requiere entrada del usuario porque los 10 primeros
        impares son siempre los mismos(1, 3, 5, 7, 9, 11, 13, 15, 17, 19).
        */
        Scanner entrada = new Scanner(System.in);
        int producto = 1;
        int contador = 0;
        int numero = 1; // primer número impar
        
        // Entrada del usuario opcional
        System.out.println("Presione una tecla para seguir...");
        entrada.nextLine(); // espera a que el usuario presione enter
        
        // Mientras no hayamos multiplicado 10 impares
        while (contador < 10) {
            producto *= numero; // multiplicamos el impar actual
            contador++; // contamos cuántos impares llevamos
            numero += 2; // saltamos al siguiente impar
        }
        
        System.out.println("El producto de los 10 primeros números impares es: "
                +producto);
        
        // Alternativa pidiendo cuantos impares multiplicar
        producto = 1;
        contador = 0;
        numero = 1;
        System.out.println("Cuantos impares desea multiplicar?");
        int cantidad = Integer.parseInt(entrada.nextLine());
        
        while (contador < cantidad) {
            producto *= numero;
            contador++;
            numero+= 2;
        }
        
        System.out.println("El producto de los "+cantidad+" numeros impares es: "
        +producto);
    }
}
