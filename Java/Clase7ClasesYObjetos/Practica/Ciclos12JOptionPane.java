/*
Ejercicio 12: Pedir un numero y calcular su factorial.
Hacerlo con las dos clases, Scanner y JOptionPane
 */
package Java.Clase7ClasesYObjetos.Practica;

import javax.swing.JOptionPane;

public class Ciclos12JOptionPane {
    public static void main(String[] args) {
        long factorial = 1; // usamos long porque el factorial crece muy rápido
        
        int numero = Integer.parseInt(
            JOptionPane.showInputDialog("Digite un número para calcular su factorial:")
        );
        
        // Calculamos el factorial multiplicando desde 1 hasta el número
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        
        JOptionPane.showMessageDialog(null, 
            "El factorial de " + numero + " es: " + factorial);
    }
}
