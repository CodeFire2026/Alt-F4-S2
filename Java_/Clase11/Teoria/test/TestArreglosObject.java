package Clase11.Teoria.test;

import Clase11.Teoria.domain.Persona;

public class TestArreglosObject {
    public static void main(String[] args) {
        Persona personas[] = new Persona[2];
        personas[0] = new Persona("Abel");
        personas[1] = new Persona("Joel");
        System.out.println("personas[0] = " + personas[0]);
        System.out.println("personas[1] = " + personas[1]);

        for (int i = 0; i < personas.length; i++) {
            System.out.println("Persona numero " + (i + 1) + ": " + personas[i]);
        }

        // "Sintaxis resumida" v
        String frutas[] = { "Banana", "Pera", "Durazno" };
        
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("fruta " + (i+1) + "°: " + frutas[i]);
        }
    }
}
