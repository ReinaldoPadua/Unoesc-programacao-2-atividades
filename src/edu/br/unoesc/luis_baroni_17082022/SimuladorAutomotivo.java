package edu.br.unoesc.luis_baroni_17082022;

import java.util.Scanner;

public class SimuladorAutomotivo {


    public  static  void main(String ars[]){
        Scanner user = new Scanner(System.in);

        Cambio cambioManual = new Cambio(false,5);

        Carro carro = new Carro("Corsa GSI","GM",1998,cambioManual,
                220.00);

        if(carro.ligar().equals(true))
                printf("Ligado!");
        else printf("Não foi possivel ligar");

        if(cambioManual.getMarchaAtual().equals(1)){
            printf("Primeira marcha engatada");
        }
        else{
            printf("Engatando a primeira marcha");
            cambioManual.subirMarcha();
        }

        if(carro.acelerar()) {
            printf("Acelerando");
            printf(new StringBuilder().append("Velocidade Atual: ").append(carro.getVelocidadeAtual()).toString());
        }
        else printf("Não foi possivel acelerar");

        if(cambioManual.subirMarcha()){
            printf("Subindo marcha");
        }
        else {
            printf("Nao foi possivel subir marcha");
        }

        if(carro.acelerar()) {
            printf("Acelerando");
            printf(new StringBuilder().append("Velocidade Atual: ").append(carro.getVelocidadeAtual()).toString());
        }
        else printf("Não foi possivel acelerar");

        carro.frear();
        printf("Freiando");
        printf(new StringBuilder().append("Velocidade Atual: ").append(carro.getVelocidadeAtual()).toString());

        if(cambioManual.reduzirMarcha()){
            printf("Reduzindo marcha");
        }
        else {
            printf("Não foi possivel reduzir marcha");
        }

        carro.frear();
        printf("Freiando");
        printf(new StringBuilder().append("Velocidade Atual: ").append(carro.getVelocidadeAtual()).toString());

        if(cambioManual.reduzirMarcha()){
            printf("Reduzindo marcha");
        }
        else {
            printf("Não foi possivel reduzir marcha");
        }

        if(carro.desligar()) {
            printf("Desligado!");
        }
        else printf("Não foi possivel Desligar!");

        while(true){
            printf("1 - ligar");
            printf("2 - acelerar");
            printf("3 - subir marcha");
            printf("4 - descer marcha");
            printf("5 - freiar");
            printf("6 - desligar");
            printf(new StringBuilder().append("Velocidade Atual: ").append(carro.getVelocidadeAtual()).toString());
            printf(new StringBuilder().append("Marcha Atual: ").append(cambioManual.getMarchaAtual()).toString());

            int OP = user.nextInt();
            if (OP==1){
                if(carro.ligar().equals(true))
                    printf("Ligado!");
                else printf("Não foi possivel ligar");
            }
            if(OP==2){
                if(carro.acelerar()) {
                    printf("Acelerando");

                }
                else printf("Não foi possivel acelerar");
            }
            if(OP==3) {
                if (carro.trocaMarcha(true)) {
                    printf("Subindo marcha");
                }
                else {
                    printf("Nao foi possivel subir marcha");
                }
            }
            if(OP==4){
                if(carro.trocaMarcha(false)){
                    printf("Reduzindo marcha");
                }
                else {
                    printf("Não foi possivel reduzir marcha");
                }
            }
            if(OP==5){
                carro.frear();
                printf("Freiando");
                printf(new StringBuilder().append("Velocidade Atual: ").append(carro.getVelocidadeAtual()).toString());
            }
            if(OP==6){
                if(carro.desligar()) {
                    printf("Desligado!");
                }
                else printf("Não foi possivel Desligar!");
            }
            if (OP==9){
                break;
            }
        }
    }

    private static void printf(String msg){
        System.out.println(msg);
    }
}
