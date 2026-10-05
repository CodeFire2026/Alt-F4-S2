package Clase08.Teoria.ContextoEstatico.domain;

public class Persona {
    // Cargamos los atributos
    private int idPersona;
    private static int contadorPersona; // asociada a la clase Persona, de lo contrario se reiniciaría
    private String nombre;

    // Aquellos que no sean static utilizamos el "this",
    // para aquellos que sean static utilizamos el nombre de la clase con el
    // operador punto "."

    // Constructor
    public Persona(String nombre) {
        this.nombre = nombre;
        // Incrementar el contador por cada objeto nuevo
        Persona.contadorPersona++; // No utilizar el operador this, necesitamos cambiarlo a nivel clase
        // Vamos a asignar un nuevo valor a la variable idPersona
        this.idPersona = Persona.contadorPersona;
    }

    public static int getContadorPersona() {
        return contadorPersona;
    }

    public static void setContadorPersona(int contadorPersona) {
        Persona.contadorPersona = contadorPersona;
    }

    public int getIdPersona() {
        return this.idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        // return super.toString();
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + "}";
    }
}
