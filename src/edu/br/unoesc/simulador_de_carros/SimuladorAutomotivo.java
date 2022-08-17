package edu.br.unoesc.simulador_de_carros;

public class SimuladorAutomotivo {


    public  static  void main(String ars[]){

        Cambio cambioManual = new Cambio(true,5);

        Carro carro = new Carro("Corsa GSI","GM",1998,cambioManual,
                220.00);

        if(carro.ligar().equals(true))
                printf("Ligado!");
        else printf("Não foi possivel ligar");

        if(carro.acelerar()) {
            printf("Acelerando");
            printf(new StringBuilder().append("Velocidade Atual: ").append(carro.getVelocidadeAtual()).toString());
        }
        else printf("Não foi possivel acelerar");

        //carro.frear();
        //printf(new StringBuilder().append("Velocidade Atual: ").append(carro.getVelocidadeAtual()).toString());

        if(carro.desligar()) {
            printf("Desligado!");
        }
        else printf("Não foi possivel Desligar!");


    }

    private static void printf(String msg){
        System.out.println(msg);
    }



}
