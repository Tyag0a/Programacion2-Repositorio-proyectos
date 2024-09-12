package co.edu.uniquindio.biblioteca.parcial1.services;
import co.edu.uniquindio.biblioteca.parcial1.model.Prestamo;

public interface ICrudPrestamo {

    public boolean crearPrestamo();
    public boolean eliminarPrestamo();
    public Prestamo getPrestamo();
}
