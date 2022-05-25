import java.text.DecimalFormat;

public class Comida {

    String nome;
    float calorias;
    Double preco;

    public Comida(String nome, float calorias, Double preco) {
        this.nome = nome;
        this.calorias = calorias;
        this.preco = preco;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.000000");
        return "[" + nome + "] " + df.format(calorias) + " R$ " + df.format(preco);
    }
}
