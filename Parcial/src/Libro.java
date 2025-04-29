import java.util.List;

public class Libro {

    private String isbn;
    private List<Autor> autores;
    private Editorial editorial;

    public Libro(String isbn, Autor autores, Editorial editorial) {
        this.isbn = isbn;
        this.autores = (List<Autor>) autores;
        this.editorial = editorial;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    public void getEjemplaresDisponibles(Ejemplar ejemplar1) {
    }
}
