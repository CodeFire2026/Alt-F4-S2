/*
Ejercicio 4: Pedir numeros hasta que se teclee uno negativo, y mostrar cuantos
numeros se han introducido. Lo hacemos primero con Scanner, luego con JOptionPane.
 */
import javax.swing.JOptionPane;

public class Ciclos04JOptionPane {
    public static void main(String[] args) {
        int contador = 0;
        var numero = Integer.parseInt(JOptionPane.showInputDialog
        ("Digite un numero (negativo para terminar):"));
        
        while(numero >= 0) { // mientras sea positivo se siguen pidiendo numeros
            contador++; // incrementa el contador al ingresar un numero
            numero = Integer.parseInt(JOptionPane.showInputDialog
        ("Digite otro numero (negativo para terminar):"));
        }
        // Mostramos resultado
        JOptionPane.showMessageDialog(null, "Se han introducido " + contador + " números.");
    }
}
