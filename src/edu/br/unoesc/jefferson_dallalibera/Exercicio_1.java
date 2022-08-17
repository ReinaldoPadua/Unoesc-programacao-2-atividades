package edu.br.unoesc.jefferson_dallalibera;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio_1 {
    public static void main(String ars[]) {
        List<Colaborador> Colaboradores = new ArrayList<Colaborador>();
        boolean continuar = true;
        Scanner leitor = new Scanner(System.in);

        do {
            System.out.println("Deseja adicionar um colaborador? (Y/N)");
            String opcao = leitor.nextLine();
            continuar = opcao.equals("y") || opcao.equals("Y");

            if (continuar) {
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

                for (int i = 0; i < numero_certificados; i++) {
                    System.out.printf("Digite o nome do certificado %d:", i + 1);
                    colaborador.addCertificados(leitor.nextLine());
                }

                Colaboradores.add(colaborador);
                System.out.println("Continuando..");
            }
        } while (continuar);

        System.out.println("Mostrando Relatorio:");

        for (Colaborador colaborador : Colaboradores) {
            System.out.println("...");
            System.out.printf("Nome: %s", colaborador.getNome());
            System.out.printf("\nCPF: %s", colaborador.getCpf());
            System.out.printf("\nIdade: %d", colaborador.getIdade());
            System.out.printf("\nEndereco: %s", colaborador.getEndereco());
            System.out.printf("\nSalario: %.2f", colaborador.getSalario());
            System.out.printf("\nDepartamento: %s", colaborador.getDepartamento());
            System.out.printf("\nFuncao: %s", colaborador.getFuncao());
            System.out.printf("\nCertificados: ");
            for (String certificado : colaborador.getCertificados()) {
                System.out.printf("%s ", certificado);
            }
            System.out.println("\n...");
        }

    }
}
