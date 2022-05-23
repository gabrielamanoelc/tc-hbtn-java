import java.util.Objects;

public class Post {

    public String autor;

    public String titulo;

    public String corpo;

    public String categoria;

    public Post(String autor, String titulo, String corpo, String categoria) {
        this.autor = autor;
        this.titulo = titulo;
        this.corpo = corpo;
        this.categoria = categoria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return Objects.equals(autor, post.autor) && Objects.equals(titulo, post.titulo) && Objects.equals(corpo, post.corpo) && Objects.equals(categoria, post.categoria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autor, titulo, corpo, categoria);
    }
}
