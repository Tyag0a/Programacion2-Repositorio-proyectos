package co.edu.uniquindio.biblioteca.parcial1.model;

import java.util.Collection;
import java.util.LinkedList;

public class Miembro {

    String nombre;
    String apellido;
    int idMiembro;
    Collection<Prestamo> prestamosActivos;

    public Miembro(){
        this.prestamosActivos = new LinkedList<>();
    }

    public Miembro(String nombre, String apellido, int idMiembro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.idMiembro = idMiembro;
        this.prestamosActivos = new LinkedList<>();
    }

    public String getNombre() { return nombre; }

    public String getApellido() { return apellido; }

    public int getIdMiembro() { return idMiembro; }

    public Collection<Prestamo> getPrestamosActivos() { return prestamosActivos; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public void setApellido(String apellido) { this.apellido = apellido; }

    public void setIdMiembro(int idMiembro) { this.idMiembro = idMiembro; }

    public void setPrestamosActivos(Collection<Prestamo> prestamosActivos) { this.prestamosActivos = prestamosActivos; }



}
