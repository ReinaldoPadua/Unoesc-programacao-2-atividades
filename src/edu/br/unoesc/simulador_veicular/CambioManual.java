package edu.br.unoesc.simulador_veicular;

public class CambioManual implements tipoCambio {


    private Integer numeroMarchas;

    private Integer marchaAtual;

    public CambioManual(Integer numeroMarchas){
        super();
        this.numeroMarchas = numeroMarchas;
        this.marchaAtual = 0;
    }

    public Boolean subirMarcha(){
        return false;
    }

    public Boolean reduzirMarcha(){
        if(this.marchaAtual>0){
            this.marchaAtual--;
            return true;
        }
        return false;
    }

    public Boolean engatarMarchaRe(){
        if(this.marchaAtual<=this.numeroMarchas){
            this.marchaAtual++;
            return true;
        }

        return false;
    }

    public Integer getNumeroMarchas() {
        return this.numeroMarchas;
    }

    public Integer getMarchaAtual() {
        return this.marchaAtual;
    }


}
