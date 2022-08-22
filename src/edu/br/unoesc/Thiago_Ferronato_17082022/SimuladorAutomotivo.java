package edu.br.unoesc.Thiago_Ferronato_17082022;

public class SimuladorAutomotivo {


    public static void main(String[] ars) {

        Cambio cambioManual = new Cambio(false, 5);

        Carro carro = new Carro("Corsa GSI", "GM", 1998, cambioManual,
                220.00);

        if (carro.ligar().equals(true))
            printf("Ligado!");
        else printf("Não foi possivel ligar");

        if (carro.trocaMarcha(true).equals(true))
            printf("Trocando marcha");

        if (carro.acelerar()) {
            printf("Acelerando");
            printf("Velocidade Atual: " + carro.getVelocidadeAtual());
        } else printf("Não foi possivel acelerar");
        if (carro.trocaMarcha(true).equals(true))
            printf("Trocando marcha");

        if (carro.acelerar()) {
            printf("Acelerando");
            printf("Velocidade Atual: " + carro.getVelocidadeAtual());
        } else printf("Não foi possivel acelerar");
        if (carro.trocaMarcha(true).equals(true))
            printf("Trocando marcha");

        if (carro.acelerar()) {
            printf("Acelerando");
            printf("Velocidade Atual: " + carro.getVelocidadeAtual());
        } else printf("Não foi possivel acelerar");

        if (carro.trocaMarcha(false).equals(true))
            printf("reduzindo marcha");
        carro.frear();
        printf(new StringBuilder().append("Velocidade Atual: ").append(carro.getVelocidadeAtual()).toString());
        carro.frear();
        printf(new StringBuilder().append("Velocidade Atual: ").append(carro.getVelocidadeAtual()).toString());
        carro.frear();
        printf(new StringBuilder().append("Velocidade Atual: ").append(carro.getVelocidadeAtual()).toString());
        if (carro.trocaMarcha(false).equals(true))
            printf("reduzindo marcha");
        carro.frear();
        printf(new StringBuilder().append("Velocidade Atual: ").append(carro.getVelocidadeAtual()).toString());

        if (carro.trocaMarcha(false).equals(true))
            printf("reduzindo marcha");

        if (carro.desligar()) {
            printf("Desligado!");
        } else printf("Não foi possivel Desligar!");


    }

    private static void printf(String msg) {
        System.out.println(msg);
    }


}
