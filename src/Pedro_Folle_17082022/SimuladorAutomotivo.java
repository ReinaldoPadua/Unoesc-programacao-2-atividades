package Pedro_Folle_17082022;

import java.util.Scanner;

public class SimuladorAutomotivo {


    public  static  void main(String ars[]){
        Scanner leitor = new Scanner(System.in);
        int opcao = 0;
        Cambio cambioManual = new Cambio(false,5);

        Carro carro = new Carro("Corsa GSI","GM",1998,cambioManual,
                220.00);

do{
        printf("ESCOLHA UMA OPCAO: ");
        printf("1 - Ligar");
        printf("2 - Subir marcha");
        printf("3 - Descer marcha");
        printf("4 - Acelerar");
        printf("5 - Frear");
        printf("6 - Desligar");
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
        printf("Descendo marcha");
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
        printf("Desligado! E Saindo...");
        else printf("Não foi possivel desligar");
        break;
default:
        printf("Opcao invalida");
        break;
        }
        } while (opcao != 6);
        }

private static void printf(String msg){
        System.out.println(msg);
        }
        }