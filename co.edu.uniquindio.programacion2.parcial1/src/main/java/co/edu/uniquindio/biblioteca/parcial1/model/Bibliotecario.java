package co.edu.uniquindio.biblioteca.parcial1.model;

import co.edu.uniquindio.biblioteca.parcial1.services.IGestionInventario;

public class Bibliotecario extends Empleado implements IGestionInventario {

    public Bibliotecario(String nombre, String apellido, int idEmpleado) {
        super(nombre, apellido, idEmpleado);


    }

    
}
