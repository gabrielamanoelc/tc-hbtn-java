import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private ArrayList<Agencia> agencias;

    public Banco(String nome) {
        this.nome = nome;
        this.agencias = new ArrayList<Agencia>();
    }

    public Agencia buscarAgencia(String nome){
        for (var a :this.agencias) {
            if(nome.equals(a.getNome())){
                return a;
            }
        }
        return null;
    }

    public boolean adicionarAgencia(String nome){
            if(buscarAgencia(nome) == null){
                this.agencias.add(new Agencia(nome));
                return true;
            }

        return false;
    }

    public boolean adicionarCliente(String nomeAgencia, String nomeCliente, double valor){
        var agencia = buscarAgencia(nomeAgencia);

        if(agencia.novoCliente(nomeCliente, valor)){
            return true;
        }
        return false;
    }

    public boolean adicionarTransacaoCliente(String nomeAgencia, String nomeCliente, double valor){

        var agencia = buscarAgencia(nomeAgencia);

        if(agencia.buscarCliente(nomeCliente) != null){
            agencia.adicionarTransacaoCliente(nomeCliente, valor);
            return true;
        }
        return false;
    }

    public boolean listarClientes(String nomeAgencia, boolean imprimeTransicaoes){
        var agencia = buscarAgencia(nomeAgencia);
        var i = 1;
        var j = 1;

        if(agencia != null){
            if(imprimeTransicaoes){
                for (var c :agencia.getClientes()) {
                    System.out.println("Cliente: " + c.getNome()+ " [" + i + "]");
                    i++;
                    for (var t :c.getTransacoes()) {
                        System.out.println("  [" + j + "]" + " valor " + t);
                        j++;
                    }
                    j = 1;
                }
            }
            return true;
        }

        return false;
    }

}
