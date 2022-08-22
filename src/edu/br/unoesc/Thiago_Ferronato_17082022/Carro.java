package edu.br.unoesc.Thiago_Ferronato_17082022;

public class Carro {

    public String modelo;

    public String fabricante;

    public Integer ano;

    public Cambio cambio;

    public Double velocidadeMaxima;

    public Double velocidadeAtual;

    public Boolean temCombustivel;

    public Boolean ligado;

    public Carro(String modelo, String fabricante, Integer ano, Cambio cambio, Double velocidadeMaxima) {
        super();
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.ano = ano;
        this.cambio = cambio;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = 0.00;
        this.temCombustivel = true;
        this.ligado = false;
    }

    public Double getVelocidadeAtual() {
        return this.velocidadeAtual;
    }


    public Boolean ligar() {
        if (this.ligado.equals(true) || this.temCombustivel.equals(false) || this.cambio.getMarchaAtual() != 0)
            return false;

        this.ligado = true;

        return true;
    }

    public Boolean desligar() {
        if (this.ligado.equals(false) || this.cambio.getMarchaAtual() != 0 || this.velocidadeAtual != 0)
            return false;

        this.ligado = false;
        return true;
    }

    public Boolean trocaMarcha(Boolean aumentar) {
        if ((aumentar && this.cambio.subirMarcha()) || this.cambio.reduzirMarcha())
            return true;
        return false;
    }

    public Boolean acelerar() {
        if (this.ligado.equals(true) && this.velocidadeAtual < this.velocidadeMaxima && this.validarTrocaMarcha() && this.cambio.getMarchaAtual() != 0) {
            this.velocidadeAtual += this.retornarVelocidadeMaximaPorMarcha();
            return true;
        }

        return false;
    }

    ;

    private Boolean validarTrocaMarcha() {
        return this.velocidadeAtual < this.retornarVelocidadeMaximaPorMarcha() * this.cambio.getMarchaAtual();//
    }

    private Double retornarVelocidadeMaximaPorMarcha() {
        return this.velocidadeMaxima / this.cambio.getNumeroMarchas();
    }

    public boolean frear() {
        if (this.velocidadeAtual > 0) {
            this.velocidadeAtual -= this.retornarVelocidadeMaximaPorMarcha();
            if (this.velocidadeAtual < 0) {
                this.velocidadeAtual = 0.0;
            }
            return true;
        }
        return false;
    }
}
