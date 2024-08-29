package co.edu.uniquindio.biblioteca.model;

import java.time.LocalDate;

public class Prestamo {
    private Libro libro;
    private Miembro miembro;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;

    public Prestamo(Libro libro, Miembro miembro, LocalDate fechaPrestamo, LocalDate fechaDevolucion) {
        this.libro = libro;
        this.miembro = miembro;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    public Libro getLibro() {
        return libro;
    }

    public Miembro getMiembro() {
        return miembro;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public long calcularMulta() {
        long diasRetraso = LocalDate.now().toEpochDay() - fechaDevolucion.toEpochDay();
        return diasRetraso > 0 ? diasRetraso * 5 : 0;  // Multa de 5 unidades por día de retraso
    }
}

