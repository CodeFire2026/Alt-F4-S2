// Continuamos con el ejemplo de Aritmetica, ahora vemos:
// * Sobrecarga de constructores
// * Alcance de variables

package Clase06.Teoria.Aritmetica.Operaciones;

public class Aritmetica {
    // Atributos
    int a;
    int b;

    // El constructor es un metodo especial
    public Aritmetica() { // Constructor 1
        System.out.println("Se está ejecutando este constructor número uno");
    }
    
    // Aplicamos sobrecarga de constructores
    public Aritmetica(int a, int b) { // Constructor 2
        this.a = a;
        this.b = b;
        System.out.println("Se está ejecutando este constructor número dos");
    }

    // Metodos
    public void sumarNumeros() {
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }

    public int sumarConRetorno() {
        // int resultado = a + b;
        // return resultado;
        
        return a + b;
    }

    public int sumarConArgumentos(int arg1, int arg2) {
        // Opcional: usar "this" (se crea automaticamente)
        // this.a = arg1;
        // this.b = arg2;
        // return this.sumarConRetorno();
        
        a = arg1;
        b = arg2;
        // return a + b;
        return sumarConRetorno();
    }
}
