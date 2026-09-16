/*
Proyecto Caja:
Clase de prueba
 */
public class PruebaCaja {
    public static void main(String[] args) {
        // Forma 1: Constructor vacío
        // Asignamos los valores directamente a los atributos
        Caja caja1 = new Caja();
        caja1.ancho = 3;
        caja1.alto = 4;
        caja1.profundidad = 5;
        
        System.out.println("CAJA 1: CONSTRUCTOR VACIO");
        System.out.println("Ancho: " + caja1.ancho);
        System.out.println("Alto: " + caja1.alto);
        System.out.println("Profundidad: " + caja1.profundidad);
        System.out.println("Volumen: " + caja1.calcularVolumen());
        
        // --- Forma 2: Constructor con argumentos ---
        Caja caja2 = new Caja(2, 6, 3);
        
        System.out.println("\nCAJA 2: CONSTRUCTOR CON ARGUMENTOS");
        System.out.println("Ancho: " + caja2.ancho);
        System.out.println("Alto: " + caja2.alto);
        System.out.println("Profundidad: " + caja2.profundidad);
        System.out.println("Volumen: " + caja2.calcularVolumen());
    }
}
