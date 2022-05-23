import java.util.*;
import java.util.stream.Collectors;

public class Blog {

    private List<Post> post = new ArrayList<>();

    public void adicionarPostagem(Post post){
        for (var p :this.post) {
            if(p.autor.equals(post.autor) && p.titulo.equals(post.titulo)){
                throw new IllegalArgumentException("Postagem jah existente");
            }
        }
        this.post.add(post);
    }

    public Set obterPostsPorAutor(Autor autor){

        var posts = new TreeSet<Post>();

        for (var p:this.post) {
            if(p.autor.equals(autor)){
                posts.add(p);
            }
        }

        return posts;
    }

    public Set obterPostsPorCategoria(Categorias categorias){

        var posts = new TreeSet<>();

        for (var p :this.post) {
            if(p.categoria.equals(categorias)){
                posts.add(p);
            }
        }

        return posts;
    }

    public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias(){

        Map<Categorias, Set<Post>> retorno = new TreeMap<>();

        Set<Categorias> categorias = new TreeSet<>();

        this.post.forEach( postagem -> categorias.add(postagem.categoria));

        for (var c :categorias) {
          var  posts = this.post.stream().filter(postagens -> postagens.categoria.equals(c)).collect(Collectors.toList());
          retorno.put(c, new TreeSet<>(posts));
        }

        return retorno;

    }

    public Map<Autor, Set<Post>> obterTodosPostsPorAutor(){

        Map<Autor, Set<Post>> retorno = new TreeMap<>();

        Set<Autor> autores = new TreeSet<>();

        this.post.forEach( postagem -> autores.add(postagem.autor));

        for (var a :autores) {
            var  posts = this.post.stream().filter(postagens -> postagens.autor.equals(a)).collect(Collectors.toSet());
            retorno.put(a, posts);
        }

        return retorno;
    }

    public Set<Autor> obterTodosAutores(){

        var autores = new TreeSet<Autor>();

        for (var p :this.post) {
            autores.add(p.autor);
        }


        return autores;
    }

    public Map<Categorias, Integer> obterContagemPorCategoria(){

        TreeMap<Categorias, Integer> categorias = new TreeMap<>();
        var nR = new ArrayList<>();

        for (var p :this.post) {
            nR.add(p.categoria);
            categorias.put(Categorias.valueOf(String.valueOf(p.categoria)), Collections.frequency(nR, p.categoria));
        }


        return categorias;
    }


}
