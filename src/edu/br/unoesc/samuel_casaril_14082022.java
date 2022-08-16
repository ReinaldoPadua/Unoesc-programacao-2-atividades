package edu.br.unoesc;

import java.util.ArrayList;
import java.util.Scanner;

class SamuelCasaril {
    
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);

        String name, cpf, adress, depart, function, certifics;
        int birthDate, Wage, nCertifics, Years, wageYear;
        
        ArrayList<String> certificsArray = new ArrayList<String>();

        System.out.printf("Nome do Colaborador: ");
        name = Input.nextLine();
        System.out.printf("CPF: ");
        cpf = Input.next();

        System.out.printf("Ano nascimento: ");
        DataNasc = Input.nextInt();
        Input.nextLine();
        anos = 2022 - DataNasc;
        System.out.printf("Endereço: ");
        adress = Input.nextLine();

        System.out.printf("Salário Mensal: ");
        salario = Input.nextInt();
        Input.nextLine();
        salarioAno = 12 * salario;

        System.out.printf("Depatarmento: ");
        depart = Input.nextLine();
        System.out.printf("Função: ");
        function = Input.nextLine();

        System.out.printf("Número de certificados: ");
        nCertifics = Input.nextInt();
        Input.nextLine();

        int n = 0;
        while (n < nCertifics) {
            System.out.printf("Nome do Certificado %d: ",n+1);
            certifics = Input.nextLine();
            certificsArray.add(certifics);
            n++; 
            }

        System.out.printf("\n");
        System.out.printf("RESULTADOS:");
        System.out.printf("\n");
        System.out.printf("Nome: %s",name);
        System.out.printf("\n");
        System.out.printf("CPF: %s",cpf);
        System.out.printf("\n");
        System.out.printf("Endereço: %s",adress);
        System.out.printf("\n");
        System.out.printf("Departamento: %s",depart);
        System.out.printf("\n");
        System.out.printf("Função: %s",function);
        System.out.printf("\n");
        System.out.printf("Idade: %d anos",anos);
        System.out.printf("\n");
        System.out.printf("Salario Anual: R$ %d",salarioAno);
        System.out.printf("\n");
        System.out.printf("certificsArray: ");
        System.out.printf("\n");
        System.out.println(certificsArray);
        System.out.printf("\n");
    }
}