package edu.br.unoesc.atividades_10082022.eduarda_bento_389342;

import java.util.Scanner;

// Tudo ok

public class cod {

    public  static  void main(String ars[]){
        Scanner input  = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.println("No formato 000.000.000-00");
        System.out.println("Digite seu cpf: ");
        String cpf = input.nextLine();

        System.out.println("Digite o ano de seu nascimento: ");
        int ano = input.nextInt();

        System.out.println("Digite seu salario bruto: ");
        double salario = input.nextDouble();

        Scanner input2  = new Scanner(System.in);

        System.out.println("Digite seu endereco: ");
        String endereco = input2.nextLine();

        System.out.println("Digite o departamento que voce trabalha: ");
        String departamento =  input2.nextLine();

        System.out.println("Digite sua funcao: ");
        String funcao = input2.nextLine();

        System.out.println("Digite o numero de sua certificacao: ");
        String certificacao = input2.nextLine();

        System.out.println("Quais são os certificados que voce possui?");
        System.out.println("Separe por ',' ");
        String certificados = input2.nextLine();


        Integer idade = 2022 - ano;
        Double salario_anual = 12 * salario;

        System.out.println(nome);
        System.out.println(cpf);
        System.out.println(ano);
        System.out.println(endereco);
        System.out.println(salario);
        System.out.println(departamento);
        System.out.println(funcao);
        System.out.println(certificacao);
        System.out.println(certificados);
        System.out.println(idade);
        System.out.println(salario_anual);
    }
}