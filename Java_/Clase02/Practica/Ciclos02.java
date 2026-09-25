/* 
Ejercicio 2: leer un numero e indicar si es positivo o negativo
Repetir hasta que se ingrese 0
*/

package Clase02.Practica;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ciclos02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String mensaje_intro = "Ingrese un numero a evaluar si es positivo o negativo (ingrese 0 para salir)";
        int usr_choice;
        int num;

        while (true) {
            System.out.print("Elija con qué clase hacer el ejercicio:\n1. Scanner\n2. JOptionPane\nOpción: ");
            usr_choice = entrada.nextInt();
            if (usr_choice == 1) {
                System.out.println("\n" + mensaje_intro);
            } else if (usr_choice == 2) {
                JOptionPane.showMessageDialog(null, mensaje_intro);
            } else {
                System.out.println("\n(!) Opción incorrecta\n");
                continue;
            }
            break;
        }

        while (true) {
            if (usr_choice == 1) {
                System.out.print("Número: ");
                num = entrada.nextInt();
            } else if (usr_choice == 2) {
                num = Integer.parseInt(JOptionPane.showInputDialog("Número: "));
            } else {
                num = 0;
            }

            if (num > 0) {
                if (usr_choice == 1) {
                    System.out.println(num + " es positivo!");
                } else if (usr_choice == 2) {
                    JOptionPane.showMessageDialog(null, num + " es positivo!");
                }
            } else if (num < 0) {
                if (usr_choice == 1) {
                    System.out.println(num + " es negativo!");
                } else if (usr_choice == 2) {
                    JOptionPane.showMessageDialog(null, num + " es negativo!");
                }
            } else {
                break;
            }
        }

        entrada.close();
    }
}
