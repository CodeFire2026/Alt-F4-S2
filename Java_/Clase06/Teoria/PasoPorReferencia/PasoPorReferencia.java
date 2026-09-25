// Aquí también vemos sobre Return y Null

package Clase06.Teoria.PasoPorReferencia;

import Clase04.Teoria.Persona;

public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Ester";
        System.out.println("person1.nombre = " + persona1.nombre);

        cambiarValor(persona1);
        System.out.println("person1.nombre (new) = " + persona1.nombre);

        persona1 = cambiarElValor(persona1);
        System.out.println("persona1.nombre (new 2) = " + persona1.nombre);
        Persona persona2 = null;
        persona2 = cambiarElValor(persona2);
    }

    public static void cambiarValor(Persona persona) {  // parametro por referencia
        persona.nombre = "Maria";
    }

    public static Persona cambiarElValor(Persona persona) {
        if (persona == null) {
            System.out.println("El valor de persona es invalido : Null");
            return null;
        }
        persona.nombre = "Monica";
        return persona;
    }
}
