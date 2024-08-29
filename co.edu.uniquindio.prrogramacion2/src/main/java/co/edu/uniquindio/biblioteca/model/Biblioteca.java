package co.edu.uniquindio.biblioteca.model;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Biblioteca {
    private List<Libro> libros;
    private List<Miembro> miembros;
    private Bibliotecario bibliotecario;

    public Biblioteca() {
        libros = new ArrayList<>();
        miembros = new ArrayList<>();
        bibliotecario = new Bibliotecario("Laura García", "E001");
    }

    /**
     * Metodo mostrar el menu de la interfaz.
     */

    public void mostrarMenu() {
        while (true) {
            String[] opciones = {
                    "Registrar libro",
                    "Registrar miembro",
                    "Realizar préstamo",
                    "Calcular multa por retraso",
                    "Filtrar libros disponibles",
                    "Buscar préstamos activos",
                    "Salir"
            };

            String opcion = (String) JOptionPane.showInputDialog(
                    null,
                    "Seleccione una opción",
                    "Sistema de Gestión de Biblioteca",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    opciones,
                    opciones[0]
            );

            if (opcion == null || opcion.equals("Salir")) {
                break;
            }

            /**
             * Switch case para la estructura del menu.
             */

            switch (opcion) {
                case "Registrar libro":
                    registrarLibro();
                    break;

                case "Registrar miembro":
                    registrarMiembro();
                    break;

                case "Realizar préstamo":
                    realizarPrestamo();
                    break;

                case "Calcular multa por retraso":
                    calcularMulta();
                    break;

                case "Filtrar libros disponibles":
                    filtrarLibrosDisponibles();
                    break;

                case "Buscar préstamos activos":
                    buscarPrestamosActivos();
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        }
    }

    /**
     * Metodo para registrar un libro
     */

    private void registrarLibro() {
        String titulo = JOptionPane.showInputDialog("Ingrese el título del libro:");
        String autor = JOptionPane.showInputDialog("Ingrese el autor del libro:");
        String ISBN = JOptionPane.showInputDialog("Ingrese el ISBN del libro:");
        libros.add(new Libro(titulo, autor, ISBN));
        JOptionPane.showMessageDialog(null, "Libro registrado exitosamente.");
    }

    /**
     * Metodo para registrar un miembro
     */

    private void registrarMiembro() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del miembro:");
        String idMiembro = JOptionPane.showInputDialog("Ingrese el ID del miembro:");
        miembros.add(new Miembro(nombre, idMiembro));
        JOptionPane.showMessageDialog(null, "Miembro registrado exitosamente.");
    }

    /**
     * Metodo para gestionar un prestamo
     */

    private void realizarPrestamo() {
        String nombreMiembro = JOptionPane.showInputDialog("Ingrese el nombre del miembro:");
        Miembro miembro = miembros.stream()
                .filter(m -> m.getNombre().equals(nombreMiembro))
                .findFirst()
                .orElse(null);
        if (miembro == null) {
            JOptionPane.showMessageDialog(null, "Miembro no encontrado.");
            return;
        }

        String tituloLibro = JOptionPane.showInputDialog("Ingrese el título del libro:");
        Libro libro = libros.stream()
                .filter(l -> l.getTitulo().equals(tituloLibro))
                .findFirst()
                .orElse(null);
        if (libro == null) {
            JOptionPane.showMessageDialog(null, "Libro no encontrado.");
            return;
        }

        bibliotecario.gestionarPrestamos(libro, miembro);
    }

    /**
     * Metodo para calcular una multa
     */

    private void calcularMulta() {
        String nombreMiembro = JOptionPane.showInputDialog("Ingrese el nombre del miembro:");
        Miembro miembro = miembros.stream()
                .filter(m -> m.getNombre().equals(nombreMiembro))
                .findFirst()
                .orElse(null);
        if (miembro == null) {
            JOptionPane.showMessageDialog(null, "Miembro no encontrado.");
            return;
        }

        String tituloLibro = JOptionPane.showInputDialog("Ingrese el título del libro:");
        Libro libro = libros.stream()
                .filter(l -> l.getTitulo().equals(tituloLibro))
                .findFirst()
                .orElse(null);
        if (libro == null) {
            JOptionPane.showMessageDialog(null, "Libro no encontrado.");
            return;
        }

        Prestamo prestamo = miembro.getPrestamosActivos().stream()
                .filter(p -> p.getLibro().equals(libro))
                .findFirst()
                .orElse(null);
        if (prestamo == null) {
            JOptionPane.showMessageDialog(null, "Préstamo no encontrado.");
            return;
        }

        long multa = prestamo.calcularMulta();
        JOptionPane.showMessageDialog(null, "La multa es: " + multa);
    }

    /**
     * Metodo para mostrar los libros que se encuentran disponibles
     */

    private void filtrarLibrosDisponibles() {
        List<Libro> librosDisponibles = bibliotecario.filtrarLibrosDisponibles(libros);
        StringBuilder sb = new StringBuilder("Libros disponibles:\n");
        for (Libro l : librosDisponibles) {
            sb.append(l.getTitulo()).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }

    /**
     * Metodo para buscar los prestamos activos y mostrarlos
     */

    private void buscarPrestamosActivos() {
        String nombreMiembro = JOptionPane.showInputDialog("Ingrese el nombre del miembro:");
        Miembro miembro = miembros.stream()
                .filter(m -> m.getNombre().equals(nombreMiembro))
                .findFirst()
                .orElse(null);
        if (miembro == null) {
            JOptionPane.showMessageDialog(null, "Miembro no encontrado.");
            return;
        }

        List<Prestamo> prestamosActivos = miembro.buscarPrestamosActivos();
        StringBuilder sb = new StringBuilder("Préstamos activos:\n");
        for (Prestamo p : prestamosActivos) {
            sb.append(p.getLibro().getTitulo()).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }
}
