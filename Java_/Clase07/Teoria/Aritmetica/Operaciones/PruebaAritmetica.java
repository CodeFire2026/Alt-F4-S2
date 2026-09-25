// En la clase 7 vemos entonces:
// * Crear clase dentro de una clase

package Clase07.Teoria.Aritmetica.Operaciones;

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

        Persona persona1 = new Persona("Saul", "Goodman");
        System.out.println("persona1.nombre = " + persona1.nombre);
        System.out.println("persona1.apellido = " + persona1.apellido);
    }

    public static void miMetodo() {
        // a = 10; // esto da error porque el alcance es limitado
        System.out.println("Aquí hay otro metodo");
    }
}

// Atención: cualquier clase nueva no recibe el modificador de acceso "public" 
//  solo puede haber 1 clase publica.
//  Por defecto, reciben el modificador "package" o "default" (lo mismo para los metodos)
//  por lo tanto, solo serán accesibles para aquellas clases dentro del mismo paquete
//  nota: no se debe agregar las palabras "package" o "default" ya que se hace solo de fondo
class Persona {
    String nombre;
    String apellido;

    Persona(String nombre, String apellido) {
        super(); // Llamada al constructor de la clase padre Object, siempre debe ir al principio

        // Imprimir imprimir = new Imprimir();
        new Imprimir().imprimir(this);
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Objeto persona usando this: " + this);
    }
}

class Imprimir {
    Imprimir() {
        super(); // el constructor de la clase padre, para reservar memoria
    }

    void imprimir(Persona persona) {
        System.out.println("Persona desde la clase imprimir: " + persona);
        System.out.println("El objeto actual: " + this);
    }
}