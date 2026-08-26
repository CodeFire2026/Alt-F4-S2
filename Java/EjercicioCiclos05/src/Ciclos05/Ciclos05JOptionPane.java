/*
Ejercicio 5: Realizar un juego para adivinar un numero, para ello generar un
numero aleatorio entre 0-100, y luego ir pidiendo numeros indicando "es mayor" o
"es menor" segun sea mayor o menor con respecto a N. El proceso termina cuando
el usuario acierta y mostramos el numero de intentos hechos.
 */
package Ciclos05;

import javax.swing.JOptionPane;

public class Ciclos05JOptionPane {
    public static void main(String[] args) {
        // Generar número aleatorio entre 0 y 100
        int numeroSecreto = (int) (Math.random() * 101);
        int intentos = 0;
        int numeroUsuario;
        
        // mensaje inicial
        JOptionPane.showMessageDialog(null, "¡Adivina el número secreto entre 0 y 100!");
        
        // Pedir número
        String input = JOptionPane.showInputDialog("Ingresa un número:");
        numeroUsuario = Integer.parseInt(input);
        intentos++;
        
        // mientras no acierte
        while (numeroUsuario != numeroSecreto) {
            if (numeroUsuario > numeroSecreto) {
                JOptionPane.showMessageDialog(null, "El número es MENOR que " + numeroUsuario);
            } else {
                JOptionPane.showMessageDialog(null, "El número es MAYOR que " + numeroUsuario);
            }
            input = JOptionPane.showInputDialog("Ingresa otro número:");
            numeroUsuario = Integer.parseInt(input);
            intentos++;
        }
        
        // cuando acierta
        JOptionPane.showMessageDialog(null, "¡Felicidades! Adivinaste el número " + numeroSecreto + 
                "\nLo lograste en " + intentos + " intentos.");
    }
}
