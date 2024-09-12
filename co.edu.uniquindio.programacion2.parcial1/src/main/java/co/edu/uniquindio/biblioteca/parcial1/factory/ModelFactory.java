package co.edu.uniquindio.biblioteca.parcial1.factory;

import co.edu.uniquindio.biblioteca.parcial1.model.*;
import co.edu.uniquindio.biblioteca.parcial1.services.*;
import java.time.LocalDate;

//Clase singlenton

public class ModelFactory implements ICrudLibro, ICrudMiembro {

    private static ModelFactory instance;
    private static Biblioteca biblioteca;

    private ModelFactory() {
        inicializarDatos();
    }

    public static ModelFactory getInstance() {
        if (instance == null) {
            instance = new ModelFactory();
        }
        return instance;
    }

    /**
     * Inicializa los datos de la biblioteca, incluyendo miembros, libros y prestamos.
     *
     * @return una instancia de Biblioteca con datos predefinidos.
     */

    public static void inicializarDatos() {

        biblioteca = new Biblioteca("Biblioteca uq");

        //libros

        Libro libro1 = new Libro();
        libro1.setTitulo("El Quijote");
        libro1.setAutor("Miguel de Cervantes");
        libro1.setEstado(EstadoItem.DISPONIBLE);

        Libro libro2 = new Libro();
        libro2.setTitulo("1984");
        libro2.setAutor("Jorge Orwell");
        libro2.setEstado(EstadoItem.DISPONIBLE);

        Libro libro3 = new Libro();
        libro3.setTitulo("Cien años de soledad");
        libro3.setAutor("Gabriel García Márquez");
        libro3.setEstado(EstadoItem.DISPONIBLE);

        Libro libro4 = new Libro();
        libro4.setTitulo("Algebra Baldor");
        libro4.setAutor("John Jairo Baldor");
        libro4.setEstado(EstadoItem.DISPONIBLE);

        Libro libro5 = new Libro();
        libro5.setTitulo("Hamlet");
        libro5.setAutor("Wilder Shakespeare");
        libro5.setEstado(EstadoItem.DISPONIBLE);

        Libro libro6 = new Libro();
        libro6.setTitulo("La Odisea");
        libro6.setAutor("Homero Simpson");
        libro6.setEstado(EstadoItem.DISPONIBLE);

        //Miembros

        Miembro miembro1 = new Miembro();
        miembro1.setNombre("Juanito");
        miembro1.setApellido("Pérez");
        miembro1.setIdMiembro(10);

        Miembro miembro2 = new Miembro();
        miembro2.setNombre("María");
        miembro2.setApellido("Rodríguez");
        miembro2.setIdMiembro(11);

        Miembro miembro3 = new Miembro();
        miembro3.setNombre("Carlos");
        miembro3.setApellido("García");
        miembro3.setIdMiembro(12);

        Miembro miembro4 = new Miembro();
        miembro4.setNombre("Luisa");
        miembro4.setApellido("Martínez");
        miembro4.setIdMiembro(13);

        Miembro miembro5 = new Miembro();
        miembro5.setNombre("Jorge");
        miembro5.setApellido("Gómez");
        miembro5.setIdMiembro(14);

        //Prestamos

        Prestamo prestamo1 = new Prestamo();
        prestamo1.setFechaPrestamo(LocalDate.of(2024, 9, 1));
        prestamo1.setFechaDevolucion(LocalDate.of(2024, 9, 15));
        prestamo1.setLibroPrestamo(libro1);
        prestamo1.setMiembroPrestamo(miembro1);

        Prestamo prestamo2 = new Prestamo();
        prestamo2.setFechaPrestamo(LocalDate.of(2024, 9, 2));
        prestamo2.setFechaDevolucion(LocalDate.of(2024, 9, 16));
        prestamo2.setLibroPrestamo(libro2);
        prestamo2.setMiembroPrestamo(miembro2);

        Prestamo prestamo3 = new Prestamo();
        prestamo3.setFechaPrestamo(LocalDate.of(2024, 9, 3));
        prestamo3.setFechaDevolucion(LocalDate.of(2024, 9, 17));
        prestamo3.setLibroPrestamo(libro3);
        prestamo3.setMiembroPrestamo(miembro3);

        Prestamo prestamo4 = new Prestamo();
        prestamo4.setFechaPrestamo(LocalDate.of(2024, 9, 4));
        prestamo4.setFechaDevolucion(LocalDate.of(2024, 9, 18));
        prestamo4.setLibroPrestamo(libro4);
        prestamo4.setMiembroPrestamo(miembro4);

        Prestamo prestamo5 = new Prestamo();
        prestamo5.setFechaPrestamo(LocalDate.of(2024, 9, 5));
        prestamo5.setFechaDevolucion(LocalDate.of(2024, 9, 19));
        prestamo5.setLibroPrestamo(libro5);
        prestamo5.setMiembroPrestamo(miembro5);

        // asignacion en biblioteca

        biblioteca.getListaLibros().add(libro1);
        biblioteca.getListaLibros().add(libro2);
        biblioteca.getListaLibros().add(libro3);
        biblioteca.getListaLibros().add(libro4);
        biblioteca.getListaLibros().add(libro5);
        biblioteca.getListaLibros().add(libro6);

        biblioteca.getListaMiembros().add(miembro1);
        biblioteca.getListaMiembros().add(miembro2);
        biblioteca.getListaMiembros().add(miembro3);
        biblioteca.getListaMiembros().add(miembro4);
        biblioteca.getListaMiembros().add(miembro5);

        biblioteca.getListaPrestamos().add(prestamo1);
        biblioteca.getListaPrestamos().add(prestamo2);
        biblioteca.getListaPrestamos().add(prestamo3);
        biblioteca.getListaPrestamos().add(prestamo4);
        biblioteca.getListaPrestamos().add(prestamo5);

        miembro1.getPrestamosActivos().add(prestamo1);
        miembro2.getPrestamosActivos().add(prestamo2);
        miembro3.getPrestamosActivos().add(prestamo3);
        miembro4.getPrestamosActivos().add(prestamo4);
        miembro5.getPrestamosActivos().add(prestamo5);






    }

    @Override
    public boolean crearLibro(String titulo, String autor, EstadoItem estado) {
        return biblioteca.crearLibro(titulo, autor, estado);
    }

    @Override
    public boolean eliminarLibro(String titulo) {
        return biblioteca.eliminarLibro(titulo);
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
        return biblioteca.crearMiembro(nombre, apellido, idMiembro);
    }

    @Override
    public boolean eliminarMiembro(int idMiembro) {
        return biblioteca.eliminarMiembro(idMiembro);
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
