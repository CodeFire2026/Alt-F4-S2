package Clase08.Teoria;

import Clase08.Teoria.dominio.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Osvaldo", 57000, false);
        System.out.println("persona1 nombre: " + persona1.getNombre());

        // Modificar a traves de metodos
        persona1.setNombre("Juan Ignacio");

        // persona1.nombre = "Juan Ignacio"; <- no se puede utilizar (porque es privado)
        // System.out.println("Nombre: " + persona1.nombre); daria error

        System.out.println("persona1 nombre modificado: " + persona1.getNombre());
        System.out.println("persona1 sueldo: " + persona1.getSueldo());
        System.out.println("persona1 booleano: " + persona1.isEliminado());

        // Tarea: crear otro objeto de tipo Persona, asignar valores de manera inicial
        // e imprimir. Luego modificar sus valores y volver a imprimir
        Persona persona2 = new Persona("Ruti", 67000, false);
        System.out.println("persona2 nombre: " + persona2.getNombre());
        System.out.println("persona2 sueldo: " + persona2.getSueldo());
        System.out.println("persona2 eliminado?: " + persona2.isEliminado());

        persona2.setNombre("Ester");
        persona2.setSueldo(97000);
        persona2.setEliminado(true);
        System.out.println("persona2 nombre modificado: " + persona2.getNombre());
        System.out.println("persona2 sueldo modificado: " + persona2.getSueldo());
        System.out.println("persona2 eliminado modificado: " + persona2.isEliminado());

        // --- Viendo el toString() ---
        // System.out.println("persona1: " + persona1.toString());
        // ^ normalmente hariamos esto, pero como ya está definido el método
        // y por la forma en la que funciona toString(), podemos hacer:
        System.out.println("persona1 = " + persona1);
    }

    // --- Contextos ---
    // Cuando se trabaja en la clase, estamos en el contexto estático
    // Cuando creamos un objeto (es decir cuando la clase está en memoria), estamos en el contexto dinámico
    // El contexto estático no puede acceder al contexto dinámico, pero sí al revés
    // usando la palabra "static" = atributos/metodos se asocian con la clase
    // sin la palabra "static" = atributos/metodos se asocian con los objetos
}
