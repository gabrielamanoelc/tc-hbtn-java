public class Teams implements CanalNotificacao{
    @Override
    public String notificar(Mensagem mensagem) {
        return "[TEAMS] {" + mensagem.getTipoMensagem() + "}" + " - " + mensagem.getTexto();
    }
}
