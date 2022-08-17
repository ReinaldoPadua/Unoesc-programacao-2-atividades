package edu.br.unoesc.jefferson_dallalibera;
import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Colaborador {
    String _nome;
    String _cpf;
    Date _ano_nascimento;
    String _endereco;
    double _salario;
    String _departamento;
    String _funcao;
    List<String> _certificados = new ArrayList<String>();

    ////////////////////////////////SET
    public void setNome(String nome){
        _nome = nome;
    }

    public void setCpf(String cpf){
        _cpf = cpf;
    }

    public void setAnoNascimento(String ano){
        try{
            Date nascimento = new SimpleDateFormat("dd/MM/yyyy").parse(ano);
            _ano_nascimento = nascimento;
        } catch (Exception e){
            System.out.println("Ano de nascimento inválido (padrão: dd/MM/yyyy");
        }
    }

    public void setEndereco(String endereco){
        _endereco = endereco;
    }

    public void setSalario(String salario){
        _salario = Double.parseDouble(salario);
    }

    public void setDepartamento(String departamento){
        _departamento = departamento;
    }

    public void setFuncao(String funcao){
        _funcao = funcao;
    }

    public void addCertificados(String certificado){
        _certificados.add(certificado);
    }

    //////////////////////////////////////////////GET

    public String getNome(){
        return _nome;
    }

    public String getCpf(){
        return _cpf;
    }

    public long getIdade(){
        Date dataAtual = new Date();
        long diferenca = dataAtual.getTime() - _ano_nascimento.getTime();
        long idade = diferenca / (1000L * 60 * 60 * 24 * 365);
        return idade;
    }

    public String getEndereco(){
        return _endereco;
    }

    public double getSalario(){
        return _salario;
    }

    public String getDepartamento(){
        return _departamento;
    }

    public String getFuncao(){
        return _funcao;
    }

    public List<String> getCertificados(){
        return _certificados;
    }

}

