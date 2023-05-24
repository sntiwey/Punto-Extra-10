package org.example;

import org.example.Controlador.ContorladorEjemplo;
import org.example.Vista.Ventana;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {

        Ventana ventana = new Ventana("Ejemplo Jopcion");
        ContorladorEjemplo controller = new ContorladorEjemplo(ventana);
    }
}