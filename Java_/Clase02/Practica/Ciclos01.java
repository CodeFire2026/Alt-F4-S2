/*
Ejercicio 1: leer un numero y mostrar su cuadrado. 
Repetir hasta que se introduzca un numero negativo
*/

package Clase02.Practica;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ciclos01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String mensaje_intro = "Ingrese un numero a mostrar su cuadrado (ingrese un negativo para salir)";
        int usr_choice;
        int num = 0;

        while (true) {
            System.out.print("Elija con qué clase hacer el ejercicio:\n1. Scanner\n2. JOptionPane\nOpción: ");
            usr_choice = entrada.nextInt();
            if (usr_choice == 1) {
                System.out.println(mensaje_intro);
            } else if (usr_choice == 2) {
                JOptionPane.showMessageDialog(null, mensaje_intro);
            } else {
                System.out.println("\n(!) Opción incorrecta\n");
                continue;
            }
            break;
        }

        do {
            if (usr_choice == 1) {
                System.out.print("Número: ");
                num = entrada.nextInt();
            } else if (usr_choice == 2) {
                num = Integer.parseInt(JOptionPane.showInputDialog("Número: "));
            }
            if (num >= 0) {
                if (usr_choice == 1) {
                    System.out.println(num + "^2 = " + Math.pow(num, 2));
                } else if (usr_choice == 2) {
                    JOptionPane.showMessageDialog(null, num + "^2 = " + Math.pow(num, 2));
                }
            }
        } while (num >= 0);

        entrada.close();
    }
}