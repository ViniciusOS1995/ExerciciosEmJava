package br.alura;

import java.util.Scanner;

public class ExercicioTresArea {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Olá digite o primeiro numero para realizar calculos : ");
        int x = leitura.nextInt();

        System.out.println("Agora digite o segundo número e vamos calcular! ");
        int y = leitura.nextInt();

        System.out.println("""
                             Você deseja calcular a area do quadrado ou a area do circulo?
                             Digite '1' para quadrado ou digite '2' para circulo.""");
        int opicao = leitura.nextInt();

        if (opicao == 1){
            System.out.println("Você selecionou a area de um quadrado!\n");
            int area = x * y;
            System.out.println("A area do quadrado é: "+ area +"m² \n");
        }else if (opicao == 2){
            System.out.println("Você selecionou a area de um circulo!\n");
            double areaCirc = 3.14*(x*x);
            System.out.println("Vamos supor que o primeiro numero digitado seja o raio de um circulo.");
            System.out.println("Esse seria o resultado: "+ areaCirc+"m²\n");
        }

        System.out.println("Tabudada do segundo numero selecionado:\n");
        for (int i = 1; i < 11; i++) {
            int tabuada = i * y;
            System.out.println(i + " x " + y +" = " + tabuada);
        }

        System.out.println("Verificando se o segundo numero é par: ");
        if (y % 2 == 0){
            System.out.println("É um numero par!\n");
        }else {
            System.out.println("É um numero impar!\n");
        }

        double fatorial = x;

        while (x > 1){
            fatorial = fatorial*(x-1);
            x--;
            System.out.println("Valor fatorial: " + fatorial);
        }
    }
}
