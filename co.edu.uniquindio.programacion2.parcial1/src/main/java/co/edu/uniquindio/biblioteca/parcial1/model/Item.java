package co.edu.uniquindio.biblioteca.parcial1.model;

public class Item {

    public String titulo;
    public String autor;
    public EstadoItem estado;

    public Item(){
    }

    public Item(String titulo, String autor, EstadoItem estado) {
        this.titulo = titulo;
        this.autor = autor;
        this.estado = estado;
    }

    public String getTitulo() { return titulo; }

    public String getAutor() { return autor; }

    public EstadoItem getEstado() { return estado; }

    public void setTitulo(String titulo) { this.titulo = titulo; }

    public void setAutor(String autor) { this.autor = autor; }

    public void setEstado(EstadoItem estado) { this.estado = estado; }
}
