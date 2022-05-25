import java.util.HashMap;
import java.util.Map;
public abstract class Armazem<T> implements Armazenavel<T> {

    Map<String, T> dados;

    public Armazem() {
        this.dados = new HashMap<>();
    }


    @Override
    public void adicionarAoInventario(String nome, T valor) {
        dados.put(nome, valor);
    }

    @Override
    public T obterDoInventario(String nome) {
        return dados.get(nome);
    }


}
