package Clase10.Teoria.operaciones;

public class Operaciones {
    // Video 10.2: sobrecarga de metodos
    // tienen mismo identificador, pero operan con distintos tipos
    public static int sumar(int a, int b) {
        System.out.println("Metodo para sumar enteros");
        return a + b;
    }
    
    // debe seguir siendo public, es decir, no puede cambiar de acceso
    public static double sumar(double a, double b) {
        System.out.println("Metodo para sumar double");
        return a + b;
    }
}
