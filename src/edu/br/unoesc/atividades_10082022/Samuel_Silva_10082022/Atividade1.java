package edu.br.unoesc.atividades_10082022.Samuel_Silva_10082022;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// tudo ok
public class Atividade1 {
    public Atividade1() {
    }

    public static void main(String[] args) {
        System.out.println("atividade 1");
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o nome do colaborador: ");
        String nome = leitor.nextLine();
        System.out.println("Digite o cpf do colaborador: ");
        String cpf = leitor.nextLine();
        System.out.println("Digite a data de nascimento do colaborador: ");
        Integer data_nascimento = leitor.nextInt();
        leitor.nextLine();
        System.out.println("Digite o endereço do colaborador: ");
        String endereco = leitor.nextLine();
        System.out.println("Digite o salario do colaborador: ");
        Double salario = leitor.nextDouble();
        leitor.nextLine();
        System.out.println("Digite a departamento do colaborador: ");
        String departamento = leitor.nextLine();
        System.out.println("Digite a função do colaborador: ");
        String funcao = leitor.nextLine();
        System.out.println("Digite a quntidade de certificações do colaborador: ");
        Integer numero_certificacoes = leitor.nextInt();
        leitor.nextLine();

        List<String>  certificacoes = new  ArrayList<String>();
        while(numero_certificacoes>0) {
            System.out.println("Digite os nomes das certificações do colaborador: ");
            certificacoes.add(leitor.nextLine());
            numero_certificacoes--;
        }

        System.out.println("Nome colaborador: " + nome);
        System.out.println("CPF colaborador: " + cpf);
        System.out.println("Data nascimento colaborador: " + data_nascimento);
        LocalDate data_atual = LocalDate.now();
        Integer idade = data_atual.getYear() - data_nascimento;
        System.out.println("Idade colaborador: " + idade);
        System.out.println("Endereco : " + endereco);
        System.out.println("Salario : " + salario);
        System.out.println("Salario bruto anual : " + salario * 12);
        System.out.println("Departamento do colaborador: " + departamento);
        System.out.println("Funcao colaborador: " + funcao);
        System.out.println("Numero certificacoes: " + numero_certificacoes);
        System.out.println("Nome certificaçôes:" + certificacoes);


    }
}
