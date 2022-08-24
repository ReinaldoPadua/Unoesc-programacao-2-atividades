package edu.br.unoesc.Mateus_eidt_17082022;

import java.util.Scanner;

public class SimuladorAutomotivo {
    public  static  void main(String ars[]){

        Scanner ler = new Scanner(System.in);
        int userInput, aparelhoSomLigado=0;



        Cambio cambioManual = new Cambio(false,5);

        Carro carro = new Carro("Corsa GSI","GM",1998,cambioManual,
                220.00);

                while (true) {
                    System.out.printf("\nSIMULADOR CARRO\n0: Sair\n1: Ligar\n2: Aumentar marcha\n3: Diminuir marcha\n4: Acelerar\n5: Frear\n6: Desligar\n7: Ligar aparelho de som\n8: Desligar aparelho de som\n\n");

                    System.out.printf("Informe sua opcao: ");
                    userInput = ler.nextInt();


                    if (userInput == 0) {
                        break;
                    }   
                    else if (userInput == 1) {
                        if(carro.ligar().equals(true))
                            printf("Ligado!");
                        else printf("Não foi possivel ligar");
                    }   
                    else if (userInput == 2) {
                        if(carro.trocaMarcha(true).equals(true))
                        printf(new StringBuilder().append("Marcha aumentou, marcha Atual: ").append(cambioManual.getMarchaAtual()).toString());
                        else printf("Não foi possivel trocar de marcha");
                    }   
                    else if (userInput == 3) {
                        if(carro.trocaMarcha(false).equals(true))
                        printf(new StringBuilder().append("Marcha diminuiu, marcha Atual: ").append(cambioManual.getMarchaAtual()).toString());
                        else printf("Não foi possivel trocar de marcha");
                    }   
                    else if (userInput == 4) {
                        if(carro.acelerar()) {
                        printf("Acelerando");
                        printf(new StringBuilder().append("Velocidade Atual: ").append(carro.getVelocidadeAtual()).toString());
                        }
                        else printf("Não foi possivel acelerar");
                    }   
                    else if (userInput == 5) {
                        if (carro.frear()) {
                        printf("Freando");
                        printf(new StringBuilder().append("Velocidade Atual: ").append(carro.getVelocidadeAtual()).toString());
                        }
                        else printf("Não foi possivel frear");
                    }   
                    else if (userInput == 6) {
                        if(carro.desligar()) {
                        printf("Desligado!");
                        }
                        else printf("Não foi possivel Desligar!");
                    }
                    else if (userInput == 7) {
                        if(aparelhoSomLigado == 0) {
                        aparelhoSomLigado = 1;
                        printf("Aparelho de som ligado!");
                        }
                        else printf("Não foi possivel ligar o aparelho!");
                    }
                    else if (userInput == 8) {
                        if(aparelhoSomLigado == 1) {
                        aparelhoSomLigado = 0;
                        printf("Aparelho de som desligado!");
                        }
                        else printf("Não foi possivel desligar o aparelho!");
                    }
        }
    }

    private static void printf(String msg){
        System.out.println(msg);
    }
}
