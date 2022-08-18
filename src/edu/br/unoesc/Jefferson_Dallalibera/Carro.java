package edu.br.unoesc.Jefferson_Dallalibera;

public class Carro {

    private String modelo;

    private String fabricante;

    private Integer ano;

    private Cambio cambio;

    private Double velocidadeMaxima;

    private double velocidadeAtual;

    private boolean temCombustivel;

    private boolean ligado;

    public Carro(String modelo, String fabricante, Integer ano, Cambio cambio, Double velocidadeMaxima){
        super();
        this.modelo=modelo;
        this.fabricante= fabricante;
        this.ano=ano;
        this.cambio=cambio;
        this.velocidadeMaxima=velocidadeMaxima;
        this.velocidadeAtual=0.00;
        this.temCombustivel=true;
        this.ligado=false;
    }

    public double getVelocidadeAtual(){
        return this.velocidadeAtual;
    }


    public boolean ligar(){
        System.out.println(this.ligado);
        System.out.println(!this.temCombustivel );
        System.out.println(this.cambio.getMarchaAtual() != 0);
        if(this.ligado ||!this.temCombustivel || this.cambio.getMarchaAtual() != 0)
            return false;

        this.ligado=true;

        return true;
    }

    public Boolean desligar(){
        if((!this.ligado && this.cambio.getMarchaAtual() != 0) || this.velocidadeAtual != 0){
            return false;
        }
        this.ligado = false;
        return true;
    }

    public Boolean trocaMarcha(Boolean aumentar){
        if(this.ligado){
            return (aumentar && this.cambio.subirMarcha()) || this.cambio.reduzirMarcha();
        }
        return false;
    }

    public Boolean acelerar(){
        if(     this.ligado &&
                (this.velocidadeAtual < this.velocidadeMaxima) &&
                this.validarTrocaMarcha() &&
                (this.cambio.getMarchaAtual() != 0
                )){
            this.velocidadeAtual += this.retornarVelocidadeMaximaPorMarcha();
            return true;
        }

        return false;
    };

    private Boolean validarTrocaMarcha() {
        return this.velocidadeAtual < this.retornarVelocidadeMaximaPorMarcha() * this.cambio.getMarchaAtual();
    }

    private Double retornarVelocidadeMaximaPorMarcha(){
        return this.velocidadeMaxima/this.cambio.getNumeroMarchas();
    }

    public Boolean frear(){
        if(this.velocidadeAtual > 0 && this.ligado){
            this.velocidadeAtual -= this.retornarVelocidadeMaximaPorMarcha();
            return true;
        }
        return false;
    }

}
