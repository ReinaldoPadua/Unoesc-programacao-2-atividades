package edu.br.unoesc.Samuel_Silva_17082022;

public class SimuladorAutomotivo {


    public  static  void main(String ars[]){

        Cambio cambioManual = new Cambio(false,5);

        Carro carro = new Carro("Corsa GSI","GM",1998,cambioManual,
                220.00);

        if(carro.ligar().equals(true))
                printf("Ligado!");
        else printf("Não foi possivel ligar");

        if(carro.trocaMarcha(true).equals(true)) {
            printf("trocou de marcha");
        }

        if(carro.acelerar().equals(true)) {
            printf("Acelerando");
            printf(new StringBuilder().append("Velocidade Atual: ").append(carro.getVelocidadeAtual()).toString());
        }
        else printf("Não foi possivel acelerar");


        if(carro.trocaMarcha(false).equals(true)) {
            printf("reduziu de marcha");
        }

        carro.frear();
        printf(new StringBuilder().append("Velocidade Atual: ").append(carro.getVelocidadeAtual()).toString());
        carro.desligar();

        if(carro.desligar()) {
            printf("Desligado!");
        }
        else printf("Não foi possivel Desligar!");


    }

    private static void printf(String msg){
        System.out.println(msg);
    }



}
