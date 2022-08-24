package edu.br.unoesc.Samuel_Silva_17082022;

import java.util.Scanner;
public class SimuladorAutomotivo {


    public  static  void main(String ars[]){


        Cambio cambioManual = new Cambio(false,5);

        Carro carro = new Carro("Corsa GSI","GM",1998,cambioManual,
                220.00);

        SomAutomotivo somCarro = new SomAutomotivo(30);


        //menu de opções
        Scanner opcao  = new Scanner(System.in);
        int opcaoMenu = 0;
        while(opcaoMenu != 9){
            System.out.println("1 - Ligar");
            System.out.println("2 - Ligar som");
            System.out.println("3 - Aumentar volume");
            System.out.println("4 - Trocar Marcha");
            System.out.println("5 - Reduzir Marcha");
            System.out.println("6 - Acelerar");
            System.out.println("7 - Frear");
            System.out.println("8 - Desligar");
            System.out.println("9 - Sair");
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
                    if(somCarro.ligarSom()){
                        System.out.println("Som ligado");
                    }else{
                        System.out.println("Nao foi possível ligar o som");
                    }
                    break;
                case 3:
                    if(somCarro.aumetarVolume()){
                        System.out.println("Volume aumentado " + somCarro.getVolumeAtual());
                    }else{
                        System.out.println("Nao foi possível aumentar o volume");
                    }
                    break;
                case 4:
                    if(carro.ligar().equals(false)){
                    carro.trocaMarcha(true).equals(true);
                        System.out.println("Marcha trocada para a frente " + carro.getCambio().getMarchaAtual() + "ª velocidade atual " + carro.getVelocidadeAtual());
                    }else{
                        System.out.println("Marcha nao trocada, verifique o status do carro");
                    }
                    break;
                case 5:
                    if(carro.ligar().equals(false)){
                        carro.trocaMarcha(false).equals(false);
                        System.out.println("Reduziu marcha " + carro.getCambio().getMarchaAtual() + "' velocidade atual " + carro.getVelocidadeAtual());
                    }else{
                        System.out.println("Nao foi possível reduzir marcha");
                    }
                    break;
                case 6:
                    if(carro.acelerar().equals(true) && carro.ligar().equals(false)){
                        System.out.println("Acelerou, carro em movimento! velocidade atual: " + carro.getVelocidadeAtual());
                    }else{
                        System.out.println("Troque a marcha!");
                    }
                    break;
                case 7:
                    carro.frear();
                    System.out.println("Freiou, velocidade atual: " + carro.getVelocidadeAtual());
                    break;
                case 8:
                    if(carro.getVelocidadeAtual() > 0){
                        System.out.println("Carro em movimento nao pode ser desligado");
                    }
                    else{
                        carro.desligar();
                        System.out.println("Carro desligado");
                        if (somCarro.ligarSom()==true)
                            System.out.println("Som desligado");
                    }
                    break;
                case 9:
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
