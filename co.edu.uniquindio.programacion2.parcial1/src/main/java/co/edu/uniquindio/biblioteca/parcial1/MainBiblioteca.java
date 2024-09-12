package co.edu.uniquindio.biblioteca.parcial1;

import co.edu.uniquindio.biblioteca.parcial1.factory.ModelFactory;
import co.edu.uniquindio.biblioteca.parcial1.model.EstadoItem;

public class MainBiblioteca {

    public static void main(String[] args) {

        ModelFactory modelFactory = ModelFactory.getInstance();

        crudMiembro(modelFactory);
        crudLibro(modelFactory);

        System.out.println("\n---------Confirmacion de funcionamento de las funcionalidades del proyecto--------");

    }

    public static void crudMiembro(ModelFactory modelFactory) {
        crearMiembro(modelFactory);
        eliminarMiembro(modelFactory);

    }


    public static void crudLibro(ModelFactory modelFactory) {
        crearLibro(modelFactory);
        eliminarLibro(modelFactory);

    }

    public static void crearMiembro(ModelFactory modelFactory) {
        boolean confirmacionAgg1 = modelFactory.crearMiembro("John jairo","diaz",10);
        System.out.println("* Estado del proceso de creacion del miembro: "+confirmacionAgg1);

    }

    public static void eliminarMiembro(ModelFactory modelFactory) {
        boolean eliminado = modelFactory.eliminarMiembro(10);
        System.out.println("\n* Estado del proceso de eliminacion del miembro: "+eliminado);

    }

    public static void crearLibro(ModelFactory modelFactory) {
        boolean confirmacionAgg2 = modelFactory.crearLibro("Ana frank", "Ana Frank", EstadoItem.DISPONIBLE);
        System.out.println("\n* Estado del proceso de creacion del libro en la base de datos: " +confirmacionAgg2);

    }

    public static void eliminarLibro(ModelFactory modelFactory) {
        boolean eliminado = modelFactory.eliminarLibro("Ana frank");
        System.out.println("\n* Estado del proceso de eliminacion del libro de la base de datos: "+eliminado);

    }


}
