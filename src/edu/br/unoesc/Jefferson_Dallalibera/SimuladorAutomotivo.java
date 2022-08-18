package edu.br.unoesc.Jefferson_Dallalibera;

import java.util.Scanner;

public class SimuladorAutomotivo {


    public  static  void main(String ars[]){
        Scanner leitor = new Scanner(System.in);
        int opcao = 0;
        Cambio cambioManual = new Cambio(false,5);

        Carro carro = new Carro("Corsa GSI","GM",1998,cambioManual,
                220.00);

        if(carro.ligar()){
            printf("Ligado!");
        } else printf("Não foi possivel ligar");

        carro.trocaMarcha(true);

        if(carro.acelerar()) {
            printf("Acelerando");
            printf(new StringBuilder().append("Velocidade Atual: ").append(carro.getVelocidadeAtual()).toString());
        } else printf("Não foi possivel acelerar");

        do{
            System.out.println("...");
            System.out.println("ESCOLHA UMA OPCAO: ");
            System.out.println("1 - Ligar");
            System.out.println("2 - Subir marcha");
            System.out.println("3 - Descer marcha");
            System.out.println("4 - Acelerar");
            System.out.println("5 - Frear");
            System.out.println("6 - Desligar");
            System.out.println("7 - Fazer Automaticamente");
            System.out.println("8 - SAIR");
            opcao = leitor.nextInt();
            leitor.nextLine();

            switch(opcao){
                case 1:
                    if(carro.ligar())
                        printf("Ligado!");
                    else printf("Não foi possivel ligar");
                    break;
                case 2:
                    if(carro.trocaMarcha(true))
                        printf("Subindo marcha");
                    else printf("Não foi possivel subir marcha");
                    break;
                case 3:
                    if(carro.trocaMarcha(false)){
                        carro.frear();
                        printf("Reduzindo marcha");
                    } else printf("Não foi possivel descendo marcha");
                    break;
                case 4:
                    if(carro.acelerar())
                        printf("Acelerando.. Velocidade Atual: " + carro.getVelocidadeAtual());
                    else printf("Não foi possivel acelerar");
                    break;
                case 5:
                    if(carro.frear())
                        printf("Freando.. Velocidade Atual: " + carro.getVelocidadeAtual());
                    else printf("Não foi possivel frear");
                    break;
                case 6:
                    if(carro.desligar())
                        printf("Desligado!");
                    else printf("Não foi possivel desligar");
                    break;
                case 7:
                    printf("Fazendo automaticamente...");
                    Automatic(carro, cambioManual );
                    break;
                case 8:
                    printf("Saindo...");
                default:
                    printf("Opcao invalida");
                    break;
            }
        } while (opcao != 7);
    }

    private static void printf(String msg){
        System.out.println(msg);
    }

    public static void Automatic(Carro carro, Cambio cambioManual){
        carro.trocaMarcha( true);

        if(carro.acelerar()) {
            printf("Acelerando");
            printf(new StringBuilder().append("Velocidade Atual: ").append(carro.getVelocidadeAtual()).toString());
        }
        else printf("Não foi possivel acelerar");

        int i = 0;
        while(i  < cambioManual.getNumeroMarchas()) {
            carro.trocaMarcha(true);
            if (carro.acelerar()) {
                printf("Acelerando");
                printf("Marcha Atual: " + cambioManual.getMarchaAtual());
                printf(new StringBuilder().append("Velocidade Atual: ").append(carro.getVelocidadeAtual()).toString());
            }
            i++;
        }
        for(int x= 0;x< cambioManual.getNumeroMarchas(); x++){
            carro.frear();
            System.out.println("Freiando...");
            printf(new StringBuilder().append("Velocidade Atual: ").append(carro.getVelocidadeAtual()).toString());

        }

    }
}