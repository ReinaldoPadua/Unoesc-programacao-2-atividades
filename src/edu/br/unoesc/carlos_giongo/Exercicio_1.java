package edu.br.unoesc.carlos_giongo;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Exercicio_1 {
        public static void main(String ars[]){
            boolean continuar = true;
            Scanner leitor = new Scanner(System.in);

            do {
                System.out.println("Deseja adicionar um colaborador? (Y/N)");
                String opcao = leitor.nextLine();
                continuar = opcao.equals("y") || opcao.equals("Y") ? true : false;

                if(continuar){
                    System.out.print("Digite o nome do colaborador: ");
                    String nome = leitor.nextLine();

                    System.out.print("Digite o cpf do colaborador: ");
                    String cpf = leitor.nextLine();

                    System.out.print("Digite o ano de nascimento do colaborador: ");
                    String ano_nascimento = leitor.nextLine();

                    System.out.print("Digite o endereco do colaborador: ");
                    String endereco = leitor.nextLine();

                    System.out.print("Digite o salario bruto do colaborador: ");
                    String salario_bruto = leitor.nextLine();

                    System.out.print("Digite o departamento do colaborador: ");
                    String departamento = leitor.nextLine();

                    System.out.print("Digite a funcao do colaborador: ");
                    String funcao = leitor.nextLine();

                    System.out.print("Digite o numero de certificados do colaborador: ");
                    Integer numero_certificados = leitor.nextInt();

                    for(int i = 0; i < numero_certificados; i++){
                        System.out.printf("Digite o nome do certificado %d:", i+1);
                        String nome_certificado = leitor.nextLine();
                    }

                    System.out.println("Continuando..");
                }
            } while (continuar);

            System.out.println("Mostrando Relatorio:");
        }
}
