import java.util.*;

public class ListaTelefonica {

    public HashMap<String, ArrayList<Telefone>> lista;
    public ListaTelefonica() {
        this.lista = new HashMap<String, ArrayList<Telefone>>();
    }

    public void adicionarTelefone(String nome, Telefone telefone){

        ArrayList<Telefone> telefones = this.lista.get(nome);

        if(telefones == null){
            telefones = new ArrayList<>();
        }

        telefones.add(telefone);
        lista.put(nome, telefones);

    }

    public ArrayList<Telefone> buscar(String nome){

        return this.lista.get(nome);
    }
}
