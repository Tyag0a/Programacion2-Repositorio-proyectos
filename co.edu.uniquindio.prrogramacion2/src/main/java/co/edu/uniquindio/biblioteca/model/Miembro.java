package co.edu.uniquindio.biblioteca.model;

import java.util.ArrayList;
import java.util.List;

public class Miembro {
    private String nombre;
    private String idMiembro;
    private List<Prestamo> prestamosActivos;

    public Miembro(String nombre, String idMiembro) {
        this.nombre = nombre;
        this.idMiembro = idMiembro;
        this.prestamosActivos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdMiembro() {
        return idMiembro;
    }

    public List<Prestamo> getPrestamosActivos() {
        return prestamosActivos;
    }

    public void agregarPrestamo(Prestamo prestamo) {
        prestamosActivos.add(prestamo);
    }

    public List<Prestamo> buscarPrestamosActivos() {
        return prestamosActivos;
    }

}
