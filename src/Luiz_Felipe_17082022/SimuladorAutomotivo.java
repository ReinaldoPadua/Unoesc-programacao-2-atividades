package Luiz_Felipe_17082022;

import Luiz_Felipe_17082022.Cambio;
import Luiz_Felipe_17082022.Carro;

public class SimuladorAutomotivo {


    public  static  void main(String ars[]){

        Cambio cambioManual = new Cambio(false,5);

        Carro carro = new Carro("Corsa GSI","GM",1998,cambioManual,
                220.00);

        if(carro.ligar().equals(true))
            printf("Ligado!");
        else printf("Não foi possivel ligar");

        if (carro.trocaMarcha(true).equals(true))
            printf("Aumentando marcha");
        if(carro.acelerar()) {
            printf("Acelerando");
            printf(new StringBuilder().append("Velocidade Atual: ").append(carro.getVelocidadeAtual()).toString());
        }
        else printf("Não foi possivel acelerar");

        if (carro.trocaMarcha(true).equals(true))
            printf("Aumentando marcha");

        if(carro.acelerar()) {
            printf("Acelerando");
            printf(new StringBuilder().append("Velocidade Atual: ").append(carro.getVelocidadeAtual()).toString());
        }
        else printf("Não foi possivel acelerar");

        if (carro.trocaMarcha(true).equals(true))
            printf("Aumentando marcha");
        if(carro.acelerar()) {
            printf("Acelerando");
            printf(new StringBuilder().append("Velocidade Atual: ").append(carro.getVelocidadeAtual()).toString());
        }
        else printf("Não foi possivel acelerar");

        if (carro.trocaMarcha(true).equals(true))
            printf("Aumentando marcha");
        if(carro.acelerar()) {
            printf("Acelerando");
            printf(new StringBuilder().append("Velocidade Atual: ").append(carro.getVelocidadeAtual()).toString());
        }
        else printf("Não foi possivel acelerar");

        if (carro.trocaMarcha(true).equals(true))
            printf("Aumentando marcha");
        if(carro.acelerar()) {
            printf("Acelerando");
            printf(new StringBuilder().append("Velocidade Atual: ").append(carro.getVelocidadeAtual()).toString());
        }
        else printf("Não foi possivel acelerar");

        if (carro.trocaMarcha(false).equals(true))
            printf("Reduzindo marcha");
        if(carro.frear());
        printf("Freiando");
        printf(new StringBuilder().append("Velocidade Atual: ").append(carro.getVelocidadeAtual()).toString());

        if (carro.trocaMarcha(false).equals(true))
            printf("Reduzindo marcha");
        if(carro.frear());
        printf("Freiando");
        printf(new StringBuilder().append("Velocidade Atual: ").append(carro.getVelocidadeAtual()).toString());



        if (carro.trocaMarcha(false).equals(true))
            printf("Reduzindo marcha");
        if(carro.frear());
        printf("Freiando");
        printf(new StringBuilder().append("Velocidade Atual: ").append(carro.getVelocidadeAtual()).toString());



        if (carro.trocaMarcha(false).equals(true))
            printf("Reduzindo marcha");
        if(carro.frear());
        printf("Freiando");
        printf(new StringBuilder().append("Velocidade Atual: ").append(carro.getVelocidadeAtual()).toString());



        if (carro.trocaMarcha(false).equals(true))
            printf("Reduzindo marcha");
        if(carro.frear());
        printf("Freiando");
        printf(new StringBuilder().append("Velocidade Atual: ").append(carro.getVelocidadeAtual()).toString());


        if(carro.desligar()) {
            printf("Desligado!");
        }
        else printf("Não foi possivel Desligar!");


    }

    private static void printf(String msg){
        System.out.println(msg);
    }



}


