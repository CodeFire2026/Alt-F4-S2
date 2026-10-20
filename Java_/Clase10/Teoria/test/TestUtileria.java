package Clase10.Teoria.test;

// Video 10.3 parte 1: importando. Todo y solo la clase especifica
// import Clase10.Teoria.ar.com.codesystem.*;
// import Clase10.Teoria.ar.com.codesystem.Utileria;

// Video 10.3 parte 2: importando de forma estatica solo un metodo especifico
import static Clase10.Teoria.ar.com.codesystem.Utileria.saludar; // solo aplica para metodos estaticos

public class TestUtileria {
    public static void main(String[] args) {
        // Video 10.3 parte 1: llamamos al metodo estatico de la clase importada
        // Utileria.saludar("world 1!");

        // Video 10.3 parte 2: 
        saludar("World 2!");

        // Es posible llamar al nombre completo de una clase y no tener que usar import
        Clase10.Teoria.ar.com.codesystem.Utileria.saludar("world 3!");
    }
}
