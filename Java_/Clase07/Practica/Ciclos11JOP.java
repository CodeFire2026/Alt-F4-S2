/*
Ejercicio 11 (version JOptionPane): Diseñar un programa que muestre el producto de los 10 primeros
numeros impares. Hacerlo con Scanner y JOptionPane
 */
package Clase07.Practica;

import javax.swing.JOptionPane;

public class Ciclos11JOP {
     public static void main(String[] args) {
        int producto = 1;
        int contador = 0;
        int numero = 1; // primer número impar
        
        // Entrada del usuario opcional
        int confirmacion = JOptionPane.showConfirmDialog(null,
                "Desea calcular el producto de los 10 primeros impares?");
        if (confirmacion != JOptionPane.OK_OPTION){
            JOptionPane.showMessageDialog(null, "Operacion cancelada.");
            return;
        }
        
        // Mientras no hayamos multiplicado 10 impares
        while (contador < 10) {
            producto *= numero; // multiplicamos el impar actual
            contador++; // contamos cuántos impares llevamos
            numero += 2; // saltamos al siguiente impar
        }
        
        JOptionPane.showMessageDialog(null, 
            "El producto de los 10 primeros números impares es: "+producto);
        
        // Alternativa pidiendo cuantos impares multiplicar
        producto = 1;
        contador = 0;
        numero = 1;
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Cuantos impares desea multiplicar?"));
        
        while (contador < cantidad) {
            producto *= numero;
            contador++;
            numero += 2;
        }
        
        JOptionPane.showMessageDialog(null,
                "El producto de los "+cantidad+" primeros números impares es: "
                        +producto);
    }
}
