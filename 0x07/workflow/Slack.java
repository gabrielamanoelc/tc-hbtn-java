public class Slack implements CanalNotificacao{
    @Override
    public String notificar(Mensagem mensagem) {
        return "[SLACK] {" + mensagem.getTipoMensagem() + "}" + " - " + mensagem.getTexto();
    }
}
