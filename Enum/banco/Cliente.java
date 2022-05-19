import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cliente {

    private String nome;

    private ArrayList<Double> transacoes;

    public Cliente() {
    }

    public Cliente(String nome, double valor) {
        this.nome = nome;
        this.transacoes = new ArrayList<Double>(List.of(valor));
    }

    public String getNome() {
        return nome;
    }

    public List<Double> getTransacoes() {
        return transacoes;
    }

    public void adicionarTransacao(double transacao){
        this.transacoes.add(transacao);
    }

}
