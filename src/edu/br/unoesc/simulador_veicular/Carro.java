package edu.br.unoesc.simulador_veicular;

public class Carro extends Veiculo {

    private tipoCambio cambio;

    private Double velocidadeMaxima;

    private Double velocidadeAtual;

    private Boolean temCombustivel;

    public Carro(String modelo, String fabricante, Integer ano, tipoCambio cambio, Double velocidadeMaxima){
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
        if(this.ligado.equals(false) && this.cambio.getMarchaAtual()!=0)
            return false;

        this.velocidadeAtual=0.00;
        this.ligado = false;

        return  true;
    }

    public Boolean trocaMarcha(Boolean aumentar){
        if((aumentar && this.cambio.subirMarcha()) ||this.cambio.reduzirMarcha())
            return true;
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

    private Boolean validarTrocaMarcha() {
        return this.velocidadeAtual < this.retornarVelocidadeMaximaPorMarcha() * this.cambio.getMarchaAtual();
    }

    private Double retornarVelocidadeMaximaPorMarcha(){
        return this.velocidadeMaxima/this.cambio.getNumeroMarchas();
    }

    private void frear(){
        if(this.velocidadeAtual>0){
            this.velocidadeAtual -= this.retornarVelocidadeMaximaPorMarcha();
        }
    }


}
