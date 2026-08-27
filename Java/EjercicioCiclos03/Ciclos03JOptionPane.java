/*
Ejercicio 3: Leer numeros hasta que se introduzca un cero. Para cada uno
indicar si es par o impar. Primero con la clase Scanner, luego con JOptionPane.
 */
import javax.swing.JOptionPane;

public class Ciclos03JOptionPane {
    public static void main(String[] args) {
        var numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        while(numero != 0){
            if(numero % 2 == 0){
                JOptionPane.showMessageDialog(null, "El numero "+numero+" es PAR");
            }
            else{
                JOptionPane.showMessageDialog(null, "El numero "+numero+" es IMPAR");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
        }
        JOptionPane.showMessageDialog(null, "El numero "+numero+" finaliza el programa");
    }
}
