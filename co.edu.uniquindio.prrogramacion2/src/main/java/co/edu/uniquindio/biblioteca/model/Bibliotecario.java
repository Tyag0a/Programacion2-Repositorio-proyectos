package co.edu.uniquindio.biblioteca.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Bibliotecario extends Empleado implements GestionInventario {

    public Bibliotecario(String nombre, String idEmpleado) {
        super(nombre, idEmpleado);
    }


    /**
     * Metodo implementado de la interfaz
     */

    @Override
    public void gestionarItem() {
        JOptionPane.showMessageDialog(null, "Gestionando items de la biblioteca.");
    }

    /**
     * Metodo para gestionar los prestamos
     *
     * @param {Libro} libro
     * @param {Miembro} miembro
     */

    public void gestionarPrestamos(Libro libro, Miembro miembro) {
        if (libro.isDisponible()) {
            libro.setDisponible(false);
            Prestamo prestamo = new Prestamo(libro, miembro, LocalDate.now(), LocalDate.now().plusWeeks(2));
            miembro.agregarPrestamo(prestamo);
            JOptionPane.showMessageDialog(null, "Préstamo registrado exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null, "El libro no está disponible.");
        }
    }

    /**
     * Metodo para filtrar los libros disponibles
     *
     * @param {List} lista de libros
     * @return {List} lista de libros disponibles
     */

    public List<Libro> filtrarLibrosDisponibles(List<Libro> libros) {
        List<Libro> librosDisponibles = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.isDisponible()) {
                librosDisponibles.add(libro);
            }
        }
        return librosDisponibles;
    }

}
