package edu.br.unoesc.simulador_de_carros;

public class Carro {

    private String modelo;

    private String fabricante;

    private Double velocidadeMaxima;

    private Double velocidadeAtual;

    private Boolean temCombustivel;

    private String ano;

    private Cambio cambio;

    private Boolean ligado;

    public Boolean ligar(){
        if(this.ligado.equals(true)&&this.temCombustivel.equals(false) && this.cambio.getMarchaAtual()==0)
            return false;

        this.ligado=true;

        return true;
    }

    public Boolean desligar(){
        if(this.ligado.equals(false))
            return false;

        this.velocidadeAtual=0.00;
        this.ligado = false;

        return  true;
    }

    public Boolean acelerar(){
        if(this.ligado.equals(true)&&this.velocidadeAtual<this.velocidadeMaxima && precisaTrocarMarcha()){
            this.velocidadeAtual += this.getVelocidadeMaximaPorMarcha();
            return true;
        }

        return false;
    };

    private Boolean precisaTrocarMarcha() {
        return this.velocidadeAtual < this.getVelocidadeMaximaPorMarcha() * this.cambio.getMarchaAtual();
    }

    private Double getVelocidadeMaximaPorMarcha(){
        return this.velocidadeMaxima/this.cambio.getNumeroMarchas();
    }

    private void frear(){
        if(this.velocidadeAtual>0){
            this.velocidadeAtual -= this.getVelocidadeMaximaPorMarcha();
        }
    }

}
