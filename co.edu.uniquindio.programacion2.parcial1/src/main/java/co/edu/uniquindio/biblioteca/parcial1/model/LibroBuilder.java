package co.edu.uniquindio.biblioteca.parcial1.model;

//Patron builder

public class LibroBuilder {

    protected String titulo;
    protected String autor;
    protected EstadoItem estado;
    protected String isbn;

    public Libro build() {
        return new Libro(titulo,autor,estado, isbn);


    }

    public LibroBuilder titulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public LibroBuilder autor(String autor) {
        this.autor = autor;
        return this;
    }

    public LibroBuilder estado(EstadoItem estado) {
        this.estado = estado;
        return this;
    }

    public LibroBuilder isbn(String isbn) {
        this.isbn = isbn;
        return this;
    }


}
