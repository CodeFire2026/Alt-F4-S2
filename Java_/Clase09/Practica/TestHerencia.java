package Clase09.Practica;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import Clase09.Teoria.domain.Cliente;

public class TestHerencia {
    public static void main(String[] args) {
        // Cliente 1 completo
        Cliente cliente1 = new Cliente(new Date(), true, "Leon", 'M', 49, "Racoon St. 328");
        System.out.println("cliente1 = " + cliente1);
        
        // Probando getters de cliente1
        System.out.println("cliente1 id = " + cliente1.getIdCliente());
        System.out.println("cliente1 fecha = " + cliente1.getFechaRegistro());
        System.out.println("cliente1 vip = " + cliente1.isVip());

        // Probando setters de cliente1 (.parse() requiere un try porque 
        // tira ParseException la cual es una verificada, es decir una excepcion checked)
        Date fechaRegistro; 
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
            fechaRegistro = formatter.parse("7-10-2024"); // pasamos por codigo duro, aunque podria ser por teclado tranquilamente
        } catch (ParseException e) {
            fechaRegistro = null; 
            System.out.println("Error: el formato de fecha debe coincidir!");
        }
        
        cliente1.setFechaRegistro(fechaRegistro);
        cliente1.setVip(false);
        System.out.println("cliente1 modificado = " + cliente1);
    }
}
