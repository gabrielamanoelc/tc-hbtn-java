@SuppressWarnings("unchecked")
public class ArmazemDeComida extends Armazem {

    @Override
    public void adicionarAoInventario(String nome, Object valor) {
        super.adicionarAoInventario(nome, valor);
    }

    @Override
    public Comida obterDoInventario(String nome) {
        return (Comida) super.obterDoInventario(nome);
    }
}
