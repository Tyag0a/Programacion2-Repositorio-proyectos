package co.edu.uniquindio.biblioteca.parcial1.services;

import co.edu.uniquindio.biblioteca.parcial1.model.EstadoItem;
import co.edu.uniquindio.biblioteca.parcial1.model.Libro;

public interface ICrudLibro {

    public boolean crearLibro (String titulo, String autor, EstadoItem estado);
    public boolean eliminarLibro(String titulo);
    public boolean modificarLibro(String titulo, String autor, EstadoItem estado);
    public Libro getLibro(String nombre);
}
