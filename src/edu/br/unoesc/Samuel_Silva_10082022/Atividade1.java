package edu.br.unoesc.Samuel_Silva_10082022;

import java.util.Date;
import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        System.out.println("atividade 1");
        Scanner leitor = new Scanner(System.in);
        String nome = leitor.nextLine();
        String cpf = leitor.nextLine();
        Integer data_nascimento = leitor.nextInt();
        String endereco = leitor.nextLine();
        Double salario = leitor.nextDouble();
        String departamento = leitor.nextLine();
        String funcao = leitor.nextLine();
        Integer numero_certificacoes = leitor.nextInt();
        String nome_certificacoes = leitor.nextLine();

        // prints dos inputs do colaborador
        System.out.println("Nome colaborador" +nome);
        System.out.println("CPF colaborador" +cpf);
        System.out.println("Data nascimento colaborador" +data_nascimento);
        //calculo da idade do colaborador atual
        System.out.println("Endereco colaborador" +endereco);
        System.out.println("Salario colaborador" +salario);
        System.out.println("Departamento colaborador" +departamento);
        System.out.println("Funcao colaborador" +funcao);
        System.out.println("Numero certificacoes colaborador" +numero_certificacoes);
        System.out.println("Nome certificacoes colaborador" +nome_certificacoes);



    }
}
