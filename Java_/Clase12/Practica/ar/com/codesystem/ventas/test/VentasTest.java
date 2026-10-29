package Clase12.Practica.ar.com.codesystem.ventas.test;

import Clase12.Practica.ar.com.codesystem.ventas.*;

public class VentasTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Pantalon", 9500.00);
        Producto producto2 = new Producto("Campera", 29900.00);

        Orden orden1 = new Orden();
        // Agregamos productos al arreglo
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.mostrarOrden();

        // Tarea
        // Crear más objetos de tipo Producto (por lo menos 10)
        // Crear más objetos de tipo Orden (por lo menos 2 más)

        System.out.println("--------------------------------------------------");

        Producto producto3 = new Producto("Remera", 2500.00);
        Producto producto4 = new Producto("Zapatillas", 15000.00);
        Producto producto5 = new Producto("Buzo", 18000.00);
        Producto producto6 = new Producto("Short", 3500.00);
        Producto producto7 = new Producto("Gorra", 1200.00);
        Producto producto8 = new Producto("Bufanda", 800.00);
        Producto producto9 = new Producto("Guantes", 1500.00);
        Producto producto10 = new Producto("Botas", 25000.00);
        Producto producto11 = new Producto("Camisa", 4000.00);

        Orden orden2 = new Orden();
        orden2.agregarProducto(producto3);
        orden2.agregarProducto(producto4);
        orden2.agregarProducto(producto5);
        orden2.mostrarOrden();

        System.out.println("--------------------------------------------------");

        Orden orden3 = new Orden();
        orden3.agregarProducto(producto2);
        orden3.agregarProducto(producto1);
        orden3.agregarProducto(producto3);
        orden3.agregarProducto(producto7);
        orden3.agregarProducto(producto7);
        orden3.agregarProducto(producto8);
        orden3.agregarProducto(producto5);
        orden3.agregarProducto(producto9);
        orden3.agregarProducto(producto6);
        orden3.agregarProducto(producto10);
        orden3.agregarProducto(producto11);
        orden3.mostrarOrden();
    }
}
