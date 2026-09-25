// Vemos todo sobre metodos de una clase, como crearlos, sus retornos y parametros

package Clase05.Teoria.Aritmetica.Operaciones;

public class Aritmetica {
    // Atributos
    int a;
    int b;

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
