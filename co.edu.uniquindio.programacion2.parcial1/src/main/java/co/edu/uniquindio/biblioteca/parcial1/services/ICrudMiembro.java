package co.edu.uniquindio.biblioteca.parcial1.services;

import co.edu.uniquindio.biblioteca.parcial1.model.Miembro;

public interface ICrudMiembro {

    public boolean crearMiembro (String nombre, String apellido, int idMiembro);
    public boolean eliminarMiembro(int idMiembro);
    public boolean modificarMiembro(String nombre, String apellido, int idMiembro);
    public Miembro getMiembro(String nombre);

}
