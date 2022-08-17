package edu.br.unoesc.atividades_10082022.vitor_ames_10082022;

import java.util.Scanner;
// tudo ok
public class vitor_ames_10082022 {
    public static void main(String[] args){

            Scanner respostas = new Scanner(System.in);

            System.out.println("Insira o seu nome:");
            String nome = respostas.next();

            System.out.println("Insira o seu CPF:");
            String cpf = respostas.next();

            System.out.println("Insira o seu ano de nascimento:");
            int nascimento = respostas.nextInt();

            System.out.println("Insira o seu endereco:");
            String endereco = respostas.next();

            System.out.println("Insira o seu salário:");
            double salario = respostas.nextDouble();

            System.out.println("Insira o departamento onde trabalha:");
            String depart = respostas.next();

            System.out.println("Insira a sua função:");
            String funcao = respostas.next();

            System.out.println("Insira o número de certificações que você tem:");
            int num_cert = respostas.nextInt();

            System.out.println("Insira o nome de todos os certificados:");
            String nome_cert = respostas.next();


            System.out.println("Seu nome é " + nome);
            System.out.println("Seu CPF é " + cpf);
            System.out.println("Seu ano de nascimento é " + nascimento);
            System.out.println("Seu endereco é " + endereco);
            System.out.println("Seu salario é " + salario);
            System.out.println("Seu departamento é " + depart);
            System.out.println("Sua função é " + funcao);
            System.out.println("O número de certificações que você tem é " + num_cert);
            System.out.println("As certificações são " + nome_cert);

            int idade = 2022 - nascimento;
            System.out.println("Sua idade atual é " + idade);

            double salario_anual = salario * 12;
            System.out.println("Seu salário bruto anual é " + salario_anual);

        }
    }
