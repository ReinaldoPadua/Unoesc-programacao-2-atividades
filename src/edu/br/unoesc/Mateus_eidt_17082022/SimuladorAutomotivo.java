package edu.br.unoesc.Mateus_eidt_17082022;

public class SimuladorAutomotivo {


    public  static  void main(String ars[]){

        Cambio cambioManual = new Cambio(false,5);

        Carro carro = new Carro("Corsa GSI","GM",1998,cambioManual,
                220.00);

        if(carro.ligar().equals(true))
                printf("Ligado!");
        else printf("Não foi possivel ligar");

        if(carro.trocaMarcha(true).equals(true))
                printf(new StringBuilder().append("Marcha aumentou, marcha Atual: ").append(cambioManual.getMarchaAtual()).toString());
        else printf("Não foi possivel trocar de marcha");

        if(carro.acelerar()) {
            printf("Acelerando");
            printf(new StringBuilder().append("Velocidade Atual: ").append(carro.getVelocidadeAtual()).toString());
        }
        else printf("Não foi possivel acelerar");

        if (carro.frear()) {
            printf("Freando");
            printf(new StringBuilder().append("Velocidade Atual: ").append(carro.getVelocidadeAtual()).toString());
        }
        else printf("Não foi possivel frear");

        if(carro.trocaMarcha(false).equals(true))
                printf(new StringBuilder().append("Marcha diminuiu, marcha Atual: ").append(cambioManual.getMarchaAtual()).toString());
        else printf("Não foi possivel trocar de marcha");

        if(carro.desligar()) {
            printf("Desligado!");
        }
        else printf("Não foi possivel Desligar!");


    }

    private static void printf(String msg){
        System.out.println(msg);
    }



}
