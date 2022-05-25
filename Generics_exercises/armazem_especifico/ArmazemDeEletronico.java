@SuppressWarnings("unchecked")
public class ArmazemDeEletronico extends Armazem {
    @Override
    public void adicionarAoInventario(String nome, Object valor) {
        super.adicionarAoInventario(nome, valor);
    }

    @Override
    public Eletronico obterDoInventario(String nome) {
        return (Eletronico) super.obterDoInventario(nome);
    }
}
