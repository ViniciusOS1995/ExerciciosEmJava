package br.alura.operacoesAri;

import java.util.Scanner;

public class OperacaoAritimetica {
    private Float x;
    private Float y;
    private Float resultado;
    private Scanner digite = new  Scanner(System.in);

    public void soma(){

        System.out.println("Por favor Digite o valor de 'X' ");
        x = digite.nextFloat();

        System.out.println("Por favor Digite o valor de 'Y' ");
        y = digite.nextFloat();

        resultado = x + y;
        System.out.println("O resultado da soma é: "+ resultado);
    }
    public void subtracao(){
        System.out.println("Por favor Digite o valor de 'X' ");
        x = digite.nextFloat();

        System.out.println("Por favor Digite o valor de 'Y' ");
        y = digite.nextFloat();

        resultado = x - y;
        System.out.println("O resultado da subtração é: "+ resultado);
    }
}
