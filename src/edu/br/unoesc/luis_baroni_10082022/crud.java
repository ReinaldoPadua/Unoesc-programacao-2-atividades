package edu.br.unoesc.luis_baroni_10082022;

import java.util.Scanner;

public class crud {
    public static void main(String arg[]) {

        String[] messages = {"Entre com seu nome", "Entre com seu cpf",
                "Entre com seu ano de nascimento", "Entre com seu endereço",
                "Entre com seu salario bruto mensal", "Insira o nome do seu departamento",
                "Insira a sua função", "Insira o numero de certificados que voce possui",
                "Insira o nome de todos os seus certificados"};

        String[] keys = {"Nome: ", "CPF: ", "Ano de nascimento: ", "Endereco: ",
                "Salario bruto mensal: ", "Departamento: ", "Funcao: ", "N de Certificados: ",
                "Nome dos Certificados: ", "Idade: ", "Salario bruto anual: "};

        String[] data = {"", "", "", "", "", "", "", "", "", "", ""};

        Scanner user = new Scanner(System.in);

        for (int i = 0; i < messages.length; i++) {
            System.out.println(messages[i]);
            data[i] = user.nextLine();
        }

        data[9] = String.valueOf(2022 - Integer.parseInt(data[2]));
        data[10] = String.valueOf(Integer.parseInt(data[4]) * 12);

        for (int i = 0; i < data.length; i++) {
            System.out.println(keys[i] + data[i]);

        }
    }
}
