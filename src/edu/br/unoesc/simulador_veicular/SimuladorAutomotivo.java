package edu.br.unoesc.simulador_veicular;

public class SimuladorAutomotivo {


    public  static  void main(String ars[]){

        tipoCambio cambioManual = new CambioManual(5);

        Carro carro = new Carro("Corsa GSI","GM",1998,cambioManual,
                220.00);

        if(carro.ligar().equals(true))
                printf("Ligado!");
        else printf("Não foi possivel ligar");


    }

    private static void printf(String msg){
        System.out.println(msg);
    }



}
