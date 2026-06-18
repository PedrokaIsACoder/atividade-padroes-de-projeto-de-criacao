package padroes.projeto.adapter;

public class Main {
    public static void main(String[] args){
        CentralAtendimento central = new CentralAtendimento();

        AtendenteIngles ingles = new AtendenteIngles();
        AtendentePT adaptadorIngles = new AdaptadorIngles(ingles);

        AtendenteEspanhol espanhol = new AtendenteEspanhol();
        AtendentePT adaptadorEspanhol = new AdaptadorEspanhol(espanhol);

        System.out.println("=== Atendimento em Inglês ===");
        central.realizarAtendimento(adaptadorIngles, "payment");

        System.out.println();

        System.out.println("=== Atendimento em Espanhol ===");
        central.realizarAtendimento(adaptadorEspanhol, "pago");
    }
}
