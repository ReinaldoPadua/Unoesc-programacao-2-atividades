package edu.br.unoesc.Samuel_Silva_17082022;
import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;
public class SimuladorAutomotivo {


    public  static  void main(String ars[]){


        Cambio cambioManual = new Cambio(false,5);

        Carro carro = new Carro("Corsa GSI","GM",1998,cambioManual,
                220.00);


        //menu de opções
        Scanner opcao  = new Scanner(System.in);
        int opcaoMenu = 0;
        while(opcaoMenu != 6){
            System.out.println("1 - Ligar");
            System.out.println("2 - Trocar Marcha");
            System.out.println("3 - Acelerar");
            System.out.println("4 - Frear");
            System.out.println("5 - Desligar");
            System.out.println("6 - Sair");
            opcaoMenu = opcao.nextInt();
            switch(opcaoMenu){
                case 1:
                    if(carro.ligar()){
                        System.out.println("Carro ligado");
                    }else{
                        System.out.println("Nao foi possível ligar o carro");
                    }
                    break;
                case 2:
                    if(carro.ligar().equals(false)){
                    carro.trocaMarcha(true).equals(true);
                        System.out.println("Marcha trocada para a frente");
                    }else{
                        System.out.println("Marcha nao trocada, verifique o status do carro");
                    }
                    break;
                case 3:
                    if(carro.acelerar().equals(true) && carro.ligar().equals(false) && carro.trocaMarcha(true).equals(true)){
                        System.out.println("Acelerou, carro em movimento! velocidade atual: " + carro.getVelocidadeAtual());
                    }else{
                        System.out.println("Não acelerou verifique o status do carro");
                    }
                    break;
                case 4:
                    carro.frear();
                    System.out.println("Freiou, velocidade atual: " + carro.getVelocidadeAtual());
                    break;
                case 5:
                    if(carro.getVelocidadeAtual() > 0){
                        System.out.println("Carro em movimento nao pode ser desligado");
                    }
                    else if(carro.desligar().equals(true)){
                        System.out.println("Carro ja esta Desligado");
                    }
                    else {
                        carro.desligar();
                        System.out.println("Desligou");
                        carro.ligar();
                    }
                    break;
                case 6:
                    System.out.println("Desisto de usar o carro kkkkk");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }

//código do sem menu
       /* if(carro.ligar().equals(true))
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

        if(carro.desligar()) {
            printf("Desligado!");
        }
        else printf("Não foi possivel Desligar!");*/


    }

    private static void printf(String msg){
        System.out.println(msg);
    }



}
