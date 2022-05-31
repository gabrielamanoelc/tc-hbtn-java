import java.text.DecimalFormat;

public class Produto {
    String nome;
    double preco;
    double peso;
    int quantidadeEmEstoque;
    TiposProduto tipo;

    public Produto(String nome, double preco, double peso, int quantidadeEmEstoque, TiposProduto tipo) {
        this.nome = nome;
        this.preco = preco;
        this.peso = peso;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        this.tipo = tipo;
    }

    public double getPreco() {
        return preco;
    }

    public double getPeso() {
        return peso;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public TiposProduto getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.000000");
        return nome + " " + df.format(preco) + " " + df.format(peso) + " " + quantidadeEmEstoque + " " + tipo;
    }
}
