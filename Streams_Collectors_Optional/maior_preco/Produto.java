import java.text.DecimalFormat;

public class Produto implements Comparable<Produto>{
    int codigo;
    String nome;
    CategoriaProduto categoria;
    Double preco;

    public Double getPreco() {
        return preco;
    }

    public Produto(int codigo, String nome, CategoriaProduto categoria, Double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }

    public Produto() {
    }

    @Override
    public String toString() {
        return "[" + codigo + "] " + nome + " " + categoria + " R$ " + new DecimalFormat("0.00").format(preco);
    }

    @Override
    public int compareTo(Produto o) {
        return (this.codigo - o.codigo);
    }
}
