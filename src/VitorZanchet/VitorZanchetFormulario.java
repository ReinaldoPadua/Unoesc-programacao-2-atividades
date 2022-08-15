package VitorZanchet;
import java.util.Scanner;

public class VitorZanchetFormulario {

    public static void main(String[] args){


            Scanner teclado = new Scanner(System.in);
            System.out.println("Entre com o seu nome: ");
            String nome = teclado.nextLine();


            System.out.println("Entre com o seu cpf: ");
            String cpf = teclado.nextLine();

            System.out.println("Entre com a ano do seu nascimento: ");
            String nascimento = teclado.nextLine();

            System.out.println("Entre com seu endereço: ");
            String endereco = teclado.nextLine();

            System.out.println("Entre com o seu salário bruto mensal: ");
            String salario = teclado.nextLine();

            System.out.println("Entre com o departamento que você trabalha: : ");
            String departamento = teclado.nextLine();

            System.out.println("Entre com a sua função: ");
            String funcao = teclado.nextLine();

            System.out.println("Entre com o numero de certificações que você possue: ");
            String certific = teclado.nextLine();

            System.out.println("Entre com o nome de todos os seus certificados: ");
            String NameCertific = teclado.nextLine();

            int anoConvertido = Integer.parseInt(nascimento);
            int idade = 2022 - anoConvertido;

            int salarioConvertido = Integer.parseInt(salario);
            int SalarioAnual = salarioConvertido * 12;


            System.out.printf("Nome do colaborador: %s \n", nome);
            System.out.printf("CPF: %s \n", cpf);
            System.out.printf("Ano de Nascimento: %d \n", anoConvertido);
            System.out.printf("Endereço: %s \n", endereco);
            System.out.printf("Salario Bruto Mensal: %d \n", salarioConvertido);
            System.out.printf("Departamento: %s \n", departamento);
            System.out.printf("Função: %s \n", funcao);
            System.out.printf("Numero de certificações: %s \n", certific);
            System.out.printf("Certificados: %s \n", NameCertific);
            System.out.printf("Idade: %s \n", idade);
            System.out.printf("Salario anual: %s \n", SalarioAnual);






    }






}
