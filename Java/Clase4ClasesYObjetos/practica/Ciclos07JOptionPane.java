package practica;

import javax.swing.JOptionPane;

public class Ciclos07JOptionPane {
    public static void main(String[] args) {

        
        int acumulador = 0;
        int contador = 0;
        int user_num = 0;
        
        JOptionPane.showMessageDialog(null, "Ingrese numeros (finaliza al ingresar uno negativo)");
        do {
            user_num = Integer.parseInt(JOptionPane.showInputDialog("Numero: "));
            if (user_num >= 0) {
                acumulador += user_num;
                contador++;
            }
        } while (user_num >= 0);
        
        if (contador == 0) {
            JOptionPane.showMessageDialog(null, "Sin positivos!");
        } else {
            JOptionPane.showMessageDialog(null, "Suma: " + acumulador + "\nCantidad: " + contador + "\nMedia: " + (double) acumulador / contador);
        }
        
    }
}
