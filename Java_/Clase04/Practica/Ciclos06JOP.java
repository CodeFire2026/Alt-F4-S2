/* 
Ejercicio 6 (version JOptionPane): pedir numeros hasta que se teclee un 0, mostrar
la suma de todos los numeros introducidos
*/

package Clase04.Practica;

import javax.swing.JOptionPane;

public class Ciclos06JOP {
    public static void main(String[] args) {
        
        int acumulador = 0;
        int user_num;

        JOptionPane.showMessageDialog(null, "Ingrese numeros (finaliza al ingresar 0)");

        do {
            user_num = Integer.parseInt(JOptionPane.showInputDialog("Numero: "));
            if (user_num != 0) {
                acumulador += user_num;
            }
        } while (user_num != 0);

        JOptionPane.showMessageDialog(null, "La suma de los numeros ingresados es: " + acumulador);
        
    }
}
