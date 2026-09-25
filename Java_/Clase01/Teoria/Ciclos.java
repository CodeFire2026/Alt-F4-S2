package Clase01.Teoria;

public class Ciclos {
    public static void main(String[] args) {
        // Bucle While
        var conteo = 0;
        while (conteo < 3) {
            System.out.println("Conteo = " + conteo);
            conteo++;
        }

        // Bucle Do While
        var contador = 0;
        do {
            System.out.println("contador = " + contador);
            contador++;
        } while (contador < 7);

        // Bucle For
        for (var contando = 0; contando < 7; contando++) {
            System.out.println("Contando = " + contando);
        }

        // Bucle For con break
        for (var contanding = 0; contanding < 7; contanding++) {
            if (contanding % 2 == 0) {
                System.out.println("Contanding = " + contanding);
                break;
            }
        }

        // Bucle For con continue
        for (var contado = 0; contado < 7; contado++) {
            if (contado % 2 != 0) {
                continue;
            }
            System.out.println("Contado = " + contado);
        }
        
        etiqueta_uno:
        // Bucle con etiquetas
        for (var i = 0; i < 7; i++) {
            if (i % 2 != 0) {
                continue etiqueta_uno; 
                // break etiqueta_uno;      // lo mismo para break
            }
            System.out.println("i = " + i);
        }
    }
}
