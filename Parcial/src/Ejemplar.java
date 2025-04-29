public class Ejemplar {
    private String codigo;
    private EstadoEjemplar estado;
    private Publicacion publicacoin;

    public Ejemplar(String codigo, EstadoEjemplar estado, Libro libro) {
        this.codigo = codigo;
        this.estado = estado;
    }

    public Boolean estaDisponible(){
        if (EstadoEjemplar.DISPONIBLE != EstadoEjemplar.DISPONIBLE) {
            return true;
        }
        return false;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public EstadoEjemplar getEstado() {
        return estado;
    }

    public void setEstado(EstadoEjemplar estado) {
        this.estado = estado;
    }

    public Publicacion getPublicacoin() {
        return publicacoin;
    }

    public void setPublicacoin(Publicacion publicacoin) {
        this.publicacoin = publicacoin;
    }
}
