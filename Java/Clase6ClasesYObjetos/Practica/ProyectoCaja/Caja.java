

public class Caja {
    float ancho;
    float alto;
    float profundidad;
    
    public Caja() {
        // constructor vacio
    }

    public Caja(float ancho, float alto, float profundidad) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundidad = profundidad;
    }

    public float getVolumen() {
        return (this.ancho * this.alto * this.profundidad);
    }

    public float getAncho() {
        return this.ancho;
    }

    public float getAlto() {
        return this.alto;
    }

    public float getProfundidad() {
        return this.profundidad;
    }
}
