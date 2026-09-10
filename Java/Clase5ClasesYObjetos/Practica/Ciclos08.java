package Java.Clase5ClasesYObjetos.Practica;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ciclos08 {
    
    // MENU principal
    public static void mostrarMenu() {
        // Bucle principal (para verificar clase correcta)
        while (true) {
            System.out.print("\nSeleccione una clase\n1. Scanner\n2. JOptionPane\nOpcion: ");
            int opcion_usuario = Integer.parseInt(entrada_scan.nextLine());

            if (opcion_usuario < 1 || opcion_usuario > 2) {
                System.out.println("\nClase incorrecta! Vuelva a intentarlo");

            } else {
                // Si se eligio una clase correcta entonces solicitamos el n
                solicitarNumN(opcion_usuario);
                break; // Una vez terminado el ciclo secundario, rompemos el ciclo principal y terminamos el programa
            }
        }
    }

    // Metodo para obtener el n del usuario con la clase correcta (estaba antes dentro del menu, pero quedaba medio feo)
    public static void solicitarNumN (int clase) {
        int num_n_usuario = 0;

        // Bucle secundario (para verificar que n del usuario sea >= 1)
        while (true) {

            if (clase == 1) {
                // Usamos scanner
                System.out.println("\nIngrese el numero hasta el cual imprimir");
                System.out.print("Número: ");
                num_n_usuario = Integer.parseInt(entrada_scan.nextLine());

            } else if (clase == 2) {
                // Usamos JOptionPane
                num_n_usuario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero hasta el cual imprimir\nNúmero: "));
            }
            

            if (num_n_usuario <= 0) {
                if (clase == 1) {
                    System.out.println("El número debe ser mayor o igual a 1!");
                } else if (clase == 2) {
                    JOptionPane.showMessageDialog(null, "El número debe ser mayor o igual a 1!");
                }
            } else {
                mostrarNums(num_n_usuario, clase);
                break; // Una vez llamado mostrarNums(), terminar el ciclo secundario
            }
        }
    }

    // El ejercicio en si, usando otro metodo
    public static void mostrarNums(int n, int clase) {
        String nums_hasta_n = "";
        for (int i = 1; i <= n; i++) {
            if (i == n) {
                nums_hasta_n = nums_hasta_n + i;
            } else {
                nums_hasta_n = nums_hasta_n + i + " ";
            }
        }

        if (clase == 1) {
            System.out.println("\nTus números (hasta n): " + nums_hasta_n);
        } else if (clase == 2) {
            JOptionPane.showMessageDialog(null, "\nTus números (hasta n): " + nums_hasta_n);
        }
    }

    // Inicializamos un scanner que los demas metodos puedan usar
    static Scanner entrada_scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        mostrarMenu();
    }
}