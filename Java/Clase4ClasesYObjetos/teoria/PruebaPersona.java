package teoria;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "John";
        persona1.apellido = "Doe";
        persona1.ObtenerInformacion();
        
        Persona persona2 = new Persona();
        System.out.println("persona2 = " + persona2);
        System.out.println("persona1 = " + persona1);
        persona2.ObtenerInformacion();
        persona2.nombre = "Jane";
        persona2.apellido = "Doey";
        persona2.ObtenerInformacion();
    }
}
