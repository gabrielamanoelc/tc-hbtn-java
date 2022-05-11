public class MaquinaWorkflow {

    void executar(Workflow workflow){
        for (var atividade: workflow.getAtividades()) {
            atividade.executar();
        }
    }
}
