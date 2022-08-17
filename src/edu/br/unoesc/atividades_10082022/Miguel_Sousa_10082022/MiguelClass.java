package edu.br.unoesc.atividades_10082022.Miguel_Sousa_10082022;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

// Tudo

public class MiguelClass {
    public static void main(String[] args){
        ArrayList<String> lista = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        // input = objeto, scanner = classe
        String nome;
        System.out.println("Entre com o seu Nome:");
        nome = input.nextLine();


        String cpf;
        System.out.println("Informe seu CPF:");
        cpf = input.nextLine();


        int ano_nascimento;
        int idade;
        System.out.println("Informe seu ano de nascimento: ");
        ano_nascimento = input.nextInt();
        idade = 2022 - ano_nascimento;


        String cidade, bairro, rua, cep;
        System.out.println("Informe Endereço");{

            input.nextLine();

            System.out.println("Cidade:");
            cidade = input.nextLine();
            System.out.println("Bairro:");
            bairro = input.nextLine();
            System.out.println("Rua:");
            rua = input.nextLine();
            System.out.println("CEP:");
            cep = input.nextLine();
        }

        double salario_mes;
        double salario_ano;
        System.out.println("Informe a Renda Mensal (em reais e separando os centamos com ',' ):");
        salario_mes = input.nextDouble();
        input.nextLine();
        salario_ano = salario_mes * 12;


        String departamento;
        System.out.println("Digite o departamento:");
        departamento = input.nextLine();


        String funcao;
        System.out.println("Informe sua função:");
        funcao = input.nextLine();


        String certificado;
        int contador = 0;
        System.out.println("Digite seus certificados (para concluir informe FIM): ");
        while (true){
            certificado = input.nextLine();
            if (certificado.equalsIgnoreCase("FIM"))
                break;
            lista.add(certificado);
            contador += 1;
        }


        System.out.println("Nome do Colaborador: " + nome);
        System.out.println("Cadastro de Pessoa Fisica: " + cpf);
        System.out.println("Ano de Nascimento: " + ano_nascimento);
        System.out.println("Endereço: " + cidade + ", Bairro " + bairro + ", Rua " + rua + ", CEP " + cep);
        System.out.println("Salário Mensal: R$" + new DecimalFormat("#.##").format(salario_mes));
        System.out.println("Departamento: " + departamento);
        System.out.println("Função: " + funcao);
        System.out.println("Número de Certificados: " + contador);
        System.out.println("Certificados de Formação: " + lista);
        System.out.println("Salario Anual: R$"+ new DecimalFormat("#.##").format(salario_ano));
        System.out.println("Idade Atual: " + idade + " anos");

        input.close();
    }

}
