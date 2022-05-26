import java.util.function.Consumer;
import java.util.function.Supplier;

public class Produto {

    private String nome;
    private Double preco;
    private Double percentualMarkUp;

    Supplier<Double> precoComMarkUp = () -> preco * (1 + percentualMarkUp);
    Consumer<Double> atualizarMarkUp = valor ->  this.percentualMarkUp = (valor / 100);

    public Produto(Double preco, String nome) {
        super();
        this.nome = nome;
        this.preco = preco;
        this.percentualMarkUp = 0.10d;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

}
