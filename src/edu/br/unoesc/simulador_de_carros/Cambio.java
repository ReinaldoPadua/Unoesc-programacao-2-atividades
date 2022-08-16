package edu.br.unoesc.simulador_de_carros;

public class Cambio {

    private Boolean automatico;

    private Integer numeroMarchas;

    private Integer marchaAtual;

    public Boolean subirMarcha(){
        return false;
    }

    public Boolean reduzirMarcha(){
        return false;
    }

    public Boolean engatarMarchaRe(){
        return false;
    }

    public Integer getNumeroMarchas() {
        return this.numeroMarchas;
    }

    public Integer getMarchaAtual() {
        return this.marchaAtual;
    }


}
