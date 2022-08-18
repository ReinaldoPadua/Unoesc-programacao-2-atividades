package edu.br.unoesc.luis_baroni_17082022;

import java.util.Scanner;

public class SimuladorAutomatico {


    public  static  void main(String ars[]){
        Scanner user = new Scanner(System.in);

        Cambio cambioAutomatico = new Cambio(true,5);

        Carro carro = new Carro("Civic","Honda",2006,cambioAutomatico,
                220.00);


        while(true){
            printf("1 - ligar");
            printf("2 - acelerar");
            printf("3 - freiar");
            printf("4 - desligar");
            printf(new StringBuilder().append("Velocidade Atual: ").append(carro.getVelocidadeAtual()).toString());
            printf(new StringBuilder().append("Marcha Atual: ").append(cambioAutomatico.getMarchaAtual()).toString());

            int OP = user.nextInt();
            if (OP==1){
                if(carro.ligar().equals(true))
                    printf("Ligado!");
                else printf("Não foi possivel ligar");
            }
            if(OP==2) {
                if (carro.trocaMarcha(true)) {
                    printf("Subindo marcha");
                }
                if (carro.acelerar()) {
                    printf("Acelerando");
                }
            }
            if(OP==3){
                if(carro.trocaMarcha(false)){
                    printf("Reduzindo marcha");
                }
                carro.frear();
                printf("Freiando");
                printf(new StringBuilder().append("Velocidade Atual: ").append(carro.getVelocidadeAtual()).toString());
            }
            if(OP==4){
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
