package co.edu.uniquindio.biblioteca.parcial1.model;

import java.util.Collection;
import java.util.LinkedList;
import co.edu.uniquindio.biblioteca.parcial1.model.*;
import co.edu.uniquindio.biblioteca.parcial1.services.ICrudLibro;
import co.edu.uniquindio.biblioteca.parcial1.services.ICrudMiembro;

public class Biblioteca implements ICrudMiembro, ICrudLibro {

    String nombre;
    Collection<Miembro> listaMiembros;
    Collection<Empleado> listaEmpleados;
    Collection<Libro> listaLibros;
    Collection<Prestamo> listaPrestamos;
    Collection<Dvd> listaDvds;
    Collection<Revista> listaRevistas;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        listaMiembros = new LinkedList<>();
        listaEmpleados = new LinkedList<>();
        listaLibros = new LinkedList<>();
        listaPrestamos = new LinkedList<>();
        listaDvds = new LinkedList<>();
        listaRevistas = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Collection<Miembro> getListaMiembros() {
        return listaMiembros;
    }

    public void setListaMiembros() {
        this.listaMiembros = new LinkedList<>();
    }

    public Collection<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados() {
        this.listaEmpleados = new LinkedList<>();
    }

    public Collection<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros() {
        this.listaLibros = new LinkedList<>();
    }

    public Collection<Prestamo> getListaPrestamos() {
        return listaPrestamos;
    }

    public void setListaPrestamos() {
        this.listaPrestamos = new LinkedList<>();
    }

    public void setListaEmpleados(Collection<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public void setListaLibros(Collection<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public void setListaPrestamos(Collection<Prestamo> listaPrestamos) {
        this.listaPrestamos = listaPrestamos;
    }

    public void setListaMiembros(Collection<Miembro> listaMiembros) {
        this.listaMiembros = listaMiembros;
    }

    public Collection<Dvd> getListaDvds() { return listaDvds; }

    public void setListaDvds(Collection<Dvd> listaDvds) { this.listaDvds = listaDvds; }

    public void setListaRevistas(Collection<Revista> listaRevistas) { this.listaRevistas = listaRevistas; }

    public Collection<Revista> getListaRevistas() { return listaRevistas; }

    /**
     * Verifica si un miembro ya existe  en la coleccion.
     *
     * @return un objeto miembro.
     */


    private Miembro verificarMiembro(String nombre, int idMiembro) {
        Miembro miembroExistente = null;

        for (Miembro miembro : listaMiembros) {
            if (miembro.getNombre().equals(nombre) && miembro.getIdMiembro() == idMiembro) {
                miembroExistente = miembro;
                break;
            }
        }

        return miembroExistente;
    }

    /**
     * Verifica si un libro ya existe  en la coleccion.
     *
     * @return un objeto libro.
     */

    private Libro verificarLibro(String titulo) {
        Libro libroExistente = null;

        for (Libro libro : listaLibros) {
            if (libro.getTitulo().equals(titulo)) {
                libroExistente = libro;
                break;
            }
        }

        return libroExistente;
    }

    @Override
    public boolean crearLibro(String titulo, String autor, EstadoItem estado) {
        Libro newLibro = new Libro();
        Libro libroExistente = verificarLibro(titulo);

        if (libroExistente == null) {
            newLibro.setTitulo(titulo);
            newLibro.setAutor(autor);
            newLibro.setEstado(estado);
            listaLibros.add(newLibro);

            return true;
        }

        return false;

    }

    @Override
    public boolean eliminarLibro(String titulo) {
        Libro libro = verificarLibro(titulo);
        if (libro != null) {
            listaLibros.remove(libro);
            return true;
        }
        return false;
    }

    @Override
    public boolean modificarLibro(String titulo, String autor, EstadoItem estado) {
        return false;
    }

    @Override
    public Libro getLibro(String nombre) {
        return null;
    }

    @Override
    public boolean crearMiembro(String nombre, String apellido, int idMiembro) {
        Miembro newMimbro = new Miembro();
        Miembro miembroExistente = verificarMiembro(nombre, idMiembro);

        if (miembroExistente == null) {
            newMimbro.setNombre(nombre);
            newMimbro.setApellido(apellido);
            newMimbro.setIdMiembro(idMiembro);
            listaMiembros.add(newMimbro);

            return true;
        }
        return false;
    }

    @Override
    public boolean eliminarMiembro(int idMiembro) {
        Miembro miembro = verificarMiembro(nombre, idMiembro);
        if (miembro != null) {
            listaMiembros.remove(miembro);
            return true;
        }
        return false;
    }

    @Override
    public boolean modificarMiembro(String nombre, String apellido, int idMiembro) {
        return false;
    }

    @Override
    public Miembro getMiembro(String nombre) {
        return null;
    }



}
