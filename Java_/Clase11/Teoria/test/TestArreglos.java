package Clase11.Teoria.test;

public class TestArreglos {
    public static void main(String[] args) {
        int edades[] = new int[3];
        //  ^ variable      ^ instancia de tipo Object
        System.out.println("arreglo edades = " + edades);
    
        edades[0] = 17;
        System.out.println("edad [0] = " + edades[0]);
    
        edades[1] = 18;
        System.out.println("edad [1] = " + edades[1]);
    
        edades[2] = 19;
        System.out.println("edad [2] = " + edades[2]);
    
        // edades[3] = 7;  <- a la hora de ejecutar, dará error

        for (int i = 0; i < edades.length; i++) {
            System.out.println("Edad número " + (i+1) + ": " + edades[i]);
        }
    }
}
