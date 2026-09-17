

import java.util.Scanner;
import javax.swing.JOptionPane;

public class PruebaCaja {
    // Variables (atributos) globales para no tener que pasar tantos argumentos
    private static Scanner entrada = new Scanner(System.in);
    private static int usr_printer_choice;
    private static float ancho;
    private static float alto;
    private static float profundidad;

    // Menu para pedir scanner o joption
    public static void mostrarMenu() {
        while (true) {
            System.out.print("\nSeleccione una clase a usar\n1. Scanner\n2. JOptionPane\nOpcion: ");
            usr_printer_choice = Integer.parseInt(entrada.nextLine());

            if (usr_printer_choice < 1 || usr_printer_choice > 2) {
                System.out.println("\nClase incorrecta! Vuelva a intentarlo");
            } else {
                solicitarValores();
                mostrarResultadoCaja();
                break;
            }
        }
    }

    public static void solicitarValores() {
        if (usr_printer_choice == 1) {
            System.out.println("\nPor favor ingrese los valores para calcular el volumen de la caja");
            
            System.out.print("Ancho: ");
            ancho =  Float.parseFloat(entrada.nextLine());
            
            System.out.print("Alto: ");
            alto =  Float.parseFloat(entrada.nextLine());
            
            System.out.print("Profundidad: ");
            profundidad =  Float.parseFloat(entrada.nextLine());
        } else if (usr_printer_choice == 2) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese los valores para calcular el volumen de la caja");
            
            ancho = Float.parseFloat(JOptionPane.showInputDialog(null, "Ancho: "));
            alto = Float.parseFloat(JOptionPane.showInputDialog(null, "Alto: "));
            profundidad = Float.parseFloat(JOptionPane.showInputDialog(null, "Profundidad: "));
        } else {
            System.out.println("ERROR FATAL.");
            return;
        }
    }

    public static void mostrarResultadoCaja() {
        // Constructor vacio
        Caja cajaVacio = new Caja(); 
        cajaVacio.ancho = ancho;
        cajaVacio.alto = alto;
        cajaVacio.profundidad = profundidad;
        
        // Constructor con argumentos
        Caja cajaArgum = new Caja(ancho, alto, profundidad);

        if (usr_printer_choice == 1) {
            System.out.println("\n--- Usando constructor vacio --- ");
            System.out.println("Los valores de tu caja:\nAncho: " + cajaVacio.ancho + "\nAlto: " + cajaVacio.alto + "\nProfundidad: " + cajaVacio.profundidad + "\nVolumen: " + cajaVacio.getVolumen());
            System.out.println("\n--- Usando constructor con argumentos --- ");
            System.out.println("Los valores de tu caja:\nAncho: " + cajaArgum.ancho + "\nAlto: " + cajaArgum.alto + "\nProfundidad: " + cajaArgum.profundidad + "\nVolumen: " + cajaArgum.getVolumen());
        } else if (usr_printer_choice == 2) {
            JOptionPane.showMessageDialog(null, "[ Usando constructor vacio ]\nAncho: " + cajaVacio.ancho + "\nAlto: " + cajaVacio.alto + "\nProfundidad: " + cajaVacio.profundidad + "\nVolumen: " + cajaVacio.getVolumen());
            JOptionPane.showMessageDialog(null, "[ Usando constructor con argumentos ]\nAncho: " + cajaArgum.ancho + "\nAlto: " + cajaArgum.alto + "\nProfundidad: " + cajaArgum.profundidad + "\nVolumen: " + cajaArgum.getVolumen());
        }
    }

    public static void main(String[] args) {
        mostrarMenu();
    }
}