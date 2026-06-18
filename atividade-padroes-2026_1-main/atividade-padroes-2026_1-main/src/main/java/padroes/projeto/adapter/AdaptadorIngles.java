package padroes.projeto.adapter;

public class AdaptadorIngles implements AtendentePT {
   private AtendenteIngles atendente;

    public AdaptadorIngles(AtendenteIngles atendente) {
        this.atendente = atendente;
    }

    @Override
    public void cumprimentar() {
        atendente.cumprimentar();
    }

    @Override
    public void responderDuvida(String duvida) {
        atendente.responderDuvida(duvida);
    }

    @Override
    public void encerrarAtendimento() {
        atendente.encerrarAtendimento();
    }
}
