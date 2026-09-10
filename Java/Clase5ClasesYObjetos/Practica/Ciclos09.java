package Java.Clase5ClasesYObjetos.Practica;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ciclos09 {
    
    // MENU principal
    public static void mostrarMenu() {
        // Bucle principal
        while (true) {
            System.out.print("\nSeleccione una clase\n1. Scanner\n2. JOptionPane\nOpcion: ");
            int opcion_usuario = Integer.parseInt(entrada_scan.nextLine());

            if (opcion_usuario < 1 || opcion_usuario > 2) {
                System.out.println("\nClase incorrecta! Vuelva a intentarlo");
            } else {
                solicitarFecha(opcion_usuario);
                break;
            }
        }
    }


    public static void solicitarFecha(int clase) {

        if (clase == 1) {
            // Scanner
            System.out.println("\nIngrese dia, mes y año a verificar");
            System.out.print("Día: ");
            dia = Integer.parseInt(entrada_scan.nextLine());
            
            System.out.print("Mes: ");
            mes = Integer.parseInt(entrada_scan.nextLine());
            
            System.out.print("Año: ");
            anio = entrada_scan.nextLine();

        } else if (clase == 2) {
            // JOption
            JOptionPane.showMessageDialog(null, "Ingrese día, mes y año a verificar");
            dia = Integer.parseInt(JOptionPane.showInputDialog("Día:"));
            mes = Integer.parseInt(JOptionPane.showInputDialog("Mes:"));
            anio = JOptionPane.showInputDialog("Año:");
        }

        verificarFecha(clase);
    }


    public static void verificarFecha(int clase) {
        boolean fecha_correcta = true;
        String causante = "";

        if (dia < 1 || dia > 30) {
            fecha_correcta = false;
            causante = "día";
        } else if (!verificarMes()) {
            fecha_correcta = false;
            causante = "mes";
        } else if (!verificarAnio()) {
            fecha_correcta = false;
            causante = "año";
        }

        String msj_correct = "\nLa fecha es correcta!\nFecha: " + dia + " de " + mes_nombre + " de " + anio_num + era;
        String msj_incorrect = "\nLa fecha es INCORRECTA. \nRazón principal: " + causante + " está mal.";

        if (fecha_correcta) {
            if (clase == 1) {
                System.out.println(msj_correct);
            } else if (clase == 2) {
                JOptionPane.showMessageDialog(null, msj_correct);
            }
        } else if (!fecha_correcta) {
            if (clase == 1) {
                System.out.println(msj_incorrect);
            } else if (clase == 2) {
                JOptionPane.showMessageDialog(null, msj_incorrect);
            }
        }
    }


    public static boolean verificarMes() {
        if (mes < 1 || mes > 12) {
            return false;
        }

        mes_nombre = switch (mes) {
            case 1 -> "enero";
            case 2 -> "febrero";
            case 3 -> "marzo";
            case 4 -> "abril";
            case 5 -> "mayo";
            case 6 -> "junio";
            case 7 -> "julio";
            case 8 -> "agosto";
            case 9 -> "septiembre";
            case 10 -> "octubre";
            case 11 -> "noviembre";
            case 12 -> "diciembre";
            default -> "";
        };

        return true;
    }


    public static boolean verificarAnio() {
        String anio_limpio = anio.toUpperCase().replace(" ", "").replace(".", "");

        if (anio_limpio.contains("AC")) {
            era = " a. C.";
            anio_limpio = anio_limpio.replace("AC", "");
        } else if (anio_limpio.contains("DC")) {
            era = " d. C.";
            anio_limpio = anio_limpio.replace("DC", "");
        } else {
            era = "";
        }

        
        try {
            anio_num = Integer.parseInt(anio_limpio);
        } catch (NumberFormatException e) {
            return false;
        }

        if (anio_num <= 0) {
            return false;
        }

        return true;
    }
    

    // Inicializamos atributos
    static Scanner entrada_scan = new Scanner(System.in);
    private static int dia;
    private static int mes;
    private static String mes_nombre;
    private static String anio;
    private static int anio_num;
    private static String era;
    
    // Comienza el programa
    public static void main(String[] args) {
        mostrarMenu();
    }
}
