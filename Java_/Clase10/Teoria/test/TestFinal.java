/* 
Uso de la palabra Final
Esta palabra tiene diferentes significados dependiendo donde se aplique
    Variables: evita cambiar el valor que almacena la variable
    Métodos: evita que se modifique la definición o el comportamiento de
             un método desde una subclase (hija)
    Clases: evita que se creen clases hijas
Otra caracteristica es que normalmente, cuando trabajamos con variables
se combina con el modificador de acceso estático para convertir una
variable en una constante, es decir que no se puede modificar su valor,
el ejemplo de esto es la clase Math en la cuál todos sus atributos
son de tipo static y final, es por esto que la variable pi se conoce
como una constante.
*/

package Clase10.Teoria.test;

public class TestFinal {
    public static void main(String[] args) {
        final int dni = 46709876;
        System.out.println(dni);
        // dni = 23560733; <- tira error porque no se puede modificar
    }
}

/*


--- Video 10.4 Parte 2 ---

Si en un archivo fuesemos a escribir:
    public final class Persona {}
Y luego en otro archivo intentaramos hacer:
    public class Empleado extends Persona {}
Nos daria error ya que "final" no permite clases hijas

Algo similar con los métodos:
Si en Persona() tenemos:
    
    public final void imprimir() {
        System.out.println("Hello");
    }

Entonces en Empleado() nos va a tirar error si intentamos agregar el metodo:

    public void imprimir() {  <- esta parte estaria en rojo
        System.out.println("Hola");
    }

Ya que no podemos sobreescribir el metodo del padre



--- Video 10.4 Parte 3 ---
Sintaxis correcta para las CONSTANTES (en este ejemplo es un atributo de Persona):

    public final static int NOMBRE_DE_CONSTANTE = 15;

Por convención (es decir, no por regla del lenguaje), las constantes las escribimos en mayusculas y con guiones bajos
Si intentamos despues modificar la constante, obviamente nos dará error (en nuestro ejemplo, la constante no puede cambiar de 15)
Pero podemos llamarla sin problema:
    System.out.println(Persona.NOMBRE_DE_CONSTANTE);



--- Video 10.4 Parte 4 ---
Final también se puede usar para objetos:
    final Persona persona1 = new Persona();
    persona1 = new Empleado(); <- tira ERROR, porque no se le puede asignar una nueva referencia
Lo que sí se puede hacer es get y set sin problema



*/