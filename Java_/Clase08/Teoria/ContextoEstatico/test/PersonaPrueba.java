package Clase08.Teoria.ContextoEstatico.test;

import Clase08.Teoria.ContextoEstatico.domain.Persona;

public class PersonaPrueba {
    private int contador; // se puede crear atributos de esta clase PersonaPrueba sin problema

    public static void main(String[] args) {
        Persona persona1 = new Persona("Agnes");
        System.out.println("persona1 = " + persona1);
        Persona persona2 = new Persona("Reggie");
        System.out.println("persona2 = " + persona2);
        imprimir(persona1);
        // this.contador = 10; <- pero no se puede acceder a este desde un contexto estatico
        // para ello deberiamos hacer:
        PersonaPrueba personaP1 = new PersonaPrueba(); // este tiene contexto dinamico
        System.out.println(personaP1.getContador()); // por eso podremos acceder a este metodo sin problema
    }

    public static void imprimir(Persona persona) {
        System.out.println("Imprimir: persona = " + persona);
    }

    public int getContador() {
        imprimir(new Persona("Liliana"));
        return this.contador; // y aqui lo mismo, al ser dinamico podemos usar "this"
    }
}
