import java.text.DecimalFormat;

public class Eletronico {

    String descricao;
    double valor;

    public Eletronico(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "[" + descricao + "] " + "R$ " +  new DecimalFormat("0.000000").format(valor);
    }
}
