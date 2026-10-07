package Clase09.Teoria.domain;

public class Persona {
    // private <- no se hereda
    // protected <- si se heredaria, incluso para otras clases en otros paquetes

    // Atributos de herencia (debido a protected)
    protected String nombre;
    protected char genero;
    protected int edad;
    protected String direccion;

    // Constructor vacio para crear objetos sin tener que inicializar los atributos
    public Persona() { // Constructor 1

    }

    public Persona(String nombre) { // Constructor 2: solo nombre
        this.nombre = nombre;
    }

    public Persona(String nombre, char genero, int edad, String direccion) { // Constructor 3: completo
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return this.genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{nombre=").append(this.nombre);
        sb.append(", genero=").append(this.genero);
        sb.append(", edad=").append(this.edad);
        sb.append(", direccion=").append(this.direccion);
        sb.append(", ").append(super.toString());
        sb.append("}");
        return sb.toString();
    }
}
