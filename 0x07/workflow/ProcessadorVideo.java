import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProcessadorVideo {

    List<CanalNotificacao> canais;

    public ProcessadorVideo() {
        this.canais = new ArrayList<CanalNotificacao>();
    }

    public void registrarCanal(CanalNotificacao canal){
        this.canais.add(canal);
    }

    public void processar(Video video){
        for (var canal:canais) {
            Mensagem msg = new Mensagem();
            msg.setTipoMensagem(TipoMensagem.LOG);
            msg.setTexto(video.getArquivo() + " - " + video.getFormato());

            System.out.println(canal.notificar(msg));
        }
    }
}
