import java.util.ArrayList;
import java.util.List;

public class Agencia {

    private String nome;

    private ArrayList<Cliente> clientes;

    public Agencia(String nome) {
        this.nome = nome;
        this.clientes = new ArrayList<Cliente>();
    }

    public Agencia() {
    }

    public String getNome() {
        return nome;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public boolean novoCliente(String nome, double valor){

        if(buscarCliente(nome) == null){

            this.clientes.add(new Cliente(nome, valor));

            return true;
        }

        return false;
    }

    public boolean adicionarTransacaoCliente(String nome, double valor){
        if(buscarCliente(nome) != null){
            buscarCliente(nome).adicionarTransacao(valor);
            return true;
        }
        return false;
    }

    public Cliente buscarCliente(String nome){

        for (var c :this.clientes) {
            if(c.getNome().equals(nome)){
                return c;
            }
        }

        return null;
    }
}
