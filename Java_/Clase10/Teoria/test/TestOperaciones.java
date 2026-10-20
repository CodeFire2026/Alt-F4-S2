package Clase10.Teoria.test;

import Clase10.Teoria.operaciones.Operaciones;

public class TestOperaciones {
    public static void main(String[] args) {;
        System.out.println("Usando enteros: " + Operaciones.sumar(7, 9));
        System.out.println("Usando double: " + Operaciones.sumar(5.0, 7)); // al menos uno de los dos debe ser double
        System.out.println("Usando double pero con long: " + Operaciones.sumar(8, 6L)); // double soporta long
    }
}
