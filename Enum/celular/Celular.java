import java.util.ArrayList;

public class Celular {
    ArrayList<Contato> contatos;

    public Celular() {
        this.contatos = new ArrayList<Contato>();
    }

    public int obterPosicaoContato(String nome){
        for (var c :this.contatos) {
            if(c.getNome().equals(nome)){
                return this.contatos.indexOf(c);
            }
        }
        return -1;
    }

    public void adicionarContato(Contato contato){
        if(obterPosicaoContato(contato.getNome()) != -1){
            throw new IllegalArgumentException("Nao foi possivel adicionar contato. Contato jah existente com esse nome");
        } else {
            this.contatos.add(contato);
        }
    }

    public void atualizarContato(Contato contatoAntigo, Contato novoContato){
        if(obterPosicaoContato(contatoAntigo.getNome()) == -1){
            throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato nao existe");
        } else if(!novoContato.getNome().equals(contatoAntigo.getNome()) && obterPosicaoContato(contatoAntigo.getNome()) != -1){
            throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato jah existente com esse nome");
        }

        else {
            this.contatos.set(obterPosicaoContato(contatoAntigo.getNome()), novoContato);
        }
    }

    public void removerContato(Contato contato){
        if(obterPosicaoContato(contato.getNome()) == -1){
            throw new IllegalArgumentException("Nao foi possivel remover contato. Contato nao existe");
        }

        this.contatos.remove(obterPosicaoContato(contato.getNome()));

    }

    public void listarContatos(){
        for (var c :this.contatos) {
            System.out.println(c.getNome() + " -> " + c.getTelefone() + " (" + c.getTipoNumero() + ")");
        }
    }
}
