package edu.br.unoesc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FirstClass {


    public  static  void main(String ars[]){

        Scanner leitor = new Scanner(System.in);
        int x = leitor.nextInt();
        System.out.println(x);

        /* classe String */
        String myFirstString = "Hello peoples";
        System.out.println(myFirstString);

        /*Alguns tipos primitivos*/
        int primitiveInt = 1;
        double primitiveDouble = 1.2;
        boolean primitiveBoolean = false;
        char primitiveChar = 'a';
//
        /* Alguns Wrappers  */;
        Integer whapperInteger = 1;
        Double wrapperDouble = 1.2;
        Boolean wrapperBoolean = true;
//
        /* classe String */
        System.out.println(myFirstString);
//
        String mySecondString = new String();

        System.out.println(mySecondString);
//
        StringBuilder builder = new StringBuilder();

        mySecondString = builder.append("EU SEI ").append("Que você não está ")
                .append("Entendendo!").toString().toUpperCase();
        System.out.println(mySecondString);
//
//        String myThirtyString = "Cola aqui " + " Comigo";
//        System.out.println(myThirtyString);
//
        /* Arrays */
        Integer[] arrayIntegers = {1,2,3,4};
        System.out.println(arrayIntegers[0]);
        System.out.println(arrayIntegers[1]);
        System.out.println(arrayIntegers[2]);
        System.out.println(arrayIntegers[3]);
//
//        arrayIntegers[1] = 99;
//        System.out.println(arrayIntegers[1]);
//
        /* List / ListArrays */
        List<String> names = new ArrayList<String>();
        names.add("João");
        names.add("Maria");
        System.out.println(names.toString());
        names.add("Fulano");
        System.out.println(names.toString());
        names.remove("Fulano");
        System.out.println(names.toString());
//
//        /*Tema de Casa: pesquisar sobre SET, MAP, Queue, */
//
//
        /* Estruturas de condição*/
        if(1==1) {
            System.out.println("É verdade");
        }
//
        String novaString = "Verdadeiro";
//
        if(novaString.equals("verdadeiro")) {
            System.out.println("È verdade");
        }
//
          String  auxString= "Verdadeiro";
//
            if(novaString.equals(auxString)) {
               System.out.println("É verdade");
            }
//
        if(novaString.equals(auxString) && novaString.startsWith("Y")) {
            System.out.println("É verdade");
        } else if(novaString.startsWith("Y") || novaString.endsWith("z")) {
            System.out.println("É meia verdade");
        } else {
            System.out.println("É falso");
        }
//
        int opcao = 10;
        switch (opcao) {
            case 1: {
                System.out.println("Opção 1");
            }
            case 2: {
                System.out.println("Opção 2");
            }
            default: {
                System.out.println("Outro valor");
            }
        }
//
//
//        /*  Operador Ternario*/
        String resultado = ( novaString.length()<999 ) ? "Menor que 999" : "Maior que 999";
        System.out.println(resultado);
//
//
//        /* Estruturas de repetição*/
        int maximo = 10;

        for (int indice=0; indice<maximo; indice++){
            System.out.println("Indice For:" +indice);
        }
//
        List<String> animais = new ArrayList<String>(List.of("vaca","cachorro","gato","jacaré"));
        for (String animal : animais) {
            System.out.println(animal);
        }
//
        while(maximo>0) {
            System.out.println("Indice While:" +maximo);
            maximo--;
        }
//
        do{
            System.out.println("Indice Do While:" +maximo);
            maximo++;
        }while (maximo<10);



    }

}
