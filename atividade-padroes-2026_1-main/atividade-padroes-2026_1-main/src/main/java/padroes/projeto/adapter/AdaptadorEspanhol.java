package padroes.projeto.adapter;

public class AdaptadorEspanhol implements AtendentePT {
  private AtendenteEspanhol atendente;

    public AdaptadorEspanhol(AtendenteEspanhol atendente) {
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
