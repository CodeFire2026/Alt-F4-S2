/*
Proyecto Caja:
Ejercicio 1: Crear un proyecto segun las especificaciones mostradas
a continuacion.
La formula es: volumen = ancho * alto * profundidad
Necesitamos mostrarlo de 2 maneras: un constructor vacio y un constructor con
argumentos (que reciba los parametros para la formula).
 */
public class Caja {
    // Atributos
    public double ancho;
    public double alto;
    public double profundidad;
    
    // Constructor vacío
    public Caja() {
    }
    
    // Constructor con argumentos
    public Caja(double ancho, double alto, double profundidad) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundidad = profundidad;
    }
    
    // Método para calcular el volumen
    public double calcularVolumen() {
        return this.ancho * this.alto * this.profundidad;
    }
}
