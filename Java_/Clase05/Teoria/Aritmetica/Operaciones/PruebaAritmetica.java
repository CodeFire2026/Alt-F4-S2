package Clase05.Teoria.Aritmetica.Operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        Aritmetica aritmetica = new Aritmetica();
        aritmetica.a = 3;
        aritmetica.b = 7;
        aritmetica.sumarNumeros();

        int resultado = aritmetica.sumarConRetorno();
        System.out.println("resultado (return) = " + resultado);
        
        resultado = aritmetica.sumarConArgumentos(12, 26);
        System.out.println("resultado (args) = " + resultado);
    }
}
