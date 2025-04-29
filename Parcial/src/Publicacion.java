import java.util.List;

public class Publicacion {
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public List<Ejemplar> getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(List<Ejemplar> ejemplares) {
        this.ejemplares = ejemplares;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    private String titulo;
    private int anio;
    private List<Ejemplar> ejemplares;
    private Genero genero;

    public Publicacion(String titulo, int anio, Genero genero, List<Ejemplar> ejemplares) {
        this.titulo = titulo;
        this.anio = anio;
        this.genero = genero;
        this.ejemplares = ejemplares;
    }

    public Publicacion(String titulo, int anio, Genero fansasía, Editorial editorial) {
    }



    public List<Ejemplar> getEjemplaresDisponibles(Libro libro) {
        Ejemplar ejemplar = new Ejemplar("1000", EstadoEjemplar.DISPONIBLE, libro);
        Ejemplar ejemplar2 = new Ejemplar("2000", EstadoEjemplar.EXTRAVIADO, libro);
        return List.of(ejemplar, ejemplar2);
    }
}
