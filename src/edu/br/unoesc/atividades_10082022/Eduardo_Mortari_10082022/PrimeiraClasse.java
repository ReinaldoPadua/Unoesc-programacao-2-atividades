package edu.br.unoesc.atividades_10082022.Eduardo_Mortari_10082022;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
// Tudo ok
public class PrimeiraClasse {
    public static void main(String[] args){
        ArrayList<String> lista = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String nome;
        System.out.println("Entre com o Nome do colaborador:");
        nome = input.nextLine();

        String cpf;
        System.out.println("Informe o CPF:");
        cpf = input.nextLine();

        int ano_nascimento;
        int idade;
        System.out.println("Informe o ano de nascimento: ");
        ano_nascimento = input.nextInt();
        idade = 2022 - ano_nascimento;

        String cidade, bairro, rua, cep;
        System.out.println("Informe o Endereço");{

            input.nextLine();

            System.out.println("Informe qual a Cidade residente:");
            cidade = input.nextLine();
            System.out.println("Bairro:");
            bairro = input.nextLine();
            System.out.println("Rua:");
            rua = input.nextLine();
            System.out.println(" qual o CEP:");
            cep = input.nextLine();
        }

        double salario_mes;
        double salario_ano;
        System.out.println("Informe a renda bruta mensal (em reais e caso contenha centamos, separar com ',' ):");
        salario_mes = input.nextDouble();
        input.nextLine();
        salario_ano = salario_mes * 12;

        String departamento;
        System.out.println("Digite o departamento em que o colaborador trabalha:");
        departamento = input.nextLine();

        String funcao;
        System.out.println("Informe a funcao:");
        funcao = input.nextLine();

        String certificado;
        int contador = 0;
        System.out.println("Digite os certificados que possui (para concluir informe FIM): ");
        while (true){
            certificado = input.nextLine();
            if (certificado.equalsIgnoreCase("FIM"))
                break;
            lista.add(certificado);
            contador += 1;
        }
        
        System.out.println("Nome do Colaborador: " + nome);
        System.out.println("CPF do colaborador: " + cpf);
        System.out.println("Ano de Nascimento: " + ano_nascimento);
        System.out.println("Endereço: " + cidade + ", Bairro " + bairro + ", Rua " + rua + ", CEP " + cep);
        System.out.println("Salario Mensal: R$" + new DecimalFormat("#.##").format(salario_mes));
        System.out.println("Departamento: " + departamento);
        System.out.println("Funcao: " + funcao);
        System.out.println("Numero de Certificados: " + contador);
        System.out.println("Certificados de Formação: " + lista);
        System.out.println("Salario Anual: R$"+ new DecimalFormat("#.##").format(salario_ano));
        System.out.println("Idade Atual: " + idade + " anos");

        input.close();
    }

}
