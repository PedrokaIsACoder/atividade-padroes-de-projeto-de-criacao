package padroes.projeto.strategy;

public class Main {
    public static void main(String[] args) {

        AplicativoNavegacao app = new AplicativoNavegacao();
        String origem  = "Centro";
        String destino = "Aeroporto";
        double distancia = 18.0;

        // Estratégia 1: carro
        System.out.println("=== Opção 1 ===");
        app.setEstrategia(new RotaDeCarro());
        app.calcularRota(origem, destino, distancia);

        System.out.println();

        // Estratégia 2: ônibus
        System.out.println("=== Opção 2 ===");
        app.setEstrategia(new RotaDeOnibus());
        app.calcularRota(origem, destino, distancia);

        System.out.println();

        // Estratégia 3: a pé
        System.out.println("=== Opção 3 ===");
        app.setEstrategia(new RotaAPe());
        app.calcularRota(origem, destino, distancia);
       
    }
}
