import java.util.*;

public class ListaTelefonica {

    public HashMap<String, HashSet<Telefone>> lista;
    public ListaTelefonica() {
        this.lista = new HashMap<String, HashSet<Telefone>>();
    }

    public void adicionarTelefone(String nome, Telefone telefone){

        HashSet<Telefone> telefones = this.lista.get(nome);

        if(telefones == null){
            telefones = new HashSet<>();
        }

        if(telefones.contains(telefone)){
            throw new IllegalArgumentException("Telefone jah existente para essa pessoa");
        }


        for (var l: this.lista.values()) {
            if(l.contains(telefone)){
                throw new IllegalArgumentException("Telefone jah pertence a outra pessoa");
            }
        }

        telefones.add(telefone);

        lista.put(nome, telefones);

    }

    public HashSet<Telefone> buscar(String nome){

        return this.lista.get(nome);
    }

}
