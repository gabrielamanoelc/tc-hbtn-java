import java.util.Objects;

public class Post implements Comparable<Post>{
    public Autor autor;

    public String titulo;

    public String corpo;

    public Categorias categoria;

    public Post(Autor autor, String titulo, String corpo, Categorias categoria) {
        this.autor = autor;
        this.titulo = titulo;
        this.corpo = corpo;
        this.categoria = categoria;
    }


    public String getTitulo() {
        return titulo;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Post post = (Post) o;

        if (autor != null ? !autor.equals(post.autor) : post.autor != null) return false;
        if (titulo != null ? !titulo.equals(post.titulo) : post.titulo != null) return false;
        if (corpo != null ? !corpo.equals(post.corpo) : post.corpo != null) return false;
        return categoria == post.categoria;
    }

    @Override
    public int hashCode() {
        int result = autor != null ? autor.hashCode() : 0;
        result = 31 * result + (titulo != null ? titulo.hashCode() : 0);
        result = 31 * result + (corpo != null ? corpo.hashCode() : 0);
        result = 31 * result + (categoria != null ? categoria.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(Post o) {
        return this.titulo.toString().compareTo(o.getTitulo().toString());
    }

    @Override
    public String toString() {
        return titulo;
    }

}
