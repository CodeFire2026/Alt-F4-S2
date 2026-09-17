package Java.Clase6ClasesYObjetos.Practica;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ciclos10 {
    private static int usr_printer_choice;
    private static Scanner entrada = new Scanner(System.in);
    
    public static void mostrarMenu() {
        while (true) {
            System.out.print("\nSeleccione una clase a usar\n1. Scanner\n2. JOptionPane\nOpcion: ");
            usr_printer_choice = Integer.parseInt(entrada.nextLine());

            if (usr_printer_choice < 1 || usr_printer_choice > 2) {
                System.out.println("\nClase incorrecta! Vuelva a intentarlo");
            } else {
                mostrarSuma(solicitarNums());
                break;
            }
        }
    }
    
    public static int solicitarNums() {
        int suma = 0;

        if (usr_printer_choice == 1) {
            // scanner
            System.out.println("\nIngrese 10 numeros a sumar");
            for (int i = 1; i < 11; i++) {
                System.out.print(i + "° Número: ");
                suma += Integer.parseInt(entrada.nextLine());
            }

        } else if (usr_printer_choice == 2) {
            JOptionPane.showMessageDialog(null, "Ingrese 10 numeros a sumar");
            for (int i = 1; i < 11; i++) {
                suma += Integer.parseInt(JOptionPane.showInputDialog(null, i + "° Número: "));
            }

        } else {
            System.out.println("ERROR");
            return 0;
        }

        return suma;
    }

    public static void mostrarSuma(int suma) {
        if (usr_printer_choice == 1) {
            System.out.println("\nSuma total: " + suma);
        } else if (usr_printer_choice == 2) {
            JOptionPane.showMessageDialog(null, "Suma total: " + suma);
        }
    }

    public static void main(String[] args) {
        mostrarMenu();
        entrada.close();
    }
}
