/*
Ejercicio 12: Pedir un numero y calcular su factorial.
Hacerlo con las dos clases, Scanner y JOptionPane
 */
package ciclos12;

import java.util.Scanner;

public class Ciclos12Scanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        long factorial = 1; // usamos long porque el factorial crece muy rápido
        
        System.out.println("Digite un número para calcular su factorial: ");
        int numero = Integer.parseInt(entrada.nextLine());
        
        // Calculamos el factorial multiplicando desde 1 hasta el número
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        
        System.out.println("El factorial de "+numero+" es: "+factorial);
    }
}
