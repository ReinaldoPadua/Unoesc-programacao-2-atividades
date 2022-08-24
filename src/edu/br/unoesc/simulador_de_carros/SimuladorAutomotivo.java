package Eduardo_Mortari_17082022;

import Eduardo_Mortari_17082022.Cambio;
import Eduardo_Mortari_17082022.Carro;

public class SimuladorAutomotivo {
    public  static  void main(String ars[]){

        Cambio cambioManual = new Cambio(false,5);

        Carro carro = new Carro("VECTRA GLS","GENERAL MOTORS",1999,cambioManual,
                220.00);

        if(carro.ligar().equals(true))
            printf("VECTRA ligado!");
        else printf("Não foi possivel ligar o vectra");

        if (carro.trocaMarcha(true).equals(true))
            printf("Aumentando marcha do carro");
        if(carro.acelerar()) {
            printf("Acelerando o Vectra");
            printf(new StringBuilder().append("Velocidade Atual: ").append(carro.getVelocidadeAtual()).toString());
        }
        else printf("Não foi possivel acelerar");

        if (carro.trocaMarcha(true).equals(true))
            printf("Aumentando marcha do vectra");

        if(carro.acelerar()) {
            printf("Acelerando o vectra");
            printf(new StringBuilder().append("Velocidade Atual: ").append(carro.getVelocidadeAtual()).toString());
        }
        else printf("Não foi possivel acelerar");

        if (carro.trocaMarcha(true).equals(true))
            printf("Aumentando marcha");
        if(carro.acelerar()) {
            printf("Acelerando o vectra");
            printf(new StringBuilder().append("Velocidade Atual: ").append(carro.getVelocidadeAtual()).toString());
        }
        else printf("Não foi possivel acelerar");

        if (carro.trocaMarcha(true).equals(true))
            printf("Aumentando marcha");
        if(carro.acelerar()) {
            printf("Acelerando o vectra");
            printf(new StringBuilder().append("Velocidade Atual: ").append(carro.getVelocidadeAtual()).toString());
        }
        else printf("Não foi possivel acelerar");

        if (carro.trocaMarcha(true).equals(true))
            printf("Aumentando marcha");
        if(carro.acelerar()) {
            printf("Acelerando o vectra");
            printf(new StringBuilder().append("Velocidade Atual: ").append(carro.getVelocidadeAtual()).toString());
        }
        else printf("Não foi possivel acelerar");

        if (carro.trocaMarcha(false).equals(true))
            printf("Reduzindo marcha");
        if(carro.frear());
        printf("Freiando o vectra");
        printf(new StringBuilder().append("Velocidade Atual: ").append(carro.getVelocidadeAtual()).toString());

        if (carro.trocaMarcha(false).equals(true))
            printf("Reduzindo marcha");
        if(carro.frear());
        printf("Freiando");
        printf(new StringBuilder().append("Velocidade Atual: ").append(carro.getVelocidadeAtual()).toString());



        if (carro.trocaMarcha(false).equals(true))
            printf("Reduzindo marcha");
        if(carro.frear());
        printf("Freiando o vectra");
        printf(new StringBuilder().append("Velocidade Atual: ").append(carro.getVelocidadeAtual()).toString());



        if (carro.trocaMarcha(false).equals(true))
            printf("Reduzindo marcha");
        if(carro.frear());
        printf("Freiando o vectra");
        printf(new StringBuilder().append("Velocidade Atual: ").append(carro.getVelocidadeAtual()).toString());



        if (carro.trocaMarcha(false).equals(true))
            printf("Reduzindo marcha");
        if(carro.frear());
        printf("Freiando o vectra");
        printf(new StringBuilder().append("Velocidade Atual: ").append(carro.getVelocidadeAtual()).toString());


        if(carro.desligar()) {
            printf("VECTRA Desligado!");
        }
        else printf("Não foi possivel Desligar!");


    }

    private static void printf(String msg){
        System.out.println(msg);
    }
}
