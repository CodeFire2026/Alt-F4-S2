package Clase10.Teoria.domain;

public class Empleado extends Persona {
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleados; // para incrementar

    // Video 10.1: Sobrecarga de Constructores
    public Empleado() {
        this.idEmpleado = ++Empleado.contadorEmpleados;
    }
    public Empleado(String nombre, double sueldo) {
        // super(nombre); esto se comenta porque o se usa super o se usa this no los dos
        this(); // estamos llamando desde aqui al constructor vacio ("llamar a un constructor interno")
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{idEmpleado=").append(idEmpleado);
        sb.append(", sueldo=").append(sueldo);
        sb.append(", ").append(super.toString());
        sb.append("}");
        return sb.toString();
    }
}
