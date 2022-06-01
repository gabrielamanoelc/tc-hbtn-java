import java.text.DecimalFormat;

public class Produto {
    int codigo;
    String nome;
    CategoriaProduto categoria;
    Double preco;

    public Produto(int codigo, String nome, CategoriaProduto categoria, Double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "[" + codigo + "] " + nome + " " + categoria + " R$ " + new DecimalFormat("0.00").format(preco);
    }
}
