package Clase06.Teoria.Aritmetica.Operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        // int a = 10; // estas serian variables locales
        // int b = 7; // variable local = memoria stack

        miMetodo(); // llamamos a nuestro nuevo metodo

        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 3;
        aritmetica1.b = 7;
        aritmetica1.sumarNumeros();

        // para almacenar un objeto o los atributos se utiliza memoria heap
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado (return) = " + resultado);
        
        resultado = aritmetica1.sumarConArgumentos(12, 26);
        System.out.println("resultado (args) = " + resultado);

        System.out.println("aritmetica1.a = " + aritmetica1.a);
        System.out.println("aritmetica1.b = " + aritmetica1.b);
        
        Aritmetica aritmetica2 = new Aritmetica(5, 8);
        System.out.println("aritmetica2.a = " + aritmetica2.a);
        System.out.println("aritmetica2.b = " + aritmetica2.b);
        /* 
        Para la recolección de basura (liberar memoria)
        existen dos cosas (solo a modo de ejemplo, no usar):
        
        aritmetica1 = null; // manualmente nulificamos el objeto
        System.cg(); // llamamos al metodo garbage collector, es pesado

        (!) De nuevo, ninguna de las dos se deben usar ya que directamente se hace solo o es innecesario
        */
    }

    public static void miMetodo() {
        // a = 10; // esto da error porque el alcance es limitado
        System.out.println("Aquí hay otro metodo");
    }
}
