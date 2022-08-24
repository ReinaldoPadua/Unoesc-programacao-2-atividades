package Eduardo_Mortari_17082022;

import Eduardo_Mortari_17082022.Cambio;
import Eduardo_Mortari_17082022.SimuladorAutomotivo;

public class Carro {

    private String modelo;

    private String fabricante;

    private Integer ano;

    private Cambio cambio;

    private Double velocidadeMax;

    private Double velocidadeAtual;

    private Boolean temCombustivel;

    private Boolean ligado;


    public Carro(String modelo, String fabricante, Integer ano, Eduardo_Mortari_17082022.Cambio cambio, Double velocidadeMax) {
        super();
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.ano = ano;
        this.cambio = cambio;
        this.velocidadeMax = velocidadeMax;
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

        if (this.ligado.equals(true) && this.velocidadeAtual < this.velocidadeMax && this.validarTrocaMarcha()
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
        return this.velocidadeMax / this.cambio.getNumerodeMarchas();
    }

    public Boolean frear() {
        if (this.velocidadeAtual > 0) {
            this.velocidadeAtual -= this.retornarVelocidadeMaximaPorMarcha();
        }
        return true;


    }
    }


