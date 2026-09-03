package practica;

import javax.swing.JOptionPane;

public class Ciclos06JOptionPane {
    public static void main(String[] args) {
        
        int acumulador = 0;
        int user_num = 0;

        JOptionPane.showMessageDialog(null, "Ingrese numeros (finaliza al ingresar uno negativo)");

        do {
            user_num = Integer.parseInt(JOptionPane.showInputDialog("Numero: "));
            if (user_num >= 0) {
                acumulador += user_num;
            }
        } while (user_num >= 0);

        JOptionPane.showMessageDialog(null, "La suma de los numeros ingresados es: " + acumulador);
        
    }
}
