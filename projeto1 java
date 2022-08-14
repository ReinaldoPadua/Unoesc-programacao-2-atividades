package rafaeldesanti;

import java.util.*;

public class projeto1 {


    public static void main(String[] args) {

        System.out.print("Entre com o nome do colaborador: ");
        Scanner colaborador = new Scanner(System.in);
        String colaborador2= colaborador.nextLine();
        System.out.println(colaborador2);

        System.out.print("Digite o cpf: ");
        Scanner cpf = new Scanner(System.in);
        String cpff = cpf.next();
        System.out.println(cpff);

        System.out.print("Digite seu ano de nascimento: ");
        Scanner nascimento = new Scanner(System.in);
        int nascimento2 = nascimento.nextInt();
        System.out.println(nascimento2);

        System.out.print("Digite seu endereço: ");
        Scanner endereco = new Scanner(System.in);
        String endereco2 = endereco.nextLine();
        System.out.println(endereco2);

        System.out.print("Digite seu salario bruto mensal: ");
        Scanner salbruto = new Scanner(System.in);
        Double salbruto2 = salbruto.nextDouble();
        System.out.println(salbruto2);

        System.out.print("Digite seu departamento: ");
        Scanner departamento = new Scanner(System.in);
        String departamento2 = departamento.nextLine();
        System.out.println(departamento2);

        System.out.print("Digite sua Funcao: ");
        Scanner funcao = new Scanner(System.in);
        String funcao2 = funcao.nextLine();
        System.out.println(funcao2);

        System.out.print("Digite o numero de certificações suas: ");
        Scanner cert = new Scanner(System.in);
        int tamcert = Integer.parseInt(cert.nextLine());
        String[] arr = new String [tamcert];

        for (int i=0; i<arr.length; i++ ){
            System.out.println("Digite a certificação numero "+i);
            arr[i]=cert.nextLine();
        }
        for (String element:arr){
            System.out.println(element);
        }
        System.out.println("Todas as informações");
        System.out.println("Nome: "+colaborador2);
        System.out.println("CPF: "+cpff);
        System.out.println("Nascimento: "+nascimento2);
        System.out.println("Endereço: " +endereco2);
        System.out.println("Salario bruto Mensal: " +salbruto2);
        System.out.println("Departamento: " +departamento2);
        System.out.println("Numero de certificações: " +tamcert);
        System.out.println("Certificados:");
        for (String element:arr) {
            System.out.println(element);
        }
        int idade = 2022 - nascimento2;
        System.out.println("Idade:" +idade);

        double brutoanual = salbruto2*12;
        String brutoanual2 = String.format("%.2f",brutoanual);
        System.out.println("Salario bruto anual: " +brutoanual2);

    }
}

