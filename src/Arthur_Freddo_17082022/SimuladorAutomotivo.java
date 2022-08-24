package Arthur_Freddo_17082022;

public class SimuladorAutomotivo {


    public  static  void main(String ars[]){

        Cambio cambioManual = new Cambio(true,5);

        Carro carro = new Carro("Corsa GSI","GM",1998,cambioManual,
                220.00);

        if(carro.ligar().equals(true))
            printf("Ligado!");
        else printf("Não foi possivel ligar");


        while(cambioManual.subirMarcha() == true){
            System.out.println(cambioManual.getMarchaAtual() + "º marcha" );
            if(carro.acelerar()){
                System.out.println("Acelerando!");
                System.out.println(carro.getVelocidadeAtual() + " Km/h" + "\n");

            }

        }System.out.println("Velocidade Màxima Atingida" + "\n");


        while(cambioManual.reduzirMarcha() == true){
            System.out.println(cambioManual.getMarchaAtual() + "º marcha" );
            if(carro.freiar() == false){
                System.out.println("Freiando! ");
                System.out.println(carro.getVelocidadeAtual() + " Km/h" + "\n");

            }



        }System.out.println("Frenagem Concluída!" + "\n");

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
