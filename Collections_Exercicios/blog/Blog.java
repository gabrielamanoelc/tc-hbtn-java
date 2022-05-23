import java.util.*;

public class Blog {

    private List<Post> post = new ArrayList<>();
    
    public void adicionarPostagem(Post post){
        this.post.add(post);
    }

    public Set<Object> obterTodosAutores(){

        var autores = new TreeSet<>();

        for (var postagem :this.post) {
            autores.add(postagem.autor);
        }

        return autores;
    }

    public Map<String, Integer> obterContagemPorCategoria(){

        TreeMap<String, Integer> categorias = new TreeMap<>();
        var nR = new ArrayList<>();

        for (var p :this.post) {
            nR.add(p.categoria);
            categorias.put(p.categoria, Collections.frequency(nR, p.categoria));
        }


        return categorias;
    }
}
