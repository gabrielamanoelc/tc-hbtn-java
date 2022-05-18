import java.util.ArrayList;
import java.util.List;

public class ListaTodo {
    List<Tarefa> tarefas;


    public ListaTodo() {
        tarefas = new ArrayList<Tarefa>();
    }

    public void adicionarTarefa(Tarefa tarefa){
        for (var t : tarefas){
            if(t.getIdentificador() == tarefa.getIdentificador()){
                throw new IllegalArgumentException("Tarefa com identificador " +tarefa.getIdentificador()+ " ja existente na lista" );
            }
        }
        tarefas.add(tarefa);

    }

    boolean marcarTarefaFeita(int identificador){
        for(var t : tarefas){
            if(t.getIdentificador() == identificador){
                t.setEstahFeita(true);
                return true;
            }
        }
        return false;
    }

    boolean desfazerTarefa(int identificador){
        for(var t: tarefas){
            if(t.getIdentificador() == identificador){
                t.setEstahFeita(false);
                return true;
            }
        }
        return false;
    }

    public void desfazerTodas(){
        for(var t : tarefas){
            t.setEstahFeita(false);
        }


    }

    public void fazerTodas(){
        for(var t: tarefas){
            t.setEstahFeita(true);
        }

    }

    public void listarTarefas(){
        for(var t: tarefas){
            if(t.isEstahFeita() == true)
                System.out.println("[X]  Id: "+t.getIdentificador()+ " - Descricao: "+t.getDescricao());
            else{
                System.out.println("[ ]  Id: "+t.getIdentificador()+ " - Descricao: "+t.getDescricao());
            }
        }

    }
}
