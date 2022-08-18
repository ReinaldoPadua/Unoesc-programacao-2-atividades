package edu.br.unoesc.luis_baroni_17082022;

public class Carro {

    private String modelo;

    private String fabricante;

    private Integer ano;

    private Cambio cambio;

    private Double velocidadeMaxima;

    private Double velocidadeAtual;

    private Boolean temCombustivel;

    private Boolean ligado;

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

    public Double getVelocidadeAtual(){
        return this.velocidadeAtual;
    }


    public Boolean ligar(){
        if(this.ligado.equals(true)||this.temCombustivel.equals(false) || this.cambio.getMarchaAtual()!=0)
            return false;

        this.ligado=true;

        return true;
    }

    public Boolean desligar(){
        if(this.ligado.equals(false) || this.cambio.getMarchaAtual()!=0)
            return false;

        this.velocidadeAtual=0.00;
        this.ligado = false;

        return  true;
    }

    public Boolean trocaMarcha(Boolean aumentar){
        if (aumentar){
            if (this.cambio.subirMarcha()){
                return true;
            }
        }
        if (!aumentar){
            if(this.cambio.reduzirMarcha()){
                return true;
            }
        }

        return false;

    }

    public Boolean acelerar(){
        if(this.ligado.equals(true)&&this.velocidadeAtual<this.velocidadeMaxima && this.validarTrocaMarcha()
        && this.cambio.getMarchaAtual()!=0){
            this.velocidadeAtual += this.retornarVelocidadeMaximaPorMarcha();
            return true;
        }

        return false;
    };

    public Boolean validarTrocaMarcha() {
        return this.velocidadeAtual < this.retornarVelocidadeMaximaPorMarcha() * this.cambio.getMarchaAtual();
    }

    private Double retornarVelocidadeMaximaPorMarcha(){
        return this.velocidadeMaxima/this.cambio.getNumeroMarchas();
    }

    public void frear(){
        if(this.velocidadeAtual>0){
            this.velocidadeAtual -= this.retornarVelocidadeMaximaPorMarcha();
        }
    }


}