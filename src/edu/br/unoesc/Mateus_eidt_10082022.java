package edu.br.unoesc;


import java.util.Scanner;
import java.util.ArrayList;


class MateusEidt {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome, CPF, endereco, departamento, funcao, certificadoAUX;
        int dataNasc, salario, qtdCertificados, anos, salarioAno;
        ArrayList<String> certificados = new ArrayList<String>();


        System.out.printf("Informe o seu nome: ");
        nome = ler.nextLine();

        System.out.printf("Informe o seu cpf: ");
        CPF = ler.next();

        System.out.printf("Informe o ano em que nasceu: ");
        dataNasc = ler.nextInt();
        ler.nextLine();
        anos = 2022 - dataNasc;

        System.out.printf("Informe o seu endereco: ");
        endereco = ler.nextLine();

        System.out.printf("Informe seu salario bruto mensal: ");
        salario = ler.nextInt();
        ler.nextLine();
        salarioAno = 12 * salario;

        System.out.printf("Informe o seu departamento: ");
        departamento = ler.nextLine();

        System.out.printf("Informe a sua funcao: ");
        funcao = ler.nextLine();

        System.out.printf("Informe quantos cetificados voce tem: ");
        qtdCertificados = ler.nextInt();
        ler.nextLine();


        int i = 0;
        while (i < qtdCertificados) {
            System.out.printf("Informe nome do certificado %d: ",i+1);
            certificadoAUX = ler.nextLine();
            certificados.add(certificadoAUX);
            i++;
        }


        System.out.printf("\nRESULTADOS:\n");
        System.out.printf("Nome: %s\n",nome);
        System.out.printf("CPF: %s\n",CPF);
        System.out.printf("Endereço: %s\n",endereco);
        System.out.printf("Departamento: %s\n",departamento);
        System.out.printf("Função: %s\n",funcao);
        System.out.printf("Idade: %d anos\n",anos);
        System.out.printf("Salario anual de: %d reais\n",salarioAno);
        System.out.printf("Certificados: ");
        System.out.println(certificados);
    }
}