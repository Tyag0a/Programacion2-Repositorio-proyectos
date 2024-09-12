package co.edu.uniquindio.biblioteca.parcial1.model;

public class Libro extends Item{

    public String isbn;

    public Libro(){
    }

    public Libro(String titulo, String autor, EstadoItem estado, String isbn){
        super(titulo, autor, estado);

    }

    public static LibroBuilder builder() {
        return new LibroBuilder();
    }

    public String getIsbn() { return isbn; }

    public void setIsbn(String isbn) { isbn = isbn; }
}
