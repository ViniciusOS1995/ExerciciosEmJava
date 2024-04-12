package br.alura;

import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Olá digite entre um número Negativo ou Positivo: ");
        Double x = leitura.nextDouble();

        if (x > 0){
            System.out.println("Esse x é positivo!\n");
        }if (x < 0){
            System.out.println("Esse x é negativo\n");
        }

        System.out.println("Agora digite outro número e vamos comparar eles: ");
        Double y = leitura.nextDouble();

        if (x == y){
            System.out.println("Os números são iguais!\n");
        }else if(x > y){
            System.out.println("O primeiro número digitado é maior!\n");
        }else {
            System.out.println("O segundo número digitado é maior\n");
        }
    }
}
