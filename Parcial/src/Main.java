import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Direccion direccionEditorial = new Direccion("Calle jorge", 123, "Ciudad San Francisco", "12345");

        Genero genero = new Genero("Accion", "Libros de Accion");

        Revista revista = new Revista(2, 3);

        Autor autor1 = new Autor("Stanley", "Estadounidense", LocalDate.of(1920, 3, 2));
        Autor autor2 = new Autor("Morgui", "Estadouniddense", LocalDate.of(1917, 12, 16));

        Libro libro = new Libro("isbn", autor1, new Editorial("Marvel","marvel.com"));

        Ejemplar ejemplar1 = new Ejemplar("EJ001", EstadoEjemplar.DISPONIBLE, libro);
        Ejemplar ejemplar2 = new Ejemplar("EJ002", EstadoEjemplar.DISPONIBLE, libro);

        libro.getEjemplaresDisponibles(ejemplar1);
        libro.getEjemplaresDisponibles(ejemplar2);

       Biblioteca biblioteca; new Biblioteca(ejemplar2, ejemplar1);

       Usuario usuario = new Usuario("Mateo","Morgui","47.269.785", (List<Prestamo>) new Prestamo("09/05/2024","15/05/2024","--"));

    }
}