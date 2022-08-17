package edu.br.unoesc.simulador_veicular;

public interface tipoCambio {

    public Boolean subirMarcha();

    public Boolean reduzirMarcha();

    public Boolean engatarMarchaRe();

    public Integer getNumeroMarchas();

    public Integer getMarchaAtual();

}
