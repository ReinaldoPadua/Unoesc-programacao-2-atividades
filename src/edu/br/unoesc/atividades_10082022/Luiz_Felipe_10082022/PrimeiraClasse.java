package Luiz_Felipe_10082022;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;


public class PrimeiraClasse {


    public static void main(String ars[]) {
        ArrayList<String> lista = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        // input = objeto, scanner = classe
        String nome;
        System.out.println("Informe seu nome:");
        nome = input.nextLine();

        String cpf;
        System.out.println("Informe seu CPF:");
        cpf = input.nextLine();

        int AnoNascimento;
        int idade;
        System.out.println("Informe seu ano de nascimento: ");
        AnoNascimento = input.nextInt();
        idade = 2022 - AnoNascimento;


        String cidade, bairro, rua, CEP;
        System.out.println("Insira informações sobre seu endereço:");{

            input.nextLine();

            System.out.println("Sua cidade:");
            cidade = input.nextLine();
            System.out.println("Seu bairro:");
            bairro = input.nextLine();
            System.out.println("Sua rua:");
            rua = input.nextLine();
            System.out.println("Seu CEP:");
            CEP = input.nextLine();
        }

        double SalarioMes;
        double SalarioAno;
        System.out.println("Informe sua renda mensal (em reais e separar com ',' para informar os centavos):");
        SalarioMes = input.nextDouble();
        input.nextLine();
        SalarioAno = SalarioMes * 12;


        String departamento;
        System.out.println("Informe o departamento:");
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
        System.out.println("CPF: " + cpf);
        System.out.println("Ano de Nascimento: " + AnoNascimento);
        System.out.println("Endereço: " + cidade + ", Bairro " + bairro + ", Rua " + rua + ", CEP " + CEP);
        System.out.println("Salário Mensal: R$" + new DecimalFormat("#.##").format(SalarioMes));
        System.out.println("Departamento: " + departamento);
        System.out.println("Função: " + funcao);
        System.out.println("Número de Certificados: " + contador);
        System.out.println("Certificados de Formação: " + lista);
        System.out.println("Salario Anual: R$"+ new DecimalFormat("#.##").format(SalarioAno));
        System.out.println("Idade Atual: " + idade + " anos");

        input.close();
    }

}
