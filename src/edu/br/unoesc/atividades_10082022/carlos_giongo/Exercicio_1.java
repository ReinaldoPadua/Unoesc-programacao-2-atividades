package edu.br.unoesc.atividades_10082022.carlos_giongo;
import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

// Fez uso de classe, parabéns :)

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

public class Exercicio_1 {
        public static void main(String ars[]){
            List<Colaborador> Colaboradores = new ArrayList<Colaborador>();
            boolean continuar = true;
            Scanner leitor = new Scanner(System.in);

            do {
                System.out.println("Deseja adicionar um colaborador? (Y/N)");
                String opcao = leitor.nextLine();
                continuar = opcao.equals("y") || opcao.equals("Y");

                if(continuar){
                    Colaborador colaborador = new Colaborador();

                    System.out.print("Digite o nome do colaborador: ");
                    colaborador.setNome(leitor.nextLine());

                    System.out.print("Digite o cpf do colaborador: ");
                    colaborador.setCpf(leitor.nextLine());

                    System.out.print("Digite o ano de nascimento do colaborador: ");
                    colaborador.setAnoNascimento(leitor.nextLine());

                    System.out.print("Digite o endereco do colaborador: ");
                    colaborador.setEndereco(leitor.nextLine());

                    System.out.print("Digite o salario bruto do colaborador: ");
                    colaborador.setSalario(leitor.nextLine());

                    System.out.print("Digite o departamento do colaborador: ");
                    colaborador.setDepartamento(leitor.nextLine());

                    System.out.print("Digite a funcao do colaborador: ");
                    colaborador.setFuncao(leitor.nextLine());

                    System.out.print("Digite o numero de certificados do colaborador: ");
                    int numero_certificados = leitor.nextInt();
                    leitor.nextLine();

                    for(int i = 0; i < numero_certificados; i++){
                        System.out.printf("Digite o nome do certificado %d:", i+1);
                        colaborador.addCertificados(leitor.nextLine());
                    }

                    Colaboradores.add(colaborador);
                    System.out.println("Continuando..");
                }
            } while (continuar);

            System.out.println("Mostrando Relatorio:");

            for(Colaborador colaborador : Colaboradores){
                System.out.println("...");
                System.out.printf("Nome: %s", colaborador.getNome());
                System.out.printf("\nCPF: %s", colaborador.getCpf());
                System.out.printf("\nIdade: %d", colaborador.getIdade());
                System.out.printf("\nEndereco: %s", colaborador.getEndereco());
                System.out.printf("\nSalario: %.2f", colaborador.getSalario());
                System.out.printf("\nDepartamento: %s", colaborador.getDepartamento());
                System.out.printf("\nFuncao: %s", colaborador.getFuncao());
                System.out.printf("\nCertificados: ");
                for(String certificado : colaborador.getCertificados()){
                    System.out.printf("%s ", certificado);
                }
                System.out.println("\n...");
            }

        }
}
