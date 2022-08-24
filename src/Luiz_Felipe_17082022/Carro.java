package Luiz_Felipe_17082022;

import Luiz_Felipe_17082022.Cambio;
import Luiz_Felipe_17082022.SimuladorAutomotivo;



public class Carro {

    private String modelo;

    private String fabricante;

    private Integer ano;

    private Cambio cambio;

    private Double velocidadeMaxima;

    private Double velocidadeAtual;

    private Boolean temCombustivel;

    private Boolean ligado;


    public Carro(String modelo, String fabricante, Integer ano, Luiz_Felipe_17082022.Cambio cambio, Double velocidadeMaxima) {
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
        if (this.ligado.equals(false) && this.cambio.getMarchaAtual() != 0)
            return false;

        this.velocidadeAtual = 0.00;
        this.ligado = false;

        return true;
    }

    public Boolean trocaMarcha(Boolean aumentar){
        if ((aumentar &&this.cambio.subirMarcha()) || this.cambio.reduzirMarcha()){
            return true;
        }
        return false;
    }

    public Boolean acelerar() {

        if (this.ligado.equals(true) && this.velocidadeAtual < this.velocidadeMaxima && this.validarTrocaMarcha()
                && this.cambio.getMarchaAtual() != 0) {
            this.velocidadeAtual += this.retornarVelocidadeMaximaPorMarcha();

            return true;
        }

        return false;
    }

    ;

    public Boolean validarTrocaMarcha() {
        return this.velocidadeAtual < this.retornarVelocidadeMaximaPorMarcha() * this.cambio.getMarchaAtual();

    }

    public Double retornarVelocidadeMaximaPorMarcha() {
        return this.velocidadeMaxima / this.cambio.getNumeroMarchas();
    }

    public Boolean frear() {
        if (this.velocidadeAtual > 0) {
            this.velocidadeAtual -= this.retornarVelocidadeMaximaPorMarcha();
        }
        return true;



    }


}
