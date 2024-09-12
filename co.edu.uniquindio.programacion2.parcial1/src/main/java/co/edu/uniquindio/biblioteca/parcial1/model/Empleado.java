package co.edu.uniquindio.biblioteca.parcial1.model;

public class Empleado {

    String nombre;
    String apellido;
    int idEmpleado;

    public Empleado(String nombre, String apellido, int idEmpleado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() { return nombre; }

    public String getApellido() { return apellido; }

    public int getIdEmpleado() { return idEmpleado; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public void setApellido(String apellido) { this.apellido = apellido; }

    public void setIdEmpleado(int idEmpleado) { this.idEmpleado = idEmpleado; }
}
